package com.design_pattern.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@AllArgsConstructor
@Getter
public enum Hand {
    GUU(0, "グー")
    , CHOKI(1, "チョキ")
    , PAA(2, "パー");

    private static Map<Integer, Hand> FORMAT_MAP =
            Stream.of(Hand.values()).collect(
                    Collectors.toMap(s -> s.code, Function.identity()));

    private Integer code;
    private String name;

    public static Hand enumOf(Integer code) {
        if(code == null) return null;

        Hand status = FORMAT_MAP.get(code);
        if (status == null) {
            throw new IllegalArgumentException(code + " has no corresponding value");
        }
        return status;
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    private int fight(Hand h) {
        if(this == h) return 0;
        else if((this.code + 1) % 3 == h.code) return 1;
        else return -1;
    }
}
