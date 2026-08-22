<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Our Mission</title>

    <style>

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            background: #ffffff;
            color: #222;
        }

        /* ================= HERO ================= */

        .hero {
            min-height: 500px;

            background: linear-gradient(
                135deg,
                #0f766e,
                #14b8a6
            );

            display: flex;
            align-items: center;
            justify-content: center;

            text-align: center;

            padding: 60px 20px;

            color: white;
        }

        .hero-content {
            max-width: 850px;
        }

        .hero h1 {
            font-size: 60px;
            margin-bottom: 20px;
        }

        .hero p {
            font-size: 20px;
            line-height: 1.7;
            opacity: 0.95;
        }

        .hero-btn {
            display: inline-block;

            margin-top: 30px;

            padding: 14px 30px;

            background: white;
            color: #0f766e;

            text-decoration: none;

            border-radius: 30px;

            font-weight: bold;

            transition: 0.3s;
        }

        .hero-btn:hover {
            transform: translateY(-3px);
            box-shadow: 0 8px 20px rgba(0,0,0,0.2);
        }


        /* ================= MISSION ================= */

        .mission {
            padding: 80px 8%;

            display: flex;
            align-items: center;

            gap: 60px;
        }

        /*
            No image is used here.
            The medical icon is created using CSS.
        */

        .mission-image {
            flex: 1;

            height: 350px;

            border-radius: 20px;

            background: linear-gradient(
                135deg,
                #ccfbf1,
                #99f6e4
            );

            display: flex;
            align-items: center;
            justify-content: center;

            position: relative;

            overflow: hidden;
        }

        /* Medical cross */

        .medical-icon {
            width: 110px;
            height: 110px;

            background: #0f766e;

            border-radius: 25px;

            position: relative;

            box-shadow: 0 15px 30px rgba(15,118,110,0.3);
        }

        .medical-icon::before {
            content: "";

            position: absolute;

            width: 35px;
            height: 80px;

            background: white;

            border-radius: 8px;

            top: 15px;
            left: 38px;
        }

        .medical-icon::after {
            content: "";

            position: absolute;

            width: 80px;
            height: 35px;

            background: white;

            border-radius: 8px;

            top: 38px;
            left: 15px;
        }


        .mission-content {
            flex: 1;
        }

        .mission-content span {
            color: #0f766e;

            font-weight: bold;

            text-transform: uppercase;

            letter-spacing: 2px;
        }

        .mission-content h2 {
            font-size: 42px;

            margin: 15px 0;
        }

        .mission-content p {
            color: #666;

            line-height: 1.8;

            font-size: 17px;
        }


        /* ================= VALUES ================= */

        .values {
            background: #f0fdfa;

            padding: 80px 8%;

            text-align: center;
        }

        .values h2 {
            font-size: 40px;

            margin-bottom: 10px;
        }

        .values-subtitle {
            color: #666;

            margin-bottom: 45px;
        }

        .value-container {
            display: grid;

            grid-template-columns:
                repeat(3, 1fr);

            gap: 25px;
        }

        .value-card {
            background: white;

            padding: 35px 25px;

            border-radius: 18px;

            transition: 0.3s;
        }

        .value-card:hover {
            transform: translateY(-10px);

            box-shadow:
                0 15px 30px rgba(0,0,0,0.1);
        }

        .icon {
            width: 65px;
            height: 65px;

            margin: 0 auto 20px;

            border-radius: 50%;

            background: #ccfbf1;

            display: flex;
            align-items: center;
            justify-content: center;

            font-size: 30px;
        }

        .value-card h3 {
            margin-bottom: 12px;

            font-size: 22px;
        }

        .value-card p {
            color: #666;

            line-height: 1.6;
        }


        /* ================= STATS ================= */

        .stats {
            padding: 70px 8%;

            background: #134e4a;

            color: white;
        }

        .stats-container {
            max-width: 1000px;

            margin: auto;

            display: grid;

            grid-template-columns:
                repeat(4, 1fr);

            text-align: center;

            gap: 30px;
        }

        .stat h2 {
            font-size: 42px;

            margin-bottom: 8px;
        }

        .stat p {
            opacity: 0.8;
        }


        /* ================= CTA ================= */

        .cta {
            padding: 90px 20px;

            text-align: center;
        }

        .cta h2 {
            font-size: 42px;

            margin-bottom: 15px;
        }

        .cta p {
            color: #666;

            margin-bottom: 30px;
        }

        .cta a {
            display: inline-block;

            padding: 15px 35px;

            background: #0f766e;

            color: white;

            text-decoration: none;

            border-radius: 30px;

            font-weight: bold;

            transition: 0.3s;
        }

        .cta a:hover {
            background: #115e59;

            transform: translateY(-3px);
        }


        /* ================= FOOTER ================= */

        footer {
            background: #111827;

            color: white;

            text-align: center;

            padding: 25px;
        }


        /* ================= RESPONSIVE ================= */

        @media (max-width: 900px) {

            .hero h1 {
                font-size: 45px;
            }

            .mission {
                flex-direction: column;
            }

            .mission-image {
                width: 100%;
            }

            .mission-content {
                width: 100%;
            }

            .value-container {
                grid-template-columns: 1fr;
            }

            .stats-container {
                grid-template-columns:
                    repeat(2, 1fr);
            }
        }


        @media (max-width: 500px) {

            .hero h1 {
                font-size: 36px;
            }

            .hero p {
                font-size: 16px;
            }

            .mission-content h2 {
                font-size: 32px;
            }

            .stats-container {
                grid-template-columns: 1fr;
            }

            .mission-image {
                height: 280px;
            }
        }

    </style>

</head>


<body>


<!-- ================= HERO ================= -->

<section class="hero">

    <div class="hero-content">

        <h1>
            Making Healthcare Better
        </h1>

        <p>
            Our mission is to make quality healthcare simple,
            accessible and available to everyone. We connect
            patients with trusted healthcare professionals
            through technology.
        </p>

        <a href="#" class="hero-btn">
            Discover Our Mission
        </a>

    </div>

</section>


<!-- ================= MISSION ================= -->

<section class="mission">

    <div class="mission-image">

        <!-- CSS Medical Icon -->
        <div class="medical-icon"></div>

    </div>


    <div class="mission-content">

        <span>
            Our Mission
        </span>

        <h2>
            Healthcare That Puts People First
        </h2>

        <p>
            We believe healthcare should be accessible,
            transparent and convenient for everyone.
            Our platform helps patients discover doctors,
            book appointments and manage their healthcare
            journey from one place.
        </p>

        <br>

        <p>
            By combining technology with compassionate
            healthcare professionals, we are building a
            better and more connected healthcare experience.
        </p>

    </div>

</section>


<!-- ================= VALUES ================= -->

<section class="values">

    <h2>
        What We Believe In
    </h2>

    <p class="values-subtitle">
        Our values guide everything we build and every
        patient we serve.
    </p>


    <div class="value-container">


        <!-- Patient First -->

        <div class="value-card">

            <div class="icon">
                ❤️
            </div>

            <h3>
                Patient First
            </h3>

            <p>
                Every decision we make starts with
                understanding and serving the needs
                of patients.
            </p>

        </div>


        <!-- Innovation -->

        <div class="value-card">

            <div class="icon">
                💡
            </div>

            <h3>
                Innovation
            </h3>

            <p>
                We use modern technology to create
                simpler, faster and smarter healthcare
                experiences.
            </p>

        </div>


        <!-- Trust -->

        <div class="value-card">

            <div class="icon">
                🤝
            </div>

            <h3>
                Trust
            </h3>

            <p>
                We believe transparency and trust are
                essential for building meaningful
                relationships.
            </p>

        </div>

    </div>

</section>


<!-- ================= STATS ================= -->

<section class="stats">

    <div class="stats-container">

        <div class="stat">

            <h2>
                10K+
            </h2>

            <p>
                Patients Served
            </p>

        </div>


        <div class="stat">

            <h2>
                500+
            </h2>

            <p>
                Doctors
            </p>

        </div>


        <div class="stat">

            <h2>
                50+
            </h2>

            <p>
                Specialities
            </p>

        </div>


        <div class="stat">

            <h2>
                24/7
            </h2>

            <p>
                Healthcare Access
            </p>

        </div>

    </div>

</section>


<!-- ================= CTA ================= -->

<section class="cta">

    <h2>
        Let's Build a Healthier Future
    </h2>

    <p>
        Join us in creating a healthcare experience
        that is easier and better for everyone.
    </p>

    <a href="#">
        Get Started
    </a>

</section>


<!-- ================= FOOTER ================= -->

<footer>

    <p>
        &copy; 2026 Healthcare Platform.
        All rights reserved.
    </p>

</footer>


</body>

</html>