<!DOCTYPE html>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bus Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 20px;
            text-align: center;
        }

        h1 {
            color: #333399;
            margin-bottom: 20px;
        }

        .info-container {
            margin-bottom: 20px;
            font-size: 18px;
            align: left;
        }

        .info-container span {
            font-weight: bold;
            color: #4caf50;
        }

        table {
            width: 80%;
            margin: 0 auto;
            border-collapse: collapse;
            background-color: #ffffff;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        th, td {
            border: 1px solid #cccccc;
            padding: 10px;
            text-align: center;
        }

        th {
            background-color: #4caf50;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #d1e7dd;
        }
    </style>
</head>
<body>
    <h1>Bus Details</h1>
    <div class="info-container">
        <p>Source: <span>${source}</span></p>
        <p>Destination: <span>${destination}</span></p>
        <p>Journey Date:<span>${journeyDate}</span></p>
    </div>
    <table>
        <thead>
            <tr>
                <th>Bus No</th>
                <th>Departure Time</th>
                <th>Arrival Time</th>
                <th>Bus Type</th>
                <th>Total Hours of Travel</th>
                <th>Status</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${buses}" var="bus">
                <tr>
                    <td>${bus.busNo}</td>
                    <td>${bus.departureTime}</td>
                    <td>${bus.arrivalTime}</td>
                    <td>${bus.busType}</td>
                    <td>${bus.totalHours}</td>
                    <td>${bus.status}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
