package hpe.model.operators;

import java.util.Stack;

public abstract class BinaryOperator {

    protected Object operand1;
    protected Object operand2;

    protected void init(Stack<Object> stack){
        operand2 = stack.pop();
        operand1 = stack.pop();
    }
}
