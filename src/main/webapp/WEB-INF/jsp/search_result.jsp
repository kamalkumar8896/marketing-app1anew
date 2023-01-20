<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Result</title>
</head>
<body>
       <h2>Student| Search Result</h2>
       <table>
       <tr>
               <th>First Name</th>
               <th>Email</th>
                 <th>Mobile</th>
                 <th>Roll</th>
       </tr>
        <c:forEach items="${Students}" var="student">
        <tr>
               <td>${student.firstName}</td>
                <td>${student.email}</td>
                  <td>${student.mobile}</td>
                 <td>${student.roll}</td>
       </tr>
        
         </c:forEach>
       </table>
</body>
</html>