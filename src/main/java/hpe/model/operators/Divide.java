package hpe.model.operators;

import hpe.model.Token;

import java.util.Stack;

/**
 * This class represents divide operator
 */
public class Divide extends BinaryOperator implements Token {

    @Override
    public void process(Stack<Object> stack) {
        operand2 = stack.pop();
        operand1 = stack.pop();
        stack.push((Double) operand1 / (Double) operand2);
    }
}
