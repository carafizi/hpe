package hpe.model.operators;

import hpe.model.Token;
import hpe.model.TokenVisitor;

/**
 * This class represents minus operator
 */
public class Minus implements Token {

    @Override
    public void accept(TokenVisitor tokenVisitor) {
        tokenVisitor.visit(this);
    }
}
