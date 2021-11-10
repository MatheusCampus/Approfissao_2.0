package com.example.approfisso.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.approfisso.R;


public class emprego_oferecido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emprego_oferecido);
    }

    public void botao_oferece(View view){
        Intent it = new Intent(this, empresa_oferece.class);
        startActivity(it);
    }

    public void botao_retornar_busca (View view){
        finish();

    }
}
