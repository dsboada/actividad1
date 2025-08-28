package co.edu.poli.repositorio;

import co.edu.poli.model.Pais;
import co.edu.poli.model.Pasaporte;
import co.edu.poli.model.Titular;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OperacionesPasaporte implements Operaciones<Pasaporte> {

    @Override
    public String insertar(Pasaporte entidad) {

        String sql = "INSERT INTO bdpasaporte (pasaporteid, fechaexp, titular, pais) " + "VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexionSupabase.getInstance().getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, entidad.getId());
            pstmt.setString(2, entidad.getFechaExp());
            pstmt.setString(3, entidad.getTitular().getNombre());
            pstmt.setString(4, entidad.getPais().getNombre());

            int filas = pstmt.executeUpdate();
            if (filas > 0) {
                return "Registro insertado en la tabla 'bdpasaporte'.";
            } else {
                return "No se pudo insertar el pasaporte.";
            }

        } catch (SQLException e) {
            return ("Error al insertar: " + e.getMessage());
        }

    }

    @Override
    public String eliminar(String pasaporteId) {

        String sql = "DELETE FROM BdPasaporte WHERE \"pasaporteid\" = ?";

        try (Connection conn = ConexionSupabase.getInstance().getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, pasaporteId);

            int filasEliminadas = stmt.executeUpdate();

            if (filasEliminadas > 0) {
                return " Registro eliminado correctamente.";
            } else {
                return "️ No se encontró un registro con PasaporteId = " + pasaporteId;
            }

        } catch (SQLException e) {
            return (" Error al eliminar: " + e.getMessage());
        }

    }

    @Override
    public Pasaporte selectId(String PasaporteId) {
        String sql = "SELECT * FROM BdPasaporte WHERE PasaporteId = ?";
        Pasaporte pasaporteBuscado = null;

        try (Connection conn = ConexionSupabase.getInstance().getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, PasaporteId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                //Titular titularbuscado = new Titular(null, rs.getString("titular"), null);
                //Pais paisbuscado = new Pais(null, rs.getString("pais"), null);

                pasaporteBuscado = new Pasaporte(
                        rs.getString("pasaporteid"),
                        rs.getString("fechaexp"), null, null);
            }

        } catch (SQLException e) {
            System.out.println(" Error al leer: " + e.getMessage());
        }
        return pasaporteBuscado;
    }

    @Override
    public String actualizar(Pasaporte entidad) {

        String sql = "UPDATE BdPasaporte SET FechaExp=?, Titular=?, Pais=? WHERE PasaporteId=?";

        try (Connection conn = ConexionSupabase.getInstance().getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, entidad.getFechaExp());
            pstmt.setString(2, entidad.getTitular().getNombre());
            pstmt.setString(3, entidad.getPais().getNombre());
            pstmt.setString(4, entidad.getId());

            int filasAfectadas = pstmt.executeUpdate();

            if (filasAfectadas > 0) {
                return ("Registro con ID " + entidad.getId() + " actualizado correctamente.");
            } else {
                return ("No se encontró ningún registro con el ID " + entidad.getId());
            }

        } catch (SQLException e) {
            return ("Error al actualizar: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Pasaporte> selectAll() {
        String sql = "SELECT * FROM bdpasaporte";
        ArrayList<Pasaporte> lista = new ArrayList<>();

        try (Connection conn = ConexionSupabase.getInstance().getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                //Titular titular = new Titular(null, rs.getString("titular"), null);
                //Pais pais = new Pais(null, rs.getString("pais"), null);

                Pasaporte pasaporte = new Pasaporte(
                        rs.getString("pasaporteid"),
                        rs.getString("fechaexp"),
                        null,
                        null
                );

                lista.add(pasaporte);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar: " + e.getMessage());
        }

        return lista;
    }

    @Override
    public ArrayList<Pasaporte> filterId(String ident) {

        ArrayList<Pasaporte> pasaportes_filtrados = new ArrayList<Pasaporte>();
        String sql = "SELECT * FROM bdpasaporte WHERE pasaporteid LIKE ?";

        try (Connection conn = ConexionSupabase.getInstance().getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, "%" + ident + "%");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Pasaporte pasaporte = new Pasaporte(
                        rs.getString("pasaporteid"),
                        rs.getString("fechaexp"),
                        null, null);

                pasaportes_filtrados.add(pasaporte);
            }

        } catch (SQLException e) {
            System.out.println(" Error al leer: " + e.getMessage());
        }
        return pasaportes_filtrados;

    }

}
