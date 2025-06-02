package main.java.compiler.ast;

public class Parameter extends AstNode {
    private AstNode accessModifier; // Rule → AstNode
    private AstNode variable;      // Rule → AstNode (functionVariable)

    // Getters & Setters
    public AstNode getAccessModifier() { return accessModifier; }
    public void setAccessModifier(AstNode accessModifier) { this.accessModifier = accessModifier; }

    public AstNode getVariable() { return variable; }
    public void setVariable(AstNode variable) { this.variable = variable; }

    @Override
    public String toString() {
        return (accessModifier != null ? accessModifier.toString() + " " : "") + variable.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitParameter(this);
    }
}