package hpe.model.operators;

import hpe.model.Token;
import hpe.model.TokenVisitor;

import java.util.Stack;

public class Abs implements Token {

    @Override
    public void accept(TokenVisitor tokenVisitor) {
        tokenVisitor.visit(this);
    }
}
