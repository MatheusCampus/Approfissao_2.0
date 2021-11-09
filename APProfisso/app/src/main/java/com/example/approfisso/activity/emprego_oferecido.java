package com.example.approfisso.activity;

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

    public void botao_retornar (View view){
        finish();

    }
}
