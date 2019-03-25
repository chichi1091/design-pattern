package com.design_pattern.memento;

import lombok.SneakyThrows;

import java.util.stream.IntStream;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        final Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        IntStream.range(0, 100).forEach(i -> gameStart(i, gamer, memento));
    }

    @SneakyThrows
    private static void gameStart(int i, Gamer gamer, Memento memento) {
        System.out.println("=====" + i);
        System.out.println("現状：" + gamer);

        gamer.bet();
        System.out.println("所持金は" + gamer.getMoney() + "円になりました");

        if(gamer.getMoney() > memento.getMoney()) {
            System.out.println("（だいぶ増えたので保存します）");
            memento = gamer.createMemento();
        } else if(gamer.getMoney() < memento.getMoney() / 2) {
            System.out.println("（だいぶ減ったので復元します）");
            gamer.restoreMemento(memento);
        }

        Thread.sleep(1000);
        System.out.println();
    }
}
