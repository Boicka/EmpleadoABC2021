package app.persistencia;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConexionI {

    public Connection abrir()
            throws SQLException;

    public void cerrar(Connection c) throws SQLException;

}
