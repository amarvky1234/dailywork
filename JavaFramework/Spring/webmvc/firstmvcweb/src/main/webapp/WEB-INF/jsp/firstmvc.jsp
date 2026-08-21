<!DOCTYPE html>
<html lang="en">
<head>
    <title>First MVC - Home</title>
    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background: #f5f7fa;
        }

        .navbar {
            background: #222;
            padding: 18px 50px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .logo {
            color: white;
            font-size: 24px;
            font-weight: bold;
        }

        .nav-links a {
            color: white;
            text-decoration: none;
            margin-left: 25px;
        }

        .hero {
            text-align: center;
            padding: 100px 20px;
            background: white;
        }

        .hero h1 {
            font-size: 45px;
            color: #222;
            margin-bottom: 15px;
        }

        .hero p {
            font-size: 18px;
            color: #666;
            margin-bottom: 30px;
        }

        .btn {
            display: inline-block;
            padding: 12px 25px;
            background: #007bff;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }

        .btn:hover {
            background: #0056b3;
        }

        .cards {
            display: flex;
            justify-content: center;
            gap: 25px;
            padding: 50px;
        }

        .card {
            width: 250px;
            padding: 25px;
            background: white;
            text-align: center;
            border-radius: 10px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
        }

        .card h2 {
            color: #333;
        }

        .card p {
            color: #666;
        }
    </style>
</head>

<body>

    <div class="navbar">

        <div class="logo">
            First MVC
        </div>

        <div class="nav-links">
            <a href="home.htm">Home</a>
            <a href="#">About</a>
            <a href="#">Services</a>
            <a href="#">Contact</a>
        </div>

    </div>


    <div class="hero">

        <h1>Welcome to First MVC</h1>

        <p>
            Learn Spring MVC step by step with a simple web application.
        </p>

        <a href="#" class="btn">
            Get Started
        </a>

    </div>


    <div class="cards">

        <div class="card">
            <h2>Spring MVC</h2>
            <p>
                Build powerful web applications using Spring MVC.
            </p>
        </div>

        <div class="card">
            <h2>Controller</h2>
            <p>
                Handle HTTP requests using Spring MVC controllers.
            </p>
        </div>

        <div class="card">
            <h2>JSP</h2>
            <p>
                Create dynamic web pages using JSP.
            </p>
        </div>

    </div>

</body>
</html>