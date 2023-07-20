<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <head>
        <title>This is title</title>
        <style>
            table,
            tr,
            td,
            th {
                border: 1px solid gray;
                border-collapse: collapse;
            }

            th {
                background-color: black;
                color: white;
            }

            th,
            td {
                padding: 8px;
            }

            table {
                width: 50%;
                margin: auto;
            }
        </style>
    </head>

    <body>
        <table>
            <tr>
                <th>Employee ID</th>
                <th>Employee Name</th>
                <th>Employee Salary</th>
            </tr>
            <tr>
                <td>${emp.id }</td>
                <td>${emp.name }</td>
                <td>${emp.sal }</td>
            </tr>
        </table>
    </body>
</html>