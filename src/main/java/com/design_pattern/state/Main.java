package com.design_pattern.state;

import lombok.SneakyThrows;

import java.util.stream.IntStream;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample");
        while(true) {
            IntStream.range(0, 24).forEach(hour -> {
                frame.setClock(hour);
                try {
                    Thread.sleep(1000);
                }catch(Exception e) {
                }
            });
        }
    }
}
