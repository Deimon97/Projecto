<%-- 
    Document   : study.jsp
    Created on : 02-mar-2017, 21:09:31
    Author     : projecto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">  
  <head>  
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />  
    <title>Login</title>  
    <link href="css/style.css" rel="stylesheet" />  
  </head>  
  <body>  
    <header><h1>Study</h1><h5>BIOPROVEN</h5></header>
    <article>
      
      
      <%if(session.getAttribute("userValid")=="ok"){%>
      <nav>
          <a href="#">Cosa</a>
          <a href="logout.jsp">Logout</a>
          <a href="wine.jsp">wine</a>
          <a href ="FileController?ok=AddGrafic">ADDGraffic</a>
          <a href ="wineController?ok=createStusy">Create study</a>
          <a href ="wineController?ok=stadistic">Stadistic</a>
          <a href ="wineController?ok=logStusy">Log study</a>
      </nav>
          
          ${result}
         
        <%}%>
        
      
      <%
          if(request.getParameter("error")!=null){
              int  error=Integer.parseInt(request.getParameter("error"));
              if(error==1) out.println("<h3>Usuari i/o contrasenya no vàlids</h3>");
              if(error==2) out.println("<h3>Has d'omplir tots dos camps</h3>");                            
          }
          %>
    </article>
    <footer>INS Provençana - DAWBIO 2nd course - M15 UF1 Advanced web development (Servlets)</footer>
  </body>  

