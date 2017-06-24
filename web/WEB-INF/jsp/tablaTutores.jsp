
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                                            <a href="#" class="icon-trash btn btn-danger btn-lg">
                                        </td>
                                    <tr>
                                </c:forEach>
                                        </tbody>
     </table>