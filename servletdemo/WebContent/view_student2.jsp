
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<table border="1">
<tr>
<th>Fisrtname </th>
<th>Lastname </th>
<th>Email </th>

</tr>
 <c:forEach var="tempstudent" items="${student_list}">
   <tr>   
		  <td>${tempstudent.firstname}<td>
		   <td>${tempstudent.lastname}<td>
		   <td>${tempstudent.email}<td>
   </tr>
  </c:forEach>
 
</table>
 
</body>
</html>