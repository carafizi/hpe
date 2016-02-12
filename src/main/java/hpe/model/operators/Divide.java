package hpe.model.operators;

import hpe.model.Token;
import hpe.model.TokenVisitor;

import java.util.Stack;

/**
 * This class represents divide operator
 */
public class Divide implements Token {

    @Override
    public void accept(TokenVisitor tokenVisitor) {
        tokenVisitor.visit(this);
    }
}
