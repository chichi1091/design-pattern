package com.design_pattern.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1.equals(s2)) {
            System.out.println("同じインスタンスです");
        } else {
            System.out.println("違うインスタンスです");
        }
        System.out.println("End.");
    }
}
