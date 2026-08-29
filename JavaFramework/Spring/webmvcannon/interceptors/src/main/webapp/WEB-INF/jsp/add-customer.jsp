<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Customer</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            background-color: #f8f9fa;
            color: #333;
        }
        .container {
            margin-top: 50px;
            max-width: 600px;
            background-color: #fff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);
        }
        .errors {
            color: red;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1 class="text-center mb-4">Add Customer</h1>
        <form:form method="post" modelAttribute="customerForm">
            <div class="mb-3">
                <label for="fullname" class="form-label">Full Name</label>
                <form:input path="fullname" cssClass="form-control" id="fullname"/>
                <div class="errors"><form:errors path="fullname"/></div>
            </div>

            <div class="mb-3">
                <label for="dob" class="form-label">Date of Birth</label>
                <form:input path="dob" cssClass="form-control" id="dob"/>
                <div class="errors"><form:errors path="dob"/></div>
            </div>

            <div class="mb-3">
                <label for="gender" class="form-label">Gender</label>
                <form:select cssClass="form-select" id="gender" path="gender">
                    <form:option value="">Select your gender</form:option>
                    <form:option value="male">Male</form:option>
                    <form:option value="female">Female</form:option>
                    <form:option value="other">Other</form:option>
                </form:select>
                <div class="errors"><form:errors path="gender"/></div>
            </div>

            <div class="mb-3">
                <label for="phoneNumber" class="form-label">Phone Number</label>
                <form:input path="phoneNumber" id="phoneNumber" cssClass="form-control"/>
                <div class="errors"><form:errors path="phoneNumber"/></div>
            </div>

            <div class="mb-3">
                <label for="email" class="form-label">Email Address</label>
                <form:input path="email" id="email" cssClass="form-control"/>
                <div class="errors"><form:errors path="email"/></div>
            </div>

            <button type="submit" class="btn btn-primary w-100">Submit</button>
        </form:form>
    </div>

    <!-- Bootstrap JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
