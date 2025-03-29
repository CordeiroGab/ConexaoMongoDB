package org.example.ConexaoMongo;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.example.Aluno;
import static com.mongodb.client.model.Updates.set;
import javax.management.Query;

import static com.mongodb.client.model.Filters.*;

public class AlunoCRUD {
    private MongoCollection<Document> colecao;
    public AlunoCRUD() {
        colecao = ConexaoMongo.conectar();
    }
    public ObjectId inserir(Aluno aluno) {
       Document doc = new Document("nome", aluno.getNome())
               .append("curso", aluno.getCurso())
               .append("idade", aluno.getIdade());
       colecao.insertOne(doc);
       ObjectId id = doc.getObjectId("_id");
       return id;
    }

    public Aluno buscarPorId(ObjectId id) {
        Document doc = colecao.find(eq("_id",id)).first();
        if (doc != null) {
            return new Aluno(
                    doc.getObjectId("_id"),
                    doc.getString("nome"),
                    doc.getString("curso"),
                    doc.getInteger("idade")

            );
        }
        return null;
    }
    public FindIterable<Document> selectALL(){
        return colecao.find();
    }

    public void atualizarAluno(ObjectId id,Aluno aluno) {
        Document doc = new Document()
                .append("_id", id)
                .append("nome", aluno.getNome())
                .append("curso", aluno.getCurso())
                .append("idade", aluno.getIdade());
        colecao.updateOne(
                eq("_id",id),
                new Document("$set",doc)
        );

    }

    public void deletar(ObjectId id) {
        colecao.deleteOne(eq("_id",id));
    }

}
