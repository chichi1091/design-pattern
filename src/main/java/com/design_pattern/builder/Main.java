package com.design_pattern.builder;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1) {
            usage();
            System.exit(0);
        }

        if("plain".equals(args[0])) {
            TextBuilder text = new TextBuilder();
            Director d = new Director(text);
            d.construct();
            System.out.println(text.getResult());
        } else if("html".equals(args[0])) {
            HTMLBuilder html = new HTMLBuilder();
            Director d = new Director(html);
            d.construct();
            System.out.println(html.getResult() + "が作成されました");
        } else {
            usage();
            System.exit(0);
        }
    }

    public static void usage() {
        System.out.println("Usage: Java main plain");
        System.out.println("Usage: Java main html");
    }
}
