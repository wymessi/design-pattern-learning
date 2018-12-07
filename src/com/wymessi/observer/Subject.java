package com.wymessi.observer;

import java.util.List;

/**
 * 主题接口，也就是被观察者接口，通过实现这个接口申明一个主题
 */
public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyAllObserver();
}
