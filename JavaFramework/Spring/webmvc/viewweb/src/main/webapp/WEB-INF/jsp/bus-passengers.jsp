<!DOCTYPE html>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bus Journey Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            padding: 20px;
        }
        form {
            margin-bottom: 20px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f4f4f4;
        }
    </style>
</head>
<body>
    <h2>Bus Journey Form</h2>
    <form method="post" action="${pageContext.request.contextPath}/getBusPassengers.htm">
        <label for="busNo">Bus No:</label><br>
        <input type="text" id="busNo" name="busNo" value="${busNo}" required><br><br>
        <label for="journeyDate">Journey Date:</label><br>
        <input type="date" id="journeyDate" name="journeyDate" value="${journeyDate}" required><br><br>
        <input type="hidden" name="h_action"/>

        <button type="submit">Show Passengers</button>


        <c:if test="${not empty passengers}">
            <h2>Matching Result</h2>
            <table>
                <thead>
                    <tr>
                        <th>Passenger Name</th>
                        <th>Age</th>
                        <th>Gender</th>
                        <th>Mobile No</th>
                        <th>Bus Stop to Board</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${passengers}" var="passenger">
                        <tr>
                            <td>${passenger.passengerName}</td>
                            <td>${passenger.age}</td>
                            <td>${passenger.gender}</td>
                            <td>${passenger.mobileNo}</td>
                            <td>${passenger.busStopName}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
        Export: <input type="radio" name="action" value="pdf"/>pdf (or) <input type="radio" name="action" value="xls"/>excel <a href="javascript:document.forms[0].submit();">export</a>
    </form>
</body>
</html>