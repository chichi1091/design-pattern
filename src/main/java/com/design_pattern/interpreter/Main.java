package com.design_pattern.interpreter;

import lombok.SneakyThrows;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.stream.Stream;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        String cd = new File(".").getAbsoluteFile().getParent();
        try (Stream<String> stream = Files.lines(new File(cd + "/src/main/java/com/design_pattern/interpreter/program.txt").toPath(), StandardCharsets.UTF_8)) {
            stream.forEach(line -> {
                System.out.println("text = '" + line + "'");
                Node node = new ProgramNode();
                node.parse(new Context(line));
                System.out.println("node = " + node);
            });
        }
    }
}
