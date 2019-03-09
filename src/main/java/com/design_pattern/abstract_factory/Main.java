package com.design_pattern.abstract_factory;

import com.design_pattern.abstract_factory.factory.Factory;
import com.design_pattern.abstract_factory.factory.Link;
import com.design_pattern.abstract_factory.factory.Page;
import com.design_pattern.abstract_factory.factory.Tray;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Usage: Java Main class.name.of.ConcreteFactory");
            System.out.println("Exmaple 1: java Main listfactory.ListFactory");
            System.out.println("Exmaple 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }

        Factory f = Factory.getFactory(args[0]);

        Link asahi = f.createLink("朝日新聞", "http://www.asahi.com/");
        Link yomiuri = f.createLink("読売新聞", "http://www.yomiuri.co.jp/");

        Link usyahoo = f.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jpYahoo = f.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link google = f.createLink("Google", "https://www.google.com");

        Tray t1 = f.createTray("新聞");
        t1.add(asahi);
        t1.add(yomiuri);

        Tray t2 = f.createTray("Yahoo!");
        t2.add(usyahoo);
        t2.add(jpYahoo);

        Tray search = f.createTray("サーチエンジン");
        search.add(google);

        Page p = f.createPage("LinkPage", "名前");
        p.add(t1);
        p.add(t2);
        p.output();
    }
}
