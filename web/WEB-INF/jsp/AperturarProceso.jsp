<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
                <div class="container" >
                    <div class="navbar-header">
                        <a href="#" class="navbar-brand" style="font-size:25px">Gestion de Tutorias</a>
                    </div>
                    <div class="collapse navbar-collapse" id="navegacionP">
                        <ul class="nav navbar-nav">
                            <li><a href="<c:url value="/Principal.htm"/>">Inicio</a></li>
                            <li><a href="#">Aperturar Proceso</a></li>
                        </ul>
                    </div>
                </div>
            </nav>   
        </header>
    
                <div class="container" id="proceso">
                     <div class="panel panel-primary" id="RegistroProceso">
                         <div class="panel-heading">
                          Formulario
                        </div>
                        <div class="panel-body">
                            <form:form >
                            <h1>Nuevo Proceso de Tutoria</h1>
                            <p>
                                <form:label path="codigoperiodo">Codigo Periodo:</form:label>
                                <form:input path="codigoperiodo" cssClass="form-control"/>
                            </p>
                            <p>
                                <form:label path="periodo">Periodo Academico:</form:label>
                                <form:input path="periodo" cssClass="form-control"/>
                            </p>
                            <p>
                                <form:label path="leyuniversitaria">Ley Universitaria:</form:label>
                                <form:input path="leyuniversitaria" cssClass="form-control"/>
                            </p>
                        <hr/>
                            <button type="button" class="btn btn-danger btn-lg">
                             <span>Guardar </span>  
                             <span class="glyphicon glyphicon-floppy-disk"></span>
                            </button>
                            </form:form>
                    
                         </div>
                      </div>
            
                    
                <div class="panel panel-primary" id="PanelProcesos">    
                   <div class="panel-heading">
                          Lista de Procesos
                        </div>
                    
                        <table class="table table-bordered table-striped table-bordered">
                            <thead>
                                <tr>
                                    <th>Codigo</th>
                                    <th>Periodo Academico</th>
                                    <th>Ley Universitaria</th>
                                    <th>Estado</th>
                                    <th>Programacion</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>Proceso001</td>
                                    <td>2015-2</td>
                                    <td>30220-2014</td>
                                    <td>
                                        <label class="icon-lock"> Cerrado</label>
                                    </td>
                                    <td style="text-align: center; padding-top: 2px">
                                        <a href="<c:url value="/Principal/ProgramacionAcademica.htm"/>" class="btn">
                                          <span class="icon-list" id="iconosApertura"></span>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Proceso002</td>
                                    <td>2016-1</td>
                                    <td>30220-2014</td>
                                    <td>
                                        <label class="icon-lock-open"> Abierto</label>
                                    </td>
                                    <td style="text-align: center; padding-top: 2px">
                                        <a href="<c:url value="/ProgramacionAcademica.htm"/>" class="btn">
                                        <span class="icon-list" id="iconosApertura"></span>
                                        </a>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    
                </div> 
            
        </div>
       
    </body>
</html>
