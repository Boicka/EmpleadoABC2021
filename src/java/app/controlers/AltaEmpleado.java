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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author serio
 */
public class AltaEmpleado extends HttpServlet {

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
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet AltaEmpleado</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet AltaEmpleado at " + request.getContextPath() + "</h1>");
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
        String nombre, apellidos, puesto, mensaje, paginaRespuesta;
        double sueldo;
        Empleado e;
        EmpleadoDaoJDB eJDB;
        //Recibir datos del formulario
        //Convertir datos si es necesarios
        id = Integer.parseInt(request.getParameter("idT"));
        nombre = request.getParameter("nombreT");
        apellidos = request.getParameter("apellidosT");
        puesto = request.getParameter("puestoT");
        sueldo = Double.parseDouble(request.getParameter("sueldoT"));
        //Crear el objeto de la Clase Empleado
        e = new Empleado();
        //Asignar valores a sus atributos
        e.setId(id);
        e.setNombre(nombre);
        e.setApellidos(apellidos);
        e.setPuesto(puesto);
        e.setSueldoBase(sueldo);
        try {
            //Agregar empleado a la base de datos
            eJDB = new EmpleadoDaoJDB();
            eJDB.alta(e);
            //Enviar mensaje a la página de respuesta
            mensaje = "Alta exitosa";
        } catch (SQLException ex) {
            mensaje = "Algo ocurrio mal" + ex.getMessage();
        }
        paginaRespuesta = "alta.jsp";
        request.setAttribute("mensaje", mensaje);
        //Redireccionar a la página de respuesta
        
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
