package hpe.model;

import java.util.List;

/**
 * Request object deserialized from the input JSON
 */
public class Request {

    List<String> elements;

    public List<String> getElements() {
        return elements;
    }

    public void setElements(List<String> elements) {
        this.elements = elements;
    }
}
