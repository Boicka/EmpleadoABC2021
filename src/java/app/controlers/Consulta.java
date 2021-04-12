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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author serio
 */
@WebServlet(name = "Consulta", urlPatterns = {"/Consulta"})
public class Consulta extends HttpServlet {

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
        int id;
        Empleado e = null;
        String mensaje = "";
        String paginaRespuesta;
        //Recibir id del formulario y convertir al tipo necesario
        id = Integer.parseInt(request.getParameter("id"));
        //Hacer la consulta
        EmpleadoDaoJDB eDB = new EmpleadoDaoJDB();
        try {
            eDB.consulta(id);
            if(e == null){
                mensaje = "Empleado inexistente";
            // no se encontro el empleado
            }
        } catch (SQLException ex) {
           mensaje = ex.getMessage();
           request.setAttribute("mensaje", mensaje);
        }
        //Definir la pagina de respuesta
        paginaRespuesta="consulta.jsp";
        //Enviar datos a la pagina de respuesta
        request.setAttribute("empleado", e);
        //Redireccionar a la pagina de respuesta
        //<%-- ESTO HAY QUE APRENDERLO --%>
        RequestDispatcher dispatcher
                = request.getRequestDispatcher(paginaRespuesta);
        dispatcher.forward(request, response);
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
