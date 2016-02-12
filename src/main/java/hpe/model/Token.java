package hpe.model;

public  interface Token {
     void accept(TokenVisitor tokenVisitor);
}
