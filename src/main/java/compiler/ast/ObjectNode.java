package main.java.compiler.ast;

public class ObjectNode extends AstNode {
    private String identifier;
    private AstNode assertion;
    private boolean isThis;
    private boolean isSuper;
    private boolean hasParentheses;

    // Constructors
    public ObjectNode() {}

    // Getters & Setters
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public AstNode getAssertion() {
        return assertion;
    }

    public void setAssertion(AstNode assertion) {
        this.assertion = assertion;
    }

    public boolean isThis() {
        return isThis;
    }

    public void setThis(boolean isThis) {
        this.isThis = isThis;
    }

    public boolean isSuper() {
        return isSuper;
    }

    public void setSuper(boolean isSuper) {
        this.isSuper = isSuper;
    }

    public boolean hasParentheses() {
        return hasParentheses;
    }

    public void setParentheses(boolean hasParentheses) {
        this.hasParentheses = hasParentheses;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (hasParentheses) {
            sb.append("(");
        }

        if (identifier != null) {
            sb.append(identifier);
        } else if (assertion != null) {
            sb.append(assertion.toString());
        } else if (isThis) {
            sb.append("this");
        } else if (isSuper) {
            sb.append("super");
        }

        if (hasParentheses) {
            sb.append(")");
        }

        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitObjectNode(this);
    }
}