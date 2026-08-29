<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">

    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">

    <title>Matching Passengers</title>

    <style>

        * {
            box-sizing: border-box;
        }

        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background-color: #f4f7fb;
            color: #222;
        }

        /* Header */

        .header {
            background: linear-gradient(
                135deg,
                #0d6efd,
                #6254f4
            );

            color: white;
            text-align: center;
            padding: 28px 20px;
        }

        .header h1 {
            margin: 0;
            font-size: 32px;
        }

        .header p {
            margin: 10px 0 0;
            font-size: 16px;
        }


        /* Main Container */

        .container {
            width: 85%;
            max-width: 1200px;
            margin: 40px auto;
        }


        /* Top Section */

        .top-section {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-bottom: 25px;
        }

        .title h2 {
            margin: 0 0 8px;
            font-size: 28px;
            color: #26364a;
        }

        .title p {
            margin: 0;
            color: #6c757d;
        }


        /* Passenger Count */

        .count {
            display: inline-block;
            margin-top: 12px;
            padding: 8px 16px;

            background-color: #e7f0ff;
            color: #0066ff;

            border-radius: 20px;

            font-weight: bold;
            font-size: 14px;
        }


        /* Search */

        .search-box input {
            width: 300px;
            padding: 13px 18px;

            border: 1px solid #ddd;
            border-radius: 25px;

            outline: none;

            font-size: 15px;
        }

        .search-box input:focus {
            border-color: #0d6efd;

            box-shadow:
                0 0 0 3px rgba(13, 110, 253, 0.1);
        }


        /* Table Card */

        .table-card {
            background-color: white;

            border-radius: 15px;

            overflow: hidden;

            box-shadow:
                0 8px 25px rgba(0, 0, 0, 0.08);
        }


        /* Table */

        table {
            width: 100%;
            border-collapse: collapse;
        }

        thead {
            background: linear-gradient(
                135deg,
                #0d6efd,
                #6254f4
            );

            color: white;
        }

        th {
            padding: 18px;
            text-align: left;
            font-size: 16px;
        }

        td {
            padding: 18px;

            border-bottom: 1px solid #eeeeee;

            font-size: 15px;
        }

        tbody tr:hover {
            background-color: #f7faff;
        }


        /* Passenger Name */

        .passenger {
            display: flex;
            align-items: center;
            gap: 12px;
        }

        .avatar {
            width: 40px;
            height: 40px;

            border-radius: 50%;

            background: linear-gradient(
                135deg,
                #0d6efd,
                #6254f4
            );

            color: white;

            display: flex;
            align-items: center;
            justify-content: center;

            font-weight: bold;
        }

        .passenger-name {
            font-weight: bold;
        }


        /* Gender */

        .gender {
            display: inline-block;

            padding: 6px 14px;

            border-radius: 20px;

            font-size: 13px;

            font-weight: bold;

            text-transform: capitalize;
        }

        .male {
            background-color: #e7f1ff;
            color: #0066ff;
        }

        .female {
            background-color: #ffe7f1;
            color: #d63384;
        }


        /* Email */

        .email {
            color: #0066ff;
        }


        /* Mobile */

        .mobile {
            color: #555;
        }


        /* Responsive */

        @media (max-width: 768px) {

            .container {
                width: 95%;
            }

            .top-section {
                flex-direction: column;
                align-items: flex-start;
                gap: 20px;
            }

            .search-box {
                width: 100%;
            }

            .search-box input {
                width: 100%;
            }

            .table-card {
                overflow-x: auto;
            }

            table {
                min-width: 800px;
            }
        }

    </style>

</head>


<body>


<!-- Header -->

<div class="header">

    <h1>Matching Passengers</h1>

    <p>
        Find and view passengers matching your search criteria
    </p>

</div>


<!-- Main -->

<div class="container">


    <!-- Top Section -->

    <div class="top-section">

        <div class="title">

            <h2>Passenger List</h2>

            <p>
                Available passengers based on your search
            </p>

            <div class="count">

                Total Passengers:
                ${passengers.size()}

            </div>

        </div>


        <!-- Search -->

        <div class="search-box">

            <input
                type="text"
                id="searchInput"
                placeholder="Search passenger..."
            >

        </div>

    </div>


    <!-- Table -->

    <div class="table-card">

        <table>

            <thead>

                <tr>

                    <th>Passenger</th>

                    <th>Age</th>

                    <th>Gender</th>

                    <th>Mobile</th>

                    <th>Email Address</th>

                </tr>

            </thead>


            <tbody id="passengerTable">

                <c:forEach
                    items="${passengers}"
                    var="passenger">

                    <tr>


                        <!-- Passenger -->

                        <td>

                            <div class="passenger">

                                <div class="avatar">

                                    ${passenger.passengerName.substring(0,1)}

                                </div>

                                <div class="passenger-name">

                                    ${passenger.passengerName}

                                </div>

                            </div>

                        </td>


                        <!-- Age -->

                        <td>

                            ${passenger.age} years

                        </td>


                        <!-- Gender -->

                        <td>

                            <span
                                class="gender ${passenger.gender}">

                                ${passenger.gender}

                            </span>

                        </td>


                        <!-- Mobile -->

                        <td class="mobile">

                            ${passenger.mobileNo}

                        </td>


                        <!-- Email -->

                        <td class="email">

                            ${passenger.email}

                        </td>


                    </tr>

                </c:forEach>

            </tbody>

        </table>

    </div>

</div>


<script>

    const searchInput =
        document.getElementById("searchInput");

    searchInput.addEventListener("keyup", function () {

        const searchValue =
            this.value.toLowerCase();

        const rows =
            document.querySelectorAll(
                "#passengerTable tr"
            );

        rows.forEach(function (row) {

            const text =
                row.innerText.toLowerCase();

            if (text.includes(searchValue)) {

                row.style.display = "";

            } else {

                row.style.display = "none";

            }

        });

    });

</script>


</body>

</html>