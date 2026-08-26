<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bus Added Successfully</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .success-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            text-align: center;
            width: 400px;
        }

        .success-container h2 {
            color: #28a745;
        }

        .bus-details {
            text-align: left;
            margin-top: 20px;
        }

        .bus-details p {
            margin: 5px 0;
            color: #333;
        }

        .back-button {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            font-size: 14px;
            color: #fff;
            background-color: #007bff;
            text-decoration: none;
            border-radius: 4px;
            cursor: pointer;
        }

        .back-button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="success-container">
        <h2>Bus Added Successfully!</h2>
        <div class="bus-details">
            <p><strong>Bus Number:</strong> ${busNo}</p>
            <p><strong>Manufacturer:</strong> ${manufacturer}</p>
            <p><strong>Fuel Type:</strong> ${fuelType}</p>
        </div>
        <a href="${pageContext.request.contextPath}/add-bus.htm" class="back-button">Add Another Bus</a>
    </div>
</body>
</html>
