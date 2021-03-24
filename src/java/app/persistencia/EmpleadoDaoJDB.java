package app.persistencia;

import app.model.Empleado;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EmpleadoDaoJDB implements EmpleadoDaoI{
        Connection conexion;
        private String URL = "jdbc:derby://localhost:1527/MiEmpresa";
        private String usuarioBD = "root";
        private String contrasenaBD  = "root";

    @Override
    public void alta(Empleado e) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void baja(int id) throws SQLException {
        Statement smt;
        ResultSet rs;
        Connection c;
        ConexionJDB conexion = new ConexionJDB();
        //Abrir BD
        String sql = "DELETE FROM EMPLEADO WHERE ID =" + id;
        c = conexion.abrir();
        smt = c.createStatement();
        boolean r = smt.execute(sql);
        System.out.println(r);
        c.close();
    }

    @Override
    public void cambio(Empleado e) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado consulta(int id) throws SQLException {
        Empleado e = null;
        Statement smt;
        ResultSet rs;
        Connection c;
        ConexionJDB conexion = new ConexionJDB();
        //--Abrir BD
        c = conexion.abrir();
        //--Ejecutar la busqueda
        String sentencia = "SELECT * FROM EMPLEADO WHERE ID=" + id;
        smt = c.createStatement();
        rs = smt.executeQuery(sentencia);
        //--Crear el objeto
        while(rs.next()){
            e = new Empleado();
            e.setId(Integer.parseInt(rs.getString("ID")));
            e.setNombre(rs.getString("NOMBRE"));
            e.setApellidos(rs.getString("APELLIDOS"));
            e.setPuesto(rs.getString("PUESTO"));
            e.setSueldoBase(Double.parseDouble(rs.getString("SUELDOBASE")));
        }
        c.close();
        return e;
    }
}
