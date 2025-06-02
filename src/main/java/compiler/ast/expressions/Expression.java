package main.java.compiler.ast.expressions;

import main.java.compiler.ast.AstNode;
import main.java.compiler.ast.AstVisitor;

public abstract class Expression extends AstNode {
    // سيكون هذا الكلاس أساساً لجميع أنواع التعبيرات
    @Override
    public abstract <T> T accept(AstVisitor<T> visitor);
}