package com.design_pattern.memento;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    @Getter
    int money;
    @Getter
    List<String> fruits;

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }
}
