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
        <script type="text/javascript" src="<c:url value="/public/js/funciones.js"/>"></script>
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
                            <li><a href="#">Cargar Tutores</a></li>
                             
                        </ul>
                    </div>
                </div>
            </nav>   
        </header>
    
                <div class="container" id="proceso">
                    <div class="panel panel-primary" id="PanelCargarTutores">
                        <div class="panel-heading" >
                          Importar
                        </div>
                        <div class="panel-body" >
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
            
                    
    <div class="panel panel-primary" id="PanelTablaTutores">
    <a href="#ventana1" class="btn btn-primary " data-toggle="modal" >Añadir Usuario</a> 
       <div class="panel-heading">
        Lista de Tutores
        </div >
            <table class="table table-bordered table-striped table-bordered">
             <thead>
             <tr>
             <th>Codigo</th>
             <th>Nombres</th>
             <th>Apellidos</th>
             <th>Telefono</th>
             <th>Emails</th>
             <th> </th>
             <th> </th>
             </tr>
             </thead>
             <tbody>
             <c:forEach items="${valores}" var="valor">
              <tr>
                <td>${valor.id}</td>
                <td>${valor.nombres}</td>
                <td>${valor.apellidos}</td>
                <td>${valor.telefono}</td>
                <td>
                    <select  cssClass="form-control">
                    <option value="0">${valor.email}</option>
                    <option value="1">${valor.email2}</option>
                    </select>
                    </td>
                    <td>
                        <a href="#${valor.id}" data-toggle="modal" class="icon-pencil btn btn-danger btn"></a>
                                                
                    <div class="modal fade" id="${valor.id}">
                      <div class="modal-dialog">
                        <div class="modal-content">
                          <div class="modal-header">
                              <button tytle="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                              <h4 class="modal-title"> Modificar datos del Tutor </h4>
                          </div>
                          <form:form role="form" action="/TutoriaFisi/Principal/Editar.htm" method="POST" class="form-horizontal">
                              <input type="hidden" name="codigo" value="${valor.id}">
                                <div class="modal-body">
                                 <div class="form-group">
                                   <label for="nombres" class="control-label col-md-2 col-left">Nombres:</label>
                                    <div class="col-md-10">
                                    <input type="text" class="form-control" id="nombres" value="${valor.nombres}" name="nombres">
                                    </div>
                                 </div>
                                <div class="form-group">
                                   <label for="apellidos" class="control-label col-md-2 col-left">Apellidos:</label>
                                    <div class="col-md-10">
                                    <input type="text" class="form-control" id="apellidos" value="${valor.apellidos}" name="apellidos">
                                    </div>
                                </div>
                                <div class="form-group">
                                   <label for="fnacimiento" class="control-label col-md-2 col-left">Fecha de Nacimiento:</label>
                                    <div class="col-md-10">
                                    <input type="text" class="form-control"  value="${valor.fecha_nacimiento.toString()}" name="fnacimiento">
                                    </div>
                                </div>
                                    <div class="form-group">
                                   <label for="telefono" class="control-label col-md-2 col-left">Telefono:</label>
                                    <div class="col-md-10">
                                    <input type="text" class="form-control"  value="${valor.telefono}" name="telefono">
                                    </div>
                                </div>
                                    <div class="form-group">
                                   <label for="direccion" class="control-label col-md-2 col-left">Direccion:</label>
                                    <div class="col-md-10">
                                    <input type="text" class="form-control"  value="${valor.direccion}" name="direccion">
                                    </div>
                                </div>
                                    <div class="form-group">
                                   <label for="email2" class="control-label col-md-2 col-left">Email:</label>
                                    <div class="col-md-10">
                                    <input type="text" class="form-control"  value="${valor.email}" name="email">
                                    </div>
                                </div>
                                    <div class="form-group">
                                   <label for="email2" class="control-label col-md-2 col-left">Email2:</label>
                                    <div class="col-md-10">
                                    <input type="text" class="form-control"  value="${valor.email2}" name="email2">
                                    </div>
                                </div>
                                    <div class="modal-footer">
                                   <button type="submit" class="btn btn-primary">Guardar</button>
                                   <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>                       
                                </div>
                                </div>
                            </form:form>  
                       </div>
                    </div>
                    </div>
                                    
                    </td>
                     <td>
                       <a href="#${valor.telefono}"  data-toggle="modal" class="icon-trash btn btn-danger btn" id="btnEliminar"></a>
                       
                         <div class="modal fade" id="${valor.telefono}">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button tytle="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                            <h2 class="modal-title"> Importante!! </h2>
                                    </div>
                                        <form:form role="form" action="/TutoriaFisi/Principal/Eliminar.htm" method="POST" class="form-horizontal">
                                            <input type="hidden" name="codigo" value="${valor.id}">
                                            <div class="modal-body">
                                                <p>
                                                    <label>Desea Eliminar al Tutor: ${valor.nombres} ${valor.apellidos}  </label>
                                                </p>
                                                <div class="modal-footer">
                                                 <button type="submit" class="btn btn-primary">Comfirmar</button>
                                                 <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
                                                </div>
                                            </div>
                                        </form:form>
                                    </div>
                            </div>
                         </div>
                      </td>
                                    </tr>
                  </c:forEach>
                 </tbody>
                </table>
                   
              </div>
        </div>
      
      
                            
          
           
           <div class="modal fade" id="ventana1" >
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button tytle="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                    <h4 class="modal-title">Tutor</h4>
                                </div>
                                <!--contenido de ventana modal-->
                                <form:form role="form" action="/TutoriaFisi/Principal/Agregar.htm" method="POST" class="form-horizontal">
                                    <div class="modal-body">
                                        <div class="form-group">
                                            <label for="codigo" class="control-label col-md-2 col-left">Codigo*:</label>
                                            <div class="col-md-10">
                                                <input type="text" name="codigo" class="form-control" id="codigo" required="true">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="nombres" class="control-label col-md-2 col-left">Nombres*:</label>
                                            <div class="col-md-10">
                                                <input type="text" name="nombres" class="form-control" id="nombre" required="true">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="apellidos" class="control-label col-md-2 col-left">Apellidos*:</label>
                                            <div class="col-md-10">
                                                <input type="text" class="form-control" name="apellidos" required="true">
                                            </div>
                                        </div>
                                       
                                        <div class="form-group">
                                            <label for="fnacimiento" class="control-label col-md-2 col-left">Fecha Nacimiento*:</label>
                                            <div class="col-md-10">
                                                <input type="text" class="form-control" name="fnacimiento" required="true">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="telefono" class="control-label col-md-2 col-left">Telefono*:</label>
                                            <div class="col-md-10">
                                                <input type="text" class="form-control" name="telefono" required="true">
                                            </div>
                                        </div>
                                         <div class="form-group">
                                            <label for="direccion" class="control-label col-md-2 col-left">Dirección*:</label>
                                            <div class="col-md-10">
                                                <input type="text" class="form-control" name="direccion" required="true">
                                            </div>
                                        </div>
                                         <div class="form-group">
                                            <label for="email" class="control-label col-md-2 col-left">Email*</label>
                                            <div class="col-md-10">
                                                <input type="text" class="form-control" name="email" required="true">
                                            </div>
                                        </div>
                                         <div class="form-group">
                                            <label for="email2" class="control-label col-md-2 col-left">Email(opcional):</label>
                                            <div class="col-md-10">
                                                <input type="text" class="form-control" name="email2" required="false">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="id_usuario" class="control-label col-md-2 col-left">UsuarioID:</label>
                                            <div class="col-md-10">
                                                <input type="text" class="form-control" name="id_usuario" required="true">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="username" class="control-label col-md-2 col-left">Username:</label>
                                            <div class="col-md-10">
                                                <input type="text" class="form-control" name="username" required="true">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="password" class="control-label col-md-2 col-left">Password:</label>
                                            <div class="col-md-10">
                                                <input type="password" class="form-control" name="password" required="true">
                                            </div>
                                        </div>
                                         <div class="modal-footer">
                                        <button type="submit" class="btn btn-primary">Guardar</button>
                                        <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
                                        </div> 
                                    </div>
                                </form:form>
                            </div>
                        </div>
               
           </div>
    </body>
    
    <script type="text/javascript">
        
        
        
        
        
        
        $("#btn-ajax").click(function()
        {
            $.ajax(
                    {
                        type:"GET",
                        url:"/TutoriaFisi/tablaTutores.htm",
                        data:{},
                        success: function(resultado)
                        {
                            $("#PanelTablaTutores").html(resultado);
                        }
                    }).done(function(){
                        
                    }).fail(function(){
                     
                    });
        });
        
        </script>
</html>
