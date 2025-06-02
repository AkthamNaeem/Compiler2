package main.java.compiler.ast;
import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class ImportSpecifier extends AstNode {
    private String name;
    private String alias;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public boolean hasAlias() {
        return alias != null;
    }

    @Override
    public String toString() {
        return hasAlias() ? name + " as " + alias : name;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitImportSpecifier(this);
    }
}