package com.patterns.observer.own;

public class WeatherMonitor implements Observer, Display{

    int temperature = 0;
    int humidity = 0;
    int pressure = 0;

    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Wether monitore. temperature: " + temperature + ", humidity: " + humidity + ", pressure: " + pressure);
    }
}
