package com.design_pattern.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Border extends Display {
    protected Display display;
}
