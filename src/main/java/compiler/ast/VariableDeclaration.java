package main.java.compiler.ast;

public class VariableDeclaration implements AstNode {
    public String name;
    public AstNode type;;
    public AstNode value;
    private boolean semi = false;

    public boolean isSemi() {
        return semi;
    }

    public void setSemi(boolean semi) {
        this.semi = semi;
    }

    public AstNode getValue() {
        return value;
    }

    public void setValue(AstNode value) {
        this.value = value;
    }

    public AstNode getType() {
        return type;
    }

    public void setType(AstNode type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
//        if (scope != null) {
//            sb.append(scope);
//        }
        if (name != null) {
            sb.append(" ").append(name);
        }

        if (type != null) {
            sb.append(" :").append(type.toString());
        }

        if (value != null) {
            sb.append(" = ").append(value.toString());
        }

        if (semi) {
            sb.append(";");
        }

        return sb.toString();
    }

    @Override
    public <T> T accept (AstVisitor<T> visitor) {
        return visitor.visitVariableDeclaration (this);
    }
}
