/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author projecto
 */
@WebServlet(name = "FileController", urlPatterns = {"/FileController"})
public class FileController extends HttpServlet {

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
        if(request.getParameter("ok")!=null){
             //sí que he clicat un botó de formulari
             String action=request.getParameter("ok");
             switch(action){
                 case "AddGrafic":
                     addGrafic(request,response);
                     break;
                 case "createPDF":
                     createPDF(request,response);
                     break;
                 
             }
         }else{
             //no he donat al botó ok
             HttpSession session = request.getSession();
                    String positionPage= (String) session.getAttribute("positionOfButtonFile");
                    //For futur implement a variable session of location on click in 
                    //option of reference this controller, because the option is in more .jds
                //response.sendRedirect(positionPage);
             response.sendRedirect("index.jsp");
         }
        }
    
    /**
     * Add grafic
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     */
    private void addGrafic(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("result", "AddGrafic");
        RequestDispatcher oDispatcher=request.getRequestDispatcher("study.jsp");
                    oDispatcher.forward(request,response);
                    response.sendRedirect("study.jsp");
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
    
    /**
     * 
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     */
    private void createPDF(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("result", "createPDF");
        RequestDispatcher oDispatcher=request.getRequestDispatcher("wine.jsp");
                    oDispatcher.forward(request,response);
                    response.sendRedirect("wine.jsp");
    }

}
