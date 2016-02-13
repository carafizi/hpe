package hpe.model.operands;

import hpe.model.Token;

import java.util.Stack;

/**
 * This class represents a numeric operand
 */
public class OperandDouble implements Token {

    private Double value;

    public OperandDouble(Double value) {
        this.value =value;
    }

    @Override
    public void process(Stack<Object> stack) {
        stack.push(value);
    }
}
