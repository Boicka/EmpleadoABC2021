/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controlers;

import app.model.Empleado;
import app.persistencia.EmpleadoDaoJDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ActualizarEmpleado", urlPatterns = {"/ActualizarEmpleado"})
public class ActualizarEmpleado extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet ActualizarEmpleado</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ActualizarEmpleado at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        int id;
        String nombre;
        String apellidos;
        String puesto;
        double sueldo;
        String paginaRespuesta;
        Empleado e;
        EmpleadoDaoJDB eJDB;
        String mensaje;
        //Recibir datos del formulario
        //Convertir datos si es necesario
        id = Integer.parseInt(request.getParameter("id"));
        nombre = request.getParameter("fName");
        apellidos = request.getParameter("lName");
        puesto = request.getParameter("puesto");
        sueldo = Double.parseDouble(request.getParameter("sueldo"));
        //Crear el objeto de la Clase Empleado
        //Asignar valores a sus atributos
        try {
            //Agregarempleado a la BD
            eJDB = new EmpleadoDaoJDB();
            eJDB.cambio(id, nombre, apellidos, puesto, sueldo);
            //Enviar mensaje a la página de respuesta
            mensaje = "Datos del empleado han sido actualizados";
        } catch (SQLException ex) {
            //Enviar mensaje a la página de respuesta
            mensaje = ex.getMessage();
            mensaje = mensaje.replace("'", "");
        }
        paginaRespuesta = "actualizar.jsp";
        request.setAttribute("mensaje", mensaje);
//        Redireccionar a la página de respuesta
        RequestDispatcher dispatcher
                = request.getRequestDispatcher(paginaRespuesta);
        dispatcher.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
