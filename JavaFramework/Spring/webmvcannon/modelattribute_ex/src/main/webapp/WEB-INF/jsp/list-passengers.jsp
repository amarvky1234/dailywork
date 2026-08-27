<!DOCTYPE html>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Matching Passengers</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            margin: 0;
            padding: 20px;
        }

        h1 {
            text-align: center;
            color: #343a40;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        th, td {
            text-align: left;
            padding: 10px;
            border: 1px solid #dee2e6;
        }

        th {
            background-color: #007bff;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #e9ecef;
        }
    </style>
</head>
<body>
    <h1>Matching Passengers</h1>
    <table>
        <thead>
            <tr>
                <th>Passenger Name</th>
                <th>Age</th>
                <th>Gender</th>
                <th>Mobile No</th>
                <th>Email Address</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${passengers}" var="passenger">
                <tr>
                    <td>${passenger.passengerName}</td>
                    <td>${passenger.age}</td>
                    <td>${passenger.gender}</td>
                    <td>${passenger.mobileNo}</td>
                    <td>${passenger.email}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
