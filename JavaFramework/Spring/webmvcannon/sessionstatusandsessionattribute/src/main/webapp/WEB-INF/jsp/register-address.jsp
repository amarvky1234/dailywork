<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <title>Address Details</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            text-align: center;
            padding: 20px;
        }

        .container {
            width: 400px;
            background: white;
            padding: 20px;
            margin: auto;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }

        h2 {
            color: #333;
        }

        input[type="text"] {
            width: 100%;
            padding: 8px;
            margin: 8px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background: #0056b3;
        }
    </style>
</head>

<body>

<div class="container">

    <h2>Address Registration</h2>

    <form:form
            modelAttribute="registrationForm"
            method="POST"
            action="${pageContext.request.contextPath}/doRegister.htm">

        Address Line 1:
        <form:input path="addressLine1"/>
        <br>

        City:
        <form:input path="city"/>
        <br>

        State:
        <form:input path="state"/>
        <br>

        Zip Code:
        <form:input path="zip"/>
        <br>

        Country:
        <form:input path="country"/>
        <br><br>

        <input type="submit" value="Register">

    </form:form>

</div>

</body>
</html>