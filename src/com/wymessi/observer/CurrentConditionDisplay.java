package com.wymessi.observer;

/**
 * 当前天气布告板，可以根据需求建造其他布告板，展示不同数据
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;

    private float temp;

    private float humidity;

    private float pressure;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("当前天气状况：温度：" + temp + ", 湿度：" + humidity + ", 气压：" + pressure);
    }
}
