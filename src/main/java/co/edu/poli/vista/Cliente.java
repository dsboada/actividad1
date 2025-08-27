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
        Pasaporte pasaporte_1 = new Pasaporte("F4155689845", "10-05-2025", titular_1, pais_1);

        
            //CRUD
        //Insertar
        //String insertarPasaporte = PasaporteRepo.insertar(pasaporte_1);
        //System.out.println(insertarPasaporte);

        //Actualizar
        /*
        
        titular_1.setNombre("Daniela Boada"); // Cambiamos fecha
        String resultadoUpdate = PasaporteRepo.actualizar(pasaporte_1);
        System.out.println(resultadoUpdate);
        
         */
        //eliminar

        /*
        
        String resultadoDelete = PasaporteRepo.eliminar("P5478");
        System.out.println(resultadoDelete);
        
         */
        //SelectId
        
        
        Pasaporte encontrado = PasaporteRepo.selectId("P43562"); 
        if (encontrado != null) {
            System.out.println("ID: " + encontrado.getId());
            System.out.println("Fecha Exp: " + encontrado.getFechaExp()+
                    ", Pais: " + encontrado.getPais().getNombre());
            System.out.println("Titular: " + encontrado.getTitular().getNombre());
            System.out.println("Pais: " + encontrado.getPais().getNombre());
        } else {
            System.out.println("Pasaporte no encontrado.");
        }
        
         
        //SelectAll
        /*
        System.out.println("Lista de pasaportes:");
        for (Pasaporte p : PasaporteRepo.selectAll()) {
            System.out.println("ID: " + p.getId() +
                    ", Fecha Exp: " + p.getFechaExp() +
                    ", Titular: " + p.getTitular().getNombre
           
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*System.out.println("=== Prueba del Patrón Singleton ===");
        
        // Obtener la primera instancia
        ConexionSupabase instancia1 = ConexionSupabase.getInstance();
        System.out.println("Primera instancia obtenida: " + instancia1.hashCode());
        
        // Obtener la segunda instancia
        ConexionSupabase instancia2 = ConexionSupabase.getInstance();
        System.out.println("Segunda instancia obtenida: " + instancia2.hashCode());
        
        // Verificar que son la misma instancia
        if (instancia1 == instancia2) {
            System.out.println("✅ ÉXITO: Ambas instancias son la misma (Singleton funcionando correctamente)");
        } else {
            System.out.println("❌ ERROR: Las instancias son diferentes (Singleton NO funcionando)");
        }
        
        // Probar la conexión
        try {
            if (instancia1.getConnection() != null) {
                System.out.println("✅ ÉXITO: Conexión a la base de datos establecida correctamente");
            } else {
                System.out.println("❌ ERROR: No se pudo establecer la conexión");
            }
        } catch (Exception e) {
            System.out.println("❌ ERROR en la conexión: " + e.getMessage());
        }
        
        System.out.println("=== Fin de la prueba ===");*/
    }

}
