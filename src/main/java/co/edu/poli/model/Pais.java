package co.edu.poli.model;

import java.io.*;
import java.util.*;

/**
 *
 */
public class Pais {

    private String codigo;
    private String nombre;
    private List<Ciudad> ciudad;

    public Pais(String codigo, String nombre, List<Ciudad> ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Ciudad> getCiudad() {
        return ciudad;
    }

    public void setCiudad(List<Ciudad> ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "(Codigo: " + codigo + ", Nombre: " + nombre + ", Ciudad: " + ciudad + ')';
    }

}
