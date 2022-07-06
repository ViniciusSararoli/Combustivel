package com.example.calccombustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText inputGasolina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputGasolina = findViewById(R.id.inputGasolina);
    }

    public void calcularPrecos(View view) {
        float gasolina, etanol, resultado;

        gasolina = Float.parseFloat(inputGasolina.getText().toString());

        EditText inputEtanol = findViewById(R.id.inputEtanol);
        etanol = Float.parseFloat(inputEtanol.getText().toString());

        resultado = etanol/gasolina;

        TextView txtResultado = findViewById(R.id.txtResultado);

        if(resultado <= 0.7) {
            txtResultado.setText("Etanol (" + resultado + ")");
        }else{
            txtResultado.setText("Gasolina (" + resultado + ")");
        }
    }
}