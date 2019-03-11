package com.design_pattern.abstract_factory.tablefactory;

import com.design_pattern.abstract_factory.factory.Item;
import com.design_pattern.abstract_factory.factory.Tray;

import java.util.Iterator;

public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer sb = new StringBuffer();
        sb.append("<td>");
        sb.append("<table width='100%' border='1'><tr>");
        sb.append("<td bgcoler='#cccccc' align='center' colspan='" + tray.size() + "'>");
        sb.append("<b>" + caption + "</b></td>");
        sb.append("</tr>");

        Iterator<Item> it = tray.iterator();
        while(it.hasNext()) {
            Item item = it.next();
            sb.append(it.next());
        }

        sb.append("</tr></table>");
        sb.append("</td>");
        return sb.toString();
    }
}
