package main.java.compiler.ast;

import java.util.ArrayList;
import java.util.List;

public class ImportArray extends AstNode {
    private List<AstNode> importItems = new ArrayList<>();

    // Getters & Setters
    public List<AstNode> getImportItems() {
        return importItems;
    }

    public void setImportItems(List<AstNode> importItems) {
        this.importItems = importItems;
    }

    public void addImportItem(AstNode item) {
        this.importItems.add(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < importItems.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(importItems.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitImportArray(this);
    }
}