package main.java.compiler.ast.allValues;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class JsonValue extends AstNode {
    private AstNode jsonDef;

    public AstNode getJsonDef() { return jsonDef; }
    public void setJsonDef(AstNode jsonDef) { this.jsonDef = jsonDef; }

    @Override
    public String toString() { return jsonDef.toString(); }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitJsonValue(this);
    }
}