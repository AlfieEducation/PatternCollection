package com.patterns.observer.own;

import java.util.ArrayList;

public class WeatherData implements Subject {
    ArrayList<Observer> listOfObservers;

    int temperature = 0;
    int humidity = 0;
    int pressure = 0;

    WeatherData() {
        listOfObservers = new ArrayList<Observer>();
    }

    public void setData(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyAllObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        listOfObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (listOfObservers.size() != 0)
            listOfObservers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        if (listOfObservers != null) {
            for (Observer o : listOfObservers) {
                o.update(temperature, humidity, pressure);
            }
        }
    }
}
