<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Locate Us</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            background-color: #f4f6f8;
        }

        .header {
            background-color: #2c3e50;
            color: white;
            text-align: center;
            padding: 30px;
        }

        .container {
            width: 80%;
            margin: 40px auto;
            display: flex;
            gap: 30px;
        }

        .map {
            flex: 2;
            height: 350px;
            background-color: #dfe6e9;
            border-radius: 10px;

            display: flex;
            justify-content: center;
            align-items: center;

            font-size: 70px;
        }

        .details {
            flex: 1;
            background-color: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 3px 10px #ccc;
        }

        .details h2 {
            color: #2c3e50;
        }

        .details p {
            color: #555;
            line-height: 1.6;
        }

        .button {
            display: inline-block;
            padding: 12px 20px;
            background-color: #3498db;
            color: white;
            text-decoration: none;
            border-radius: 5px;
            margin-top: 10px;
        }

        .button:hover {
            background-color: #2980b9;
        }

        footer {
            text-align: center;
            background-color: #2c3e50;
            color: white;
            padding: 15px;
        }
    </style>
</head>

<body>

    <div class="header">
        <h1>📍 Locate Us</h1>
        <p>Come and visit us!</p>
    </div>

    <div class="container">

        <!-- Map Section -->
        <div class="map">
            📍
        </div>

        <!-- Location Details -->
        <div class="details">

            <h2>Our Location</h2>

            <p>
                <b>Address:</b><br>
                123 Main Street<br>
                Cumming, Georgia, USA
            </p>

            <p>
                <b>Phone:</b><br>
                +1-800-123-4567
            </p>

            <p>
                <b>Email:</b><br>
                contact@company.com
            </p>

            <p>
                <b>Opening Hours:</b><br>
                Monday - Friday: 9 AM - 5 PM
            </p>

            <a class="button"
               href="https://www.google.com/maps"
               target="_blank">
                Get Directions
            </a>

        </div>

    </div>

    <footer>
        © 2025 Your Company Name
    </footer>

</body>
</html>