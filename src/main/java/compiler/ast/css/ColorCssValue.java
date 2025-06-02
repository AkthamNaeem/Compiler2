package main.java.compiler.ast.css;

public class ColorCssValue extends CssValue {
    private String colorValue;

    // Getters & Setters
    public String getColorValue() { return colorValue; }
    public void setColorValue(String colorValue) { this.colorValue = colorValue; }

    @Override
    public String toString() {
        return "#" + colorValue;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitColorCssValue(this);
    }
}