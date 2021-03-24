package app.persistencia;

import app.model.Empleado;
import java.sql.SQLException;


public interface EmpleadoDaoI {
    public void alta(Empleado e)throws SQLException;
    public void baja(int id)throws SQLException;
    public void cambio(Empleado e)throws SQLException;
    public Empleado consulta(int id) throws SQLException;
}
