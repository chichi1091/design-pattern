package com.design_pattern.proxy;

import java.util.stream.IntStream;

public class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob("Printerのインスタンスを生成");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("Printerのインスタンス(" + name + ")を生成");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    private void heavyJob(String msg) {
        System.out.println(msg);
        IntStream.range(0, 5).forEach(i -> {
            try{
                Thread.sleep(1000);
            } catch(Exception e) {
            }
            System.out.println(".");
        });
        System.out.println("完了");
    }
}
