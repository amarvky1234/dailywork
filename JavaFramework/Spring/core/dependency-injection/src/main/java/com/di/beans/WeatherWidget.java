package com.di.beans;

public class WeatherWidget {
    private IWeatherFinder weatherFinder;

    public WeatherWidget(IWeatherFinder weatherFinder) {
        System.out.println("ConstructWeatherFinder(weatherFinder)");
        this.weatherFinder = weatherFinder;
    }

    public void showWeather(String zipcode){
        double temp = weatherFinder.getWeather(zipcode);
        System.out.println("Temperature "+temp+" for the zipcode "+zipcode);
    }

    public void setWeatherFinder(IWeatherFinder weatherFinder) {
        System.out.println("setWeatherFinder(weatherFinder)");
        this.weatherFinder = weatherFinder;
    }

}
