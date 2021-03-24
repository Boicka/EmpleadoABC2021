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
        Connection c;
        String sql;
        Statement smt;
        //--Abrir BD
        ConexionJDB conexion = new ConexionJDB();
        c = conexion.abrir();
        //--Obtener los valores de los atributos del objeto
        int id = e.getId();
        String nombre = e.getNombre();
        String apellidos = e.getApellidos();
        String puesto = e.getPuesto();
        double sueldoBase = e.getSueldoBase();
        //--Definir la sentencia
        sql = "INSERT INTO EMPLEADO VALUES("
                + id + ","
                + "'" + nombre + "',"
                + "'" + apellidos + "',"
                + "'" + puesto + "',"
                + sueldoBase + ")";
//        System.out.println(sql);
        //--Ejecutar la sentencia
        smt = c.createStatement();
        smt.executeUpdate(sql);
        //--Cerrar la BD
        c.close();
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
    public void cambio(int id, String nombre, String apellido, String puesto,
            double sueldobase) throws SQLException {
        Statement smt;
        
        Connection c;
        ConexionJDB conexion = new ConexionJDB();
        //--Abrir BD
        c = conexion.abrir();
        //--Ejecutar la busqueda
        String sentencia = "UPDATE EMPLEADO SET NOMBRE='" + nombre  + "', APELLIDOS='" 
                + apellido + "', PUESTO='" + puesto + "', SUELDOBASE=" + sueldobase + " WHERE ID=" + id;
        smt = c.createStatement();
        smt.executeUpdate(sentencia);
        //--Crear el objeto
        System.out.println("Actualizado");
        c.close();
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
