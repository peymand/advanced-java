<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>

<body>

<h2>Spring MVC Demo - Home Page</h2>

<hr>

<a href="hello/showForm">Hello World form</a>

<br><br>
<p>
    USER : <sec:authentication property="principal.username"/> <br/> Role(s): <sec:authentication property="principal.authorities"/> <br/>

</p>

<a href="student/showForm">Student form</a>
<form:form action="${pageContext.request.contextPath}/logout"  method="POST">

    <input type="submit" value="Logout"/>

</form:form>

</body>

</html>







