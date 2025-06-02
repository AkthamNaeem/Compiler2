package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class StringLiteral extends AstNode {
    private String content;
    private boolean isTemplateLiteral; // إضافة إذا كان يدعم Template Strings مثل `${var}`

    // Getters & Setters
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isTemplateLiteral() {
        return isTemplateLiteral;
    }

    public void setTemplateLiteral(boolean isTemplateLiteral) {
        this.isTemplateLiteral = isTemplateLiteral;
    }

    @Override
    public String toString() {
        return isTemplateLiteral ? "`" + content + "`" : "\"" + content + "\"";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitStringLiteral(this);
    }
}