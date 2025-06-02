package compiler.ast.components;

import compiler.ast.AstVisitor;

public class TemplateProperty extends ComponentPropertyDef {
    private String template;

    public String getTemplate() { return template; }
    public void setTemplate(String template) { this.template = template; }

    @Override
    public String toString() {
        return "template: `" + template + "`";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitTemplateProperty(this);
    }
}