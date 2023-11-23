package com.example.calculadoradeidadeanimal;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SegundaTela extends AppCompatActivity {

    private EditText editIdade;
    private TextView textResultado;

    Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            int idade = Integer.parseInt(editIdade.getText().toString());
            int resultado = idade * 7;
            textResultado.setText("Idade igual a: " + resultado + "anos");

        setContentView(R.layout.activity_segunda_tela);

        editIdade = findViewById(R.id.editIdade);
        textResultado = findViewById(R.id.textResultado);

        setTitle("Minha segunda tela solicitada");

        botaoVoltar = findViewById(R.id.botaoVoltar);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                finish();
               }

        });

    }

}



