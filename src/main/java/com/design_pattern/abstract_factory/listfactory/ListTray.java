package com.design_pattern.abstract_factory.listfactory;

import com.design_pattern.abstract_factory.factory.Item;
import com.design_pattern.abstract_factory.factory.Tray;

import java.util.Iterator;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer sb = new StringBuffer();
        sb.append("<li>\n");
        sb.append(caption + "\n");
        sb.append("<ul>\n");
        Iterator<Item> it = tray.iterator();
        while(it.hasNext()) {
            Item item = it.next();
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("</li>\n");
        return sb.toString();
    }
}
