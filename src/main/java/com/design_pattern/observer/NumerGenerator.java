package com.design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NumerGenerator {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.stream().forEach(observer -> observer.update(this));
    }

    public abstract int getNumber();
    public abstract void execute();
}
