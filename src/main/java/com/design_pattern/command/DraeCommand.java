package com.design_pattern.command;

import lombok.AllArgsConstructor;

import java.awt.*;

@AllArgsConstructor
public class DraeCommand implements Command {
    protected Drawable drawable;
    private Point positon;

    @Override
    public void execute() {
        drawable.draw(positon.x, positon.y);
    }
}
