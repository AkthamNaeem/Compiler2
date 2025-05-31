package main.java.compiler.ast;

public class Token implements AstNode {
    public String name;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return this.name;
    }

    @Override
    public <T> T accept (AstVisitor<T> visitor) {
        return visitor.visitToken (this);
    }
}
