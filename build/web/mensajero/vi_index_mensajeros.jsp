<%-- 
    Document   : index_mensajeros
    Created on : 18-ene-2020, 1:35:56
    Author     : usuario
--%>

<%@page import="modelo.Mod_mensajeros"%>    
<%@page import="modelo.Mod_mensajeros_get_set"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">  
         <link rel="stylesheet" href="../css/style.css">
        <title>index mensajero</title>
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
        
        <div class="container" >
           
        
        <table class="table" id="tabla_mensajero">
            

            <thead>
                <tr>
                    <th colspan="8">Datos mensajeros</th>
                </tr>
            </thead>
            <tr>
                <th>Id</th>
                <th>Cedula</th>
                <th>Nombre</th>
                <th>direccion</th>
                <th>Barrio</th>
                <th>Descripcion</th>
                <th>Telefono</th>
                <th>Email</th>
                <th>Confi</th>
                
            </tr>
            
            <%
                ArrayList<Mod_mensajeros_get_set> listaMensajeros = new ArrayList<>();
                Mod_mensajeros_get_set datos_mensajeros = new Mod_mensajeros_get_set();
                Mod_mensajeros consulta_mensajero = new Mod_mensajeros();
                listaMensajeros=consulta_mensajero.consultarMensajero();
                
                for(int j= 0; j < listaMensajeros.size();j++)
                {
                    datos_mensajeros = listaMensajeros.get(j);
                %>
                
                <tr>
                    <td><%=datos_mensajeros.getMen_id()%></td>
                    <td><%=datos_mensajeros.getMen_cedula()%></td>
                    <td><%=datos_mensajeros.getMen_nombre()%></td>
                    <td><%=datos_mensajeros.getMen_direccion()%></td>
                    <td><%=datos_mensajeros.getMen_barrio()%></td>
                    <td><%=datos_mensajeros.getMen_descripcion()%></td>
                    <td><%=datos_mensajeros.getMen_telefono()%></td>
                    <td><%=datos_mensajeros.getMen_email()%></td>
                <form action="editar_mensajero.jsp">
                    <input type="hidden" name="men_id" value="<%=datos_mensajeros.getMen_id()%>">
                    <td> <button type="submit" name="editar_mensajero" style="background-color: #ffffff"> <i class="fas fa-cog"></i></button></td>
                </form>
                    
                </tr>
                
                <%
                }
                %>
        </table>
         
        </div>

        
    </body>
</html>
