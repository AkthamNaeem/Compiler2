package compiler.ast.components;

import compiler.ast.AstVisitor;

public class TemplateUrlProperty extends ComponentPropertyDef {
    private String templateUrl;

    public String getTemplateUrl() { return templateUrl; }
    public void setTemplateUrl(String templateUrl) { this.templateUrl = templateUrl; }

    @Override
    public String toString() {
        return "templateUrl: '" + templateUrl + "'";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitTemplateUrlProperty(this);
    }
}