package com.santiagomarin.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bMas,bMenos,bPor,bDiv,bPunto,bIgual,bC;
    EditText eNumero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNumero=(EditText) findViewById(R.id.eNumero);
    }

    Double numero1,numero2,resultado;
    String operador;

    public void click(View view)
    {
        int id= view.getId();
        try{
        switch (id) {
            case R.id.b0:
                eNumero.setText(eNumero.getText() + "0");
                break;
            case R.id.b1:
                eNumero.setText(eNumero.getText() + "1");
                break;
            case R.id.b2:
                eNumero.setText(eNumero.getText() + "2");
                break;
            case R.id.b3:
                eNumero.setText(eNumero.getText() + "3");
                break;
            case R.id.b4:
                eNumero.setText(eNumero.getText() + "4");
                break;
            case R.id.b5:
                eNumero.setText(eNumero.getText() + "5");
                break;
            case R.id.b6:
                eNumero.setText(eNumero.getText() + "6");
                break;
            case R.id.b7:
                eNumero.setText(eNumero.getText() + "7");
                break;
            case R.id.b8:
                eNumero.setText(eNumero.getText() + "8");
                break;
            case R.id.b9:
                eNumero.setText(eNumero.getText() + "9");
                break;
            case R.id.bMas:
                operador = "+";
                onClickOperacionCapturaNumero1(view);
                break;
            case R.id.bMenos:
                operador = "-";
                onClickOperacionCapturaNumero1(view);
                break;
            case R.id.bPor:
                operador = "*";
                onClickOperacionCapturaNumero1(view);
                break;
            case R.id.bDiv:
                operador = "/";
                onClickOperacionCapturaNumero1(view);
                break;
            case R.id.bPunto:
                eNumero.setText(eNumero.getText() + ".");
                break;
            case R.id.bC:
                numero1 = 0.0;
                numero2 = 0.0;
                resultado = 0.0;
                eNumero.setText("");
                break;
            case R.id.bIgual:
                onClickIgual(view);
                break;
        }
        }catch(Exception e)
        {
            eNumero.setText("ERROR");
        };

    }
    public void onClickOperacionCapturaNumero1(View miView)
    {
        numero1 = Double.parseDouble(eNumero.getText().toString());
        eNumero.setText("");
     }

    public void onClickIgual(View miView)
    {
            numero2 = Double.parseDouble(eNumero.getText().toString());

            if(operador.equals("+"))
            {
                resultado= numero1+numero2;
            }
            else if(operador.equals("-"))
            {
                resultado= numero1-numero2;
            }
            else if(operador.equals("*"))
            {
                resultado= numero1*numero2;
            }
            else if(operador.equals("/"))
            {
                resultado= numero1/numero2;
            }
            eNumero.setText(resultado.toString());

    }
}
