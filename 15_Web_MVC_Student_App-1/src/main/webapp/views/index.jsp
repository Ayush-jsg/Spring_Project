 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insert title here</title>
</head>
<body>
    <h2> Student Enquiry Form </h2>
    
    <p>
       <font color='green'>${msg} </font>
    </p>
    
    <form:form action="save" modelAttribute="student" method="POST">
    
    <table>
    <tr>
    <td>Name:</td>
    <td><form:input path="name" /></td>
    </tr>
    
     <tr>
    <td>Email:</td>
    <td><form:input path="email" /></td>
    </tr>
    
     <tr>
    <td>Gender:</td>
    <td>
    <form:radiobutton path="gender" value="M"/>Male
     <form:radiobutton path="gender" value="F"/>Fe-male
    </td>
    </tr>
    
    <tr>
				<td>Course</td>
				<td><form:select path="course">
						<form:option value="">-Select-</form:option>
						<form:options items="${Courses}" />
					</form:select></td>
			</tr>
			
			<tr>
			<td>Timings</td>
			<td>
			<form:checkboxes items="${PrefTimings}"  path="timings" />
			</td>
			
			
			</tr>
			
    
    
     <tr>
    <td></td>
    <td><input type="submit" value="save" /></td>
    </tr>
     </table>
    
     </form:form>
    
</body>
</html>