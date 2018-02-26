
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
        <h1>Hello World!</h1>
        <c:forEach var="a" items="${accounts}">
           |${a.id}| |${a.username}| |${a.email}| 
           <a onclick="return confirm('Esta seguro?')" href="EstudianteServlet?action=delete&id=${a.id}">Delete</a>        
           <hr/>
        </c:forEach>        
        
    </body>
</html>


