package main.java.compiler.ast.expressions;

public enum ComparisonOperator {
    LT("<"),
    GT(">"),
    LTE("<="),
    GTE(">="),
    EQ("=="),
    NEQ("!="),
    STRICT_EQ("==="),
    STRICT_NEQ("!==");

    private final String symbol;

    ComparisonOperator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static ComparisonOperator fromToken(String token) {
        return switch (token) {
            case "<" -> LT;
            case ">" -> GT;
            case "<=" -> LTE;
            case ">=" -> GTE;
            case "==" -> EQ;
            case "!=" -> NEQ;
            case "===" -> STRICT_EQ;
            case "!==" -> STRICT_NEQ;
            default -> throw new IllegalArgumentException("Unknown comparison operator: " + token);
        };
    }
}