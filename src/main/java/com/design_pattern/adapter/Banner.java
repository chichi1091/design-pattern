package com.design_pattern.adapter;

public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    protected void showWithParen() {
        System.out.println("[" + string + "]");
    }

    protected void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
