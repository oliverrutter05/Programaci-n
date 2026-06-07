package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CocheDAO {

    public void insertar(Coche coche) {

        String sql =
                "INSERT INTO coches(marca, modelo, precio) VALUES(?,?,?)";

        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, coche.getMarca());
            ps.setString(2, coche.getModelo());
            ps.setDouble(3, coche.getPrecio());

            ps.executeUpdate();

            System.out.println("Coche insertado correctamente");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizar(Coche coche) {

        String sql =
                "UPDATE coches SET marca=?, modelo=?, precio=? WHERE id=?";

        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, coche.getMarca());
            ps.setString(2, coche.getModelo());
            ps.setDouble(3, coche.getPrecio());
            ps.setInt(4, coche.getId());

            int filas = ps.executeUpdate();

            if (filas > 0) {
                System.out.println("Coche actualizado");
            } else {
                System.out.println("No existe un coche con ese ID");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminar(int id) {

        String sql = "DELETE FROM coches WHERE id=?";

        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int filas = ps.executeUpdate();

            if (filas > 0) {
                System.out.println("Coche eliminado");
            } else {
                System.out.println("No existe un coche con ese ID");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Coche> obtenerTodos() {

        List<Coche> coches = new ArrayList<>();

        String sql = "SELECT * FROM coches";

        try (Connection con = ConexionBD.conectar();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {

                Coche coche = new Coche(
                        rs.getInt("id"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getDouble("precio")
                );

                coches.add(coche);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return coches;
    }
}
