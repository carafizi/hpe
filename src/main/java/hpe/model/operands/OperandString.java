package hpe.model.operands;

import hpe.model.Token;

import java.util.Stack;

/**
 * This class represents a string operand
 */
public class OperandString implements Token {

    private String value;

    public OperandString(String value) {
        this.value =value;
    }


    @Override
    public void process(Stack<Object> stack) {
        stack.push(value);
    }
}
