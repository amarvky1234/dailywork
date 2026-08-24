<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Privacy Policy</title>

    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background-color: #f5f8fa;
            color: #333;
        }

        .container {
            max-width: 900px;
            margin: 40px auto;
            background: white;
            padding: 35px;
            border-radius: 10px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.08);
        }

        h1 {
            text-align: center;
            color: #1976d2;
            margin-bottom: 10px;
        }

        .date {
            text-align: center;
            color: #777;
            margin-bottom: 30px;
        }

        h2 {
            color: #1976d2;
            margin-top: 30px;
        }

        p, li {
            line-height: 1.7;
            color: #555;
        }

        ul {
            padding-left: 25px;
        }

        .contact {
            background: #f1f7ff;
            padding: 15px;
            border-left: 4px solid #1976d2;
            margin-top: 20px;
        }

        .footer {
            text-align: center;
            margin-top: 30px;
            color: #888;
            font-size: 14px;
        }
    </style>
</head>

<body>

<div class="container">

    <h1>Privacy Policy</h1>

    <p class="date">
        Effective Date: <%= new java.text.SimpleDateFormat("dd-MM-yyyy")
                .format(new java.util.Date()) %>
    </p>

    <p>
        Welcome to our healthcare appointment platform.
        We respect your privacy and are committed to protecting your
        personal information when you use our website and services.
    </p>

    <h2>1. Information We Collect</h2>

    <p>
        When you use our website, we may collect information such as:
    </p>

    <ul>
        <li>Your name</li>
        <li>Email address</li>
        <li>Phone number</li>
        <li>Account login information</li>
        <li>Doctor and appointment details</li>
        <li>Information you provide while using our services</li>
    </ul>

    <h2>2. How We Use Your Information</h2>

    <p>
        We use your information to provide and improve our services.
        Your information may be used to:
    </p>

    <ul>
        <li>Create and manage your account</li>
        <li>Book and manage doctor appointments</li>
        <li>Contact you about your appointments</li>
        <li>Provide customer support</li>
        <li>Improve our website and services</li>
        <li>Maintain the security of our platform</li>
    </ul>

    <h2>3. Appointment Information</h2>

    <p>
        Information related to your appointments may be stored in our
        system so that you and the healthcare provider can manage
        appointments effectively.
    </p>

    <h2>4. Protection of Your Information</h2>

    <p>
        We take reasonable steps to protect your personal information
        from unauthorized access, misuse, modification, or disclosure.
        However, no online system can guarantee complete security.
    </p>

    <h2>5. Sharing of Information</h2>

    <p>
        We do not sell your personal information. Information may be
        shared with healthcare providers or service providers when
        necessary to provide the services requested by you.
    </p>

    <h2>6. Cookies</h2>

    <p>
        Our website may use cookies or similar technologies to improve
        website functionality and user experience.
    </p>

    <h2>7. Your Choices</h2>

    <p>
        You may request to access, update, or delete your personal
        information, subject to applicable requirements.
    </p>

    <h2>8. Children's Privacy</h2>

    <p>
        Our services are not intended to knowingly collect personal
        information from children without appropriate consent.
    </p>

    <h2>9. Changes to This Policy</h2>

    <p>
        We may update this Privacy Policy from time to time.
        Any changes will be posted on this page with an updated
        effective date.
    </p>

    <h2>10. Contact Us</h2>

    <div class="contact">
        <p>
            If you have any questions about this Privacy Policy,
            please contact us.
        </p>

        <p>
            <strong>Email:</strong> support@example.com
        </p>

        <p>
            <strong>Phone:</strong> +91 XXXXX XXXXX
        </p>
    </div>

    <div class="footer">
        © 2026 Healthcare Appointment Platform. All rights reserved.
    </div>

</div>

</body>
</html>