package com.design_pattern.visitor;

public interface Element {
    public abstract void accept(Visitor v);
}
