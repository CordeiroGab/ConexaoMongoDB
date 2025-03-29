package org.example;

import org.bson.types.ObjectId;

public class Aluno {
    private ObjectId id;
    private String nome;
    private String curso;
    private int idade;

    public Aluno(String nome, String curso,int idade) {
        this.idade = idade;
        this.curso = curso;
        this.nome = nome;
    }

    public Aluno() {
    }

    public Aluno(ObjectId id, String nome, String curso, int idade) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
