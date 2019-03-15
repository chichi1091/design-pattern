package com.design_pattern.visitor;

import lombok.SneakyThrows;

import java.util.Iterator;

public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();

    @SneakyThrows
    public Entry add(Entry entry) {
        throw new FileTreatmantException();
    }

    @SneakyThrows
    public Iterator iterator() {
        throw new FileTreatmantException();
    }

    public abstract void accept(Visitor v);

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
