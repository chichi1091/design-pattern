package com.design_pattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> dir = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return dir.stream().mapToInt(x -> x.getSize()).sum();
    }

    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }

    public Iterator<Entry> iterator() {
        return dir.iterator();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
