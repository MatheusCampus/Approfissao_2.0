package com.example.approfisso.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;




import androidx.appcompat.app.AppCompatActivity;
import com.example.approfisso.R;


public class empresa_oferece extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.empresa_oferece);
    }

    public void lista_emprego(View view){
        Intent it = new Intent(this, emprego_oferecido.class);
        startActivity(it);
    }


    public void botao_retornar (View view){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);

    }
}
