package hpe.service;

import hpe.evaluation.Evaluator;
import hpe.model.Request;
import hpe.model.Result;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
@Path("hpe")
public class HpeResource {

    @POST
    public Result evaluateFormula(Request request){
        Evaluator evaluator = new Evaluator();
        Result result = new Result();
        try {
            result.setResult(evaluator.evaluate(request).toString());
        }catch(Exception e){
            result.setResult(e.getLocalizedMessage());
        }
        return result;
    }
}
