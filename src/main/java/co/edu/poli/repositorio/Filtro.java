/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.poli.repositorio;

import java.util.ArrayList;

public interface Filtro <T> extends Operaciones<T>{
    ArrayList<T> filterId(String ident);
    
}
