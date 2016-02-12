package hpe.model;

import hpe.model.operands.*;
import hpe.model.operators.*;

public interface TokenVisitor {
    void visit(Plus token);
    void visit(Minus token);
    void visit(Multiply token);
    void visit(Divide token);
    void visit(Abs token);
    void visit(Sizeof token);
    void visit(OperandDouble token);
    void visit(OperandString token);
}
