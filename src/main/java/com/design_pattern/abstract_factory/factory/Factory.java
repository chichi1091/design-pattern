package com.design_pattern.abstract_factory.factory;

import lombok.SneakyThrows;

public abstract class Factory {
    @SneakyThrows
    public static Factory getFactory(String classname) {
        return Factory.class.cast(Class.forName(classname).newInstance());
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
