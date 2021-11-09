package com.example.approfisso.activity;

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

    public void botao_retornar (View view){
        finish();

    }
}
