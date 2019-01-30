<%-- 
    Document   : insertar
    Created on : 28 ene. 2019, 17:58:44
    Author     : paco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${estilos}" />
        <title>Insertar</title>
    </head>
    <body>
        <div id="principal">
            <h2>Insertar  datos</h2>
            <form method="post" action="Controlador?op=add">
                <table>
                    <fieldset>
                        <legend>Datos persona: </legend>
                        <tr>
                            <td>Nombre</td>
                            <td><input type="text" name="nombre" /></td>
                        </tr>

                    </fieldset>                
                </table>

                <table>
                    <fieldset>
                        <legend>Libros: </legend>
                        <tr>
                            <td>Libro 1</td>
                            <td><input type="text" name="libro1" /></td>
                        </tr>
                        <tr>
                            <td>Libro 2</td>
                            <td><input type="text" name="libro2" /></td>
                        </tr>
                        <tr>
                            <td>Libro 3</td>
                            <td><input type="text" name="libro3" /></td>
                        </tr>
                        

                    </fieldset>
                    <tr>
                        <td colspan="2"><input type="submit" name="enviar" value="Enviar" class="boton" /></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
