package com.design_pattern.bridge;

public class Main {
    public static final void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Japan"));
        Display d2 = new Display(new StringDisplayImpl("Hello, World"));
        CountDiaplay cd = new CountDiaplay(new StringDisplayImpl("hello, Universe."));

        d1.dispay();
        d2.dispay();
        cd.dispay();
        cd.multDispaly(5);
    }
}
