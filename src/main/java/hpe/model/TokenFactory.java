package hpe.model;

import hpe.model.operands.OperandDouble;
import hpe.model.operands.OperandString;
import hpe.model.operators.*;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * Token factory returning a Token object according to the input character
 */
public class TokenFactory {

    /**
     * @param value String value
     * @return Token - Operator or Operand
     */
    public static Token getToken(String value) {
        if (NumberUtils.isNumber(value)) {
            return new OperandDouble(NumberUtils.createDouble(value));
        } else {
            if (value.equals("+")) {
                return new Plus();
            }

            if (value.equals("-")) {
                return new Minus();
            }

            if (value.equals("*")) {
                return new Multiply();
            }

            if (value.equals("/")) {
                return new Divide();
            }

            if (value.equals("abs")) {
                return new Abs();
            }

            if (value.equals("sizeof")) {
                return new Sizeof();
            }

            if (value.getClass().equals(String.class)) {
                return new OperandString(value);
            } else {
                throw new IllegalArgumentException("Token [" + value + "] not supported");
            }
        }
    }
}
