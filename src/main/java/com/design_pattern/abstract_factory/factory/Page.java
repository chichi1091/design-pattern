package com.design_pattern.abstract_factory.factory;

import lombok.SneakyThrows;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public abstract class Page {
    protected String title;
    protected String author;
    protected List<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    @SneakyThrows
    public void output() {
        String filename = title + ".html";
        Writer w = new FileWriter(filename);
        w.write(this.makeHTML());
        w.close();
        System.out.println(filename + "を作成しました");
    }

    public abstract String makeHTML();
}
