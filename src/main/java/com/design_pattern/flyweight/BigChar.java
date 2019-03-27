package com.design_pattern.flyweight;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class BigChar {
    private char charName;
    private String fontdata;

    @SneakyThrows
    public BigChar(char charName) {
        this.charName = charName;
        try(Stream<String> s = Files.lines(Paths.get("big" + charName + ".txt"))) {
            StringBuffer sb = new StringBuffer();
            s.forEach(line -> {
                sb.append(line);
                sb.append("\n");
            });
            fontdata = sb.toString();
        }
    }

    public void print() {
        System.out.print(fontdata);
    }
}
