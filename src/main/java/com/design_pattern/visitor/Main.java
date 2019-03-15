package com.design_pattern.visitor;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static final void main(String[] args) {
        System.out.println("Making root entries...");
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");

        root.add(bin).add(tmp).add(usr);
        bin.add(new File("vi", 10000));
        bin.add(new File("latec", 20000));
        root.accept(new ListVisitor());

        System.out.println();
        System.out.println("Making user entries...");

        Directory yuki = new Directory("yuki");
        Directory hanako = new Directory("hanako");
        Directory tomura = new Directory("tomura");

        usr.add(yuki).add(hanako).add(tomura);
        yuki.add(new File("diary.html", 100));
        hanako.add(new File("memo.txt", 300));
        tomura.add(new File("junk.mail", 500));

        root.accept(new ListVisitor());
    }
}
