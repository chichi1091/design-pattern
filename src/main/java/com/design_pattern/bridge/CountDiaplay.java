package com.design_pattern.bridge;

public class CountDiaplay extends Display {
    public CountDiaplay(DisplayImpl impl) {
        super(impl);
    }

    public void multDispaly(int times) {
        open();
        for(int i = 0;i < times;++i) {
            print();
        }
        close();
    }
}
