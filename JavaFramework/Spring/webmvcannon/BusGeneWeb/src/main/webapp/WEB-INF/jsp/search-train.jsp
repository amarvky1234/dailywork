<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="UTF-8">

    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">

    <title>RailGo - Search Trains</title>

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
            background: #ffffff;
            border-bottom: 1px solid #e5e7eb;
            padding: 16px 0;
        }

        .brand {
            font-size: 25px;
            font-weight: 700;
            color: #2563eb;
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

        .nav-link:hover {
            color: #2563eb !important;
        }

        /* ================= HERO ================= */

        .hero {
            min-height: 430px;
            background:
                linear-gradient(
                    rgba(15, 23, 42, 0.78),
                    rgba(37, 99, 235, 0.72)
                ),
                linear-gradient(135deg, #2563eb, #0f172a);

            display: flex;
            align-items: center;
            justify-content: center;

            padding: 70px 20px;
        }

        .hero-content {
            width: 100%;
            max-width: 1100px;
            text-align: center;
            color: white;
        }

        .hero-title {
            font-size: 48px;
            font-weight: 700;
            margin-bottom: 12px;
        }

        .hero-subtitle {
            font-size: 18px;
            opacity: 0.9;
            margin-bottom: 40px;
        }

        /* ================= SEARCH CARD ================= */

        .search-card {
            background: white;
            border-radius: 18px;
            padding: 28px;

            box-shadow:
                0 20px 50px rgba(0, 0, 0, 0.18);

            text-align: left;
        }

        .field-label {
            font-size: 13px;
            font-weight: 600;
            color: #6b7280;
            margin-bottom: 7px;
        }

        .input-group-custom {
            border: 1px solid #dbe1ea;
            border-radius: 10px;
            overflow: hidden;
            background: #fff;
        }

        .input-icon {
            width: 48px;
            display: flex;
            align-items: center;
            justify-content: center;
            color: #2563eb;
            font-size: 19px;
            background: #f8fafc;
        }

        .custom-input {
            border: none !important;
            box-shadow: none !important;
            padding: 13px 12px;
            height: 50px;
        }

        .custom-input:focus {
            outline: none;
        }

        .search-button {
            height: 50px;
            border: none;
            border-radius: 10px;
            background: #2563eb;
            color: white;
            font-weight: 600;
            font-size: 15px;

            transition: all 0.2s ease;
        }

        .search-button:hover {
            background: #1d4ed8;
            transform: translateY(-1px);
        }

        /* ================= FEATURES ================= */

        .features {
            padding: 55px 20px;
        }

        .feature-card {
            background: white;
            border-radius: 14px;
            padding: 25px;
            height: 100%;

            border: 1px solid #e5e7eb;

            transition: all 0.2s ease;
        }

        .feature-card:hover {
            transform: translateY(-5px);
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.08);
        }

        .feature-icon {
            width: 48px;
            height: 48px;
            border-radius: 12px;

            background: #eff6ff;
            color: #2563eb;

            display: flex;
            align-items: center;
            justify-content: center;

            font-size: 22px;
            margin-bottom: 15px;
        }

        .feature-title {
            font-weight: 650;
            margin-bottom: 7px;
        }

        .feature-text {
            color: #6b7280;
            margin: 0;
            font-size: 14px;
        }

        /* ================= FOOTER ================= */

        footer {
            background: #111827;
            color: #9ca3af;
            text-align: center;
            padding: 25px;
            margin-top: 20px;
        }

        footer strong {
            color: white;
        }

        /* ================= RESPONSIVE ================= */

        @media (max-width: 768px) {

            .hero-title {
                font-size: 34px;
            }

            .hero {
                padding: 50px 15px;
            }

            .search-card {
                padding: 20px;
            }

            .nav-link {
                margin-left: 0;
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


<!-- ================= HERO ================= -->

<section class="hero">

    <div class="hero-content">

        <h1 class="hero-title">
            Find Your Perfect Train
        </h1>

        <p class="hero-subtitle">
            Search trains, compare timings and plan your journey with ease.
        </p>


        <!-- SEARCH CARD -->

        <div class="search-card">

            <form
                    action="${pageContext.request.contextPath}/search-trains.htm"
                    method="post">


                <div class="row g-3 align-items-end">


                    <!-- SOURCE -->

                    <div class="col-lg-3 col-md-6">

                        <div class="field-label">
                            FROM
                        </div>

                        <div class="input-group-custom d-flex">

                            <div class="input-icon">
                                <i class="bi bi-geo-alt-fill"></i>
                            </div>

                            <input
                                    type="text"
                                    name="source"
                                    class="form-control custom-input"
                                    placeholder="Departure city"
                                    required>

                        </div>

                    </div>


                    <!-- DESTINATION -->

                    <div class="col-lg-3 col-md-6">

                        <div class="field-label">
                            TO
                        </div>

                        <div class="input-group-custom d-flex">

                            <div class="input-icon">
                                <i class="bi bi-geo-alt"></i>
                            </div>

                            <input
                                    type="text"
                                    name="destination"
                                    class="form-control custom-input"
                                    placeholder="Arrival city"
                                    required>

                        </div>

                    </div>


                    <!-- DATE -->

                    <div class="col-lg-3 col-md-6">

                        <div class="field-label">
                            JOURNEY DATE
                        </div>

                        <div class="input-group-custom d-flex">

                            <div class="input-icon">
                                <i class="bi bi-calendar3"></i>
                            </div>

                            <input
                                    type="date"
                                    name="journeyDate"
                                    class="form-control custom-input"
                                    required>

                        </div>

                    </div>


                    <!-- SEARCH -->

                    <div class="col-lg-3 col-md-6">

                        <button
                                type="submit"
                                class="search-button w-100">

                            <i class="bi bi-search me-2"></i>

                            Search Trains

                        </button>

                    </div>

                </div>

            </form>

        </div>

    </div>

</section>


<!-- ================= FEATURES ================= -->

<section class="features">

    <div class="container">

        <div class="row g-4">


            <div class="col-md-4">

                <div class="feature-card">

                    <div class="feature-icon">

                        <i class="bi bi-search"></i>

                    </div>

                    <h5 class="feature-title">
                        Easy Search
                    </h5>

                    <p class="feature-text">
                        Quickly find trains based on your source,
                        destination and journey date.
                    </p>

                </div>

            </div>


            <div class="col-md-4">

                <div class="feature-card">

                    <div class="feature-icon">

                        <i class="bi bi-clock"></i>

                    </div>

                    <h5 class="feature-title">
                        Compare Timings
                    </h5>

                    <p class="feature-text">
                        Check departure, arrival and travel duration
                        before choosing your train.
                    </p>

                </div>

            </div>


            <div class="col-md-4">

                <div class="feature-card">

                    <div class="feature-icon">

                        <i class="bi bi-shield-check"></i>

                    </div>

                    <h5 class="feature-title">
                        Simple & Reliable
                    </h5>

                    <p class="feature-text">
                        Get clear train information in a clean,
                        easy-to-use interface.
                    </p>

                </div>

            </div>


        </div>

    </div>

</section>


<!-- ================= FOOTER ================= -->

<footer>

    <div>
        <strong>RailGo</strong> — Plan your journey smarter.
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