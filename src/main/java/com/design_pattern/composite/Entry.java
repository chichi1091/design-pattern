package com.design_pattern.composite;

import lombok.SneakyThrows;

public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();

    @SneakyThrows
    public Entry add(Entry entry) {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
