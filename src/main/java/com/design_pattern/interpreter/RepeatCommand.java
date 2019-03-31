package com.design_pattern.interpreter;

import lombok.ToString;

@ToString
public class RepeatCommand extends Node {
    private int number;
    private Node commandListNode;

    @Override
    public void parse(Context context) {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }
}
