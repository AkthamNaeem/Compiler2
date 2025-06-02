package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;
import java.util.ArrayList;
import java.util.List;

public class ImportsDef extends AstNode {
    private List<AstNode> modules = new ArrayList<>();

    // Getters & Setters
    public List<AstNode> getModules() {
        return modules;
    }

    public void addModule(AstNode module) {
        this.modules.add(module);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("imports: [");
        for (int i = 0; i < modules.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(modules.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitImportsDef(this);
    }
}