package app.persistencia;

import app.model.Empleado;
import java.sql.SQLException;


public interface EmpleadoDaoI {
    public void alta(Empleado e)throws SQLException;
    public void baja(int id)throws SQLException;
    public void cambio(int id, String nombre, String apellido, String puesto,
            double sueldobase)throws SQLException;
    public Empleado consulta(int id) throws SQLException;
}
