package com.santiagomarin.punto1;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.util.Linkify;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton m_one, m_two, m_three, m_four;
    EditText eLado, eRadio, eBase, eAltura, eLadoC;
    TextView tArea, tPerimetro, tVolumen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_one = (RadioButton) findViewById(R.id.rb1);
        m_two = (RadioButton) findViewById(R.id.rb2);
        m_three = (RadioButton) findViewById(R.id.rb3);
        m_four = (RadioButton) findViewById(R.id.rb4);
        eLado = (EditText) findViewById(R.id.eLado);
        eRadio = (EditText) findViewById(R.id.eRadio);
        eBase = (EditText) findViewById(R.id.eBase);
        eAltura = (EditText) findViewById(R.id.eAltura);
        eLadoC = (EditText) findViewById(R.id.eLadoC);
        tArea=(TextView) findViewById(R.id.tArea);
        tPerimetro=(TextView) findViewById(R.id.tPerimetro);
        tVolumen=(TextView) findViewById(R.id.tVolumen);

        eLado.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    double lado = Double.parseDouble(eLado.getText().toString());
                    Double area=lado*lado;
                    Double perimetro=lado*4;
                    tArea.setText(Double.toString(area));
                    tPerimetro.setText(String.valueOf(perimetro));
                    tVolumen.setText(" - ");
                }catch(Exception e){};
            }
        });

        eRadio.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    double radio  = Double.parseDouble(eRadio.getText().toString());
                    Double area=Math.PI*Math.pow(radio,2);
                    Double perimetro=2*Math.PI*radio;
                    tArea.setText(Double.toString(area));
                    tPerimetro.setText(Double.toString(perimetro));
                    tVolumen.setText(" - ");
                }catch(Exception e){};
            }
        });

        eBase.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    double base  = Double.parseDouble(eBase.getText().toString());
                    double altura = Double.parseDouble(eAltura.getText().toString());
                    Double area=(base*altura)/2;
                    Double perimetro= Math.sqrt(Math.pow(base,2)*Math.pow(altura,2));
                    perimetro=base+2*perimetro;
                    tArea.setText(Double.toString(area));
                    tPerimetro.setText(Double.toString(perimetro));
                    tVolumen.setText(" - ");
                }catch(Exception e){};
            }
        });

        eAltura.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    double base  = Double.parseDouble(eBase.getText().toString());
                    double altura = Double.parseDouble(eAltura.getText().toString());
                    Double area=(base*altura)/2;
                    Double perimetro=3*base;
                    tArea.setText(Double.toString(area));
                    tPerimetro.setText(Double.toString(perimetro));
                    tVolumen.setText(" - ");
                }catch(Exception e){};
            }
        });

        eLadoC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    double lado  = Double.parseDouble(eBase.getText().toString());
                    Double volumen=Math.pow(lado,3);
                    tArea.setText(" - ");
                    tPerimetro.setText(" - ");
                    tVolumen.setText(Double.toString(volumen));
                }catch(Exception e){};
            }
        });
    }

    public void borrar(){
        tArea.setText("");
        tPerimetro.setText("");
        tVolumen.setText("");
    }

    public void onRadioButtonClicked(View v) {
        boolean  checked = ((RadioButton) v).isChecked();
        int id= v.getId();
        switch (id) {
            case R.id.rb1:
                borrar();
                //eLado.setText("Lado");
                m_two.setChecked(false);
                m_three.setChecked(false);
                m_four.setChecked(false);
                eLado.setVisibility(v.VISIBLE);
                eRadio.setVisibility(v.INVISIBLE);
                eBase.setVisibility(v.INVISIBLE);
                eAltura.setVisibility(v.INVISIBLE);
                eLadoC.setVisibility(v.INVISIBLE);
                break;

            case R.id.rb2:
                borrar();
                //eRadio.setText("Radio");
                m_one.setChecked(false);
                m_two.setChecked(true);
                m_three.setChecked(false);
                m_four.setChecked(false);
                eLado.setVisibility(v.INVISIBLE);
                eRadio.setVisibility(v.VISIBLE);
                eBase.setVisibility(v.INVISIBLE);
                eAltura.setVisibility(v.INVISIBLE);
                eLadoC.setVisibility(v.INVISIBLE);
                break;

            case R.id.rb3:
                borrar();
                //eAltura.setText("Altura");
                m_one.setChecked(false);
                m_two.setChecked(false);
                m_three.setChecked(true);
                m_four.setChecked(false);
                eLado.setVisibility(v.INVISIBLE);
                eRadio.setVisibility(v.INVISIBLE);
                eBase.setVisibility(v.VISIBLE);
                eAltura.setVisibility(v.VISIBLE);
                eLadoC.setVisibility(v.INVISIBLE);
                break;

            case R.id.rb4:
                borrar();
                //eLadoC.setText("Lado");
                m_one.setChecked(false);
                m_two.setChecked(false);
                m_three.setChecked(false);
                m_four.setChecked(true);
                eLadoC.setVisibility(v.VISIBLE);
                eLado.setVisibility(v.INVISIBLE);
                eRadio.setVisibility(v.INVISIBLE);
                eBase.setVisibility(v.INVISIBLE);
                eAltura.setVisibility(v.INVISIBLE);
                break;
        }
    }
}

