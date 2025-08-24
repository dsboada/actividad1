package co.edu.poli.vista;

import co.edu.poli.model.Pasaporte;
import co.edu.poli.model.Ciudad;
import co.edu.poli.model.Pais;
import co.edu.poli.model.Titular;
import co.edu.poli.model.Visa;
import java.util.ArrayList;
import co.edu.poli.repositorio.ConexionSupabase;
import co.edu.poli.repositorio.Operaciones;
import co.edu.poli.repositorio.OperacionesPasaporte;
import java.sql.Connection;

public class Cliente {

    public static void main(String[] args) {

        //Se crea el repositorio para generar CRUD del pasaporte
        Operaciones<Pasaporte> PasaporteRepo = new OperacionesPasaporte();

        //Se crean las descripciones de los atributos del pasaporte 
        ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
        ciudades.add(new Ciudad("1", "Bogota"));
        Titular titular_1 = new Titular("1000527724", "Martin Gomez", "10-08-2005");
        Pais pais_1 = new Pais("12", "Colombia", ciudades);
       
        //Se crea el objeto pasaporte
        Pasaporte pasaporte_1 = new Pasaporte("P67342", "12-08-2020", titular_1, pais_1);

        //CRUD
        //Insertar
        String insertarPasaporte = PasaporteRepo.insertar(pasaporte_1);
        System.out.println(insertarPasaporte);
        //Actualizar
        /*pasaporte_1.setFechaExp("2026-01-01"); // Cambiamos fecha
        String resultadoUpdate = PasaporteRepo.actualizar(pasaporte_1);
        System.out.println(resultadoUpdate);*/
        //eliminar
        /*String resultadoDelete = PasaporteRepo.eliminar("P67342");
        System.out.println(resultadoDelete);*/
        //SelectId
        /*Pasaporte encontrado = PasaporteRepo.selectId("P67342"); 
        if (encontrado != null) {
            System.out.println("ID: " + encontrado.getId());
            System.out.println("Fecha Exp: " + encontrado.getFechaExp());
            System.out.println("Titular: " + encontrado.getTitular().getNombre());
            System.out.println("País: " + encontrado.getPais().getNombre());
        } else {
            System.out.println("Pasaporte no encontrado.");
        }*/
        //SelectAll
        /*System.out.println("Lista de pasaportes:");
        for (Pasaporte p : PasaporteRepo.selectAll()) {
            System.out.println("ID: " + p.getId() +
                    ", Fecha Exp: " + p.getFechaExp() +
                    ", Titular: " + p.getTitular().getNombre() +
                    ", País: " + p.getPais().getNombre());
        }*/

    }

}
