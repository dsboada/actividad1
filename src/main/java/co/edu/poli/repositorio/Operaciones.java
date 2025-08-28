
package co.edu.poli.repositorio;

import java.util.ArrayList;


public interface Operaciones<T> {
    
    String insertar(T entidad);
    String eliminar(String id); 
    String actualizar(T entidad);
    T selectId(String id);
    ArrayList<T> selectAll();
    
    
    
    
    
}
