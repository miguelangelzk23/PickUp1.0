<%-- 
    Document   : insert_mensajero
    Created on : 20-ene-2020, 17:24:48
    Author     : usuario
--%>

<%@page import="modelo.Mod_usuarios"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Mod_usuarios_get_set"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">  
         <link rel="stylesheet" href="../css/style.css">
        <title>insertar menjasero</title>
     <%
        String nombre_usu;
        HttpSession nom_usuario = request.getSession(false);
        nombre_usu = (String)nom_usuario.getAttribute("nom_user");
       
     %>
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
          
            
         ArrayList<Mod_usuarios_get_set> listaMensajero = new ArrayList<>();
         Mod_usuarios_get_set datosMensajero = new Mod_usuarios_get_set();
         Mod_usuarios consultaUno = new Mod_usuarios();
         listaMensajero = consultaUno.consultarUnUsuario(nombre_usu);
         for (int i = 0 ; i<listaMensajero.size();i++)
         {
             datosMensajero = listaMensajero.get(i);
             %>
           
             
              
        
        
        <hr>
        <div class="container">
             <h3> Registrar Mensajero</h3>
             <form action="../con_mensajeros" method="POST">
    
      <div class="form-group">
    <label for="">id Mensajero</label>
    <input class="form-control" type="hidden" name="men_usu_id" value="<%=datosMensajero.getUsu_id()%>">
    </div>             
            
    <div class="form-group">
    <label for="">Nombre de usuario</label>
    <input class="form-control" type="text" placeholder="<%=datosMensajero.getUsu_nombre()%>" readonly>
  
    </div>
            <%
            }
        %>
        
            
  <div class="form-group">
    <label for="">Nombre y Apellido</label>
    <input type="text" name="men_nombre" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" placeholder="Antonio Parra" >
  </div>
  <div class="form-group">
    <label for="">Cedula</label>
    <input type="number"  name="men_cedula" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" placeholder="cc." >
  </div>
  <div class="form-group">
    <label for="">Direccion</label>
    <input type="text" name="men_direccion" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" placeholder="Calle 5 # 21 -30" >
  </div>
  <div class="form-group">
    <label for="">Barrio</label>
    <input type="text" name="men_barrio" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" placeholder="La pradera" >
  </div>
  <div class="form-group">
    <label for="">Descripcion</label>
    <input type="text" name="men_descripcion" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" placeholder="torre 9 apt 404" >
  </div>
  <div class="form-group">
    <label for="">Celular</label>
    <input type="text" name="men_celular" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" placeholder="3202363690" >
  </div>
  <div class="form-group">
    <label for="">Email</label>
    <input type="text" name="men_email" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" placeholder="mensajero@gmail.com" >
  </div>
            
  
    <button type="submit" name="registrar_mensajero" class="btn btn-primary">Submit</button>
</form>
        </div>
    </body>
</html>
