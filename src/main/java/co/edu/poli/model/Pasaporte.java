package co.edu.poli.model;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Pasaporte {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(String fechaExp) {
        this.fechaExp = fechaExp;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Pasaporte(String id, String fechaExp, Titular titular, Pais pais) {
        this.id = id;
        this.fechaExp = fechaExp;
        this.titular = titular;
        this.pais = pais;
    }

    /**
     * Default constructor
     */
    public Pasaporte() {
    }

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String fechaExp;

    /**
     * 
     */
    private Titular titular;

    /**
     * 
     */
    private Pais pais;




}