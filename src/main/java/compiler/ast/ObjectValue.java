package main.java.compiler.ast;

public class ObjectValue extends AstNode {
    private boolean isThis;
    private boolean isSuper;
    private AstNode object;
    private String property;

    // Getters & Setters
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

    public AstNode getObject() {
        return object;
    }

    public void setObject(AstNode object) {
        this.object = object;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (isThis) {
            sb.append("this.");
        } else if (isSuper) {
            sb.append("super.");
        }

        sb.append(object.toString());
        sb.append(".");
        sb.append(property);

        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitObjectValue(this);
    }
}