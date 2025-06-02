package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class ForEachLoop extends AstNode {
    private String declarationType; // "var" | "let" | "const"
    private String item;           // IDENTIFIER
    private AstNode iterable;      // expression
    private AstNode body;          // block

    // Getters & Setters
    public String getDeclarationType() {
        return declarationType;
    }

    public void setDeclarationType(String declarationType) {
        this.declarationType = declarationType;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public AstNode getIterable() {
        return iterable;
    }

    public void setIterable(AstNode iterable) {
        this.iterable = iterable;
    }

    public AstNode getBody() {
        return body;
    }

    public void setBody(AstNode body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "for (" + declarationType + " " + item + " of " + iterable + ") {\n\t" +
                body.toString().replace("\n", "\n\t") + "\n}";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitForEachLoop(this);
    }
}