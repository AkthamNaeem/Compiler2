package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class ClassObjectDeclaration extends AstNode {
    private String declarationType; // "let" | "var" | "const"
    private String name;           // IDENTIFIER
    private AstNode value;         // classValue

    // Getters & Setters
    public String getDeclarationType() {
        return declarationType;
    }

    public void setDeclarationType(String declarationType) {
        this.declarationType = declarationType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AstNode getValue() {
        return value;
    }

    public void setValue(AstNode value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(declarationType).append(" ").append(name);
        sb.append(" = ").append(value.toString());
        sb.append(";");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitClassObjectDeclaration(this);
    }
}