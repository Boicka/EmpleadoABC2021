package app.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionJDB implements ConexionI {

    private Connection conexion;
    private String URL = "jdbc:derby://localhost:1527/MiEmpresa";
    private String usuarioBD = "root";
    private String contrasenaBD = "root";

//    public Connection abrir() throws SQLException {
//        Connection c;
//        c = DriverManager.getConnection(URL, usuarioBD, contrasenaBD);
//        return c;
//    }

    @Override
    public void cerrar(Connection c) throws SQLException {
        c.close();
    }

    @Override
    public Connection abrir() throws SQLException {
        Connection c;
        c = DriverManager.getConnection(URL, usuarioBD, contrasenaBD);
        return c;
    }

}
