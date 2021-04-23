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
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body onload="alerta('${mensaje}');">
        <div id="encabezado">
            <div></div>
            <div><h1>Mi Empleado ABC</h1></div>
            <div><img src="resources/images/logo.png" id="logo" width="125" height="125"></div>
        </div>

        <ul>
            <li><a href="./index.jsp" class="p1" > <i class="fa fa-home"></i> Inicio</a></li>
            <li><a href="./alta.jsp" class="active"><i class="fa fa-user-plus"></i> Alta de empleado</a></li>
            <li><a href="./eliminar.jsp" class="p1"><i class="fa fa-trash"></i> Eliminar empleado</a></li>
            <li><a href="./actualizar.jsp" class="p1"><i class="fa fa-users"></i> Actualizar empleado</a></li>
            <li><a href="./consulta.jsp" class="p1"><i class="fa fa-search"></i> Consultar empleado</a></li>
        </ul>

        <div class="welcome">
            <h1>Nuevo Empleado</h1>
            <div class="formulario">
                <form action="AltaEmpleado" class="form" method="POST">
                    <label for="id">
                        <b>ID</b>
                        <input type="text" placeholder="ID" name="idT">
                    </label>
                    <label for="fName">
                        <b>Nombre</b>
                        <input type="text" placeholder="Nombre" name="nombreT">
                    </label>
                    <label for="lName">
                        <b>Apellido</b>
                        <input type="text" placeholder="Apellido" name="apellidoT">
                    </label>
                    <label for="puesto">
                        <b>Puesto</b>
                        <input type="text" placeholder="Puesto" name="puestoT">
                    </label>
                    <label for="sueldo">
                        <b>Sueldo</b>
                        <input type="text" placeholder="Sueldo" name="sueldoT">
                    </label>
                    <center><button type="submit" class="btn">Alta</button></center>
                </form>
            </div>
        </div>
    </body>
    <script type="text/javascript">
        function alerta(mensaje) {
            if(mensaje!=""){
                alert(mensaje);
            }
        }
    </script>
</html>
