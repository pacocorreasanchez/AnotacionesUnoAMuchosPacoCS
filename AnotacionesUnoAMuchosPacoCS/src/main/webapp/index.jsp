<%-- 
    Document   : index
    Created on : 28 ene. 2019, 17:48:29
    Author     : paco
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="contexto" scope="application" value="${pageContext.request.contextPath}" />
<c:set var="estilos" scope="application" value="${contexto}/CSS/estilos.css" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${estilos}"/>
        <title>Index</title>
    </head>
    <body>
    <center>
        <div id="principal">
            <h2>Elige una opción:</h2>
                <li><a href="${contexto}/Eleccion?op=add" class="enlace">Insertar</a></li>
                <li><a href="${contexto}/Eleccion?op=list" class="enlace">Listar</a></li>
                <li><a href="${contexto}/Eleccion?op=delete" class="enlace">Eliminar</a></li>
                <li><a href="${contexto}/Eleccion?op=update" class="enlace">Actualizar</a></li>
            <p><a href="${contexto}/index.jsp" class="enlace">Menú inicial</a></p>
        </div>
    </center>
</body>
</html>
