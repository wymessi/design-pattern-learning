package com.wymessi.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气数据主题
 */
public class WeatherData implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private float temp;

    private float humidity;

    private float pressure;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0)
            observers.remove(index);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer o : observers) {
            o.update(temp, humidity, pressure);
        }
    }

    //假设天气数据一变化，这个方法就会被调用
    public void measurementsChanged() {
        notifyAllObserver();
    }

    //手动设置数据，方便我们测试
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged(); //手动设置完，就调用此方法，模拟天气数据发生变化
    }
}
