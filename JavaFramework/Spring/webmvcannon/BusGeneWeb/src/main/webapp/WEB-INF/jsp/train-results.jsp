<!DOCTYPE html>

<%@ taglib
        uri="jakarta.tags.core"
        prefix="c"
%>

<html lang="en">

<head>

    <meta charset="UTF-8">

    <meta
            name="viewport"
            content="width=device-width, initial-scale=1.0">

    <title>RailGo - Train Results</title>


    <!-- Bootstrap -->

    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
            rel="stylesheet">


    <!-- Bootstrap Icons -->

    <link
            rel="stylesheet"
            href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">


    <style>

        * {
            box-sizing: border-box;
        }

        body {
            margin: 0;
            font-family: "Segoe UI", Arial, sans-serif;
            background: #f5f7fb;
            color: #1f2937;
        }


        /* ================= NAVBAR ================= */

        .navbar-custom {
            background: white;
            border-bottom: 1px solid #e5e7eb;
            padding: 16px 0;
        }

        .brand {
            color: #2563eb;
            font-size: 25px;
            font-weight: 700;
            text-decoration: none;
        }

        .brand i {
            margin-right: 8px;
        }

        .nav-link {
            color: #4b5563 !important;
            font-weight: 500;
            margin-left: 20px;
        }


        /* ================= HEADER ================= */

        .page-header {
            background:
                linear-gradient(
                    135deg,
                    #1d4ed8,
                    #2563eb
                );

            color: white;

            padding: 45px 20px;
        }

        .page-header h1 {
            font-size: 34px;
            font-weight: 700;
            margin-bottom: 10px;
        }

        .page-header p {
            margin: 0;
            opacity: 0.9;
        }


        /* ================= SEARCH SUMMARY ================= */

        .search-summary {
            background: white;
            border-radius: 14px;

            padding: 20px 25px;

            margin-top: -30px;

            position: relative;

            box-shadow:
                0 8px 25px rgba(0, 0, 0, 0.08);
        }

        .summary-item {
            display: flex;
            align-items: center;
            gap: 12px;
        }

        .summary-icon {
            width: 42px;
            height: 42px;

            border-radius: 10px;

            background: #eff6ff;
            color: #2563eb;

            display: flex;
            align-items: center;
            justify-content: center;

            font-size: 18px;
        }

        .summary-label {
            color: #9ca3af;
            font-size: 12px;
            text-transform: uppercase;
            font-weight: 600;
        }

        .summary-value {
            font-weight: 650;
            color: #111827;
        }


        /* ================= RESULT HEADER ================= */

        .results-header {
            display: flex;
            justify-content: space-between;
            align-items: center;

            margin: 35px 0 18px;
        }

        .results-header h3 {
            margin: 0;
            font-size: 21px;
            font-weight: 650;
        }

        .result-count {
            color: #6b7280;
            font-size: 14px;
        }


        /* ================= TRAIN CARD ================= */

        .train-card {
            background: white;

            border: 1px solid #e5e7eb;

            border-radius: 15px;

            margin-bottom: 18px;

            padding: 23px;

            transition: all 0.2s ease;
        }

        .train-card:hover {
            transform: translateY(-3px);

            box-shadow:
                0 12px 30px rgba(0, 0, 0, 0.08);

            border-color: #bfdbfe;
        }


        /* TRAIN NAME */

        .train-icon {
            width: 48px;
            height: 48px;

            border-radius: 12px;

            background: #eff6ff;
            color: #2563eb;

            display: flex;
            align-items: center;
            justify-content: center;

            font-size: 23px;
        }

        .train-name {
            font-size: 18px;
            font-weight: 650;
            margin-bottom: 3px;
        }

        .train-number {
            font-size: 13px;
            color: #6b7280;
        }


        /* ================= TIME ================= */

        .time-section {
            display: flex;
            align-items: center;
            gap: 25px;

            margin-top: 20px;
        }

        .time {
            font-size: 22px;
            font-weight: 700;
            color: #111827;
        }

        .city {
            font-size: 13px;
            color: #6b7280;
            margin-top: 2px;
        }

        .journey-line {
            flex: 1;
            text-align: center;
            position: relative;
        }

        .line {
            height: 2px;
            background: #dbeafe;
            width: 100%;
            position: relative;
        }

        .line i {
            position: absolute;
            top: -10px;
            left: 50%;

            transform: translateX(-50%);

            background: #eff6ff;

            width: 30px;
            height: 30px;

            border-radius: 50%;

            display: flex;
            align-items: center;
            justify-content: center;

            color: #2563eb;
        }

        .duration {
            font-size: 12px;
            color: #6b7280;
            margin-bottom: 13px;
        }


        /* ================= DETAILS ================= */

        .train-details {
            border-top: 1px solid #edf0f4;

            margin-top: 20px;

            padding-top: 15px;

            display: flex;

            justify-content: space-between;

            align-items: center;
        }

        .details-left {
            display: flex;
            gap: 18px;
            flex-wrap: wrap;
        }

        .detail {
            font-size: 13px;
            color: #6b7280;
        }

        .detail i {
            color: #2563eb;
            margin-right: 5px;
        }


        /* ================= STATUS ================= */

        .status {
            display: inline-flex;

            align-items: center;

            gap: 5px;

            background: #ecfdf5;

            color: #059669;

            padding: 5px 10px;

            border-radius: 20px;

            font-size: 12px;

            font-weight: 600;
        }


        /* ================= BUTTON ================= */

        .view-button {
            border: none;

            background: #2563eb;

            color: white;

            padding: 9px 18px;

            border-radius: 8px;

            font-size: 13px;

            font-weight: 600;

            transition: 0.2s;
        }

        .view-button:hover {
            background: #1d4ed8;
        }


        /* ================= FOOTER ================= */

        footer {
            background: #111827;

            color: #9ca3af;

            text-align: center;

            padding: 25px;

            margin-top: 50px;
        }

        footer strong {
            color: white;
        }


        /* ================= MOBILE ================= */

        @media (max-width: 768px) {

            .page-header h1 {
                font-size: 27px;
            }

            .search-summary {
                margin-top: -20px;
            }

            .summary-item {
                margin-bottom: 12px;
            }

            .time-section {
                gap: 12px;
            }

            .time {
                font-size: 18px;
            }

            .train-details {
                align-items: flex-start;
                flex-direction: column;
                gap: 15px;
            }

            .details-left {
                gap: 10px;
            }

        }

    </style>

</head>


<body>


<!-- ================= NAVBAR ================= -->

<nav class="navbar navbar-expand-lg navbar-custom">

    <div class="container">

        <a class="brand" href="#">

            <i class="bi bi-train-front-fill"></i>

            RailGo

        </a>


        <button
                class="navbar-toggler"
                type="button"
                data-bs-toggle="collapse"
                data-bs-target="#navbarMenu">

            <span class="navbar-toggler-icon"></span>

        </button>


        <div
                class="collapse navbar-collapse"
                id="navbarMenu">

            <ul class="navbar-nav ms-auto">

                <li class="nav-item">

                    <a class="nav-link" href="#">
                        Home
                    </a>

                </li>

                <li class="nav-item">

                    <a class="nav-link" href="#">
                        My Bookings
                    </a>

                </li>

                <li class="nav-item">

                    <a class="nav-link" href="#">
                        Help
                    </a>

                </li>

            </ul>

        </div>

    </div>

</nav>


<!-- ================= PAGE HEADER ================= -->

<section class="page-header">

    <div class="container">

        <h1>
            Available Trains
        </h1>

        <p>
            Choose the train that best fits your journey.
        </p>

    </div>

</section>


<!-- ================= MAIN ================= -->

<div class="container">


    <!-- SEARCH SUMMARY -->

    <div class="search-summary">

        <div class="row align-items-center">


            <!-- SOURCE -->

            <div class="col-md-4">

                <div class="summary-item">

                    <div class="summary-icon">

                        <i class="bi bi-geo-alt-fill"></i>

                    </div>

                    <div>

                        <div class="summary-label">
                            From
                        </div>

                        <div class="summary-value">
                            ${source}
                        </div>

                    </div>

                </div>

            </div>


            <!-- DESTINATION -->

            <div class="col-md-4">

                <div class="summary-item">

                    <div class="summary-icon">

                        <i class="bi bi-geo-alt"></i>

                    </div>

                    <div>

                        <div class="summary-label">
                            To
                        </div>

                        <div class="summary-value">
                            ${destination}
                        </div>

                    </div>

                </div>

            </div>


            <!-- DATE -->

            <div class="col-md-4">

                <div class="summary-item">

                    <div class="summary-icon">

                        <i class="bi bi-calendar3"></i>

                    </div>

                    <div>

                        <div class="summary-label">
                            Journey Date
                        </div>

                        <div class="summary-value">
                            ${journeyDate}
                        </div>

                    </div>

                </div>

            </div>


        </div>

    </div>


    <!-- RESULTS HEADER -->

    <div class="results-header">

        <h3>
            <i class="bi bi-train-front me-2"></i>
            Trains for your journey
        </h3>

        <span class="result-count">

            Showing available trains

        </span>

    </div>


    <!-- ================= TRAIN LIST ================= -->

    <c:forEach
            items="${trains}"
            var="train">


        <div class="train-card">


            <!-- TOP -->

            <div class="d-flex align-items-center">


                <div class="train-icon">

                    <i class="bi bi-train-front-fill"></i>

                </div>


                <div class="ms-3">

                    <div class="train-name">

                        ${train.trainName}

                    </div>

                    <div class="train-number">

                        Train No. ${train.trainNumber}

                    </div>

                </div>


                <div class="ms-auto">

                    <span class="status">

                        <i class="bi bi-check-circle-fill"></i>

                        ${train.status}

                    </span>

                </div>


            </div>


            <!-- TIME SECTION -->

            <div class="time-section">


                <!-- DEPARTURE -->

                <div>

                    <div class="time">

                        ${train.departureTime}

                    </div>

                    <div class="city">

                        ${train.source}

                    </div>

                </div>


                <!-- LINE -->

                <div class="journey-line">

                    <div class="duration">

                        ${train.durationHours} Hours

                    </div>

                    <div class="line">

                        <i class="bi bi-train-front"></i>

                    </div>

                </div>


                <!-- ARRIVAL -->

                <div class="text-end">

                    <div class="time">

                        ${train.arrivalTime}

                    </div>

                    <div class="city">

                        ${train.destination}

                    </div>

                </div>


            </div>


            <!-- DETAILS -->

            <div class="train-details">


                <div class="details-left">


                    <div class="detail">

                        <i class="bi bi-lightning-charge-fill"></i>

                        ${train.trainType}

                    </div>


                    <div class="detail">

                        <i class="bi bi-clock"></i>

                        ${train.durationHours} hours

                    </div>


                    <div class="detail">

                        <i class="bi bi-shield-check"></i>

                        Reliable service

                    </div>


                </div>


                <button
                        type="button"
                        class="view-button">

                    View Train

                    <i class="bi bi-arrow-right ms-1"></i>

                </button>


            </div>


        </div>


    </c:forEach>


</div>


<!-- ================= FOOTER ================= -->

<footer>

    <strong>RailGo</strong>

    <div>
        Plan your journey smarter.
    </div>

    <small>
        © 2026 RailGo. All rights reserved.
    </small>

</footer>


<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js">
</script>

</body>

</html>