/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.poli.vista;

import co.edu.poli.model.Pasaporte;
import co.edu.poli.model.Ciudad;
import co.edu.poli.model.Pais;
import co.edu.poli.model.Titular;
import co.edu.poli.model.Visa;
import java.util.ArrayList;




public class Cliente {
    
    public static void main(String[] args) {
   
        ArrayList <Ciudad> ciudades = new ArrayList <Ciudad>();
        ciudades.add(new Ciudad ("1", "Bogota"));     
             
       Titular Carla = new Titular ("1000527724", "Esteban Lopez", "10-08-2005");
       Pais Colombia = new Pais ("12", "Colombia", ciudades);
        
       Pasaporte pasaporte_1 = new Pasaporte("ax123", "12-08-2020", Carla, Colombia);
       
       System.out.println(pasaporte_1);
       
       
       
        
        
    }
    
}
