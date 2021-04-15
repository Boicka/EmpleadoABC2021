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
    </head>
    <body>
        <div class="encabezado">
            <img src="resources/images/logo.png" id="logo" width="125" height="125"/>
            <h1 class="p1">Mi Empleado ABC</h1>
        </div>
        <ul>
            <li><a href="./index.jsp" class="p1">Inicio</a></li>
            <li><a href="./alta.jsp" class="p1">Alta de empleado</a></li>
            <li><a href="./eliminar.jsp" class="p1">Eliminar empleado</a></li>
            <li><a href="./actualizar.jsp" class="p1">Actualizar empleado</a></li>
            <li><a href="./consulta.jsp" class="active">Consultar empleado</a></li>
            <li style="float:right"><a class="p1" href="#about">About</a></li>
        </ul>
        <h2 class="p1">Buscar por id</h2>
        <form action="Consulta" method="POST">
            <br>Id: <input type="text" name="id"/>
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
