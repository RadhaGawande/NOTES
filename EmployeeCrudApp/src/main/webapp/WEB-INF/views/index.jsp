<html>
<head>
<%@include file="./base.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
</head>
<body>
<div class="container mt-3">
<div class="row">
<div class="col-md-12">
<h1 classs="text-center mb-3">Welcome to Employee Page</h1>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Employee Name</th>
      <th scope="col">Designation</th>
      <th scope="col">Salary</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${employess var= }" var="e">
    <tr>
      <th scope="row">${e.id }</th>
      <td>${e.name }</td>
      <td>${e.designation }</td>
      <td>${e.salary }</td>
    </tr>
    </c:forEach>
  </tbody>
</table>
<div class="container text-center">
<a href="add-employee" class="btn btn-outline-sucess">Add</a>
</div>
</div>
</div>
</div>
</body>
</html>
