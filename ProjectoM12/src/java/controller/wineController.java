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
@WebServlet(name = "wineController", urlPatterns = {"/wineController"})
public class wineController extends HttpServlet {

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
                 case "PRUEBA":
                     login(request,response);
                     break;
                 case "createStusy":
                     createStusy(request,response);
                     break;
                 case "stadistic":
                     stadistic(request,response);
                     break;
                  case "searchExtern":
                     searchExtern(request,response);
                     break;
                  case "searchGene":
                     searchGene(request,response);
                     break;
                  case "logStusy":
                     logStusy(request,response);
                     break;
                  case "saveStusy":
                     saveStusy(request,response);
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
         
            HttpSession session = request.getSession();
            request.setAttribute("prueba", "okidoki");
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
    /**
     * 
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     */
    private void createStusy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("result", "createStudy");
        RequestDispatcher oDispatcher=request.getRequestDispatcher("study.jsp");
                    oDispatcher.forward(request,response);
                    response.sendRedirect("study.jsp");
    }
    /**
     * 
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     */
    private void stadistic(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("result", "stadistic");
        RequestDispatcher oDispatcher=request.getRequestDispatcher("study.jsp");
                    oDispatcher.forward(request,response);
                    response.sendRedirect("study.jsp");
    }
    /**
     * 
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     */
    private void searchExtern(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("result", "searchExtern");
        RequestDispatcher oDispatcher=request.getRequestDispatcher("wine.jsp");
                    oDispatcher.forward(request,response);
                    response.sendRedirect("wine.jsp");
    }
    /**
     * 
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     */
    private void searchGene(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("result", "searchGene");
        RequestDispatcher oDispatcher=request.getRequestDispatcher("wine.jsp");
                    oDispatcher.forward(request,response);
                    response.sendRedirect("wine.jsp");
    }
    /**
     * 
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     */
    private void logStusy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("result", "logStudy");
        RequestDispatcher oDispatcher=request.getRequestDispatcher("study.jsp");
                    oDispatcher.forward(request,response);
                    response.sendRedirect("study.jsp");
    }
    /**
     * 
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     */
    private void saveStusy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("result", "saveStudy");
        RequestDispatcher oDispatcher=request.getRequestDispatcher("study.jsp");
                    oDispatcher.forward(request,response);
                    response.sendRedirect("study.jsp");
    }
                 
     }