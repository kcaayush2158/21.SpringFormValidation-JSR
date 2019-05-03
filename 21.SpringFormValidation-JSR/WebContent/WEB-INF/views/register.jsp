<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
.error{
color: red;
}
</style>

</head>
<body>

  <form:form action="/1.SpringFormValidation-JSR/register" method="post" modelAttribute="student">
  <table>
			<tr>
				<td>User Name</td>
				<td><form:input path="studentName"/></td>
				<td><form:errors path="studentName" cssClass="error"/></td>
			</tr>

			<tr>
				<td>Email</td>
				<td><form:input path="studentEmail"/></td>
				<td><form:errors path="studentEmail" cssClass="error"/></td>
			</tr>

			<tr>
				<td>Age</td>
				<td><form:input path="studentAge"/></td>
				<td><form:errors path="studentAge" cssClass="error"/></td>
			</tr>

			<tr>
				<td><form:input path="studentPhonenumber" /></td>
			    <td><form:errors path="studentPhonenumber" cssClass="error" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="register"></td>
			</tr>

    </table>
</form:form>

</body>

</html>