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
                            <form:form role="form" action="/TutoriaFisi/Principal/AgregarProceso.htm" method="POST">
                            <h1>Nuevo Proceso de Tutoria</h1>
                            <p>
                                <label>Periodo Academico:</label>
                                <input type="text" class="form-control"   name="periodo">
                            </p>
                            <p>
                                <label >Ley Universitaria:</label>
                                <input type="text" class="form-control"  name="ley">
                            </p>
                            <p>
                                <label>Fecha de Apertura:</label>
                                <input type="text" class="form-control"  name="fapertura">
                            </p>
     
                            <p>
                                <label >Fecha de Clausura</label>
                               <input type="text" class="form-control" name="fclausura">
                            </p>
                        <hr/>
                            <button type="submit" class="btn btn-danger">
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
                                    
                                    <th>Periodo Aca.</th>
                                    <th>Ley Univ.</th>
                                    <th>FechaIn</th>
                                    <th>FechaFn</th>
                                    <th>Estado</th>
                                    <th>Prog.</th>
                                </tr>
                            </thead>
                            <tbody>
                                
                                <c:forEach items="${valores}" var="valor">
                                <tr>
                                    <td>${valor.periodo}</td>
                                    <td>${valor.leyuniversitaria}</td>
                                    <td>${valor.fechaApertura}</td>
                                    <td>${valor.fechaClausura}</td>
                                    
                                    <td>
                                        <label class="icon-lock">${valor.estado}</label>
                                    </td>
                                    <td style="text-align: center; padding-top: 2px">
                                        <a href="<c:url value="/Principal/ProgramacionAcademica.htm?id=${valor.id}"/>" class="btn">
                                          <span class="icon-list" id="iconosApertura"></span>
                                        </a>
                                    </td>
                                </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    
                </div> 
            
        </div>
       
    </body>
</html>
