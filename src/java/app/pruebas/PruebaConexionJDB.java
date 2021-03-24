package app.pruebas;

import app.persistencia.ConexionJDB;
import java.sql.Connection;
import java.sql.SQLException;

public class PruebaConexionJDB {
    public static void main(String[] args) {
        ConexionJDB c = new ConexionJDB();
        Connection conexion;
//        String URL = "jdbc:derby://localhost:1527/MiEmpresa";
//        String usuarioDB = "root";
//        String contrasenaBD = "root";
        
        try {
            conexion = c.abrir();
            c.cerrar(conexion);
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido un error al conectar a la base de datos: " + ex.getMessage());
            System.exit(1);
        }
        System.out.println("Prueba exitosa!");
    }
}
 