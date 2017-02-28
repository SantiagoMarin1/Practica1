package com.santiagomarin.resistenciasapp;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;
    TextView tValor;
    boolean flag=true;
    int contador1=0;
    int contador2=0;
    int contador3=0;
    int contador4=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        tValor=(TextView) findViewById(R.id.tValor);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag)
                {
                    flag=false;
                    b2.setVisibility(v.VISIBLE);
                    b3.setVisibility(v.VISIBLE);
                    b4.setVisibility(v.VISIBLE);
                }
                contador1++;
                if(contador1>9){contador1=1;}
                switch (contador1)
                {
                    case 0:
                        b1.setBackgroundColor(b1.getContext().getResources().getColor(R.color.black));
                        break;
                    case 1:
                        b1.setBackgroundColor(b1.getContext().getResources().getColor(R.color.brown));
                        break;
                    case 2:
                        b1.setBackgroundColor(b1.getContext().getResources().getColor(R.color.red));
                        break;
                    case 3:
                        b1.setBackgroundColor(b1.getContext().getResources().getColor(R.color.orange));
                        break;
                    case 4:
                        b1.setBackgroundColor(b1.getContext().getResources().getColor(R.color.yellow));
                        break;
                    case 5:
                        b1.setBackgroundColor(b1.getContext().getResources().getColor(R.color.green));
                        break;
                    case 6:
                        b1.setBackgroundColor(b1.getContext().getResources().getColor(R.color.blue));
                        break;
                    case 7:
                        b1.setBackgroundColor(b1.getContext().getResources().getColor(R.color.violet));
                        break;
                    case 8:
                        b1.setBackgroundColor(b1.getContext().getResources().getColor(R.color.gray));
                        break;
                    case 9:
                        b1.setBackgroundColor(b1.getContext().getResources().getColor(R.color.white));
                        break;
                }
                calcular();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador2++;
                if(contador2>9){contador2=0;}
                switch (contador2)
                {
                    case 0:
                        b2.setBackgroundColor(b2.getContext().getResources().getColor(R.color.black));
                        break;
                    case 1:
                        b2.setBackgroundColor(b2.getContext().getResources().getColor(R.color.brown));
                        break;
                    case 2:
                        b2.setBackgroundColor(b2.getContext().getResources().getColor(R.color.red));
                        break;
                    case 3:
                        b2.setBackgroundColor(b2.getContext().getResources().getColor(R.color.orange));
                        break;
                    case 4:
                        b2.setBackgroundColor(b2.getContext().getResources().getColor(R.color.yellow));
                        break;
                    case 5:
                        b2.setBackgroundColor(b2.getContext().getResources().getColor(R.color.green));
                        break;
                    case 6:
                        b2.setBackgroundColor(b2.getContext().getResources().getColor(R.color.blue));
                        break;
                    case 7:
                        b2.setBackgroundColor(b2.getContext().getResources().getColor(R.color.violet));
                        break;
                    case 8:
                        b2.setBackgroundColor(b2.getContext().getResources().getColor(R.color.gray));
                        break;
                    case 9:
                        b2.setBackgroundColor(b2.getContext().getResources().getColor(R.color.white));
                        break;
                }
                calcular();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador3++;
                if(contador3>9){contador3=0;}
                switch (contador3)
                {
                    case 0:
                        b3.setBackgroundColor(b3.getContext().getResources().getColor(R.color.black));
                        break;
                    case 1:
                        b3.setBackgroundColor(b3.getContext().getResources().getColor(R.color.brown));
                        break;
                    case 2:
                        b3.setBackgroundColor(b3.getContext().getResources().getColor(R.color.red));
                        break;
                    case 3:
                        b3.setBackgroundColor(b3.getContext().getResources().getColor(R.color.orange));
                        break;
                    case 4:
                        b3.setBackgroundColor(b3.getContext().getResources().getColor(R.color.yellow));
                        break;
                    case 5:
                        b3.setBackgroundColor(b3.getContext().getResources().getColor(R.color.green));
                        break;
                    case 6:
                        b3.setBackgroundColor(b3.getContext().getResources().getColor(R.color.blue));
                        break;
                    case 7:
                        b3.setBackgroundColor(b3.getContext().getResources().getColor(R.color.violet));
                        break;
                    case 8:
                        b3.setBackgroundColor(b3.getContext().getResources().getColor(R.color.gray));
                        break;
                    case 9:
                        b3.setBackgroundColor(b3.getContext().getResources().getColor(R.color.white));
                        break;
                }
                calcular();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador4++;
                if(contador4>1){contador4=0;}
                switch (contador4) {
                    case 0:
                        b4.setBackgroundColor(b4.getContext().getResources().getColor(R.color.darkkhaki));
                        break;
                    case 1:
                        b4.setBackgroundColor(b4.getContext().getResources().getColor(R.color.silver));
                        break;
                }
                calcular();
            }
        });
    }

    void calcular()
    {
        String valor=String.valueOf(contador1) + String.valueOf(contador2);
        double multiplicador=Math.pow(10,contador3);
        double numero=Double.parseDouble(valor)*multiplicador;
        String salida;
        if(contador4==0)
        {salida="+5%Ω";}
        else{
            salida="+10%Ω";
        }
        valor=String.valueOf(numero)+salida;
        tValor.setText(valor);

    }
}
