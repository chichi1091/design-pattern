package com.design_pattern.interpreter;

import lombok.SneakyThrows;
import lombok.ToString;

@ToString
public class PrimitiveCommandNode extends Node {
    private String name;

    @SneakyThrows
    @Override
    public void parse(Context context) {
        name = context.getCurrentToken();
        context.skipToken(name);
        if(!"go".equals(name) && !"right".equals(name) && !"left".equals(name)) {
            throw new ParseException(name + " is undefined");
        }
    }
}
