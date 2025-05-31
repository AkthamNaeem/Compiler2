package main.java.compiler.ast;

public class ConstDeclaration implements AstNode {
    public String name;
    public AstNode type;
    public AstNode value;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public AstNode getType () {
        return type;
    }

    public void setType (AstNode type) {
        this.type = type;
    }

    public AstNode getValue () {
        return value;
    }

    public void setValue (AstNode value) {
        this.value = value;
    }

    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder();

        if (name != null) {
            sb.append("const ").append(name);
        }

        if (type != null) {
            sb.append(" :").append(type.toString ());
        }

        if (value != null) {
            sb.append(" =" ).append(value.toString ());
            sb.append(";");
        }

        return sb.toString();
    }

    @Override
    public <T> T accept (AstVisitor<T> visitor) {
        return visitor.visitConstDeclaration (this);
    }
}
