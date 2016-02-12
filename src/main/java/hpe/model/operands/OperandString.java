package hpe.model.operands;

import hpe.model.Token;
import hpe.model.TokenVisitor;

public class OperandString implements Token {

    private String value;

    public OperandString(String value) {
        this.value =value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void accept(TokenVisitor tokenVisitor) {
        tokenVisitor.visit(this);
    }
}
