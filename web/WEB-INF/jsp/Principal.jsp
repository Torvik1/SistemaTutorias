
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta  charset="UTF-8"/>
       <!-- <script src="<c:url value="public/js/jquery-3.2.1.min.js"/>" </script>-->
        <link rel="stylesheet" href="<c:url value="/public/css/estilo.css"/>"/>
        <link rel="stylesheet" href="<c:url value="/public/css/fonts/style.css"/>"/>
        <link rel="stylesheet" href="<c:url value="/public/css/bootstrap.css"/>"/>
        
        <title>GESTION DE TUTORIAS</title>
    </head>
    <body>
        <header>
            <nav class="navbar navbar-inverse navbar-static-top" role="navigation">
                <div class="container">
                    <div class="navbar-header">
                        <a href="#" class="navbar-brand" style="font-size:25px">Gestion de Tutorias</a>
                    </div>
                    <div class="collapse navbar-collapse" id="navegacionP">
                        <ul class="nav navbar-nav">
                            <li><a href="<c:url value="/Principal.htm"/>">Inicio</a></li>
                        </ul>
                    </div>
                </div>
            </nav>   
        </header>
        <div class="container-fluid">
     
            <a href="<c:url value="/Principal/AperturarProceso.htm"/>" class="button blue large" id="BotonesPrincipales">
                <span class="icon-lock-open" id="iconosPrincipales"></span>
                <p>Apertura de Proceso</p>
            </a>
            <a href="<c:url value="/Principal/CargarTutores.htm"/>" class="button blue large" id="BotonesPrincipales">
		<span class="icon-users" id="iconosPrincipales"></span>
                <p>Tutores</p>
            </a>
            <a href="<c:url value="/Principal/CargarAlumnos.htm"/>" class="button blue large" id="BotonesPrincipales">
                <span class="icon-graduation-cap" id="iconosPrincipales"></span>
                <p>Tutorando</p>
            </a>
             <a href="<c:url value="/Principal/Seguimiento.htm"/>" class="button blue large" id="BotonesPrincipales">
                 <span class="icon-magnifying-glass" id="iconosPrincipales"></span>
                <p>Seguimiento</p>
            </a>
        </div>
    </body>
</html>
