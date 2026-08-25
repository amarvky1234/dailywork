<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Bus Details</title>
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

        .form-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 400px;
        }

        .form-container h2 {
            margin-bottom: 20px;
            text-align: center;
            color: #333;
        }

        .form-group {
            margin-bottom: 15px;
        }

        .form-group label {
            display: block;
            font-size: 14px;
            margin-bottom: 5px;
            color: #555;
        }

        .form-group input, .form-group select {
            width: 100%;
            padding: 10px;
            font-size: 14px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        .form-group input:focus, .form-group select:focus {
            border-color: #007bff;
            outline: none;
        }

        .submit-btn {
            width: 100%;
            padding: 10px;
            font-size: 16px;
            color: #fff;
            background-color: #007bff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            margin-top: 10px;
        }

        .submit-btn:hover {
            background-color: #0056b3;
        }

        .errors {
            color: red;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Add Bus Details</h2>
        <form:form modelAttribute="busForm">
            <div class="errors">
                <form:errors path="*"/>
            </div>
            <br>
            <div class="form-group">
                <label for="busNo">Bus Number</label>
                <form:input path="busNo"/>
            </div>
            <div class="form-group">
                <label for="modelNo">Model Number</label>
                <form:input path="modelNo"/>
            </div>
            <div class="form-group">
                <label for="manufacturer">Manufacturer</label>
                <form:input path="manufacturer"/>
            </div>
            <div class="form-group">
                <label for="engineNo">Engine Number</label>
                <form:input path="engineNo"/>
            </div>
            <div class="form-group">
                <label for="chassisNo">Chassis Number</label>
                <form:input path="chassisNo"/>
            </div>
            <div class="form-group">
                <label for="fuelType">Fuel Type</label>
                <form:select path="fuelType">
                    <form:option value="petrol">Petrol</form:option>
                    <form:option value="diesel">Diesel</form:option>
                    <form:option value="electric">Electric</form:option>
                    <form:option value="hybrid">Hybrid</form:option>
                </form:select>
            </div>
            <div class="form-group">
                <label for="price">Price</label>
                <form:input path="price"/>
            </div>
            <button type="submit" class="submit-btn">Add Bus</button>
        </form:form>
    </div>
</body>
</html>
