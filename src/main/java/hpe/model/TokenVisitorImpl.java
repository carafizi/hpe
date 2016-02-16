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
        Object operand2 = stack.pop();
        Object operand1 = stack.pop();
        if(!operand1.getClass().equals(Double.class)){
            throw new IllegalArgumentException("Invalid operand [" + (operand1).toString() + "] for plus operator");
        }
        if(!operand2.getClass().equals(Double.class)){
            throw new IllegalArgumentException("Invalid operand [" + (operand2).toString() + "] for plus operator");
        }
        stack.push((Double)operand1 + (Double) operand2);
    }

    @Override
    public void visit(Minus token) {
        Object operand2 = stack.pop();
        Object operand1 = stack.pop();
        if(!operand1.getClass().equals(Double.class)){
            throw new IllegalArgumentException("Invalid operand [" + (operand1).toString() + "] for minus operator");
        }
        if(!operand2.getClass().equals(Double.class)){
            throw new IllegalArgumentException("Invalid operand [" + (operand2).toString() + "] for minus operator");
        }
        stack.push((Double)operand1 - (Double) operand2);
    }

    @Override
    public void visit(Multiply token) {
        Object operand2 = stack.pop();
        Object operand1 = stack.pop();
        if(!operand1.getClass().equals(Double.class)){
            throw new IllegalArgumentException("Invalid operand [" + (operand1).toString() + "] for multiply operator");
        }
        if(!operand2.getClass().equals(Double.class)){
            throw new IllegalArgumentException("Invalid operand [" + (operand2).toString() + "] for multiply operator");
        }
        stack.push((Double)operand1 * (Double) operand2);
    }

    @Override
    public void visit(Divide token) {
        Object operand2 = stack.pop();
        Object operand1 = stack.pop();
        if(!operand1.getClass().equals(Double.class)){
            throw new IllegalArgumentException("Invalid operand [" + (operand1).toString() + "] for divide operator");
        }
        if(!operand2.getClass().equals(Double.class)){
            throw new IllegalArgumentException("Invalid operand [" + (operand2).toString() + "] for divide operator");
        }
        stack.push((Double)operand1/(Double) operand2);
    }

    @Override
    public void visit(Abs token) {
        Object operand = stack.pop();
        if(!operand.getClass().equals(Double.class)){
            throw new IllegalArgumentException("Invalid operand [" + (operand).toString() + "] for the sizeof function");
        }
        stack.push(Math.abs((double)operand));
    }

    @Override
    public void visit(Sizeof token) {
        Object operand = stack.pop();
        if(!operand.getClass().equals(String.class)){
            throw new IllegalArgumentException("Invalid operand [" + (operand).toString() + "] for the sizeof function");
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
