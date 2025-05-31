package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public class Statement implements AstNode {
    public AstNode statement;
    public boolean semi = false;

    public AstNode getStatement () {
        return statement;
    }

    public void setStatement (AstNode statement) {
        this.statement = statement;
    }

    public boolean isSemi () {
        return semi;
    }

    public void setSemi (boolean semi) {
        this.semi = semi;
    }

    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder ();

        if(this.getStatement () != null) {
            sb.append (this.getStatement ().toString ());
            if(isSemi()) {
                sb.append (';');
            }
        }

        return sb.toString ();
    }

    @Override
    public <T> T accept (AstVisitor<T> visitor) {
        return visitor.visitStatement (this);
    }
}
