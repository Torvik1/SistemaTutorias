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
                            <li><a href="#">Cargar Tutores</a></li>
                             
                        </ul>
                    </div>
                </div>
            </nav>   
        </header>
    
                <div class="container" id="proceso">
                     <div class="panel panel-primary" id="RegistroProceso">
                         <div class="panel-heading">
                          Importar
                        </div>
                        <div class="panel-body">
                            <form:form >
                            <h2>Descarga excel de Tutores</h2>
                            <span class="btn btn-default btn-file">
                             Navegador <input type="file" >
                            </span>
                            <span class="icon-download btn btn-danger "> Importar</span>
                            <span class="icon-trash btn btn-danger "> Remover</span>
                            </form:form>
                    
                         </div>
                      </div>
            
                    
                <div class="panel panel-primary" id="PanelProcesos">    
                   <div class="panel-heading">
                          Lista de Tutores
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
                                <tr>
                                    <td>001</td>
                                    <td>Jorge</td>
                                    <td>Guerra Guerra</td>
                                    <td>jorge.guerra@unmsm.edu.pe</td>
                                    <td>
                                        <a href="" >
                                          <span class="" id="iconosAsignacion"></span>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td>002</td>
                                    <td>Cesar</td>
                                    <td>Luza Montero</td>
                                    <td>cesar.luza@gmail.com</td>
                                    <td >
                                        <a href="" >
                                        <span class="" id="iconosAsignacion"></span>
                                        </a>
                                    </td>
                                </tr>
                                 <tr>
                                    <td>003</td>
                                    <td>Victor</td>
                                    <td>Bustamante Olivera</td>
                                    <td>victor.bustamante@gmail.com</td>
                                    <td >
                                        <a href="" >
                                        <span class="" id="iconosAsignacion"></span>
                                        </a>
                                    </td>
                                </tr>
                                 <tr>
                                    <td>004</td>
                                    <td>Luzmila</td>
                                    <td>Pro Concepcion</td>
                                    <td>luzmila.pro@gmail.com</td>
                                    <td >
                                        <a href="" >
                                        <span class="" id="iconosAsignacion"></span>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td>005</td>
                                    <td>Armando David</td>
                                    <td>Espinoza Robles</td>
                                    <td>armando.espinoza@gmail.com</td>
                                    <td >
                                        <a href="" >
                                        <span class="" id="iconosAsignacion"></span>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td>006</td>
                                    <td>Felix Armando</td>
                                    <td>Fermin Perez</td>
                                    <td>fermin.felix@gmail.com</td>
                                    <td >
                                        <a href="" >
                                        <span class="" id="iconosAsignacion"></span>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td>007</td>
                                    <td>Javier</td>
                                    <td>Gamboa Cruzado</td>
                                    <td>javier.gamboa@gmail.com</td>
                                    <td >
                                        <a href="" >
                                        <span class="" id="iconosAsignacion"></span>
                                        </a>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    
                </div> 
            
        </div>
       
    </body>
</html>
