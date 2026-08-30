<!DOCTYPE html>
<html>
<head>
    <title>Error</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background: linear-gradient(to right, #ff7e5f, #feb47b);
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            color: #333;
        }

        .error-container {
            text-align: center;
            background-color: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            width: 450px;
        }

        .error-header {
            font-size: 24px;
            font-weight: bold;
            color: #d9534f;
            margin-bottom: 20px;
        }

        .error-message {
           color: #555;
           margin-bottom: 20px;
         }

         button {
            padding: 10px 20px;
            background-color: #d9534f;
            color: #fff;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
         }

         button:hover {
            background-color: #c9302c;
         }
    </style>
</head>
<body>
    <div class="error-container">
        <div class="error-header">Oops! Something went wrong.</div>
        <div class="error-message">${errorMessage}</div>
    </div>
</body>
</html>