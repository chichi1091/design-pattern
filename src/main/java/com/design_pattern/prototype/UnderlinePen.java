package com.design_pattern.prototype;

import lombok.SneakyThrows;

public class UnderlinePen implements Product {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        for(int i = 0;i < length; ++i) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

    @SneakyThrows
    @Override
    public Product createClone() {
        return Product.class.cast(clone());
    }
}
