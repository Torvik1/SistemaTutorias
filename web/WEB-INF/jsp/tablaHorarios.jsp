

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<p>${hor}</p>
<p>gola</p>
        <c:forEach items="${horas}" var="hora">
            <tr>
                <td>${hora.dia}</td>
                <td>${hora.inicio}</td>
                <td>${hora.fin}</td>
            </tr>
           
        </c:forEach>
