package com.design_pattern.abstract_factory.tablefactory;

import com.design_pattern.abstract_factory.factory.Item;
import com.design_pattern.abstract_factory.factory.Page;

import java.util.Iterator;

public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html><head><title>" + title + "</title></head>");
        sb.append("<body>");
        sb.append("<h1>" + title + "</h1>");
        sb.append("<table width='80%' border='3'>");

        Iterator<Item> it = content.iterator();
        while(it.hasNext()) {
            Item item = it.next();
            sb.append(item.makeHTML());
        }

        sb.append("</table>");
        sb.append("<hr><address>" + author + "</abbress>");
        sb.append("</body></table>");
        return sb.toString();
    }
}
