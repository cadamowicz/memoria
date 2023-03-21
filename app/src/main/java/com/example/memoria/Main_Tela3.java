package com.example.memoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main_Tela3 extends AppCompatActivity {

    EditText etfinal;

    Button exibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        etfinal=findViewById(R.id.etfinal);
        exibir=findViewById(R.id.exibir);

        exibir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = getIntent();
                String textofinal = intent1.getStringExtra("final");
                etfinal.setText(String.valueOf(textofinal));
            }
        });
    }
}