<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Checkout</title>
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

        .checkout-container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            width: 400px;
        }

        .checkout-container h1 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        .form-group {
           margin-bottom: 15px;
         }

         label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
            color: #555;
         }

         input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 14px;
         }

         button {
            width: 100;
            padding: 12px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            margin-top: 20px;
         }

         button:hover {
            background-color: #45a049;
         }
    </style>
</head>
<body>
    <div class="checkout-container">
        <h1>Checkout</h1>
        <form:form modelAttribute="checkoutForm"
                   action="${pageContext.request.contextPath}/checkout.htm"
                   method="post"
        >
            <div class="form-group">
                <label for="cardNumber">Card Number:</label>
                <form:input path="cardNumber" id="cardNumber" />
                <form:errors path="cardNumber" cssClass="error-message" />
            </div>
            <div class="form-group">
                 <label for="expiryMonth">Expiry Month:</label>
                 <form:input path="expiryMonth" id="expiryMonth" />
                 <form:errors path="expiryMonth" cssClass="error-message" />
            </div>
            <div class="form-group">
                <label for="expiryYear">Expiry Year:</label>
                <form:input path="expiryYear" id="expiryYear" />
                <form:errors path="expiryYear" cssClass="error-message" />
            </div>
            <div class="form-group">
                <label for="cvv">CVV:</label>
                <form:input path="cvv" id="cvv" />
                <form:errors path="cvv" cssClass="error-message" />
            </div>
            <button type="submit">Pay</button>
        </form:form>
    </div>
</body>
</html>