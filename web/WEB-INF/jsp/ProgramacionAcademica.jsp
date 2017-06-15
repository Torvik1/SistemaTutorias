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
                            <li><a href="#">Programacion Academica</a></li>
                        </ul>
                    </div>
                </div>
            </nav>   
        </header>
    
                <div class="container" id="proceso">
                     <div class="panel panel-primary" id="RegistroProceso">
                         <div class="panel-heading">
                          Registro
                        </div>
                        <div class="panel-body">
                            <form:form >
                            <h2>Programacion Academica</h2>
                            <p>
                               
                            <form:label path="curso"> Curso</form:label>
                            <form:select path="curso" cssClass="form-control">
                            <form:option value="0">Seleccione Curso..</form:option>
                            <form:option value="1">Algoritmica 1</form:option>
                            <form:option value="2">Matematica Discreta</form:option>
                            <form:option value="3">Ingenieria de Software</form:option>
                            </form:select>
                
                            </p>
                            <p>
                                <form:label path="profesor">Profesor:</form:label>
                                <form:input path="profesor" cssClass="form-control"/>
                            </p>
                            <p>
                                <form:label path="horainicio">Hora Inicio:</form:label>
                                <form:input path="horainicio" cssClass="form-control"/>
                            </p>
                             <p>
                                <form:label path="horafin">Hora Fin:</form:label>
                                <form:input path="horafin" cssClass="form-control"/>
                            </p>
                            <p>
                                <form:label path="dia">Dia:</form:label>
                                <form:input path="dia" cssClass="form-control"/>
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
                          Programacion de Cursos
                        </div>
                    
                        <table class="table table-bordered table-striped table-bordered">
                            <thead>
                                <tr>
                                    <th>Curso</th>
                                    <th>Profesor</th>
                                    <th>Hora</th>
                                    <th>Dia</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>Algoritmica 1</td>
                                    <td>Salinas</td>
                                    <td>3pm-5pm</td>
                                    <td>Jueves</td>
                                    <td style="text-align: center; padding-top: 1px">
                                        <a href="<c:url value="/Principal/AsignacionAlumnos.htm"/>" class="btn">
                                          <span class="icon-add-user" id="iconosProgramacion"></span>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Ecuaciones Diferenciales</td>
                                    <td>Yauri</td>
                                    <td>2pm-4pm</td>
                                    <td>Martes</td>
                                    <td style="text-align: center; padding-top: 1px">
                                        <a href="<c:url value="/AsignacionAlumnos.htm"/>" class="btn">
                                        <span class="icon-add-user" id="iconosProgramacion"></span>
                                        </a>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    
                </div> 
            
        </div>
       
    </body>
</html>

