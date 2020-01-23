<%-- 
    Document   : insert_proveedor
    Created on : 22-ene-2020, 19:32:19
    Author     : usuario
--%>

<%@page import="modelo.Mod_tipo_proveedor"%>
<%@page import="modelo.Mod_tipo_proveedor_get_set"%>
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
        <title>JSP Page</title>
    </head>
       <%
        String nombre_usu;
        HttpSession nom_usuario = request.getSession(false);
        nombre_usu = (String)nom_usuario.getAttribute("nom_user");
       %>
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
            
         ArrayList<Mod_usuarios_get_set> listaProveedor = new ArrayList<>();
         Mod_usuarios_get_set datosProveedor = new Mod_usuarios_get_set();
         Mod_usuarios consultaUno = new Mod_usuarios();
         listaProveedor = consultaUno.consultarUnUsuario(nombre_usu);
         for (int i = 0 ; i<listaProveedor.size();i++)
         {
             datosProveedor = listaProveedor.get(i);
             %>
           
             <hr>
             
              <hr>
        <div class="container">
             <h3> Registrar Mensajero</h3>
             <form action="../con_proveedor" method="POST">
    
      <div class="form-group">
    <label for=""></label>
    <input class="form-control" type="hidden" name="prove_usu_id" value="<%=datosProveedor.getUsu_id()%>">
    </div>             
            
    <div class="form-group">
    <label for="">Nombre de usuario</label>
    <input class="form-control" type="text" placeholder="<%=datosProveedor.getUsu_nombre()%>" readonly>
  
    </div>
            <%
            }
        %>
        
            
  <div class="form-group">
    <label for="">Nit</label>
    <input type="text" name="prove_nit" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" placeholder="11,338,854-3" >
  </div>
  <div class="form-group">
    <label for="">Nombre Proveedor</label>
    <input type="text"  name="prove_nombre" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" placeholder="Restaurante bar la Carreta" >
  </div>
  <div class="form-group">
    <label for="">Direccion</label>
    <input type="text" name="prove_direccion" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" placeholder="Calle 5 # 21 -30" >
  </div>

  <div class="form-group">
    <label for="">Celular</label>
    <input type="text" name="prove_celular" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" placeholder="3202363690" >
  </div>
  <div class="form-group">
    <label for="">Email</label>
    <input type="text" name="prove_email" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" placeholder="mensajero@gmail.com" >
  </div>
        
        <div class="form-group">
    <label for="">Horario de Atencion</label>
    <input type="text" name="prove_horario" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" placeholder="lunes a Domingo 8:00 am a 5:00pm" >
  </div>
            
        
        
    <div class="form-group ">
       
               <label for="">Categoria del Proveedor</label>
   
    
    <select class="form-control" name="prove_tipo_codigo">
         <%
           ArrayList<Mod_tipo_proveedor_get_set> listaTipoProvedor = new ArrayList<>();
           Mod_tipo_proveedor_get_set datosTipo = new Mod_tipo_proveedor_get_set();
           Mod_tipo_proveedor consultaTipo = new  Mod_tipo_proveedor();
           listaTipoProvedor  = consultaTipo.consultarTipoProveedor();
           for(int j = 0; j < listaTipoProvedor.size();j++)
           {
               datosTipo = listaTipoProvedor.get(j);
               %>
        <option value="<%=datosTipo.getTipo_codigo()%>"><%=datosTipo.getTipo_nombre()%></option>
          <%    
           }
           %>
    </select>
         
    
    </div>
        
    <button type="submit" name="registrar_proveedor" class="btn btn-primary">Registrar</button>
</form>
        </div>
             
      
          <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>
