
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta  charset=UTF-8"/>
        <script type="text/javascript" src="<c:url value="/public/js/funciones.js"/>"></script>
        <title></title>
    </head>
    <body>
        <form:form method="post"  action="/TutoriaFisi/Principal/editTutor.htm" commandName="persona">
            <label>Codigo:</label>
            <input value="${persona.id}" readonly="readonly" /> 
         <p>
            <form:label path="nombres"> Nombres:</form:label>
            <form:input path="nombres" cssClass="form-control"/>
         </p>
         <p>
            <form:label path="apellidos">Apellidos:</form:label>
            <form:input path="apellidos" cssClass="form-control"/>
         </p>
         <p>
            <form:label path="fecha_nacimiento">Fecha de Nacimiento:</form:label>
            <form:input path="fecha_nacimiento" cssClass="form-control"/>
         </p>
         <p>
            <form:label path="telefono">Telefono:</form:label>
            <form:input path="telefono" cssClass="form-control"/>
         </p>
         <p>
            <form:label path="direccion">Direccion:</form:label>
            <form:input path="direccion" cssClass="form-control"/>
         </p>
         <p>
            <form:label path="email">Email:</form:label>
            <form:input path="email" cssClass="form-control"/>
         </p>
         <p>
            <form:label path="email2">Email(opcional):</form:label>
            <form:input path="email2" cssClass="form-control"/>
         </p>
         <hr>
         <input type="submit" value="Editar" class="form-control" />
         
        </form:form>
    </body>
</html>
