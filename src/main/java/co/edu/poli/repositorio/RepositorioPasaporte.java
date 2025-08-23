
package co.edu.poli.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RepositorioPasaporte {
    public void insertarPasaporte(String PasaporteId, String fechaExp, String titular, String pais, String ciudad,String visaId, int mulEntry, String fecNac) {
        
	String sql = "INSERT INTO prueba1 (pasaporteid, fechaexp, titular, pais, ciudad, visaid, mulentry, fecnac) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

	try (Connection conn = ConexionSupabase.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, PasaporteId);
            pstmt.setString(2, fechaExp);
            pstmt.setString(3, titular);
            pstmt.setString(4, pais);
            pstmt.setString(5, ciudad);
            pstmt.setString(6, visaId);
            pstmt.setInt(7, mulEntry);
            pstmt.setString(8, fecNac);

            int filas = pstmt.executeUpdate();
            if (filas > 0) {
		System.out.println(" Registro insertado en la tabla 'prueba1'.");
            }
            } catch (SQLException e) {
		System.out.println(" Error al insertar: " + e.getMessage());
            }
	}
		
		public void eliminarPasaporte(Connection conn, String pasaporteId) {
		    String sql = "DELETE FROM prueba1 WHERE \"pasaporteid\" = ?";

		    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
		        stmt.setString(1, pasaporteId);

		        int filasEliminadas = stmt.executeUpdate();

		        if (filasEliminadas > 0) {
		            System.out.println(" Registro eliminado correctamente.");
		        } else {
		            System.out.println("️ No se encontró un registro con PasaporteId = " + pasaporteId);
		        }

		    } catch (SQLException e) {
		        System.out.println(" Error al eliminar: " + e.getMessage());
		    }
		
	}
		
		 public void leerPasaportePorId(Connection conn, String pasaporteIdBuscado) {
		        String sql = "SELECT * FROM prueba1 WHERE PasaporteId = ?";

		        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
		            pstmt.setString(1, pasaporteIdBuscado);

		            try (ResultSet rs = pstmt.executeQuery()) {
		                if (rs.next()) {
		                String pasaporteId = rs.getString("pasaporteid");
		                String fechaExp = rs.getString("fechaexp");
		                String titular = rs.getString("titular");
		                String pais = rs.getString("pais");
		                String ciudad = rs.getString("ciudad");
		                String visaId = rs.getString("visaid");
		                int mulEntry = rs.getInt("mulentry");
		                String fecNac = rs.getString("fecNac");

		                System.out.println("PasaporteId: " + pasaporteId +
		                                   ", FechaExp: " + fechaExp +
		                                   ", Titular: " + titular +
		                                   ", País: " + pais +
		                                   ", Ciudad: " + ciudad +
		                                   ", VisaId: " + visaId +
		                                   ", Multiples Entradas: " + mulEntry +
		                                   ", Fecha Nac: " + fecNac);
		                } else {
		                    System.out.println("️ No se encontró ningún pasaporte con ID " + pasaporteIdBuscado);
		                }
		            }

		        } catch (SQLException e) {
		            System.out.println(" Error al leer: " + e.getMessage());
		        }
		    }
		 
		  public static void actualizarPasaporte(Connection conn,String pasaporteId, String nuevaFechaExp,String nuevoTitular,String nuevoPais, String nuevaCiudad, String nuevaVisaId,int nuevoMulEntry,String nuevaFecNac) {
			String sql = "UPDATE prueba1 SET FechaExp=?, Titular=?, Pais=?, Ciudad=?, visaId=?, mulEntry=?, fecNac=? WHERE PasaporteId=?";

			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                          pstmt.setString(1, nuevaFechaExp);
                          pstmt.setString(2, nuevoTitular);
			  pstmt.setString(3, nuevoPais);
			  pstmt.setString(4, nuevaCiudad);
			  pstmt.setString(5, nuevaVisaId);
			  pstmt.setInt(6, nuevoMulEntry);
			  pstmt.setString(7, nuevaFecNac);
			  pstmt.setString(8, pasaporteId);

			  int filasAfectadas = pstmt.executeUpdate();

			  if (filasAfectadas > 0) {
			  	System.out.println("✅ Registro con ID " + pasaporteId + " actualizado correctamente.");
			  } else {
			  	System.out.println("⚠️ No se encontró ningún registro con el ID " + pasaporteId);
			  }

			  } catch (SQLException e) {
			  	System.out.println("❌ Error al actualizar: " + e.getMessage());
			  }
		  }
}
