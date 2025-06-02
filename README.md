# 🧠 AST Rule Class Construction Documentation

## 🎯 Purpose

This document outlines the standardized process for generating abstract syntax tree (AST) classes corresponding to grammar rules in the parser for our **Angular Compiler** project. These AST classes are essential for semantic analysis, optimization, and code generation.

---

## 🧱 Example Rule: `constDeclaration`

ANTLR Rule:

```antlr
constDeclaration: CONST name=IDENTIFIER (COLON type=allOptions)? ASSIGN value=allValues SEMI;
```

### 🧩 Element Mapping

| Element                | Type    | AST Representation |
|------------------------|---------|---------------------|
| `CONST`                | Token   | Ignored             |
| `name=IDENTIFIER`      | Token   | `String`            |
| `type=allOptions`      | Rule    | `AstNode`           |
| `value=allValues`      | Rule    | `AstNode`           |
| `SEMI`                 | Token   | Ignored             |

---

## 🏗️ AST Class Construction

### ✅ General Rules

- **Class name**: PascalCase version of the rule name (e.g., `ConstDeclaration`)
- **Fields**:
  - Rule references → `AstNode`
  - Token references → `String`, `int`, etc.
- **Methods**:
  - `getters` & `setters`
  - `toString()` for textual representation
  - `accept(visitor)` for traversing with the Visitor Pattern

### ✅ Implementation Example: `ConstDeclaration.java`

```java
public class ConstDeclaration extends AstNode {
    private String name;
    private AstNode type;
    private AstNode value;

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public AstNode getType() { return type; }
    public void setType(AstNode type) { this.type = type; }

    public AstNode getValue() { return value; }
    public void setValue(AstNode value) { this.value = value; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (name != null) sb.append("const ").append(name);
        if (type != null) sb.append(" :").append(type.toString());
        if (value != null) sb.append(" =").append(value.toString()).append(";");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitConstDeclaration(this);
    }
}
```

---

## 👤 Visitor Interface Integration

Each AST class must be supported in the visitor interface.

```java
T visitConstDeclaration(ConstDeclaration node);
```

Add this method to `AstVisitor.java`.

---

## 🧠 ASTBuilder Method Generation

Create a corresponding visitor method in `ASTBuilder.java`:

```java
@Override
public AstNode visitConstDeclaration(AngularParser.ConstDeclarationContext ctx) {
    ConstDeclaration constDeclaration = new ConstDeclaration();

    constDeclaration.setName(ctx.name.getText());

    if (ctx.type != null) {
        constDeclaration.setType(visit(ctx.type));
    }

    constDeclaration.setValue(visit(ctx.value));

    return constDeclaration;
}
```

---

## 🔁 Development Guidelines

- ⚙️ **General Rule**:
  - `Rule` → `AstNode`
  - `Token` → Primitive type (e.g., `String`, `int`)
- 🧩 **Each parser rule requires:**
  1. A dedicated AST class (in `ast/`)
  2. A method in `AstVisitor`
  3. A method in `ASTBuilder`

- 📚 **Follow the structure used in the first semester's project** to maintain consistency.

---

## 🗂 Recommended Project Structure

```
/src
 └── compiler/
     ├── ast/
     │   └── ConstDeclaration.java
     ├── visitor/
     │   └── AstVisitor.java
     └── builder/
         └── ASTBuilder.java
/docs
 └── AST_RULES.md
```

---

## ⚡ Tip: Use a Code Template

To accelerate development, consider using a standard code template for each new AST rule class. Let us know if you want a generator or IntelliJ/VSCode live template for this.

---

## 📍 Next Steps

1. Create AST classes for each grammar rule following this guide.
2. Update `AstVisitor` and `ASTBuilder` accordingly.
3. Commit changes with clear, descriptive messages.

