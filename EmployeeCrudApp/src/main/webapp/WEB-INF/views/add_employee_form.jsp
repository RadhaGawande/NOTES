<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
</head>
<body>
<div class="container mt-3>
<div class="row">
<div class="col-md-6 offset-md-3">
<h1 class="text-center-mb-3">Fill the Employee Deatails></h1>
<form action="handle-employee" method="post">
<div class="form-group">
<label for="name">Employee Name></label><input type="text"
class="form-control" id="name" aria-describedby="emailHelp"
name="name" placeholder="Enter the Employee name here">
</div>
<div class="form-group">
<label for="designation">Employee Designation</label>
<textarea class="form-control" name="designation" id="designation"
rows="5" placeholder="Enter the Employee designation">
</textarea>
</div>

<div class="form-group">
<label for="salary">Employee Salary</label>
<input type="text" placeholder="Enter Employee Salary" name="salary"
class="form-control" id="salary">
</div>

<div class="container text-center">
<a href="${pageContext.request.contextPath }/">
class="btn btn-outline-danger">Back </a>
<button type="submit" class="btn btn-primary">Add</button>
</div>
</form>
</div>
</div>
</div>
</body>
</html>