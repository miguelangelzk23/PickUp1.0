<%-- 
    Document   : insert_mensajero
    Created on : 20-ene-2020, 17:24:48
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">  
         <link rel="stylesheet" href="../css/style.css">
        <title>insertar menjasero</title>
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
             <h3> Registrar Mensajero</h3>
        <form>
  <div class="form-group">
    <label for="">Nombre y Apellido</label>
    <input type="text" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" placeholder="Antonio Parra" >
  </div>
  <div class="form-group">
    <label for="">Cedula</label>
    <input type="number" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" placeholder="cc." >
  </div>
  <div class="form-group">
    <label for="">Direccion</label>
    <input type="text" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" placeholder="Calle 5 # 21 -30" >
  </div>
  <div class="form-group">
    <label for="">Barrio</label>
    <input type="text" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" placeholder="La pradera" >
  </div>
  <div class="form-group">
    <label for="">Descripcion</label>
    <input type="text" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" placeholder="torre 9 apt 404" >
  </div>
  <div class="form-group">
    <label for="">Celular</label>
    <input type="text" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" placeholder="3202363690" >
  </div>
  <div class="form-group">
    <label for="">Email</label>
    <input type="text" class="form-control" id="insert_mensajero" aria-describedby="emailHelp" placeholder="mensajero@gmail.com" >
  </div>
            
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
        </div>
    </body>
</html>
