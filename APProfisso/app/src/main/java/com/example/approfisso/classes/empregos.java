package com.example.approfisso.classes;

import java.io.Serializable;

public class empregos implements Serializable {

    private String id;
    private String nome;
    private String padrao;

    public empregos(String id) {this.id = id;}

    public  empregos(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPadrao() {
        return padrao;
    }

    public void setPadrao(String padrao) {
        this.padrao = padrao;
    }
}
