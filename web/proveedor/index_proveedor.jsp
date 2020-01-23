<%-- 
    Document   : index_proveedor
    Created on : 22-ene-2020, 17:04:31
    Author     : usuario
--%>

<%@page import="modelo.Mod_proveedor"%>
<%@page import="modelo.Mod_proveedor_get_set"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">  
         <link rel="stylesheet" href="../css/style.css">
        <title>index proveedor</title>
    </head>
    <body>
         <nav class="navbar navbar-expand-lg navbar-light " id="nav_user">
            <a class="navbar-brand" href="#" id="logo">PickUp</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav ml-auto">
      <li class="nav-item active">
          <a class="nav-link" href="#">Adminnistrador<span class="sr-only">(current)</span></a>
      </li>
     
   
      <li class="nav-item">
          <a class="nav-link" href="#" id="nombre">Miguel</a>
      </li>
      
         <li class="nav-item dropdown" id="colap">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fas fa-user-cog" id="icon_confi"></i>
        </a>
          <div class="dropdown-menu " aria-labelledby="navbarDropdownMenuLink" id="contenedor_congi">
         
          <a class="dropdown-item" href="#"><form action="con_cerrar">
                  <input type="submit" name="cerrar" value=" cerrar session" style="background-color: #33d9b2; color: #ffffff;border: none; width: 100%;text-align: end">
        </form></a>
          
          </li>
    </ul>
  </div>
      

             
</nav>
        
        <hr>
        
        <div class="container">
             <table class="table" id="tabla_proveedor">
             <thead>
                <tr>
                    <th colspan="8">Datos Proveedor</th>
                </tr>
            </thead>
            
            <tr>
                <th>Nit</th>
                <th>Nombre</th>
                <th>telefono</th>
                <th>direccion</th>
                <th>email</th>
                <th>horario</th>
                <th>Confi</th>
            </tr>
            
           
                <%
                ArrayList<Mod_proveedor_get_set> lista_proveedor = new ArrayList<>();
                Mod_proveedor_get_set datos_proveedor = new Mod_proveedor_get_set();
                Mod_proveedor consulta_pro = new Mod_proveedor();
                lista_proveedor = consulta_pro.consultarProveedor();
                
                for (int i = 0; i < lista_proveedor.size();i++)
                {
                    datos_proveedor = lista_proveedor.get(i);
                    %>
                    
            <tr>
                <td><%=datos_proveedor.getProve_nit()%></td>
                <td><%=datos_proveedor.getProve_nombre()%></td>
                <td><%=datos_proveedor.getProve_telefono()%></td>
                <td><%=datos_proveedor.getProve_diceccion()%></td>
                <td><%=datos_proveedor.getProve_email()%></td>
                <td><%=datos_proveedor.getProve_horario()%></td>
            <form action="editar_proveedor.jsp">
                <input type="hidden" name="prove_nit" value="<%=datos_proveedor.getProve_nit()%>">
                 <td>
                    <button type="submit" name="editar_proveedor" style="background-color: #ffffff"> <i class="fas fa-cog"></i></button>
                </td>
            </form>
                
            </form>
            </tr>
                <%    
                }
                %>
            
        </table>
        </div>
        
        
        
        
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>
