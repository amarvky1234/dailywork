<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cricket Match Scoreboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f7f7f7;
        }
        .container {
            width: 90%;
            max-width: 800px;
            margin: 20px auto;
            padding: 20px;
            background: pink;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }
        h1 {
            text-align: center;
            color: #333;
        }
        .match-details {
            text-align: center;
            margin: 20px 0;
        }
        .scores {
            display: flex;
            justify-content: space-between;
            margin: 20px 0;
        }
        .team {
            text-align: center;
            flex: 1;
        }
        .team h2 {
            color: #4CAF50;
        }
        .result {
            text-align: center;
            font-size: 1.2em;
            color: #555;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Cricket Match Scoreboard</h1>
        <div class="match-details">
            <p><strong>Match:</strong> ${scoreboard.tournamentName}</p>
            <p><strong>Date:</strong> ${scoreboard.matchDate}</p>
            <p><strong>Venue:</strong> ${scoreboard.venue}</p>
        </div>
        <div class="scores">
            <div class="team">
                <h2>${scoreboard.team1Name}</h2>
                <p>${scoreboard.team1Score}</p>
            </div>
            <div class="team">
                <h2>${scoreboard.team2Name}</h2>
                <p>${scoreboard.team2Score}</p>
            </div>
        </div>
        <div class="result">
            <p><strong>Result:</strong> ${scoreboard.result}</p>
        </div>
    </div>
</body>
</html>
