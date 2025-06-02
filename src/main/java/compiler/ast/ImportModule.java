package main.java.compiler.ast;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;
import java.util.ArrayList;
import java.util.List;

public class ImportModule extends AstNode {
    private List<AstNode> imports = new ArrayList<>();  // قائمة importSpecifier
    private String path;  // مسار الاستيراد (STRING)

    // Getters & Setters
    public List<AstNode> getImports() {
        return imports;
    }

    public void setImports(List<AstNode> imports) {
        this.imports = imports;
    }

    public void addImport(AstNode importSpecifier) {
        this.imports.add(importSpecifier);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("import { ");
        for (int i = 0; i < imports.size(); i++) {
            sb.append(imports.get(i).toString());
            if (i < imports.size() - 1) sb.append(", ");
        }
        sb.append(" } from ").append(path).append(";");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitImportModule(this);
    }
}