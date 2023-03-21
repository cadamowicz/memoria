package com.example.memoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main_Tela2 extends AppCompatActivity {

    EditText texto2;


    Button comparar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        texto2=findViewById(R.id.texto2);
        comparar=findViewById(R.id.comparar);


        comparar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                String textocomp = intent.getStringExtra("memoria");


                String igual;
                if( textocomp.equalsIgnoreCase(texto2.getText().toString())){
                    igual="O texto e igual";
                }
                else{
                    igual="Texto diferente";
                }

                Intent intent1 = new Intent(Main_Tela2.this, Main_Tela3.class);
                intent1.putExtra("final",igual);
                startActivity(intent1);

            }
        });
    }


}