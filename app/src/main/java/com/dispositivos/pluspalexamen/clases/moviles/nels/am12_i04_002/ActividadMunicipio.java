package com.dispositivos.pluspalexamen.clases.moviles.nels.am12_i04_002;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class ActividadMunicipio extends AppCompatActivity {
    private EditText txtNombre,txtPais;
    private Button btnGuardar;
    private Spinner cmbxmunicipios;
    private ArrayAdapter<String> adaptador;
    private String[] departamentos = new String[]{
            "Sonsonate",
            "San Antonio"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_municipio);



        this.txtNombre = (EditText) findViewById(R.id.txtNombre);
        this.txtPais = (EditText) findViewById(R.id.txtCabecera);
        this.cmbxmunicipios =  (Spinner) findViewById(R.id.cmbDepto);

        btnGuardar = (Button) findViewById(R.id.btnAgregarD);

        this.adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,this.departamentos);

        this.cmbxmunicipios.setAdapter(this.adaptador);
        this.cmbxmunicipios.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ActividadMunicipio.this,"El departamento seleccionado es: " + departamentos[position],Toast.LENGTH_SHORT).show();
            }
        });

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Departamento departamento = new Departamento(
                        txtNombre.getText().toString(),
                        txtPais.getText().toString(),
                        cmbxmunicipios.toString()
                );
                Intent intent = new Intent();
                intent.putExtra("EST", departamento);
                finish();

            }
        });

    }
}
