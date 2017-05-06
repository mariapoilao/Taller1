package com.example.mariapoilao.tallerempresaxyz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    private TextView cajaResultado;
    private EditText cantidad;
    private Spinner comboGenero, comboTipo, comboMarca;
    private String[] opciones_genero, opciones_tipo, opciones_marca;
    private ArrayAdapter adapter1, adapter2, adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


        comboGenero = (Spinner) findViewById(R.id.spnSexo);
        comboTipo = (Spinner) findViewById(R.id.spnTipoZapato);
        comboMarca = (Spinner) findViewById(R.id.spnMarca);
        cajaResultado = (TextView) findViewById(R.id.txtResultado);
        cantidad = (EditText) findViewById(R.id.txtCantidad);


        opciones_genero = this.getResources().getStringArray(R.array.opciones_genero);
        adapter1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, opciones_genero);
        comboGenero.setAdapter(adapter1);

        opciones_tipo = this.getResources().getStringArray(R.array.opciones_tipo);
        adapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, opciones_tipo);
        comboTipo.setAdapter(adapter2);

        opciones_marca = this.getResources().getStringArray(R.array.opciones_marca);
        adapter3 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, opciones_marca);
        comboMarca.setAdapter(adapter3);


    }
public void calcular (View v){



        int op1, op2, op3, cant;
                double res=0;
        double nikeZ1=120000, adidasZ1=140000, pumaZ1=130000, nikeZ2=100000, adidasZ2=130000, pumaZ2=110000;
        double nikeC1=50000, adidasC1=80000, pumaC1=100000, nikeC2=60000, adidasC2=70000, pumaC2=120000;

        if (validar()) {

            cant = Integer.parseInt(cantidad.getText().toString());

            op1 = comboGenero.getSelectedItemPosition();
            op2 = comboTipo.getSelectedItemPosition();
            op3 = comboMarca.getSelectedItemPosition();


            switch (op1) {

                case 0:

                    switch (op2) {

                        case 0:

                            switch (op3) {

                                case 0:
                                    res = cant * nikeZ1;
                                    break;
                                case 1:
                                    res = cant * adidasZ1;
                                    break;
                                case 2:
                                    res = cant * pumaZ1;
                                    break;


                            }
                            break;
                        case 1:

                            switch (op3) {

                                case 0:
                                    res = cant * nikeC1;
                                    break;
                                case 1:
                                    res = cant * adidasC1;
                                    break;
                                case 2:
                                    res = cant * pumaC1;
                                    break;
                            }
                            break;

                    }
                    break;

                case 1:

                    switch (op2) {

                        case 0:

                            switch (op3) {

                                case 0:
                                    res = cant * nikeZ2;
                                    break;
                                case 1:
                                    res = cant * adidasZ2;
                                    break;
                                case 2:
                                    res = cant * pumaZ2;
                                    break;


                            }
                            break;
                        case 1:

                            switch (op3) {

                                case 0:
                                    res = cant * nikeC2;
                                    break;
                                case 1:
                                    res = cant * adidasC2;
                                    break;
                                case 2:
                                    res = cant * pumaC2;
                                    break;
                            }
                            break;

                    }

                    break;
            }
            cajaResultado.setText("Su cantidad a pagar es: $" + res);
        }
    }

    public boolean validar() {

        if(cantidad.getText().toString().isEmpty()){

            cantidad.setError(this.getResources().getString(R.string.error_cantidad));
            cantidad.requestFocus();
            return false;
        }

        if (Integer.parseInt(cantidad.getText().toString())==0){
            cantidad.setError(this.getResources().getString(R.string.error_cantidadcero));
            cantidad.requestFocus();
            return false;
        }

        if (Integer.parseInt(cantidad.getText().toString())<=0){
            cantidad.setError(this.getResources().getString(R.string.error_negativo));
            cantidad.requestFocus();
            return false;
        }

        return true;
    }

    public void borrar(View v){

        cajaResultado.setText("");
        cantidad.setText("");
        cantidad.requestFocus();

    }





}


