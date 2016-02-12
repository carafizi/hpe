package hpe.model;

import hpe.model.operands.OperandDouble;
import hpe.model.operands.OperandString;
import hpe.model.operators.*;

import java.util.Stack;

public class TokenVisitorImpl implements TokenVisitor{

    public Stack<Object> stack;

    public TokenVisitorImpl(Stack<Object> stack){
        this.stack = stack;
    }

    @Override
    public void visit(Plus token) {
        Double operand2 = (Double) stack.pop();
        Double operand1 = (Double) stack.pop();
        stack.push(operand1 + operand2);
    }

    @Override
    public void visit(Minus token) {
        Double operand2 = (Double) stack.pop();
        Double operand1 = (Double) stack.pop();
        stack.push(operand1 - operand2);
    }

    @Override
    public void visit(Multiply token) {
        Double operand2 = (Double) stack.pop();
        Double operand1 = (Double) stack.pop();
        stack.push(operand1 * operand2);
    }

    @Override
    public void visit(Divide token) {
        Double operand2 = (Double) stack.pop();
        Double operand1 = (Double) stack.pop();
        stack.push(operand1/operand2);
    }

    @Override
    public void visit(Abs token) {
        Object operand = stack.pop();
        if(!operand.getClass().equals(Double.class)){
            throw new IllegalArgumentException("Invalid token [" + (operand).toString() + "] for the sizeof function");
        }
        stack.push(Math.abs((double)operand));
    }

    @Override
    public void visit(Sizeof token) {
        Object operand = stack.pop();
        if(!operand.getClass().equals(String.class)){
            throw new IllegalArgumentException("Invalid token [" + (operand).toString() + "] for the sizeof function");
        }
        stack.push((double)((String)operand).length() );
    }

    @Override
    public void visit(OperandDouble token) {
        stack.push(token.getValue());
    }

    @Override
    public void visit(OperandString token) {
        stack.push(token.getValue());
    }
}
