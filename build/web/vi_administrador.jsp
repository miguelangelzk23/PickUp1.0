<%-- 
    Document   : vi_administrador
    Created on : 18-ene-2020, 0:51:00
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">  
        <link rel="stylesheet" href="css/style.css">
        <title>Administrador pick up</title>
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
         <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#nuevoUsuario">
         + Nuevo 
         </button>
        <a href="mensajero/vi_index_mensajeros.jsp"> <button>Mensajeros</button> </a>
        <a> <button>Restaurantes</button> </a>
        <a> <button>Usuarios</button> </a>
        </div>
        
      

<!-- Modal -->
<div class="modal fade" id="nuevoUsuario" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Registro nuevo Usuario</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
          <form action="con_usuarios" method="POST">
                    <div class="form-group">
                     <label for="">Nombre de Usuario</label>
                     <input type="text" name="usu_nombre" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder=" ej: miguelzk23">
                     </div>
                    
                    <div class="form-group">
                     <label for="">Contraseña</label>
                     <input type="password" name="usu_password" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="******">
                     </div>
                    
                    <div class="form-group">
                     <label for="exampleInputEmail1">Confirmar contraseña</label>
                     <input type="password" name="usu_confirmar" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="******">
                     </div>
                    
                    <div class="form-group">
                     <label for="">Rol</label>
                     <select id="" class="form-control" name="usu_rol">
                         <option value="Mensajero">Mensajero</option>
                         <option value="Proveedor">Proveedor</option>
                         <option value="Administrador">Administrador</option>
                    </select>
                     <input type="hidden" name="usu_estado" value="Activo">
                     </div>
                    
                     <div class="form-group">
                     <label for="exampleInputPassword1">Foto</label>
                     <input type="text" name="usu_foto" class="form-control" id="exampleInputPassword1" placeholder="foto">
                    </div>
                    
                    
                    <button type="submit" name="registrar_usuario" class="btn btn-primary">Guardar</button>
</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
        
        
        
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>
