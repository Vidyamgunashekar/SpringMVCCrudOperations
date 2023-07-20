<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form</title>
</head>
<body>
    <%-- Get the action parameter from the query string --%>
    <% String action = request.getParameter("action"); %>

    <%-- Display the corresponding form based on the action --%>
    <h2>Employee Record Management</h2>
    <%
        if (action != null) {
            if (action.equals("registerForm")) { %>
                <h2>Register Here</h2>
                <form action="register">
                    <input type="text" name="id" placeholder="Enter ID here" required>
                    <input type="text" name="name" placeholder="Enter Name here" required>
                    <input type="text" name="sal" placeholder="Enter Salary here" required>
                    <input type="submit" value="Register">
                </form>
            <% } else if (action.equals("updateForm")) { %>
                <h2>Update Salary</h2>
                <form action="update">
                    <input type="text" name="id" placeholder="Enter ID here" required>
                    <input type="text" name="sal" placeholder="Enter Salary here" required>
                    <input type="submit" value="Update">
                </form>
            <% } else if (action.equals("selectbyidForm")) { %>
                <h2>Select Single Record</h2>
                <form action="selectbyid">
                    <input type="text" name="id" placeholder="Enter ID here" required>
                    <input type="submit" value="Select">
                </form>
            <% } else if (action.equals("selectallrecordsForm")) { %>
                <h2>Select All Records</h2>
                <form action="selectallrecords">
                    <input type="submit" value="Select">
                </form>
            <% } else if (action.equals("deleterecordbyidForm")) { %>
                <h2>Delete Single Record</h2>
                <form action="deleterecordbyid">
                    <input type="text" name="id" placeholder="Enter ID here" required>
                    <input type="submit" value="Select">
                </form>
            <% } else { %>
                <p>Invalid action</p>
            <% }
        }
    %>
</body>
</html>
