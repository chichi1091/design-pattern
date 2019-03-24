package com.design_pattern.observer;

import lombok.SneakyThrows;

import java.util.stream.IntStream;

public class GraphObserver implements Observer {
    @Override
    @SneakyThrows
    public void update(NumerGenerator generator) {
        System.out.println("GraphObserver:");
        IntStream.range(0, generator.getNumber()).forEach(i -> {
            System.out.print("*");
        });
        System.out.println();

        Thread.sleep(100);
    }
}
