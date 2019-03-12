package com.design_pattern.strategy;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0;
    private int currenthandValue = 0;
    private int[][] history = {
            {1, 1, 1}
            , {1, 1, 1}
            , {1, 1, 1}
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currenthandValue));
        int handValue = 0;
        if(bet < history[currenthandValue][0]) {
            handValue = 0;
        } else if(bet < history[currenthandValue][0] + history[currenthandValue][1]) {
            handValue = 1;
        } else {
            handValue = 2;
        }
        prevHandValue = currenthandValue;
        currenthandValue = handValue;
        return Hand.enumOf(handValue);
    }

    private int getSum(int hv) {
        int sum = 0;
        for(int i = 0;i < 3;++i) {
            sum += history[hv][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if(win) {
            history[prevHandValue][currenthandValue]++;
        } else {
            history[prevHandValue][(currenthandValue + 1) % 3]++;
            history[prevHandValue][(currenthandValue + 2) % 3]++;
        }
    }
}
