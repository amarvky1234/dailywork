<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Authors List</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f8f9fa;
        }
        .container {
            margin-top: 30px;
        }
        .table th {
            background-color: #007bff;
            color: white;
        }
        .btn-custom {
            background-color: #28a745;
            color: white;
        }
        .btn-custom:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2 class="text-center mb-4">Authors Information</h2>

        <div class="text-end mb-3">
            <button class="btn btn-custom" onclick="window.location.href='newAuthor'">New Author</button>
        </div>

        <div class="table-responsive">
            <table class="table table-striped table-bordered">
                <thead>
                    <tr>
                        <th>Author ID</th>
                        <th>Full Name</th>
                        <th>Date of Birth</th>
                        <th>Gender</th>
                        <th>Contact No</th>
                        <th>Email Address</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="author" items="${authors}">
                        <tr>
                            <td>${author.authorId}</td>
                            <td>${author.fullName}</td>
                            <td>${author.dob}</td>
                            <td>${author.gender}</td>
                            <td>${author.contactNo}</td>
                            <td>${author.emailAddress}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
