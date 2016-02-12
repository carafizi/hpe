package hpe.model;

import java.util.List;

/**
 * Request object serialized from the input JSON
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
