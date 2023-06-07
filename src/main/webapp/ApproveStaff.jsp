<%@page import="dto.Staff"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Staff> list=(List<Staff>)request.getAttribute("list"); %>
<div>
<table border=1>
<tr>
<th>ID</th>
<th>Name</th>
<th>Mobile</th>
<th>Age</th>
<th>Status</th>
<th>Change Status</th>
</tr>
<%for(Staff staff:list){ %>
<tr>
<td><%=staff.getId() %></td>
<td><%=staff.getName() %></td>
<td><%=staff.getMobile() %></td>
<td><%=staff.getAge() %></td>
<td><%=staff.isStatus() %></td>
<td><a href="changestaffstatus?id=<%=staff.getId() %>"><button>Change</button></a></td>

</tr>
<% } %>
</table>
</div>
</body>
</html>