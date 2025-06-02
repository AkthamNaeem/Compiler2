package main.java.compiler.ast;

public class FunctionAssignDeclaration implements AstNode {
    public String name;
    public AstNode type;
    public AstNode value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AstNode getType() {
        return type;
    }

    public void setType(AstNode type) {
        this.type = type;
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
        sb.append(name);

        if (type != null) {
            sb.append(": ").append(type);
        }

        sb.append(" = ").append(value).append(";");
        return sb.toString();
    }
    @Override
    public <T> T accept (AstVisitor<T> visitor) {
        return visitor.visitFunctionAssignDeclaration (this);
    }
}
