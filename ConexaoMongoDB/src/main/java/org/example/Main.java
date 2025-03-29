package org.example;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.example.ConexaoMongo.AlunoCRUD;

public class Main {
    public static void main(String[] args) {

        AlunoCRUD crud = new AlunoCRUD();
        ObjectId idDefault = new ObjectId("67e160e59ad60d5ae26a4c5f");


        //Create

       /* Aluno aluno = new Aluno(25, "Computacao","Gabriel");
        ObjectId id = crud.inserir(aluno);
        System.out.println("Aluno inserido com sucesso! " + id);

        Aluno alunodb = crud.buscarPorId(id);
        if (alunodb != null) {
            System.out.println("ID: " + alunodb.getId());
            System.out.println("Nome: " + alunodb.getNome());
            System.out.println("Curso: " + alunodb.getCurso());
            System.out.println("Idade: " + alunodb.getIdade());
        }else {
            System.out.println("ID nao encontrado!");
        } */

        //Select *
       /* for (Document aluno : crud.selectALL()) {
            System.out.println(aluno.toJson());
        } */

        /*Aluno alunoUpdae = new Aluno("Joao","Moda",23);
        crud.atualizarAluno(idDefault,alunoUpdae);
        System.out.println("Alunos atualizados: ");
        */
        crud.deletar(idDefault);
        System.out.println("ALuno deletado com sucesso!");


    }
}