package app.pruebas;

import app.model.Empleado;
import app.persistencia.ConexionJDB;
import app.persistencia.EmpleadoDaoJDB;
import java.sql.Connection;
import java.sql.SQLException;

public class PruebaCambioxID {
    public static void main(String[] args) {
        Empleado e = null;
        EmpleadoDaoJDB empleadoDao = new EmpleadoDaoJDB();
        ConexionJDB c = new ConexionJDB();
        Connection conexion;
        try {
            conexion = c.abrir();
//            c.abrir();
//            e = empleadoDao.consulta(1);
            empleadoDao.cambio(1, "Sergio", "Hernandez", "CEO", 50000);
            c.cerrar(conexion);

        } catch (SQLException ex) {
            System.out.println("Ha ocurrido un error al conectar a la base de datos: " + ex.getMessage());
            System.exit(1);
        }
    }
}
