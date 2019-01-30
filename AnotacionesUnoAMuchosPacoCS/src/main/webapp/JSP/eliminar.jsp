<%-- 
    Document   : eliminar
    Created on : 28 ene. 2019, 17:58:13
    Author     : paco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${estilos}" />
        <title>Eliminar</title>
    </head>
    <body>
        <div id="principal">
            <h2>Elige uno para eliminar</h2>



            <form method="post" action="control?op=delete">
                <table>
                    <c:if test = "${listaPersonas == null || listaPersonas.size() < 0}">
                        <h1>No hay registros en la tabla</h1>
                    </c:if>
                    <c:forEach var="item" items="${listaPersonas}">
                        <tr>
                            <td><input type="radio" name="registro" value="${item.idPersona}" /></td>
                            <td>${item.nombre}</td>
                        </tr>
                    </c:forEach>
                    <tr>
                        <td colspan="2"><input type="submit" value="Eliminar" class="boton" /></td>
                    </tr>
                </table>
            </form>

        </div>
    </body>
</html>
