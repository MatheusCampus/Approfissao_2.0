package com.example.approfisso.activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.approfisso.R;


public class busca_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.busca_menu);
    }





    public void botao_retornar_busca(View view){

        finish();
    }

    public void botao_buscar(View view){

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
       /// lista.setLayoutManager(layoutManager);
        findViewById(R.id.lista_emprego_buscado);


        finish();

    }
}
