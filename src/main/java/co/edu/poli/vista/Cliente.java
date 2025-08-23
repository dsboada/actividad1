
package co.edu.poli.vista;

import co.edu.poli.model.Pasaporte;
import co.edu.poli.model.Ciudad;
import co.edu.poli.model.Pais;
import co.edu.poli.model.Titular;
import co.edu.poli.model.Visa;
import java.util.ArrayList;

import co.edu.poli.repositorio.ConexionSupabase;
import co.edu.poli.repositorio.RepositorioPasaporte;
import java.sql.Connection;


public class Cliente {
    
    public static void main(String[] args) {
   /*
        ArrayList <Ciudad> ciudades = new ArrayList <Ciudad>();
        ciudades.add(new Ciudad ("1", "Bogota"));     
             
       Titular Carla = new Titular ("1000527724", "Martin Gomez", "10-08-2005");
       Pais Colombia = new Pais ("12", "Colombia", ciudades);
        
       Pasaporte pasaporte_1 = new Pasaporte("ax123", "12-08-2020", Carla, Colombia);
       
       System.out.println(pasaporte_1);
       
      */
       ConexionSupabase.getConnection();
        Connection conn = ConexionSupabase.getConnection();
        new RepositorioPasaporte().eliminarPasaporte(conn, "P12345");
        
        RepositorioPasaporte repo = new RepositorioPasaporte();

        repo.insertarPasaporte(
            "P12345",        // PasaporteId
            "2025-08-23",    // FechaExp
            "David Pardo",   // Titular
            "Colombia",      // Pais
            "Bogotá",        // Ciudad
            "VISA123",       // visaId
            1,               // mulEntry
            "2000-05-10"     // fecNac
        );
      
        
        
      
        
        if (conn != null) {
        	RepositorioPasaporte revisar = new RepositorioPasaporte();
        	revisar.leerPasaportePorId(conn, "P12345"); // 👈 Cambia "P12345" por el ID que tengas en la tabla
        }
        
        RepositorioPasaporte.actualizarPasaporte(
                conn,
                "P12345",              // 👈 PasaporteId existente en tu tabla
                "2025-08-22",          // nueva FechaExp
                "123456789",           // nuevo Titular
                "Colombia",            // nuevo Pais
                "Bogotá",              // nueva Ciudad
                "VISA123",             // nueva VisaId
                1,                     // nuevo mulEntry
                "2000-01-15"           // nueva FecNac
            );
        
        
	}
       
        
        
    }
    
