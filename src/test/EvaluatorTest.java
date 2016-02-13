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


    private Request buildRequest(String str){
        List<String> elements = Arrays.asList(str.split(" "));
        Request request = new Request();
        request.setElements(elements);
        return request;
    }
}