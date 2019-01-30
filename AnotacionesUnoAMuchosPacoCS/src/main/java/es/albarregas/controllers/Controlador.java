/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.controllers;

import es.albarregas.beans.Libro;
import es.albarregas.beans.Persona;
import es.albarregas.dao.IGenericoDAO;
import es.albarregas.daofactory.DAOFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author paco
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

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

        DAOFactory daof = DAOFactory.getDAOFactory();
        IGenericoDAO gdao = daof.getGenericoDAO();

        String url = null;

        Persona persona = new Persona();
        Libro libro = new Libro();

        switch (request.getParameter("op")) {
            case "add":
                List<Libro> libros = new ArrayList<>();
                persona.setNombre(request.getParameter("nombre"));
                if (request.getParameter("libro1") != null && request.getParameter("libro1").length() > 0) {
                    libro.setTitulo(request.getParameter("libro1"));
                    libros.add(libro);
                }

                if (request.getParameter("libro2") != null && request.getParameter("libro2").length() > 0) {
                    libro = new Libro();
                    libro.setTitulo(request.getParameter("libro2"));
                    libros.add(libro);
                }

                if (request.getParameter("libro3") != null && request.getParameter("libro3").length() > 0) {
                    libro = new Libro();
                    libro.setTitulo(request.getParameter("libro3"));
                    libros.add(libro);
                }

                persona.setLibros(libros);
                gdao.insertOrUpdate(persona);
                url = "index.jsp";
                break;
            case "delete":
                persona = (Persona) gdao.getById(Integer.parseInt(request.getParameter("registro")), Persona.class);
                gdao.delete(persona);
                url = "index.jsp";
                break;
            case "update":
                persona = (Persona) gdao.getById(Integer.parseInt(request.getParameter("registro")), Persona.class);
                request.setAttribute("persona", persona);
                url = "JSP/finActualizar.jsp";
                break;
        }

        request.getRequestDispatcher(url).forward(request, response);
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
