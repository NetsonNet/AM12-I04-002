package com.dispositivos.pluspalexamen.clases.moviles.nels.am12_i04_002;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Nels on 22/09/2017.
 */

public class AdaptadorMunicipio extends ArrayAdapter<Municipio>  {
    //TODO constructor con 2 parametros : el contexto y la lista de objetos (Contacto)
    public AdaptadorMunicipio(Context context, List<Municipio> objects) {
        super(context, 0, objects);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obteniendo el dato
        Municipio municipio = getItem(position);
        //TODO inicializando el layout correspondiente al item (Contacto)
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_respuesta, parent, false);
        }
        TextView lblNombre = (TextView) convertView.findViewById(R.id.lblNombre);
        TextView lblPais = (TextView) convertView.findViewById(R.id.lblPais);
        TextView lblDescripcion = (TextView) convertView.findViewById(R.id.lblDescripcion);
        // mostrar los datos
        lblNombre.setText(municipio.nombre);
        lblPais.setText(municipio.pais);
        lblDescripcion.setText(municipio.depto);
        // Return la convertView ya con los datos
        return convertView;
    }
}
