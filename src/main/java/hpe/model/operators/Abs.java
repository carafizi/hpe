package hpe.model.operators;

import hpe.model.Token;

import java.util.Stack;

/**
 * This class represents abs function
 */
public class Abs extends UnaryOperator implements Token {

    @Override
    public void process(Stack<Object> stack) {
        init(stack);
        if (!operand.getClass().equals(Double.class)) {
            throw new IllegalArgumentException("Invalid token [" + (operand).toString() + "] for the abs operator");
        }
        stack.push(Math.abs((double) operand));
    }
}
