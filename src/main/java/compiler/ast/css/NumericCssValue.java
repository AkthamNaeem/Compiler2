package main.java.compiler.ast.css;

public class NumericCssValue extends CssValue {
    private String number;
    private String unit; // قد تكون null إذا لم يكن هناك وحدة

    // Getters & Setters
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public String getUnit() { return unit; }
    public void setUnit(String unit) { this.unit = unit; }

    @Override
    public String toString() {
        return number + (unit != null ? unit : "");
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitNumericCssValue(this);
    }
}