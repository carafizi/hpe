package hpe.model.operators;

import hpe.model.Token;

import java.util.Stack;

/**
 * This class represents multiply operator
 */
public class Multiply extends BinaryOperator implements Token {

    @Override
    public void process(Stack<Object> stack) {
        init(stack);
        if(!operand1.getClass().equals(Double.class)){
            throw new IllegalArgumentException("Invalid operand [" + (operand1).toString() + "] for multiply operator");
        }
        if(!operand2.getClass().equals(Double.class)){
            throw new IllegalArgumentException("Invalid operand [" + (operand2).toString() + "] for multiply operator");
        }
        stack.push((Double) operand1 * (Double) operand2);
    }
}