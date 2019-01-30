<%-- 
    Document   : listado
    Created on : 28 ene. 2019, 17:59:35
    Author     : paco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${estilos}" />
        <title>Listado</title>
    </head>
    <body>
        <div id="principal">
            <h2>Listado de personas</h2>
            <c:if test = "${listaPersonas == null || listaPersonas.size() < 0}">
                <h1>No hay registros en la tabla</h1>
            </c:if>
            <ul>
                <c:forEach var="persona" items="${listaPersonas}">
                        <pre>
                        Nombre: ${persona.nombre}
                        Libros:
                            <c:forEach var="libro" items="${persona.libros}">
                                ${libro.titulo}
                            </c:forEach>
                        </pre>
                </c:forEach>
            </ul>
            <br />
            <p><a href="${contexto}/index.jsp" class="enlace">Menú inicial</a></p>
        </div>
    </body>
</html>