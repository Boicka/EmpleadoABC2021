<%-- 
    Document   : index
    Created on : 17/03/2021, 07:27:38 AM
    Author     : Héctor Medel Negrete
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Empleado ABC</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
        <li><a href="./index.jsp" class="active">Inicio</a></li>
        <li><a href="./alta.jsp" class="p1">Alta de empleado</a></li>
        <li><a href="./eliminar.jsp" class="p1">Eliminar empleado</a></li>
        <li><a href="./actualizar.jsp" class="p1">Actualizar empleado</a></li>
        <li><a href="./consulta.jsp" title="Consultar" class="p1">Consultar empleado</a></li>
        <li style="float:right"><a class="p1" href="#about">About</a></li>
    </ul>

</body>
</html>
