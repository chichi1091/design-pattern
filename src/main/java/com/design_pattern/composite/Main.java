package com.design_pattern.composite;

public class Main {
    public static final void main(String[] args) {
        System.out.println("Making root entrise..");
        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");

        rootdir.add(bindir).add(tmpdir).add(usrdir);
        bindir.add(new File("vi", 1000)).add(new File("latex", 2000));
        rootdir.printList();

        System.out.println();
        System.out.println("making user entrise..");
        Directory yuki = new Directory("yuki");
        Directory hanako = new Directory("hanako");
        Directory tomura = new Directory("tomura");
        usrdir.add(yuki).add(hanako).add(tomura);
        yuki.add(new File("diary.html", 100)).add(new File("Composite.java", 200));
        hanako.add(new File("memo.tex", 300));
        tomura.add(new File("game.doc", 400)).add(new File("junk.mail", 500));
        rootdir.printList();
    }
}
