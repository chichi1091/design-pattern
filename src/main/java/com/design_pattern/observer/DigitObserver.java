package com.design_pattern.observer;

import lombok.SneakyThrows;

public class DigitObserver implements Observer {
    @Override
    @SneakyThrows
    public void update(NumerGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        Thread.sleep(100);
    }
}
