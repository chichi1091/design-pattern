package com.design_pattern.flyweight;

import java.util.stream.IntStream;

public class BigString {
    private BigChar[] bigChars;

    public BigString(String string) {
        bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        IntStream.range(0, bigChars.length).forEach(i -> {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        });
    }

    public void print() {
        IntStream.range(0, bigChars.length).forEach(i -> {
            bigChars[i].print();
        });
    }
}
