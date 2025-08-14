package co.edu.poli.model;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Ciudad {

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

    public Ciudad(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    /**
     * Default constructor
     */
    public Ciudad() {
    }

    /**
     * 
     */
    private String codigo;

    /**
     * 
     */
    private String nombre;



}