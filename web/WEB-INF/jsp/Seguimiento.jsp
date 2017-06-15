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
                            <li><a href="#">Seguimiento</a></li>
                            
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
                            <form:form>
                            <h2>Consulta de Seguimiento</h2>
                            <p>
                                <select  cssClass="form-control" class=" list-group-item">
                            <option value="0">Buscar Por..</option>
                            <option value="1">Tutor</option>
                            <option value="2">Curso</option>
                            <option value="3">Alumno</option>
                            </select>
                            </p>
                            <p>
                                <select  cssClass="form-control" class=" list-group-item">
                            <option value="0">Seleccione..</option>
                            <option value="1">Ingenieria de Software</option>
                            <option value="2">Matematica Discreta</option>
                            <option value="3">Calculo II</option>
                            </select>
                            </p>
                            <p>
                                <input  cssClass="form-control" class="input-lg" placeholder="Nombre del Alumno"/>
                            </p>
                        <hr/>
                            <button type="button" class=" icon-magnifying-glass btn btn-danger btn-lg">
                             <span> Buscar </span>  
                            </button>
                            </form:form>
                    
                         </div>
                      </div>
            
                    
                <div class="panel panel-primary" id="PanelProcesos">    
                   <div class="panel-heading">
                          Lista de Seguimientos
                        </div>
                    
                        <table class="table table-bordered table-striped table-bordered">
                            <thead>
                                <tr>
                                    <th>Codigo</th>
                                    <th>Nombres</th>
                                    <th>Apellidos</th>
                                    <th>Correo</th>
                                    <th>Seguimiento</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>12200015</td>
                                    <td>Pierina</td>
                                    <td>Gonzales Aburto</td>
                                    <td>pierina.gonzales@unmsm.edu.pe</td>
                                    <td style="text-align: center">
                                        <a href="" >
                                          <span class="icon-list" id="iconosAsignacion"></span>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td>11200013</td>
                                    <td>Melisa</td>
                                    <td>Rivera Solis</td>
                                    <td>melisa.rivera@gmail.com</td>
                                    <td style="text-align: center">
                                        <a href="" >
                                        <span class="icon-list" id="iconosAsignacion"></span>
                                        </a>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    
                </div> 
            
        </div>
       
    </body>
</html>
