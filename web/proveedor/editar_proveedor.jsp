<%-- 
    Document   : editar_proveedor
    Created on : 23-ene-2020, 0:39:58
    Author     : usuario
--%>

<%@page import="modelo.Mod_tipo_proveedor"%>
<%@page import="modelo.Mod_tipo_proveedor_get_set"%>
<%@page import="modelo.Mod_proveedor"%>
<%@page import="modelo.Mod_show_provedor_get_set"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">  
         <link rel="stylesheet" href="../css/style.css">
        <title>Editar Proveedor</title>
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
        int nit_provedor = Integer.parseInt(request.getParameter("prove_nit"));
        
        ArrayList<Mod_show_provedor_get_set> listaUnProveedor = new ArrayList<>();
        Mod_show_provedor_get_set datosUnProveedor = new Mod_show_provedor_get_set();
        Mod_proveedor consultaUn = new Mod_proveedor();
        listaUnProveedor = consultaUn.consultarUnProveedor(nit_provedor);
        
        for(int i = 0;i <listaUnProveedor.size();i++)
        {
            datosUnProveedor = listaUnProveedor.get(i);
            %>
          
            
            
            
             <div class="container">
             <h3> Actualizar Proveedor</h3>
             <form action="../con_proveedor" method="POST">
    
          <div class="form-row">
      <div class="form-group col-md-6" >
    <label for="">Nit Proveedor</label>
    <input class="form-control" type="text" name="prove_nit" value="<%=datosUnProveedor.getProve_nit()%>" readonly>
    <input type="hidden"  name="prove_nit"value="<%=datosUnProveedor.getProve_nit()%>">
    
    </div>             
            
    <div class="form-group col-md-6" >
    <label for="">Nombre de usuario</label>
    <input class="form-control" type="text" placeholder="<%=datosUnProveedor.getUsu_nombre()%>" readonly>
    </div>
      </div>
    

    <div class="form-row">
    <div class="form-group col-md-6">
    <label for="">Rol</label>
    <input class="form-control" type="text" placeholder="<%=datosUnProveedor.getUsu_rol()%>" readonly>
    </div>
    
    <div class="form-group col-md-6">
    <label for="">categoria</label>
    
         <%
          int dat = datosUnProveedor.getProve_tipo_codigo();
         ArrayList<Mod_tipo_proveedor_get_set> listauTipoProvedor = new ArrayList<>();
           Mod_tipo_proveedor_get_set datosuTipo = new Mod_tipo_proveedor_get_set();
           Mod_tipo_proveedor consultauTipo = new  Mod_tipo_proveedor();
           listauTipoProvedor  = consultauTipo.consultar_un_TipoProveedor(dat);
           
        for (int k = 0; k <listauTipoProvedor.size();k++ )
               {
                   datosuTipo = listauTipoProvedor.get(k);
               %>
    
               
    <select class="form-control" name="prove_tipo_codigo">
        
                <option value="<%=datosuTipo.getTipo_codigo()%>"><%=datosuTipo.getTipo_nombre()%></option>
                 <%
               }
%>
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
    </div>       
        
     <div class="form-group">
    <label for="">Foto</label>
    <input type="text" name="usu_foto" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" value="<%=datosUnProveedor.getUsu_foto()%>" >
  </div>       
    
  <div class="form-row">
  <div class="form-group col-md-6">
    <label for="">Nombre del Proveedor</label>
    <input type="text" name="prove_nombre" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" value="<%=datosUnProveedor.getProve_nombre()%>" >
  </div>
  <div class="form-group col-md-6">
    <label for="">Telefono</label>
    <input type="text"  name="prove_telefono" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" value="<%=datosUnProveedor.getProve_telefono()%>" >
  </div>
  </div>
  
  <div class="form-row">
  <div class="form-group col-md-6">
    <label for="">Direccion</label>
    <input type="text" name="prove_direccion" class="form-control" id="insert_mensajero" aria-describedby="emailHelp"value="<%=datosUnProveedor.getProve_diceccion()%>" >
  </div>
  <div class="form-group col-md-6">
    <label for="">Email</label>
    <input type="text" name="prove_email" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" value="<%=datosUnProveedor.getProve_email()%>">
  </div>
  </div>
  <div class="form-group">
    <label for="">Horario de atencion</label>
    <input type="text" name="prove_horario" class="form-control" id="insert_mensajero" aria-describedby="emailHelp"value="<%=datosUnProveedor.getProve_horario()%>" >
  </div>
  
  <div class="form-row">
      
  
  <div class="form-group col-md-6">
    <label for="">Estado</label>
    <select class="form-control" name="usu_estado" >
        <option value="<%=datosUnProveedor.getUsu_estado()%>"><%=datosUnProveedor.getUsu_estado()%></option>
        <option value="inactivo">Inactivo</option>
        <option value="inactivo">Activo</option>
    </select>
  </div>
  
  </div>
  
  <div class="row">
    <button type="submit" name="editar_proveedor" class="btn btn-primary col-md-6">Guardar Cambios</button>
    
    <form action="../con_proveedor">
        <button  class="btn btn-danger col-md-6" type="submit" >Eliminar Proveedor</button>
    </form>
    </div>
    
    </form>
           <%
            }
            %>
     </div>
   
    </body>
</html>
