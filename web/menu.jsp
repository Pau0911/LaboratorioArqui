<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${empty login}">
|<a href="login.jsp">Login</a>|
|<a href="newEstudiante.jsp">Register</a>|

</c:if>
<c:if test="${not empty login}">
|<a href="EstudianteServlet?action=logout">Logout</a>|
|<a href="EstudianteServlet?action=list">List Accounts</a>|

</c:if>



|<a href="EstudianteServlet?action=about">About</a>|
<hr/>