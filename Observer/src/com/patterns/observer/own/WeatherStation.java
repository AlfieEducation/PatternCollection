package com.patterns.observer.own;

public class WeatherStation {

    public static void main(String [] args) {
        WeatherData wData = new WeatherData();
        WeatherMonitor wMonitor = new WeatherMonitor();

        wData.registerObserver(wMonitor);

        wData.setData(30, 80, 88);
        wData.setData(40, 85, 80);

    }
}
