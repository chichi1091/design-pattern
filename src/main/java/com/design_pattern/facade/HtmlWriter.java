package com.design_pattern.facade;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.io.Writer;

@AllArgsConstructor
public class HtmlWriter {
    private Writer writer;

    @SneakyThrows
    public void title(String title) {
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>" + title + "</h1>\n");
    }

    @SneakyThrows
    public void paragraph(String msg) {
        writer.write("<p>" + msg + "</p>\n");
    }

    @SneakyThrows
    public void link(String href, String caption) {
        paragraph("<a href='" + href + "'>" + caption + "</a>");
    }

    @SneakyThrows
    public void mailto(String mailaddr, String username) {
        link("mailto:" + mailaddr, username);
    }

    @SneakyThrows
    public void close() {
        writer.write("</body></html>");
        writer.close();
    }
}
