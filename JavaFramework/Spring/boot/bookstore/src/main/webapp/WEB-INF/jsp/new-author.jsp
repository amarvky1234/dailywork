<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Create New Author</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f8f9fa;
        }
        .container {
            margin-top: 30px;
            max-width: 600px;
        }
        .card {
            padding: 20px;
            border-radius: 10px;
            background-color: white;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        .btn-custom {
            background-color: #007bff;
            color: white;
        }
        .btn-custom:hover {
            background-color: #0056b3;
        }
        .errors {
            color: red;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2 class="text-center mb-4">Create New Author</h2>

        <div class="card">
            <form:form modelAttribute="authorForm">

                <div class="mb-3">
                    <label for="fullName" class="form-label">Full Name</label>
                    <form:input path="fullName" class="form-control" id="fullName" required="true"/>
                    <span class="errors"><form:errors path="fullName"/></span>
                </div>

                <div class="mb-3">
                    <label class="form-label">Gender</label>
                    <div class="form-check">
                        <form:radiobutton path="gender" value="Male" class="form-check-input" id="genderMale"/>
                        <label for="genderMale" class="form-check-label">Male</label>
                    </div>
                    <div class="form-check">
                        <form:radiobutton path="gender" value="Female" class="form-check-input" id="genderFemale"/>
                        <label for="genderFemale" class="form-check-label">Female</label>
                    </div>
                    <span class="errors"><form:errors path="gender"/></span>
                </div>

                <div class="mb-3">
                    <label for="dob" class="form-label">Date of Birth</label>
                    <form:input path="dob" type="date" class="form-control" id="dob" required="true"/>
                    <span class="errors"><form:errors path="dob"/></span>
                </div>

                <div class="mb-3">
                    <label for="contactNo" class="form-label">Contact No</label>
                    <form:input path="contactNo" class="form-control" id="contactNo" required="true"/>
                    <span class="errors"><form:errors path="contactNo"/></span>
                </div>

                <div class="mb-3">
                    <label for="email" class="form-label">Email Address</label>
                    <form:input path="emailAddress" type="email" class="form-control" id="email" required="true"/>
                    <span class="errors"><form:errors path="emailAddress"/></span>
                </div>

                <div class="text-center">
                    <button type="submit" class="btn btn-custom">Save Author</button>
                </div>

            </form:form>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
