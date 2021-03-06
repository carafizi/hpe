package hpe.model.operators;

import hpe.model.Token;
import hpe.model.TokenVisitor;

/**
 * This class represents plus operator
 */
public class Plus implements Token {

    @Override
    public void accept(TokenVisitor tokenVisitor) {
        tokenVisitor.visit(this);
    }
}
