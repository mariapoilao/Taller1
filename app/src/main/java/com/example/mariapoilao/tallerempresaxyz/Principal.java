package com.example.mariapoilao.tallerempresaxyz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    private TextView cajaResultado;
    private Spinner comboGenero, comboTipo, comboMarca;
    private String[] opciones_genero, opciones_tipo, opciones_marca;
    private ArrayAdapter adapter1, adapter2, adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


        comboGenero = (Spinner)findViewById(R.id.spnSexo);
        comboTipo = (Spinner)findViewById(R.id.spnTipoZapato);
        comboMarca = (Spinner)findViewById(R.id.spnMarca);
        cajaResultado = (TextView)findViewById(R.id.txtResultado);

        opciones_genero = this.getResources().getStringArray(R.array.opciones_genero);
        adapter1 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,opciones_genero);
        comboGenero.setAdapter(adapter1);

        opciones_tipo = this.getResources().getStringArray(R.array.opciones_tipo);
        adapter2 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,opciones_tipo);
        comboTipo.setAdapter(adapter2);

        opciones_marca = this.getResources().getStringArray(R.array.opciones_marca);
        adapter3 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,opciones_marca);
        comboMarca.setAdapter(adapter3);



    }






}
