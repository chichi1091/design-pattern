package com.design_pattern.builder;

import lombok.SneakyThrows;

import java.io.FileWriter;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {
    private String filename;
    private PrintWriter writer;

    @SneakyThrows
    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        writer = new PrintWriter(new FileWriter(filename));
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>" + title + "</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for(String item : items) {
            writer.println("<li>" + item + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body>");
        writer.println("</html>");
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}
