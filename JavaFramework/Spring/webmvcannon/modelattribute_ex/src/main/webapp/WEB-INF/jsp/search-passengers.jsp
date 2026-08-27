<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Passenger Search</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f8ff;
            margin: 0;
            padding: 0;
        }

        h1 {
            text-align: center;
            color: #333;
            background-color: #ffa07a;
            padding: 20px;
            margin: 0;
        }

        form {
            max-width: 500px;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border: 2px solid #add8e6;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 10px;
            color: #555;
            font-weight: bold;
        }

        input[type="text"], input[type="tel"], input[type="email"], input[type="number"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input[type="radio"] {
            margin-right: 5px;
        }

        button {
            width: 100%;
            padding: 10px;
            background-color: #4682b4;
            color: #fff;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }

        button:hover {
            background-color: #5a9bd6;
        }

        .age-range {
            display: flex;
            justify-content: space-between;
        }

        .age-range input {
            width: 48%;
        }
    </style>
</head>
<body>
    <h1>Search Passenger</h1>
    <form action="${pageContext.request.contextPath}/searchPassengers.htm" method="POST">
        <label for="passengerName">Passenger Name:</label>
        <input type="text" id="passengerName" name="passengerName" required>

        <label for="mobileNo">Mobile No:</label>
        <input type="tel" id="mobileNo" name="mobileNo" pattern="[0-9]{10}" required>

        <label for="email">Email Address:</label>
        <input type="email" id="email" name="email" required>

        <label>Gender:</label>
        <input type="radio" id="male" name="gender" value="Male">
        <label for="male">Male</label>
        <input type="radio" id="female" name="gender" value="Female">
        <label for="female">Female</label>

        <label for="ageFrom">Age Between:</label>
        <div class="age-range">
            <input type="number" id="ageFrom" name="ageFrom" min="0" placeholder="From">
            <input type="number" id="ageTo" name="ageTo" min="0" placeholder="To">
        </div>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
