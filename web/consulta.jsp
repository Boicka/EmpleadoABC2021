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
        <form action="consulta" method="POST">
            <br>Id: <input type="text" name="id"/>
            <br><input type="submit" value="consulta" />
        </form>
        <%-- Pendiente --%>
        <br>Id: ${empleado.id}
        <br>Nombre: ${empleado.nombre}
        <br>Apellidos: ${empleado.apellidos}
        <br>Puesto: ${empleado.puesto}
        <br>Sueldo base: ${empleado.sueldobase}
        <footer>
            <%-- Mensaje --%>
            ${mensaje}
        </footer>
    </body>
</html>
