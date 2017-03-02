/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import static java.lang.System.out;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
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
@WebServlet(name = "UserController", urlPatterns = {"/UserController"})
public class UserController extends HttpServlet {

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
        if(request.getParameter("ok")!=null){
             //sí que he clicat un botó de formulari
             String action=request.getParameter("ok");
             switch(action){
                 case "LOGIN":
                     login(request,response);
                     break;
             }
         }else{
             //no he donat al botó ok
             response.sendRedirect("index.jsp");
         }
        }

    /**
     * Validate the login
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException
     * @throws IOException 
     */
     protected void login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
         if(request.getParameter("user")!=null && request.getParameter("password")!=null ){
                    HttpSession session = request.getSession();
                    session.setAttribute("userValid", "ok");
  
                    response.sendRedirect("index.jsp");
                }else{
                 response.sendRedirect("index.jsp?error=1");
                }
        RequestDispatcher oDispatcher=request.getRequestDispatcher("index.jsp");
        oDispatcher.forward(request,response);
        response.sendRedirect("index.jsp");
        }
     
     private void printing( HttpServletResponse response,String result)
    throws ServletException,IOException{
        
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
           
            out.println("<html>");
            out.println("<head><link rel='stylesheet' type='text/css' href='css/style.css' /> ");
            out.println("<title>Servlet</title>");            
            out.println("</head>");
            out.println("<body><header><h1>Practice</h1><h5>Form field validation</h5></header><article>");
            
            out.println(result);
            out.println("</article></body>");
            out.println("</html>");
        }
        
        

        
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
    
    






