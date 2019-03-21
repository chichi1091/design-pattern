package com.design_pattern.facade;

import lombok.SneakyThrows;

import java.io.FileWriter;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    @SneakyThrows
    public static void makeWelcomPage(String mailaddr, String filename) {
        Properties mailprop = Database.getProperties("maildata");
        String username = mailprop.getProperty(mailaddr);
        HtmlWriter html = new HtmlWriter(new FileWriter(filename));
        html.title("Welcome to " + username + "'s page!");
        html.paragraph(username + "のページへようこそ");
        html.paragraph("メールまってますね");
        html.mailto(mailaddr, username);
        html.close();
    }
}
