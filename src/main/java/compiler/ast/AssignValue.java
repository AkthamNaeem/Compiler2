package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class AssignValue extends AstNode {
    private String target;
    private AstNode objTarget;
    private AstNode value;

    // Getters & Setters
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public AstNode getObjTarget() {
        return objTarget;
    }

    public void setObjTarget(AstNode objTarget) {
        this.objTarget = objTarget;
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

        if (target != null) {
            sb.append(target);
        } else if (objTarget != null) {
            sb.append(objTarget.toString());
        }

        sb.append(" = ");
        sb.append(value != null ? value.toString() : "");
        sb.append(";");

        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitAssignValue(this);
    }
}