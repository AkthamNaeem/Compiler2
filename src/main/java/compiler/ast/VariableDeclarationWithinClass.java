package main.java.compiler.ast;

public class VariableDeclarationWithinClass implements AstNode {
    public boolean isNullable;
    public String name;
    public AstNode type;
    public AstNode value;

    public boolean isNullable() {
        return isNullable;
    }

    public void setNullable(boolean nullable) {
        isNullable = nullable;
    }

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
            if (isNullable) {
                sb.append(" | null");
            }
        }
        if (value != null) {
            sb.append(" = ").append(value);
        }
        return sb.toString();
    }
    @Override
    public <T> T accept (AstVisitor<T> visitor) {
        return visitor.visitVariableDeclarationWithinClass(this);
    }
}
