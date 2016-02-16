package hpe.model.operators;

import hpe.model.Token;

import java.util.Stack;

/**
 * This class represents divide operator
 */
public class Divide extends BznaryOperator implements Token {

    @Override
    public void process(Stack<Object> stack) {
        init(stack);
        stack.push((Double) operand1 / (Double) operand2);
    }
}
