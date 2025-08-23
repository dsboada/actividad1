
package co.edu.poli.repositorio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSupabase {
     private static final String URL = "jdbc:postgresql://aws-1-us-east-2.pooler.supabase.com:5432/postgres";
	    private static final String USER = "postgres.xvmzjfegsbnyuxesymol";
	    private static final String PASSWORD = "Dadada889_*";

	    public static Connection getConnection() {
	        Connection conn = null;
	        try {
	            // Cargar driver PostgreSQL
	            Class.forName("org.postgresql.Driver");

	            // Conexión a Supabase
	            conn = DriverManager.getConnection(URL, USER, PASSWORD);
	            System.out.println("✅ Conexión exitosa a Supabase");
	        } catch (ClassNotFoundException | SQLException e) {
	            System.out.println("❌ Error de conexión: " + e.getMessage());
	        }
	        return conn;
	    }


}
