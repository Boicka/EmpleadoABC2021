<%-- 
    Document   : newjspAlta
    Created on : 12/04/2021, 10:36:55 PM
    Author     : serio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/css/style.css"/>
        <title>Alta de empleados</title>
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
            <li><a href="./alta.jsp" class="active">Alta de empleado</a></li>
            <li><a href="./eliminar.jsp" class="p1">Eliminar empleado</a></li>
            <li><a href="./actualizar.jsp" class="p1">Actualizar empleado</a></li>
            <li><a href="./consulta.jsp" title="Consultar" class="p1">Consultar empleado</a></li>
            <li style="float:right"><a class="p1" href="#about">About</a></li>
        </ul>
        
        <h2 class="p1">Nuevo empleado</h2>
        
        <form action="AltaEmpleado" method="POST">
            <br>Id: <input type="text" name="idT"/>
            <br>Nombre: <input type="text" name="nombreT"/>
            <br>Apellidos: <input type="text" name="apellidosT"/>
            <br>Puesto: <input type="text" name="puestoT"/>
            <br>Sueldo: <input type="text" name="sueldoT"/>
            <br><input type="submit" value="Alta"/>
        </form>
        <footer>
            ${mensaje}
        </footer>
    </body>
</html>
