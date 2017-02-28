package com.santiagomarin.punto2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ePrac, eAvc1, eAvc2, eAvc3, eFinal,eNota;
    Button bCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ePrac=(EditText) findViewById(R.id.ePrac);
        eAvc1=(EditText) findViewById(R.id.eAvc1);
        eAvc2=(EditText) findViewById(R.id.eAvc2);
        eAvc3=(EditText) findViewById(R.id.eAvc3);
        eFinal=(EditText) findViewById(R.id.eFinal);
        eNota=(EditText) findViewById(R.id.eNota);
        bCalcular=(Button) findViewById(R.id.bCalcular);

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double nota = Double.parseDouble(ePrac.getText().toString()) * 60 / 100 +
                            Double.parseDouble(eAvc1.getText().toString()) * 5 / 100 +
                            Double.parseDouble(eAvc2.getText().toString()) * 7 / 100 +
                            Double.parseDouble(eAvc3.getText().toString()) * 8 / 100 +
                            Double.parseDouble(ePrac.getText().toString()) * 20 / 100;
                    if(nota>5)
                    {
                        Toast.makeText(getApplicationContext(),"ERROR. Las notas ingresadas deben estar entre 0 y 5",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        eNota.setText(Double.toString(nota));
                    }
                }catch(Exception e){};
            }
        });
    }
}
