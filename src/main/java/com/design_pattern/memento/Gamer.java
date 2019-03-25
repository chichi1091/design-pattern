package com.design_pattern.memento;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@ToString
public class Gamer {
    @Getter
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static List<String> fruitsName = Arrays.asList("りんご", "ぶどう", "バナナ", "みかん");

    public Gamer(int money) {
        this.money = money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if(dice == 1) {
            money += 100;
            System.out.println("所持金が増えました");
        } else if(dice == 2) {
            money /= 2;
            System.out.println("所持金が半分になりました");
        } else if(dice == 6) {
            String f = getFruit();
            System.out.println("フルーツ(" + f + ")をもらいました");
        } else {
            System.out.println("何も起こりませんでした");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        fruits.stream().forEach(s -> {
            if(s.startsWith("おいしい")) {
                m.addFruit(s);
            }
        });
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    private String getFruit() {
        String prefix = "";
        if(random.nextBoolean()) prefix = "おいしい";
        return prefix + fruitsName.get(random.nextInt(fruitsName.size()));
    }
}
