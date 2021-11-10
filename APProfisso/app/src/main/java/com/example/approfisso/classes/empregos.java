package com.example.approfisso.classes;

import java.io.Serializable;

public class empregos implements Serializable {

    private String id;
    private String estado;
    private String cidade;
    private String periodo;
    private String area_da_profissao;
    int salario;
    private String email;

    public empregos(String id) {this.id = id;}

    public  empregos(){
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getArea_da_profissao() {
        return area_da_profissao;
    }

    public void setArea_da_profissao(String area_da_profissao) {
        this.area_da_profissao = area_da_profissao;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
