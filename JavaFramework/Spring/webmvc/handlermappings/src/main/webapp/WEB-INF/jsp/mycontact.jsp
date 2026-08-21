<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Us</title>

    <style>
        * {
            box-sizing: border-box;
        }

        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background: #f4f7fb;
        }

        .contact-section {
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 40px 20px;
        }

        .contact-container {
            width: 100%;
            max-width: 1000px;
            display: grid;
            grid-template-columns: 40% 60%;
            background: white;
            border-radius: 15px;
            overflow: hidden;
            box-shadow: 0 10px 30px rgba(0,0,0,0.1);
        }

        /* Left Side */
        .contact-info {
            background: #2563eb;
            color: white;
            padding: 50px 35px;
        }

        .contact-info h1 {
            font-size: 32px;
            margin-bottom: 15px;
        }

        .contact-info p {
            line-height: 1.6;
            color: #e0e7ff;
        }

        .info-item {
            margin-top: 30px;
        }

        .info-item h3 {
            margin-bottom: 8px;
        }

        .info-item p {
            margin: 0;
        }

        /* Right Side */
        .contact-form {
            padding: 50px 40px;
        }

        .contact-form h2 {
            margin-top: 0;
            color: #222;
        }

        .form-group {
            margin-bottom: 20px;
        }

        .form-group label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }

        .form-group input,
        .form-group textarea {
            width: 100%;
            padding: 13px;
            border: 1px solid #ddd;
            border-radius: 7px;
            font-size: 15px;
            outline: none;
        }

        .form-group input:focus,
        .form-group textarea:focus {
            border-color: #2563eb;
        }

        textarea {
            resize: none;
        }

        .submit-btn {
            width: 100%;
            padding: 14px;
            background: #2563eb;
            color: white;
            border: none;
            border-radius: 7px;
            font-size: 16px;
            cursor: pointer;
        }

        .submit-btn:hover {
            background: #1d4ed8;
        }

        @media (max-width: 768px) {
            .contact-container {
                grid-template-columns: 1fr;
            }
        }
    </style>
</head>

<body>

<section class="contact-section">

    <div class="contact-container">

        <!-- Contact Information -->
        <div class="contact-info">

            <h1>Let's Talk</h1>

            <p>
                Have a question, suggestion or need help?
                Our team is always ready to help you.
            </p>

            <div class="info-item">
                <h3>📍 Address</h3>
                <p>123 Main Street, Hyderabad, India</p>
            </div>

            <div class="info-item">
                <h3>📞 Phone</h3>
                <p>+91 98765 43210</p>
            </div>

            <div class="info-item">
                <h3>✉ Email</h3>
                <p>support@example.com</p>
            </div>

            <div class="info-item">
                <h3>🕒 Working Hours</h3>
                <p>Monday - Saturday<br>9:00 AM - 6:00 PM</p>
            </div>

        </div>

        <!-- Contact Form -->
        <div class="contact-form">

            <h2>Send Us a Message</h2>

            <form>

                <div class="form-group">
                    <label>Name</label>
                    <input type="text" placeholder="Enter your name" required>
                </div>

                <div class="form-group">
                    <label>Email</label>
                    <input type="email" placeholder="Enter your email" required>
                </div>

                <div class="form-group">
                    <label>Subject</label>
                    <input type="text" placeholder="Enter subject">
                </div>

                <div class="form-group">
                    <label>Message</label>
                    <textarea rows="6" placeholder="Write your message..." required></textarea>
                </div>

                <button class="submit-btn">
                    Send Message
                </button>

            </form>

        </div>

    </div>

</section>

</body>
</html>