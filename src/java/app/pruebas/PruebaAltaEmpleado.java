package app.pruebas;

import app.model.Empleado;
import app.persistencia.ConexionJDB;
import app.persistencia.EmpleadoDaoJDB;
import java.sql.Connection;
import java.sql.SQLException;

public class PruebaAltaEmpleado {
    public static void main(String[] args) {
        Connection conexion;
        Empleado e;
        EmpleadoDaoJDB empleadodao;
        
        ConexionJDB c = new ConexionJDB();
        empleadodao = new EmpleadoDaoJDB();
        //--Creación del empleado
        e = new Empleado();
        e.setId(3);
        e.setNombre("Paco");
        e.setApellidos("Ruiz Gonzales");
        e.setPuesto("Gerente de manofactura");
        e.setSueldoBase(40000);
        try{
            conexion = c.abrir();
            empleadodao.alta(e);
            c.cerrar(conexion);
        }catch(SQLException ex){
            System.out.println("Ha ocurrido un error: "+ ex.getMessage());
        }
        System.out.println("Empleado agregado exitosamente!");
    }
}
