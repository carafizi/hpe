package hpe.model.operands;

import hpe.model.Token;
import hpe.model.TokenVisitor;


public class OperandDouble implements Token {

    private Double value;

    public OperandDouble(Double value) {
        this.value =value;
    }

    @Override
    public void accept(TokenVisitor tokenVisitor) {
        tokenVisitor.visit(this);
    }

    public Double getValue() {
        return value;
    }
}
