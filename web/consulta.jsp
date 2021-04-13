<%-- 
    Document   : consulta
    Created on : 12/04/2021, 07:21:38 AM
    Author     : serio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar</title>
    </head>
    <body>
        <h1>Consultar Empleados</h1>
        <h2>Buscar por id</h2>
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
