package com.design_pattern.strategy;

public class Main {
    public static final void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Usage: java Main randomseed1 randomseed2");
            System.out.println("Example: java Main 314 15");
            System.exit(0);
        }

        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);

        Player p1 = new Player("Taro", new WinningStrategy(seed1));
        Player p2 = new Player("Hana", new ProbStrategy(seed2));

        for(int i = 0;i < 100;++i) {
            Hand h1 = p1.nextHand();
            Hand h2 = p2.nextHand();

            if(h1.isStrongerThan(h2)) {
                System.out.println("Winner:" + p1);
                p1.win();
                p2.lose();
            } else if(h2.isStrongerThan(h1)) {
                System.out.println("Winner:" + p2);
                p1.lose();
                p2.win();
            } else {
                System.out.println("Even...");
                p1.even();
                p2.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
