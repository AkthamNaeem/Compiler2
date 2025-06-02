package main.java.compiler.ast.html;

import main.java.compiler.ast.AstNode;

/**
 * Represents HTML attribute (name-value pair)
 */
public class HtmlAttribute extends AstNode {
    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return name + "=\"" + value + "\"";
    }
}