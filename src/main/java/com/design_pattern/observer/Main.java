package com.design_pattern.observer;

public class Main {
    public static void main(String[] args) {
        NumerGenerator generator = new RandomNumberGenerator();
        Observer ob1 = new DigitObserver();
        Observer ob2 = new GraphObserver();
        generator.addObserver(ob1);
        generator.addObserver(ob2);
        generator.execute();
    }
}
