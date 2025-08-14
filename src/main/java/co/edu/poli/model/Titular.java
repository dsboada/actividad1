package co.edu.poli.model;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Titular {

    @Override
    public String toString() {
        return "Titular{" + "id=" + id + ", nombre=" + nombre + ", fechaNac=" + fechaNac + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Titular(String id, String nombre, String fechaNac) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    /**
     * Default constructor
     */
    public Titular() {
    }

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String fechaNac;


}