<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Locate Us</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to bottom right, #0f2027, #203a43, #2c5364);
            color: white;
            margin: 0;
            padding: 0;
        }
        header {
            text-align: center;
            padding: 20px;
            background-color: #34495e;
        }
        header h1 {
            font-size: 3em;
            color: #f39c12;
        }
        section {
            padding: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .location-image {
            flex: 1;
            text-align: center;
        }
        .location-details {
            flex: 1;
            padding: 20px;
            background-color: rgba(52, 73, 94, 0.7);
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.3);
        }
        .location-details h2 {
            color: #e74c3c;
        }
        footer {
            text-align: center;
            padding: 10px;
            background-color: #34495e;
            color: #bdc3c7;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <header>
        <h1>Locate Us</h1>
    </header>
    <section>
        <div class="location-details">
            <h2>Our Address</h2>
            <p>123 Main Street</p>
            <p>Cumming, Georgia, USA</p>
            <p>Phone: +1-800-123-4567</p>
            <h3>Business Hours:</h3>
            <p>Monday-Friday: 9:00 AM - 5:00 PM</p>
            <p>Saturday: 10:00 AM - 2:00 PM</p>
        </div>
    </section>
    <footer>
        <p>© 2025 Your Company Name. All rights reserved.</p>
    </footer>
</body>
</html>
