<%-- 
    Document   : consulta
    Created on : 12/04/2021, 07:21:38 AM
    Author     : Héctor Medel Negrete.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar empleado</title>
        <link rel="icon" type="image/png" href="resources/images/logo.png">
        <link rel="stylesheet" href="resources/css/style.css"/>
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <div id="encabezado">
            <div></div>
            <div><h1>Mi Empleado ABC</h1></div>
            <div><img src="resources/images/logo.png" id="logo" width="125" height="125"></div>
        </div>
        <ul>
            <li><a href="./index.jsp" class="p1" > <i class="fa fa-home"></i> Inicio</a></li>
            <li><a href="./alta.jsp" class="p1"><i class="fa fa-user-plus"></i> Alta de empleado</a></li>
            <li><a href="./eliminar.jsp" class="p1"><i class="fa fa-trash"></i> Eliminar empleado</a></li>
            <li><a href="./actualizar.jsp" class="p1"><i class="fa fa-users"></i> Actualizar empleado</a></li>
            <li><a href="./consulta.jsp" class="active"><i class="fa fa-search"></i> Consultar empleado</a></li>
            <li style="float:right"><a class="p1" href="#about">About</a></li>
        </ul>
        <h2 class="p1">Buscar por id</h2>
        <form action="Consulta" method="POST">
            <br>Id: <input type="text" name="id" placeholder="Ingresa el id"/>
            <br><input type="submit" value="Consulta" />
        </form>
        <%-- Pendiente --%>
        <br>Id: ${e.id}
        <br>Nombre: ${e.nombre}
        <br>Apellidos: ${e.apellidos}
        <br>Puesto: ${e.puesto}
        <br>Sueldo base: ${e.sueldoBase}
        <footer>
            <%-- Mensaje --%>
            ${mensaje}
        </footer>
    </body>
</html>
