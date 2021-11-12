package com.example.approfisso.classes;


import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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

    public empregos(){

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


    private static FirebaseDatabase firebaseDatabase;
    private static DatabaseReference databaseReference;
    private static void inicio(){
        firebaseDatabase= FirebaseDatabase.getInstance();
        //firebaseDatabase.setPersistenceEnabled(true);
        databaseReference= firebaseDatabase.getReference();
    }
    public static DatabaseReference getDatabaseReference() {
        if(databaseReference==null)
            inicio();
        return databaseReference;
    }
    public static void salvar(empregos e){
        if(databaseReference==null){
            inicio();
            List<empregos> empregos = new ArrayList();
            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    DataSnapshot dataSnapshot = snapshot.child("emprego");
                    empregos.clear();
                    for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                        empregos servico = postSnapshot.getValue(empregos.class);
                        empregos.add(servico);
                    }

                   /*
                   String id = (Integer.parseInt(empregos.get(empregos.size()-1).getId())+1)+"";
                    databaseReference.child("Emprego").child(id).child("Cidade").setValue(e.getCidade());
                    databaseReference.child("Emprego").child(id).child("Email").setValue(e.getEmail());
                    databaseReference.child("Emprego").child(id).child("Estado").setValue(e.getEstado());
                    databaseReference.child("Emprego").child(id).child("Periodo").setValue(e.getPeriodo());
                    databaseReference.child("Emprego").child(id).child("Profissao").setValue(e.getArea_da_profissao());
                    databaseReference.child("Emprego").child(id).child("salario").setValue(e.getSalario());

                    */
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });


        }
    }

    public static void excluir(empregos e){
        databaseReference.child("Emprego").child(e.getId()+"").removeValue();
    }
    public static void editar(empregos e) {
        databaseReference.child("Emprego").child(e.getId().toString()).child("Cidade").setValue(e.getCidade());
        databaseReference.child("Emprego").child(e.getId().toString()).child("Email").setValue(e.getEmail());
        databaseReference.child("Emprego").child(e.getId().toString()).child("Estado").setValue(e.getEstado());
        databaseReference.child("Emprego").child(e.getId().toString()).child("Periodo").setValue(e.getPeriodo());
        databaseReference.child("Emprego").child(e.getId().toString()).child("Profissao").setValue(e.getArea_da_profissao());
        databaseReference.child("Emprego").child(e.getId().toString()).child("Salario").setValue(e.getSalario());

    }





}

