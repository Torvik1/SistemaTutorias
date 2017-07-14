<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta  charset="UTF-8"/>
       <script type="text/javascript" src="<c:url value="/public/js/jquery-3.2.1.min.js"/>"> </script>
        <link rel="stylesheet" href="<c:url value="/public/css/estilo.css"/>"/>
        <link rel="stylesheet" href="<c:url value="/public/css/fonts/style.css"/>"/>
        <link rel="stylesheet" href="<c:url value="/public/css/bootstrap.css"/>"/>
        <script type="text/javascript" src="<c:url value="/public/js/bootstrap.js"/>"></script>
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
                <form:form role="form" action="/TutoriaFisi/Principal/AgregarProgramacion.htm" method="POST">
                <input type="hidden" name="id_proceso" value="${id}">
                <h2>Programacion Academica</h2>
                    <p>
                    <label> Curso: </label>
                    <select  cssClass="form-control" name="id_curso">
                        <option value="0">Seleccione Curso..</option>
                        <c:forEach items="${cursos}" var="valor">
                            <option  value="${valor.id}">${valor.nombre}</option>
                        </c:forEach>
                    </select>
                    </p>
                                
                    <p>
                    <label >Profesor: </label>
                    <select  cssClass="form-control" name="id_tutor">
                        <option value="0">Seleccione Tutor..</option>
                        <c:forEach items="${tutores}" var="tutor">
                            <option value="${tutor.id_usuario}">${tutor.nombres} ${tutor.apellidos}</option>
                        </c:forEach>
                    </select>   
                    </p>
 
                    <p>
                    <label> GRUPO nro: </label>
                    <input type="text" name="nro_grupo" />
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
            Programacion de Cursos
            </div>
                    
            <table class="table table-bordered table-striped table-bordered">
            <thead>
                <tr>
                    <th style="text-align:center">Grupo</th>
                    <th style="text-align:center">Profesor</th>
                    <th style="text-align:center">Curso</th>
                    <th style="text-align:center">Dia/Hora</th>
                    <th style="text-align:center">Asingar<br>Alumno</th>
                    
                </tr>
            </thead>
            
            <tbody>
                <c:forEach items="${programaciones}" var="programacion" >
                    <tr>
                        <td style="text-align:center">${programacion.grupo}</td>
                        <td style="text-align:center">${programacion.nombre_tutor}</td>
                        <td style="text-align:center">${programacion.nombre_curso}</td>                
                        <td style="text-align: center">
                            <button type="button" data-target="#${programacion.id}" data-id="${programacion.id}" data-toggle="modal" class="icon-calendar" id="btn-listar"></button>
                                            
                            <div class="modal fade" id="${programacion.id}">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button tytle="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                            <h4 class="modal-title"> Definir horario </h4>
                                        </div>
                                        <form:form role="form" action="/TutoriaFisi/Principal/AgregarHorario.htm" method="POST" class="form-horizontal">
                                        <input type="hidden" name="id_programacion" value="${programacion.id}">
                                        <input type="hidden" name="id_proceso" value="${programacion.id_proceso}">
                                        <div class="modal-body">
                                            <div class="form-group">
                                                <label for="dia" class="control-label col-md-2 col-left">Dia:</label>
                                                <div class="col-md-10">
                                                    <select  cssClass="form-control" name="id_hora">
                                                        <option value="0">Seleccione Dia.</option>
                                                        <c:forEach items="${horarios}" var="hora">
                                                            <option value="${hora.id}">${hora.dia}:${hora.inicio}-${hora.fin}</option>
                                                        </c:forEach>
                                                    </select>
                                                    
                                                </div>
                                            </div>
                                            <div class="modal-footer">
                                                <button type="submit" class="btn btn-primary">Guardar</button>
                                                <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>                       
                                            </div>
                                        </div>
                                        <div class=" panel panel primary">
                                            <table class="table table-bordered table-striped table-bordered">
                                                <thead>
                                                    <tr>
                                                      <th>Dia</th>
                                                      <th>HoraInicio</th>
                                                      <th>HoraTermino</th>
                                                    </tr>
                                                </thead>
                                                <tbody class="PanelTablaHorarios">
                                                    
                                                    
                                                </tbody>
                                            </table>
                                        </div>
                                        </form:form>  
                                    </div>
                                </div>
                            </div>
                        </td>
                        <td style="text-align: center">
                        <a href="<c:url value="/Principal/AsignacionAlumnos.htm?id=${programacion.id}"/>"  class="icon-users" ></a>
                        </td>
                    </tr>
                                    
                </c:forEach>
            </tbody>
            </table>
                    
        </div> 
            
        </div>                        
    </body>
    
    
    
    
    
    
     <script type="text/javascript">
        
        $(".icon-calendar").click(function()
        {
            var idprogramacion=$(this).data('id');
            $.ajax(
                    {
                        type:"GET",
                        url:"/TutoriaFisi/tablaHorarios.htm?id="+idprogramacion,
                        data:{},
                        success: function(resultado)
                        {
                            $(".PanelTablaHorarios").html(resultado);
                        }
                    }).done(function(){
                        
                    }).fail(function(){
                     
                    });
        });
        
        </script>
    
</html>

