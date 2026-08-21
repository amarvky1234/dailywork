<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Admin Dashboard</title>

    <style>

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, Helvetica, sans-serif;
        }

        body {
            background: #f5f7fb;
            color: #333;
        }

        /* ================= SIDEBAR ================= */

        .sidebar {
            position: fixed;
            left: 0;
            top: 0;

            width: 250px;
            height: 100vh;

            background: #172033;
            color: white;

            padding: 25px 15px;
        }

        .logo {
            font-size: 25px;
            font-weight: bold;

            padding: 0 15px 30px;

            border-bottom: 1px solid #344054;
        }

        .logo span {
            color: #4f8cff;
        }

        .menu {
            margin-top: 30px;
        }

        .menu-title {
            font-size: 12px;
            color: #8d99ae;
            padding: 0 15px;
            margin-bottom: 10px;
            text-transform: uppercase;
        }

        .menu a {
            display: flex;
            align-items: center;

            text-decoration: none;
            color: #cbd5e1;

            padding: 14px 15px;
            margin-bottom: 6px;

            border-radius: 8px;

            transition: 0.3s;
        }

        .menu a:hover {
            background: #263552;
            color: white;
        }

        .menu a.active {
            background: #4f8cff;
            color: white;
        }

        .menu-icon {
            width: 30px;
            font-size: 18px;
        }

        .logout {
            position: absolute;
            bottom: 25px;
            left: 15px;
            right: 15px;
        }

        .logout a {
            display: block;

            text-align: center;

            padding: 12px;

            border-radius: 8px;

            background: #263552;

            color: #ffb4b4;

            text-decoration: none;
        }

        .logout a:hover {
            background: #dc3545;
            color: white;
        }


        /* ================= MAIN CONTENT ================= */

        .main {
            margin-left: 250px;
            min-height: 100vh;
        }


        /* ================= TOP NAVBAR ================= */

        .topbar {
            height: 75px;

            background: white;

            display: flex;
            align-items: center;
            justify-content: space-between;

            padding: 0 35px;

            border-bottom: 1px solid #e5e7eb;
        }

        .search {
            width: 350px;

            background: #f5f7fb;

            padding: 11px 15px;

            border-radius: 8px;

            border: 1px solid #e5e7eb;

            outline: none;
        }

        .right-nav {
            display: flex;
            align-items: center;
            gap: 25px;
        }

        .notification {
            position: relative;

            font-size: 21px;

            cursor: pointer;
        }

        .notification-count {
            position: absolute;

            top: -8px;
            right: -8px;

            background: #ff4757;

            color: white;

            font-size: 10px;

            width: 17px;
            height: 17px;

            border-radius: 50%;

            display: flex;
            align-items: center;
            justify-content: center;
        }

        .profile {
            display: flex;
            align-items: center;

            gap: 10px;

            cursor: pointer;
        }

        .profile-image {
            width: 40px;
            height: 40px;

            border-radius: 50%;

            background: #4f8cff;

            color: white;

            display: flex;
            align-items: center;
            justify-content: center;

            font-weight: bold;
        }

        .profile-info strong {
            display: block;
            font-size: 14px;
        }

        .profile-info span {
            font-size: 12px;
            color: #888;
        }


        /* ================= DASHBOARD ================= */

        .content {
            padding: 35px;
        }

        .page-title {
            margin-bottom: 8px;
        }

        .page-title h1 {
            font-size: 28px;
            color: #172033;
        }

        .page-title p {
            margin-top: 7px;
            color: #7b8494;
        }


        /* ================= CARDS ================= */

        .cards {
            display: grid;

            grid-template-columns: repeat(4, 1fr);

            gap: 20px;

            margin-top: 30px;
        }

        .card {
            background: white;

            border-radius: 12px;

            padding: 22px;

            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.05);

            transition: 0.3s;
        }

        .card:hover {
            transform: translateY(-4px);

            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.08);
        }

        .card-header {
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .card-icon {
            width: 48px;
            height: 48px;

            border-radius: 10px;

            display: flex;
            align-items: center;
            justify-content: center;

            font-size: 22px;
        }

        .users-icon {
            background: #e8f1ff;
        }

        .orders-icon {
            background: #fff2df;
        }

        .revenue-icon {
            background: #e7f8ef;
        }

        .pending-icon {
            background: #ffe8e8;
        }

        .card h3 {
            font-size: 14px;

            color: #7b8494;

            margin-bottom: 8px;
        }

        .card h2 {
            font-size: 26px;

            color: #172033;
        }

        .growth {
            margin-top: 12px;

            font-size: 13px;

            color: #20a464;
        }


        /* ================= CONTENT GRID ================= */

        .dashboard-grid {
            display: grid;

            grid-template-columns: 2fr 1fr;

            gap: 20px;

            margin-top: 25px;
        }


        /* ================= TABLE ================= */

        .section {
            background: white;

            border-radius: 12px;

            padding: 25px;

            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.05);
        }

        .section-header {
            display: flex;

            justify-content: space-between;

            align-items: center;

            margin-bottom: 20px;
        }

        .section-header h2 {
            font-size: 18px;

            color: #172033;
        }

        .view-all {
            color: #4f8cff;

            text-decoration: none;

            font-size: 13px;
        }

        table {
            width: 100%;

            border-collapse: collapse;
        }

        th {
            text-align: left;

            font-size: 12px;

            color: #8b95a5;

            padding: 12px;

            border-bottom: 1px solid #eee;
        }

        td {
            padding: 15px 12px;

            font-size: 13px;

            border-bottom: 1px solid #f1f1f1;
        }

        .customer {
            display: flex;

            align-items: center;

            gap: 10px;
        }

        .customer-img {
            width: 35px;
            height: 35px;

            border-radius: 50%;

            background: #e8f1ff;

            display: flex;
            align-items: center;
            justify-content: center;

            color: #4f8cff;

            font-weight: bold;
        }

        .status {
            padding: 6px 10px;

            border-radius: 20px;

            font-size: 11px;
        }

        .completed {
            background: #e7f8ef;
            color: #198754;
        }

        .pending {
            background: #fff3cd;
            color: #997404;
        }

        .cancelled {
            background: #ffe5e5;
            color: #dc3545;
        }


        /* ================= ACTIVITY ================= */

        .activity {
            display: flex;

            gap: 15px;

            margin-bottom: 22px;
        }

        .activity-icon {
            min-width: 40px;
            height: 40px;

            border-radius: 50%;

            background: #e8f1ff;

            display: flex;
            align-items: center;
            justify-content: center;

            color: #4f8cff;
        }

        .activity-content p {
            font-size: 13px;

            line-height: 1.5;
        }

        .activity-content span {
            display: block;

            margin-top: 4px;

            font-size: 11px;

            color: #999;
        }


        /* ================= RESPONSIVE ================= */

        @media (max-width: 1100px) {

            .cards {
                grid-template-columns: repeat(2, 1fr);
            }

            .dashboard-grid {
                grid-template-columns: 1fr;
            }

        }


        @media (max-width: 768px) {

            .sidebar {
                width: 70px;
                padding: 20px 8px;
            }

            .logo {
                font-size: 0;
                text-align: center;
            }

            .logo span {
                font-size: 25px;
            }

            .menu-title,
            .menu a span,
            .logout a {
                display: none;
            }

            .menu a {
                justify-content: center;
            }

            .menu-icon {
                width: auto;
            }

            .main {
                margin-left: 70px;
            }

            .search {
                width: 200px;
            }

            .profile-info {
                display: none;
            }

            .content {
                padding: 20px;
            }

        }


        @media (max-width: 550px) {

            .cards {
                grid-template-columns: 1fr;
            }

            .topbar {
                padding: 0 15px;
            }

            .search {
                width: 140px;
            }

            .right-nav {
                gap: 10px;
            }

            table {
                font-size: 11px;
            }

            .section {
                overflow-x: auto;
            }

        }

    </style>

</head>


<body>


<!-- ================= SIDEBAR ================= -->

<div class="sidebar">

    <div class="logo">
        Admin<span>Panel</span>
    </div>


    <div class="menu">

        <div class="menu-title">
            Main Menu
        </div>


        <a href="home.htm" class="active">
            <div class="menu-icon">📊</div>
            <span>Dashboard</span>
        </a>


        <a href="#">
            <div class="menu-icon">👥</div>
            <span>Users</span>
        </a>


        <a href="#">
            <div class="menu-icon">📦</div>
            <span>Products</span>
        </a>


        <a href="#">
            <div class="menu-icon">🛒</div>
            <span>Orders</span>
        </a>


        <a href="#">
            <div class="menu-icon">📈</div>
            <span>Reports</span>
        </a>


        <div class="menu-title" style="margin-top: 25px;">
            Settings
        </div>


        <a href="#">
            <div class="menu-icon">⚙️</div>
            <span>Settings</span>
        </a>


        <a href="#">
            <div class="menu-icon">❓</div>
            <span>Help</span>
        </a>

    </div>


    <div class="logout">

        <a href="#">
            🚪 &nbsp; Logout
        </a>

    </div>

</div>



<!-- ================= MAIN ================= -->

<div class="main">


    <!-- ================= TOPBAR ================= -->

    <div class="topbar">


        <input
                type="text"
                class="search"
                placeholder="🔍 Search anything..."
        />


        <div class="right-nav">


            <div class="notification">

                🔔

                <div class="notification-count">
                    4
                </div>

            </div>


            <div class="profile">

                <div class="profile-image">
                    A
                </div>

                <div class="profile-info">

                    <strong>Amarjeet Kumar</strong>

                    <span>Administrator</span>

                </div>

            </div>


        </div>

    </div>



    <!-- ================= CONTENT ================= -->

    <div class="content">


        <div class="page-title">

            <h1>Dashboard</h1>

            <p>
                Welcome back, Amarjeet! Here's what's happening today.
            </p>

        </div>



        <!-- ================= STAT CARDS ================= -->

        <div class="cards">


            <div class="card">

                <div class="card-header">

                    <div>
                        <h3>Total Users</h3>
                        <h2>1,250</h2>
                    </div>

                    <div class="card-icon users-icon">
                        👥
                    </div>

                </div>

                <div class="growth">
                    ↑ 12.5% from last month
                </div>

            </div>



            <div class="card">

                <div class="card-header">

                    <div>
                        <h3>Total Orders</h3>
                        <h2>320</h2>
                    </div>

                    <div class="card-icon orders-icon">
                        🛒
                    </div>

                </div>

                <div class="growth">
                    ↑ 8.2% from last month
                </div>

            </div>



            <div class="card">

                <div class="card-header">

                    <div>
                        <h3>Total Revenue</h3>
                        <h2>₹85,420</h2>
                    </div>

                    <div class="card-icon revenue-icon">
                        💰
                    </div>

                </div>

                <div class="growth">
                    ↑ 18.7% from last month
                </div>

            </div>



            <div class="card">

                <div class="card-header">

                    <div>
                        <h3>Pending Orders</h3>
                        <h2>24</h2>
                    </div>

                    <div class="card-icon pending-icon">
                        ⏳
                    </div>

                </div>

                <div class="growth">
                    ↓ 3.4% from yesterday
                </div>

            </div>


        </div>



        <!-- ================= TABLE + ACTIVITY ================= -->

        <div class="dashboard-grid">


            <!-- ================= RECENT ORDERS ================= -->

            <div class="section">


                <div class="section-header">

                    <h2>Recent Orders</h2>

                    <a href="#" class="view-all">
                        View All
                    </a>

                </div>


                <table>

                    <thead>

                    <tr>

                        <th>Customer</th>

                        <th>Order ID</th>

                        <th>Amount</th>

                        <th>Status</th>

                    </tr>

                    </thead>


                    <tbody>


                    <tr>

                        <td>

                            <div class="customer">

                                <div class="customer-img">
                                    R
                                </div>

                                Rahul Sharma

                            </div>

                        </td>

                        <td>#ORD-1001</td>

                        <td>₹2,500</td>

                        <td>
                            <span class="status completed">
                                Completed
                            </span>
                        </td>

                    </tr>


                    <tr>

                        <td>

                            <div class="customer">

                                <div class="customer-img">
                                    P
                                </div>

                                Priya Singh

                            </div>

                        </td>

                        <td>#ORD-1002</td>

                        <td>₹1,200</td>

                        <td>
                            <span class="status pending">
                                Pending
                            </span>
                        </td>

                    </tr>


                    <tr>

                        <td>

                            <div class="customer">

                                <div class="customer-img">
                                    V
                                </div>

                                Vikash Kumar

                            </div>

                        </td>

                        <td>#ORD-1003</td>

                        <td>₹4,500</td>

                        <td>
                            <span class="status completed">
                                Completed
                            </span>
                        </td>

                    </tr>


                    <tr>

                        <td>

                            <div class="customer">

                                <div class="customer-img">
                                    S
                                </div>

                                Sneha Patel

                            </div>

                        </td>

                        <td>#ORD-1004</td>

                        <td>₹850</td>

                        <td>
                            <span class="status cancelled">
                                Cancelled
                            </span>
                        </td>

                    </tr>


                    </tbody>

                </table>


            </div>



            <!-- ================= RECENT ACTIVITY ================= -->

            <div class="section">


                <div class="section-header">

                    <h2>Recent Activity</h2>

                </div>


                <div class="activity">

                    <div class="activity-icon">
                        👤
                    </div>

                    <div class="activity-content">

                        <p>
                            <strong>New user</strong>
                            registered successfully.
                        </p>

                        <span>
                            10 minutes ago
                        </span>

                    </div>

                </div>


                <div class="activity">

                    <div class="activity-icon">
                        🛒
                    </div>

                    <div class="activity-content">

                        <p>
                            New order
                            <strong>#ORD-1005</strong>
                            was created.
                        </p>

                        <span>
                            25 minutes ago
                        </span>

                    </div>

                </div>


                <div class="activity">

                    <div class="activity-icon">
                        💳
                    </div>

                    <div class="activity-content">

                        <p>
                            Payment of
                            <strong>₹3,200</strong>
                            received.
                        </p>

                        <span>
                            1 hour ago
                        </span>

                    </div>

                </div>


                <div class="activity">

                    <div class="activity-icon">
                        📦
                    </div>

                    <div class="activity-content">

                        <p>
                            Order
                            <strong>#ORD-1003</strong>
                            completed.
                        </p>

                        <span>
                            2 hours ago
                        </span>

                    </div>

                </div>


            </div>


        </div>


    </div>


</div>

</body>

</html>
