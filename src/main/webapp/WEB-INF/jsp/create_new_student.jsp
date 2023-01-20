<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student | Create </title>
</head>
<body>
  <h2>Create new student</h2>
   <form action="saveStudent" method ="post">
    <pre>
		    First Name<input type ="text" name="firstName"/>
		    Email<input type ="text"  name="email"/>
		    Mobile<input type ="text" name="mobile"/>
		    Roll<input type = "text" name= "roll"/>
		    <input type ="submit" value="save"/>
    </pre>
    
   </form>
   ${saveMsg}
</body>
</html>