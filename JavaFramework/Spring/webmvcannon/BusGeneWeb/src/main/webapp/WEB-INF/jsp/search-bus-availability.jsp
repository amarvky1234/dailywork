<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bus Availability Search</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f8ff;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .search-container {
            background-color: #ffffff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            text-align: center;
            width: 300px;
        }

        h1 {
            color: #333399;
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-bottom: 10px;
            color: #555555;
            font-weight: bold;
        }

        input, select {
            width: calc(100% - 20px);
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #cccccc;
            border-radius: 4px;
            font-size: 14px;
        }

        button {
            background-color: #4caf50;
            color: white;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            border-radius: 4px;
            cursor: pointer;
        }

        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="search-container">
        <h1>Search Buses</h1>
        <form action="${pageContext.request.contextPath}/search-buses.htm" method="post">
            <label for="source">Source</label>
            <input type="text" id="source" name="source" placeholder="Enter source">

            <label for="destination">Destination</label>
            <input type="text" id="destination" name="destination" placeholder="Enter destination">

            <label for="journeyDate">Journey Date</label>
            <input type="date" id="journeyDate" name="journeyDate">

            <button type="submit">Search</button>
        </form>
    </div>
</body>
</html>
