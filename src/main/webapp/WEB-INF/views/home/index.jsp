

<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MedicosN</title>
    </head>
    <body>
        <h1>${Saludo}</h1>


        <table>
            <tr>
                <td>ID</td>
                <td>Nombre</td>
            </tr>

            <c:forEach var="medicos" items="${medicos}">

                <tr>
                    <td>${medicos.id}</td>
                    <td>${medicos.nombre}</td>
                </tr>
            </c:forEach>


        </table>


    </body>
</html>
