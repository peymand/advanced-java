<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

<%--	${student}--%>

    <c:url value="/student/processForm" var="pfurl"/>
	<form:form action="${pfurl}" modelAttribute="student" method="post">
	
		First name: <form:input path="firstName" />
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		
		<br><br>
	
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>












