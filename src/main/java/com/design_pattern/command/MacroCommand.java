package com.design_pattern.command;

import java.util.Stack;

public class MacroCommand implements Command {
    private Stack<Command> commands = new Stack();
    @Override
    public void execute() {
        commands.stream().forEach(c -> c.execute());
    }

    public void append(Command cmd) {
        if(cmd != this) commands.push(cmd);
    }

    public void undo() {
        if(!commands.empty()) commands.pop();
    }

    public void clear() {
        commands.clear();
    }
}
