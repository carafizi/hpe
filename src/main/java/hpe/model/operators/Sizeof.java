package hpe.model.operators;

import hpe.model.Token;

import java.util.Stack;

/**
 * This class represents sizeof function
 */
public class Sizeof extends UnaryOperator implements Token {


    @Override
    public void process(Stack<Object> stack) {
        init(stack);
        if (!operand.getClass().equals(String.class)) {
            throw new IllegalArgumentException("Invalid token [" + (operand).toString() + "] for the sizeof function");
        }
        stack.push((double) ((String) operand).length());
    }
}
