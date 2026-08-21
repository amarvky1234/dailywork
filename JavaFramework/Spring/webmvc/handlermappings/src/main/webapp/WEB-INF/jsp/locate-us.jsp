<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Locate Us</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f9f9f9;
        }

        header {
            background-color: #4CAF50;
            color: white;
            padding: 1em 0;
            text-align: center;
        }

        main {
            padding: 2em;
        }

        .location-info {
            background: white;
            padding: 2em;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 600px;
            margin: 0 auto;
            text-align: center;
        }

        #map {
            width: 100%;
            height: 400px;
            margin-top: 1em;
        }
    </style>
</head>
<body>
    <header>
        <h1>Locate Us</h1>
    </header>
    <main>
        <section class="location-info">
            <h2>Our Office</h2>
            <p>123 Main Street, Cumming, GA 30040</p>
            <div id="map"></div>
        </section>
    </main>
    <script>
        function initMap() {
            var location = {lat: 34.2073, lng: -84.1402};
            var map = new google.maps.Map(document.getElementById('map'), {
                zoom: 15,
                center: location
            });
            var marker = new google.maps.Marker({
                position: location,
                map: map
            });
        }
    </script>
    <script async defer src="https://maps.googleapis.com/maps/api/js?key=YOUR_API_KEY&callback=initMap">
    </script>
</body>
</html>
