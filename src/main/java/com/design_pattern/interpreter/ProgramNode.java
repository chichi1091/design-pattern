package com.design_pattern.interpreter;

import lombok.ToString;

@ToString
public class ProgramNode extends Node {
    private Node commandListNode;
    @Override
    public void parse(Context context) {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }
}
