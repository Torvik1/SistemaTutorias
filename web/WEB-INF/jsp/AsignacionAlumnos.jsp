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
                            <li><a href="#">Asignacion</a></li>
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
                            <form:form action="/TutoriaFisi/Principal/AgregarPAtutorando.htm" method="POST" >
                                <input type="hidden" name="id_programacion_academica" value="${id}"/>
                            <h2>Asignacion de Alumnos</h2>
                            <p>
                            <label > Alumno</label>
                            <select  cssClass="form-control" name="id_tutorando">
                            <option value="0">Elija Alumno</option>
                           <c:forEach items="${tutorandos}" var="tutorando">
                            <option value="${tutorando.id_usuario}">${tutorando.nombres} ${tutorando.apellidos}</option>
                            </c:forEach>
                            </select>
                
                            </p>
                            
                        <hr/>
                            <button type="submit" class="btn btn-danger btn-lg">
                             <span>Agregar </span>  
                             <span class="glyphicon glyphicon-plus"></span>
                            </button>
                            </form:form>
                    
                         </div>
                      </div>
            
                    
                <div class="panel panel-primary" id="PanelProcesos">    
                   <div class="panel-heading">
                          Lista de Alumnos en el Curso
                        </div>
                    
                        <table class="table table-bordered table-striped table-bordered">
                            <thead>
                                <tr>
                                    <th>Codigo</th>
                                    <th>Nombres</th>
                                    <th>Apellidos</th>
                                    <th>Email</th>
                                    <th> </th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${PAtutorando}" var="dato">
                                    <tr>
                                        <td>dato.id</td>
                                        <td>dato.nombres</td>
                                        <td>dato.apellidos</td>
                                        <td>dato.telefono</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    
                </div> 
            
        </div>
       
    </body>
</html>