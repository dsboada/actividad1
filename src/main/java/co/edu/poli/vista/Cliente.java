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
        ciudades.add(new Ciudad("4", "Tunja"));
        Titular titular_1 = new Titular("1078564320", "Juan Ruiz", "13-05-2001");
        Pais pais_1 = new Pais("20", "Peru", ciudades);

        //Se crea el objeto pasaporte
        Pasaporte pasaporte_1 = new Pasaporte("547463", "10-05-2545", titular_1, pais_1);
        //CRUD

        //Insertar

        /*
        
        String insertarPasaporte = PasaporteRepo.insertar(pasaporte_1);
        System.out.println(insertarPasaporte);
        
         
        //Eliminar

        /*
        
        String resultadoDelete = PasaporteRepo.eliminar("P1jkbjkbvjb2");
        System.out.println(resultadoDelete);
        
         */
        //Actualizar

        /*
        
        titular_1.setNombre("Carlos Francisco Torres");
        String resultadoUpdate = PasaporteRepo.actualizar(pasaporte_1);
        System.out.println(resultadoUpdate);
        
        */
        //SelectId

        /*
        
        Pasaporte encontrado = PasaporteRepo.selectId("SDE3456");
        if (encontrado != null) {
            System.out.println("ID: " + encontrado.getId());
            System.out.println("Fecha Exp: " + encontrado.getFechaExp());
            System.out.println("Titular: " + encontrado.getTitular().getNombre());
            System.out.println("Pais: " + encontrado.getPais().getNombre());
        } else {
            System.out.println("Pasaporte no encontrado.");
        }
        
         */
        //SelectAll
        
        /*
        
        System.out.println("Lista de pasaportes:");
        for (Pasaporte p : PasaporteRepo.selectAll()) {
            System.out.println("ID: " + p.getId()
                    + ", Fecha Exp: " + p.getFechaExp()
                    + ", Titular: " + p.getTitular().getNombre());
        }

        */



    }
}
