package Indentation;

import java.util.Stack;

public class IndentationStack {

    private final Stack<Indentable> indentablesStack;

    public IndentationStack() {
        this.indentablesStack = new Stack<>();
    }

    public String getIndentation() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Indentable indentable :indentablesStack) {
            stringBuilder.append(indentable.indentationLiteral());
        }
        return stringBuilder.toString();
    }

    public void pop(IndentationType type) throws IndentationStackException {
        if (this.indentablesStack.peek().getIndentationType() == type) {
            throw new IndentationStackException(type, this.indentablesStack.peek().getIndentationType());
        } else {
            this.indentablesStack.pop();
        }
    }

    public void push(IndentationType type) throws IndentationStackException {
        if (this.indentablesStack.size() > 0 && this.indentablesStack.peek().getIndentationType() == type) {
            throw  new IndentationStackException(type);
        }
        else {
            switch (type) {
                case program -> {
                    this.indentablesStack.push(new ProgramIndentation());
                }
                case importt -> {
                    this.indentablesStack.push(new ImportIndentation());
                }
                case classs -> {
                }
            }
        }
    }
}
