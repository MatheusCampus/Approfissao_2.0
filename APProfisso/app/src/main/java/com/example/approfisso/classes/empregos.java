package com.example.approfisso.classes;


import java.io.Serializable;

public class empregos implements Serializable {

    private Integer id;
    private String Estado;
    private String Cidade;
    private String Periodo;
    private String Area_da_profissao;
    private String Salario;
    private String Email;

    public empregos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String periodo) {
        Periodo = periodo;
    }

    public String getArea_da_profissao() {
        return Area_da_profissao;
    }

    public void setArea_da_profissao(String area_da_profissao) {
        Area_da_profissao = area_da_profissao;
    }

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String salario) {
        Salario = salario;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }




    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + Area_da_profissao + '\'' +
                ", salario='" + Salario + '\'' +
                '}';
    }



}

