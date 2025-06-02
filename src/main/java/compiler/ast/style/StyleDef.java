package main.java.compiler.ast.style;

import java.util.ArrayList;
import java.util.List;

public class StyleDef extends AstNode {
    private String startLiteral;
    private List<AstNode> cssRules = new ArrayList<>();
    private String endLiteral;

    // Getters & Setters
    public String getStartLiteral() {
        return startLiteral;
    }

    public void setStartLiteral(String startLiteral) {
        this.startLiteral = startLiteral;
    }

    public List<AstNode> getCssRules() {
        return cssRules;
    }

    public void addCssRule(AstNode rule) {
        this.cssRules.add(rule);
    }

    public String getEndLiteral() {
        return endLiteral;
    }

    public void setEndLiteral(String endLiteral) {
        this.endLiteral = endLiteral;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(startLiteral);
        for (AstNode rule : cssRules) {
            sb.append(rule.toString());
        }
        sb.append(endLiteral);
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitStyleDef(this);
    }
}