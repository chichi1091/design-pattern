package com.design_pattern.visitor;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class File extends Entry {
    private String name;
    private int size;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
