package main.java.compiler.ast.literals;

import main.java.compiler.ast.AstVisitor;

public class SymbolContent implements LiteralContent {
    private String symbol;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitSymbolContent(this);
    }
}