package com.design_pattern.composite;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class Directory extends Entry {
    private final String name;
    private List<Entry> directory = new ArrayList<>();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return directory.stream().mapToInt(entry -> entry.getSize()).sum();
    }

    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        directory.stream().forEach(entry -> entry.printList(prefix + "/" + name));
    }
}
