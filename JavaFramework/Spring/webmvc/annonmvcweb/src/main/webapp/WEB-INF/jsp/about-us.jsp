<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>About Us</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        header {
            background-color: #333;
            color: white;
            padding: 20px 0;
            text-align: center;
        }
        .container {
            padding: 20px;
        }
        .about-section {
            background: white;
            padding: 20px;
            margin: 20px 0;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        h1, h2, h3 {
            color: #333;
        }
        p {
            line-height: 1.6;
            color: #666;
        }
        .team {
            display: flex;
            flex-wrap: wrap;
            gap: 20px;
        }
        .team-member {
            background: white;
            padding: 10px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            flex: 1 1 200px;
            text-align: center;
        }
        .team-member img {
            border-radius: 50%;
            width: 100px;
            height: 100px;
        }
    </style>
</head>
<body>
    <header>
        <h1>About Us</h1>
    </header>
    <div class="container">
        <div class="about-section">
            <h2>Who We Are</h2>
            <p>We are a team of passionate professionals committed to making a difference. Our mission is to deliver exceptional service and value to our customers.</p>
        </div>
        <div class="about-section">
            <h2>Our Mission</h2>
            <p>Our mission is to inspire and empower individuals through innovative solutions and outstanding customer service.</p>
        </div>
        <div class="about-section">
            <h2>Meet Our Team</h2>
            <div class="team">
                <div class="team-member">
                    <img src="https://via.placeholder.com/100" alt="Team Member">
                    <h3>John Doe</h3>
                    <p>Founder & CEO</p>
                </div>
                <div class="team-member">
                    <img src="https://via.placeholder.com/100" alt="Team Member">
                    <h3>Jane Smith</h3>
                    <p>Chief Operating Officer</p>
                </div>
                <div class="team-member">
                    <img src="https://via.placeholder.com/100" alt="Team Member">
                    <h3>Michael Johnson</h3>
                    <p>Chief Technology Officer</p>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
