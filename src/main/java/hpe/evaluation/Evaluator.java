package hpe.evaluation;

import hpe.model.*;

import java.util.*;

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
        TokenVisitor visitor = new TokenVisitorImpl(stack);
        for (Token token : tokens) {
            token.accept(visitor);
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
