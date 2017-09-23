package com.dispositivos.pluspalexamen.clases.moviles.nels.am12_i04_002;

import java.io.Serializable;

/**
 * Created by Nels on 22/09/2017.
 */

public class Departamento implements Serializable{
    String nombre;
    String pais;
    String depto;
    public Departamento(String nombre, String pais, String depto) {
        this.nombre = nombre;
        this.pais = pais;
        this.depto = depto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }
}
