package com.design_pattern.factory_method;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product p1 = factory.createProduct("てっしー");
        Product p2 = factory.create("あいうえお");
        Product p3 = factory.create("かきくけこ");

        p1.use();
        p2.use();
        p3.use();
    }
}
