package hpe.model.operators;


import java.util.Stack;

public class UnaryOperator{
    protected Object operand;

    protected void init(Stack<Object> stack){
        operand = stack.pop();
    }
}
