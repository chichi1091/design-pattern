package com.design_pattern.interpreter;

import lombok.SneakyThrows;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class CommandListNode extends Node {
    private List<Node> list = new ArrayList<>();

    @SneakyThrows
    @Override
    public void parse(Context context) {
        while (true) {
            if(context.getCurrentToken() == null) {
                throw new ParseException("Missing end");
            } else if("end".equals(context.getCurrentToken())) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }
}
