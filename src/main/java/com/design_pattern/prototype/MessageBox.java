package com.design_pattern.prototype;

import lombok.SneakyThrows;

public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for(int i = 0;i < length; ++i) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + " " + s + " " + decochar);
        for(int i =0;i < length + 4; ++i) {
            System.out.print(decochar);
        }
        System.out.println();
    }

    @SneakyThrows
    @Override
    public Product createClone() {
        return Product.class.cast(clone());
    }
}
