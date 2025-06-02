package main.java.compiler.ast.html;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

/**
 * Represents *ngIf directive
 */
public class NgIfDirective extends HtmlDirective {
    private AstNode condition;

    public AstNode getCondition() {
        return condition;
    }

    public void setCondition(AstNode condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "*ngIf=\"" + condition.toString() + "\"";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitNgIfDirective(this);
    }
}