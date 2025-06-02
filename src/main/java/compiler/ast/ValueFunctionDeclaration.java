package main.java.compiler.ast;

public class ValueFunctionDeclaration extends AstNode {
    private BaseFunctionDeclaration function;

    // Getters & Setters
    public BaseFunctionDeclaration getFunction() { return function; }
    public void setFunction(BaseFunctionDeclaration function) { this.function = function; }

    @Override
    public String toString() {
        return "function " + function.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitValueFunctionDeclaration(this);
    }
}