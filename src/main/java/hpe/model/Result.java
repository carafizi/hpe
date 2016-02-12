package hpe.model;


/**
 * Result object to be serialized to JSON and returned in the HTTP response body
 */
public class Result {

    String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
