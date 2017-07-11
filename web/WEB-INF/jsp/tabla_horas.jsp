
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<tbody>
<c:forEach items="horarios" var="hora">
    <tr>
        <td>hora.dia</td>
        <td>hora.inicio</td>
        <td>hora.fin</td>
    </tr>
</c:forEach>
</tbody>