package com.dispositivos.pluspalexamen.clases.moviles.nels.am12_i04_002;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Principal extends AppCompatActivity implements View.OnClickListener {

    Button btnDeptos, btnMun;
    public static ArrayList<Municipio> lstMunicipio = new ArrayList<>();
    public static ArrayList<Departamento> lstDepartamento = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnDeptos = (Button) findViewById(R.id.btnDepto);
        btnMun = (Button) findViewById(R.id.btnMun);

        btnDeptos.setOnClickListener(this);
        btnMun.setOnClickListener(this);

        /*btnDeptos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal.this,ActividadDepto.class);
                intent.putExtra("mimun", lstMunicipio);
                startActivity(intent);
            }
        });*/

       /* btnMun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal.this,ActividadMunicipio.class);
                startActivity(intent);
            }
        });*/

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnDepto:
                Intent intent = new Intent(this, ActividadDepto.class);
                startActivity(intent);
                break;

            case R.id.btnMun:
                Intent intent2 = new Intent(this, ActividadMunicipio.class);
                startActivity(intent2);
                break;

        }
    };

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==24 && resultCode==RESULT_OK){
            Municipio municipio = (Municipio) data.getSerializableExtra("EST");
            lstMunicipio.add(municipio);
            btnMun.setText("LISTA ESTUDIANTE" + lstMunicipio.size());

        }
    }
}