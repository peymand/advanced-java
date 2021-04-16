<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="mvc" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html>

<head>
	<meta charset="UTF-8"/>
	<script src="<c:url value="/resources/js/main.js"/>" type="application/javascript"></script>
	<link rel="stylesheet" href="/resources/css/main.css"/>
	<title>Student Registration Form</title>
</head>

<body>


	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		<form:errors cssClass="error" path="firstName"/>
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		
		<br><br>
	
		Country:
		
		<form:select path="country">
		
			<form:options items="${student.countryOptions}" />
			
		</form:select>
				
		<br><br>

		Favorite Language:
		
		Java <form:radiobutton  path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

		<br><br>

		Hobbies:

		Football : <form:checkbox path="hobbies" value="football"/>
		Camping : <form:checkbox path="hobbies" value="camping"/>


		<br><br>

		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>












