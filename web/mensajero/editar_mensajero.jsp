<%-- 
    Document   : editar_mensajero
    Created on : 21-ene-2020, 2:57:05
    Author     : usuario
--%>

<%@page import="modelo.Mod_mensajeros"%>
<%@page import="modelo.Mod_show_mensajero_get_set"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">  
         <link rel="stylesheet" href="../css/style.css">
        <title>JSP Page</title>
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
        
        
        <%
            int id_mensajero = Integer.parseInt(request.getParameter("men_id"));
             
            ArrayList<Mod_show_mensajero_get_set> listaUnMensajero = new ArrayList<>();
            Mod_show_mensajero_get_set datosUnMensajero = new Mod_show_mensajero_get_set();
            Mod_mensajeros consultaUn = new Mod_mensajeros();
            listaUnMensajero = consultaUn.consultar_un_Mensajero(id_mensajero);
            
            for (int i = 0;i<listaUnMensajero.size();i++)
            {
                datosUnMensajero = listaUnMensajero.get(i);
                %>
                
                  <div class="container">
             <h3> editar Mensajero</h3>
             <form action="../con_mensajeros" method="POST">
    
      <div class="form-group">
    <label for="">id Mensajero</label>
    <input class="form-control" type="text" name="men_usu_id" value="<%=datosUnMensajero.getMen_id()%>" readonly>
    </div>             
            
    <div class="form-group">
    <label for="">Nombre de usuario</label>
    <input class="form-control" type="text" placeholder="<%=datosUnMensajero.getUsu_nombre()%>" readonly>
    </div>
    
    <div class="form-group">
    <label for="">Rol</label>
    <input class="form-control" type="text" placeholder="<%=datosUnMensajero.getUsu_rol()%>" readonly>
    </div>
    
    <div class="form-group">
    <label for="">Estado</label>
    <input class="form-control" type="text" placeholder="<%=datosUnMensajero.getUsu_estado()%>" readonly>
    </div>
           
     <div class="form-group">
    <label for="">Foto</label>
    <input type="text" name="men_nombre" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" value="<%=datosUnMensajero.getUsu_foto()%>" >
  </div>       
    
    
  <div class="form-group">
    <label for="">Nombre y Apellido</label>
    <input type="text" name="men_nombre" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" value="<%=datosUnMensajero.getMen_nombre()%>" >
  </div>
  <div class="form-group">
    <label for="">Cedula</label>
    <input type="text"  name="men_cedula" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" value="<%=datosUnMensajero.getMen_cedula()%>" >
  </div>
  <div class="form-group">
    <label for="">Direccion</label>
    <input type="text" name="men_direccion" class="form-control" id="insert_mensajero" aria-describedby="emailHelp"value="<%=datosUnMensajero.getMen_direccion()%>" >
  </div>
  <div class="form-group">
    <label for="">Barrio</label>
    <input type="text" name="men_barrio" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" value="<%=datosUnMensajero.getMen_barrio()%>">
  </div>
  <div class="form-group">
    <label for="">Descripcion</label>
    <input type="text" name="men_descripcion" class="form-control" id="insert_mensajero" aria-describedby="emailHelp"value="<%=datosUnMensajero.getMen_descripcion()%>" >
  </div>
  <div class="form-group">
    <label for="">Celular</label>
    <input type="text" name="men_celular" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" value="<%=datosUnMensajero.getMen_telefono()%>" >
  </div>
  <div class="form-group">
    <label for="">Email</label>
    <input type="text" name="men_email" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" value="<%=datosUnMensajero.getMen_email()%>" >
  </div>
  <%
            }
%>
  
    <button type="submit" name="registrar_mensajero" class="btn btn-primary">Submit</button>
</form>
        </div>
          
    </body>
</html>
