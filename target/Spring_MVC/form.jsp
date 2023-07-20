
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>

	<h2>Register Here</h2>
	<form action="register">
		<input type="text" name="id" placeholder="Enter ID here" required>
		<input type="text" name="name" placeholder="Enter Name here" required>
		<input type="text" name="sal" placeholder="Enter Salary here" required>
		<input type="submit" value="Register">
	</form>

	<h2>Update Salary</h2>
	<form action="update">
		<input type="text" name="id" placeholder="Enter ID here" required>
		<input type="text" name="sal" placeholder="Enter Salary here" required>
		<input type="submit" value="Update">
	</form>

	<h2>Select Single Record</h2>
	<form action="selectbyid">
		<input type="text" name="id" placeholder="Enter ID here" required>
		<input type="submit" value="Select">
	</form>

	<h2>Select All Records</h2>
	<form action="selectallrecords">

		<input type="submit" value="Select">
	</form>

	<h2>Select Single Record</h2>
	<form action="deleterecordbyid">

		<input type="submit" value="Select">
	</form>



</body>
</html>

