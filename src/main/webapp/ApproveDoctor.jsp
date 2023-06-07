<%@page import="java.util.List"%>
<%@page import="dto.Doctor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Doctor> list=(List<Doctor>)request.getAttribute("list"); %>
<div>
<table border=1>
<tr>
<th>ID</th>
<th>Name</th>
<th>Mobile</th>
<th>Age</th>
<th>Qualification</th>
<th>Status</th>
<th>Change Status</th>
</tr>
<%for(Doctor doctor:list){ %>
<tr>
<td><%=doctor.getId() %></td>
<td><%=doctor.getName() %></td>
<td><%=doctor.getMobile() %></td>
<td><%=doctor.getAge() %></td>
<td><%=doctor.getQualification() %>
<td><%=doctor.isStatus() %></td>
<td><button>Change</button></td>

</tr>
<% } %>
</table>
</div>
</body>
</html>