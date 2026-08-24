<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Privacy Policy | Healthcare</title>
<style>

    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    body {
        font-family: "Segoe UI", Arial, sans-serif;
        background: #f4f9fc;
        color: #334155;
    }

    /* HEADER */

    .header {
        background: linear-gradient(135deg, #087ea4, #19a7a8);
        color: white;
        padding: 55px 20px;
        text-align: center;
    }

    .header-icon {
        width: 70px;
        height: 70px;
        margin: auto;
        background: rgba(255,255,255,0.18);
        border-radius: 50%;
        display: flex;
        justify-content: center;
        align-items: center;
        font-size: 32px;
        margin-bottom: 18px;
    }

    .header h1 {
        font-size: 38px;
        margin-bottom: 10px;
    }

    .header p {
        font-size: 16px;
        opacity: 0.9;
    }

    /* MAIN CONTAINER */

    .main-container {
        max-width: 1100px;
        margin: 40px auto;
        padding: 0 20px;
        display: grid;
        grid-template-columns: 250px 1fr;
        gap: 30px;
    }

    /* SIDEBAR */

    .sidebar {
        background: white;
        padding: 22px;
        border-radius: 15px;
        height: fit-content;
        box-shadow: 0 5px 20px rgba(0,0,0,0.06);
        position: sticky;
        top: 20px;
    }

    .sidebar h3 {
        color: #087ea4;
        margin-bottom: 15px;
        font-size: 17px;
    }

    .sidebar a {
        display: block;
        text-decoration: none;
        color: #64748b;
        padding: 10px 12px;
        border-radius: 8px;
        margin-bottom: 5px;
        font-size: 14px;
        transition: 0.3s;
    }

    .sidebar a:hover {
        background: #e8f8fa;
        color: #087ea4;
    }

    /* CONTENT */

    .content {
        background: white;
        padding: 40px;
        border-radius: 18px;
        box-shadow: 0 5px 25px rgba(0,0,0,0.06);
    }

    .updated {
        background: #eef9fb;
        border-left: 4px solid #19a7a8;
        padding: 15px 18px;
        border-radius: 8px;
        margin-bottom: 30px;
        color: #52616b;
        font-size: 14px;
    }

    .section {
        margin-bottom: 35px;
    }

    .section-title {
        display: flex;
        align-items: center;
        gap: 12px;
        margin-bottom: 14px;
    }

    .section-icon {
        width: 38px;
        height: 38px;
        background: #e8f8fa;
        color: #087ea4;
        border-radius: 10px;
        display: flex;
        justify-content: center;
        align-items: center;
        font-size: 19px;
    }

    h2 {
        font-size: 21px;
        color: #12344d;
    }

    p {
        line-height: 1.8;
        color: #64748b;
        font-size: 15px;
        margin-bottom: 10px;
    }

    ul {
        padding-left: 20px;
    }

    li {
        color: #64748b;
        line-height: 1.8;
        margin-bottom: 5px;
    }

    /* INFORMATION CARDS */

    .info-grid {
        display: grid;
        grid-template-columns: repeat(2, 1fr);
        gap: 15px;
        margin-top: 15px;
    }

    .info-card {
        background: #f8fcfd;
        border: 1px solid #e1f0f2;
        padding: 20px;
        border-radius: 12px;
    }

    .info-card strong {
        display: block;
        color: #087ea4;
        margin-bottom: 7px;
    }

    .info-card span {
        color: #64748b;
        font-size: 14px;
    }

    /* CONTACT BOX */

    .contact-box {
        background: linear-gradient(135deg, #087ea4, #19a7a8);
        color: white;
        padding: 28px;
        border-radius: 15px;
        margin-top: 20px;
    }

    .contact-box h2 {
        color: white;
        margin-bottom: 10px;
    }

    .contact-box p {
        color: rgba(255,255,255,0.9);
    }

    .contact-details {
        display: flex;
        gap: 15px;
        flex-wrap: wrap;
        margin-top: 15px;
    }

    .contact-item {
        background: rgba(255,255,255,0.15);
        padding: 10px 15px;
        border-radius: 8px;
        font-size: 14px;
    }

    /* FOOTER */

    .footer {
        background: #12344d;
        color: #cbd5e1;
        text-align: center;
        padding: 25px;
        margin-top: 50px;
        font-size: 14px;
    }

    /* RESPONSIVE */

    @media (max-width: 800px) {

        .main-container {
            grid-template-columns: 1fr;
        }

        .sidebar {
            position: static;
        }

        .sidebar a {
            display: inline-block;
            margin-right: 5px;
        }

        .content {
            padding: 25px;
        }

        .info-grid {
            grid-template-columns: 1fr;
        }

        .header h1 {
            font-size: 30px;
        }
    }

</style>
```

</head>

<body>

<!-- HEADER -->

<header class="header">

<div class="header-icon">
    🔒
</div>

<h1>Privacy Policy</h1>

<p>
    Your privacy and security are important to us
</p>


</header>

<!-- MAIN -->

<div class="main-container">


<!-- SIDEBAR -->

<aside class="sidebar">

    <h3>Privacy Policy</h3>

    <a href="#information">Information We Collect</a>

    <a href="#usage">How We Use Information</a>

    <a href="#appointments">Appointment Information</a>

    <a href="#security">Data Security</a>

    <a href="#sharing">Information Sharing</a>

    <a href="#cookies">Cookies</a>

    <a href="#rights">Your Rights</a>

    <a href="#changes">Policy Changes</a>

    <a href="#contact">Contact Us</a>

</aside>


<!-- CONTENT -->

<main class="content">

    <div class="updated">

        <strong>Last Updated:</strong>
        <%= new java.text.SimpleDateFormat("dd MMMM yyyy")
                .format(new java.util.Date()) %>

    </div>


    <!-- INTRODUCTION -->

    <div class="section">

        <p>
            Welcome to our healthcare appointment platform.
            We respect your privacy and are committed to keeping
            your personal information safe.
        </p>

        <p>
            This Privacy Policy explains what information we collect,
            how we use it, and how we protect it when you use our
            website and services.
        </p>

    </div>


    <!-- INFORMATION -->

    <div class="section" id="information">

        <div class="section-title">

            <div class="section-icon">
                👤
            </div>

            <h2>Information We Collect</h2>

        </div>

        <p>
            We may collect information that you provide while
            creating an account or using our healthcare services.
        </p>

        <div class="info-grid">

            <div class="info-card">
                <strong>Personal Information</strong>
                <span>Name, email address and phone number.</span>
            </div>

            <div class="info-card">
                <strong>Account Information</strong>
                <span>Login and account-related information.</span>
            </div>

            <div class="info-card">
                <strong>Appointment Details</strong>
                <span>Doctor, date, time and appointment information.</span>
            </div>

            <div class="info-card">
                <strong>Usage Information</strong>
                <span>Information about how you use our website.</span>
            </div>

        </div>

    </div>


    <!-- USAGE -->

    <div class="section" id="usage">

        <div class="section-title">

            <div class="section-icon">
                ⚙️
            </div>

            <h2>How We Use Your Information</h2>

        </div>

        <p>
            Your information helps us provide a better and safer
            healthcare experience.
        </p>

        <ul>

            <li>Create and manage your account</li>

            <li>Book and manage doctor appointments</li>

            <li>Send appointment notifications</li>

            <li>Provide customer support</li>

            <li>Improve our website and services</li>

            <li>Maintain platform security</li>

        </ul>

    </div>


    <!-- APPOINTMENTS -->

    <div class="section" id="appointments">

        <div class="section-title">

            <div class="section-icon">
                📅
            </div>

            <h2>Appointment Information</h2>

        </div>

        <p>
            When you book an appointment, information such as the
            selected doctor, appointment date, time and booking
            details may be stored in our system.
        </p>

        <p>
            This information allows us to manage your appointment
            and provide the requested healthcare services.
        </p>

    </div>


    <!-- SECURITY -->

    <div class="section" id="security">

        <div class="section-title">

            <div class="section-icon">
                🛡️
            </div>

            <h2>Data Security</h2>

        </div>

        <p>
            We use reasonable security measures to protect your
            personal information from unauthorized access,
            modification or misuse.
        </p>

        <p>
            However, no method of storing or transmitting
            information over the internet can be guaranteed
            to be completely secure.
        </p>

    </div>


    <!-- SHARING -->

    <div class="section" id="sharing">

        <div class="section-title">

            <div class="section-icon">
                🤝
            </div>

            <h2>Information Sharing</h2>

        </div>

        <p>
            We do not sell your personal information.
            Your information may be shared with doctors,
            healthcare providers, or trusted service providers
            when necessary to provide our services.
        </p>

    </div>


    <!-- COOKIES -->

    <div class="section" id="cookies">

        <div class="section-title">

            <div class="section-icon">
                🍪
            </div>

            <h2>Cookies</h2>

        </div>

        <p>
            Our website may use cookies or similar technologies
            to remember preferences, improve functionality and
            understand how users interact with our website.
        </p>

    </div>


    <!-- RIGHTS -->

    <div class="section" id="rights">

        <div class="section-title">

            <div class="section-icon">
                ✅
            </div>

            <h2>Your Rights</h2>

        </div>

        <p>
            Depending on applicable laws, you may have the right to:
        </p>

        <ul>

            <li>Access your personal information</li>

            <li>Update incorrect information</li>

            <li>Request deletion of your information</li>

            <li>Ask questions about how your information is used</li>

        </ul>

    </div>


    <!-- CHANGES -->

    <div class="section" id="changes">

        <div class="section-title">

            <div class="section-icon">
                🔄
            </div>

            <h2>Changes to This Policy</h2>

        </div>

        <p>
            We may update this Privacy Policy from time to time.
            Any changes will be displayed on this page with
            an updated date.
        </p>

    </div>


    <!-- CONTACT -->

    <div class="section" id="contact">

        <div class="contact-box">

            <h2>Need Help?</h2>

            <p>
                If you have any questions about our Privacy Policy
                or how we handle your information, please contact us.
            </p>

            <div class="contact-details">

                <div class="contact-item">
                    📧 support@example.com
                </div>

                <div class="contact-item">
                    📞 +91 XXXXX XXXXX
                </div>

            </div>

        </div>

    </div>

</main>
```

</div>

<!-- FOOTER -->

<footer class="footer">


© 2026 Healthcare Appointment Platform.
All rights reserved.


</footer>

</body>

</html>
