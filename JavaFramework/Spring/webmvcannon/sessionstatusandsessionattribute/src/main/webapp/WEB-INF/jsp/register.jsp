<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <title>User Registration</title>

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

        input[type="text"],
        input[type="password"],
        input[type="email"] {
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
            background: #28a745;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background: #218838;
        }
    </style>
</head>

<body>

<div class="container">

    <h2>User Registration</h2>

    <form:form
            modelAttribute="registrationForm"
            method="POST"
            action="${pageContext.request.contextPath}/register-address.htm">

        Email:
        <form:input path="email" type="email"/>
        <br>

        Password:
        <form:password path="password"/>
        <br>

        Re-Type Password:
        <form:password path="reTypePassword"/>
        <br>

        Full Name:
        <form:input path="fullname"/>
        <br>

        Age:
        <form:input path="age" type="text"/>
        <br>

        Gender:
        <form:radiobutton path="gender" value="Male"/> Male

        <form:radiobutton path="gender" value="Female"/> Female

        <br><br>

        <input type="submit" value="Next">

    </form:form>

</div>

</body>
</html>