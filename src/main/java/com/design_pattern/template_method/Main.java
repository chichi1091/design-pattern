package com.design_pattern.template_method;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay ad1 = new CharDispay('H');
        AbstractDisplay ad2 = new StringDisplay("Hello, Display!");
        AbstractDisplay ad3 = new StringDisplay("こんにちは 世界！");

        ad1.display();
        ad2.display();
        ad3.display();
    }
}
