package hpe.model.operators;

import hpe.model.Token;
import hpe.model.TokenVisitor;

public class Sizeof implements Token {

    @Override
    public void accept(TokenVisitor tokenVisitor) {
        tokenVisitor.visit(this);
    }
}
