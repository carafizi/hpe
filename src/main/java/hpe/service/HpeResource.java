package hpe.service;

import hpe.model.Request;
import hpe.evaluation.Evaluator;
import hpe.model.Result;

import javax.ws.rs.*;
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
            result.setValue(evaluator.evaluate(request).toString());
        }catch(Exception e){
            result.setValue(e.getLocalizedMessage());
        }
        return result;
    }
}
