package com.design_pattern.chain_of_responsibility;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Trouble {
    private int number;

    @Override
    public String toString() {
        return "[Trouble " + number + "]";
    }
}
