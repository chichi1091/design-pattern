package com.design_pattern.interpreter;

import lombok.SneakyThrows;
import lombok.ToString;

@ToString
public class CommandNode extends Node {
    private Node node;

    @SneakyThrows
    @Override
    public void parse(Context context) {
        if("repeat".equals(context.getCurrentToken())) {
            node = new RepeatCommand();
            node.parse(context);
        } else {
            node = new PrimitiveCommandNode();
            node.parse(context);
        }
    }
}
