package com.design_pattern.composite;

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

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
