package main.java.compiler.ast.html;

public class EventBindingTemplate extends HtmlTemplateType {
    private AstNode event;
    private AstNode handler;

    // Getters & Setters
    public AstNode getEvent() { return event; }
    public void setEvent(AstNode event) { this.event = event; }

    public AstNode getHandler() { return handler; }
    public void setHandler(AstNode handler) { this.handler = handler; }

    @Override
    public String toString() {
        return "(" + event.toString() + ")=\"" + handler.toString() + "\"";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitEventBindingTemplate(this);
    }
}