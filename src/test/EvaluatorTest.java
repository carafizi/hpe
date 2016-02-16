import hpe.evaluation.Evaluator;
import hpe.model.Request;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;


public class EvaluatorTest {

    @Test
    public void testEvaluate() throws Exception {

        Request request = buildRequest("3 4 + 5 * count_me sizeof + -17 abs +");
        Evaluator evaluator = new Evaluator();
        Assert.assertEquals(evaluator.evaluate(request), new Double(60));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testEvaluateInvalidOperandForSizeof() throws Exception {

        Request request = buildRequest("3 4 + 5 * 100 sizeof + -17 abs +");
        Evaluator evaluator = new Evaluator();
        evaluator.evaluate(request);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testEvaluateInvalidOperandForAbs() throws Exception {

        Request request = buildRequest("3 4 + 5 * count_me sizeof + invalid abs +");
        Evaluator evaluator = new Evaluator();
        evaluator.evaluate(request);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testEvaluateInvalidOperandForPlus() throws Exception {

        Request request = buildRequest("3 invalid + 5 * count_me sizeof + -17 abs +");
        Evaluator evaluator = new Evaluator();
        evaluator.evaluate(request);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testEvaluateInvalidOperandForMultiply() throws Exception {

        Request request = buildRequest("3 4 + invalid * count_me sizeof + -17 abs +");
        Evaluator evaluator = new Evaluator();
        evaluator.evaluate(request);
    }



    private Request buildRequest(String str){
        List<String> elements = Arrays.asList(str.split(" "));
        Request request = new Request();
        request.setElements(elements);
        return request;
    }
}