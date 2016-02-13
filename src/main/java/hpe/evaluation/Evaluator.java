package hpe.evaluation;

import hpe.model.Request;
import hpe.model.Token;
import hpe.model.TokenFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Evaluator of the Request containing a collection of input string elements
 */
public class Evaluator {

    /**
     * @param request
     * @return Double
     */
    public Double evaluate(Request request) {
        List<Token> tokens = transformRequestElements(request);
        Stack<Object> stack = new Stack<>();
        for (Token token : tokens) {
            token.process(stack);
        }
        return (Double) stack.pop();
    }


    private List<Token> transformRequestElements(Request request){
        List<Token> inputTokens = new ArrayList<>();
        for (String requestElement:request.getElements()){
            inputTokens.add(TokenFactory.getToken(requestElement));
        }
        return inputTokens;
    }

}
