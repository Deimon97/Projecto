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
         }
                 
     }
    
    






