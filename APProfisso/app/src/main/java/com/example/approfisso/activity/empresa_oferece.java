package com.example.approfisso.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;










import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.LinkedList;

import com.example.approfisso.R;
import com.example.approfisso.classes.empregos;



public class empresa_oferece extends AppCompatActivity {

    DatabaseReference databaseReference;

    private EditText Estado;
    private EditText Cidade;
    private EditText Periodo;
    private EditText Profissao;
    private EditText Salario;
    private EditText Email;
    private empregos Emprego;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.empresa_oferece);
        Estado=findViewById(R.id.TextOfereceEstado);
        Cidade=findViewById(R.id.TextOfereceCidade);
        Periodo=findViewById(R.id.TextOferecePeriodo);
        Profissao=findViewById(R.id.TextOfereceProfissao);
        Salario=findViewById(R.id.TextOfereceSalario);
        Email=findViewById(R.id.TextOfereceEmail);
        Intent i = getIntent();
        Emprego= (empregos) i.getSerializableExtra("Empregos");


    }

    public void lista_emprego(View view){
        Intent it = new Intent(this, emprego_oferecido.class);
        startActivity(it);
    }


    public void botao_retornar (View view){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);

    }

    public void botao_Salvar (View view){
        Emprego.setEstado(Estado.getText().toString());
        Emprego.setCidade(Cidade.getText().toString());
        Emprego.setPeriodo(Periodo.getText().toString());
        Emprego.setArea_da_profissao(Profissao.getText().toString());
        Emprego.setSalario(Salario.getText().toString());
        Emprego.setEmail(Email.getText().toString());
        empregos.salvar(Emprego);
        onBackPressed();
    }

}
