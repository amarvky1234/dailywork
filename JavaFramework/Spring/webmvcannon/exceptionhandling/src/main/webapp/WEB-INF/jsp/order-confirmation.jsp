<!DOCTYPE html>
<html>
<head>
    <title>Order Confirmation</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #74ebd5, #9face6);
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .confirmation-container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            width: 400px;
        }

        .confirmation-container h1 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        .order-details{
            margin-bottom: 20px;
            color: #555;
        }

        .order-details p span {
            font-weight: bold;
            color: #333;
        }

        .thank-you {
            text-align: center;
            margin-top: 20px;
            font-size: 18px;
            color: #4CAF50;
        }
    </style>
</head>
<body>
    <div class="confirmation-container">
        <h1>Payment Successful!</h1>
        <div class="order-details">
            <p>Order Id: <span>${orderConfirmation.orderId}</span></p>
            <p>Payment Amount: <span>${orderConfirmation.paymentAmount}</span></p>
            <p>Payment Date: <span>${orderConfirmation.paymentDate}</span></p>
        </div>
        <div class="thank-you">
            Thank you for your purchase!
        </div>
    </div>
</body>
</html>