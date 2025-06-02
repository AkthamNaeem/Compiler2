📘 توثيق بناء كلاس مجرد لقاعدة Parser في مشروع Compiler للغة Angular
🎯 الهدف
بناء كلاس مجرد (AST Node) لكل قاعدة Rule في الـ parser الخاص بنا، بهدف تمثيلها كشجرة تجريدية مجردة (AST) تُستخدم لاحقًا في التحليل الدلالي أو التوليد.

🧱 مثال عملي: قاعدة constDeclaration
antlr
Copy
Edit
constDeclaration: CONST name=IDENTIFIER (COLON type=allOptions)? ASSIGN value=allValues SEMI;
🧩 تحليل عناصر القاعدة
CONST: ثابت (Token) → لا يتم تخزينه.

name=IDENTIFIER: اسم المتغير (Token) → يتم تخزينه كسلسلة نصية String.

type=allOptions: النوع (Rule) → يتم تخزينه ككائن AstNode.

value=allValues: القيمة (Rule) → يتم تخزينها ككائن AstNode.

SEMI: فاصلة منقوطة (Token) → لا يتم تخزينها.

🏗️ إنشاء الكلاس المجرد
✅ الخطوات الموحدة:
اسم الكلاس: مطابق لاسم القاعدة مع تحويل أول حرف إلى حرف كبير (ConstDeclaration).

المتغيرات:

عناصر من نوع Rule → AstNode.

عناصر من نوع Token → String أو int أو حسب الحاجة.

توليد التوابع:

Getters & Setters

toString() لتمثيل نصي.

accept() لاستدعاء الزائر (Visitor Pattern).

✅ مثال:
java
Copy
Edit
public class ConstDeclaration extends AstNode {
    public String name;
    public AstNode type;
    public AstNode value;

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
👤 تعديل واجهة الزائر AstVisitor
إضافة تابع خاص بكل كلاس يتم إنشاؤه:

java
Copy
Edit
T visitConstDeclaration(ConstDeclaration node);
🧠 توليد التابع الخاص في ASTBuilder
java
Copy
Edit
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
🔁 توجيهات عامة
✅ قاعدة ذهبية:

إن كان العنصر عبارة عن Rule → خزن كـ AstNode.

إن كان Token → خزن كنص (String) أو رقم (int).

🔄 يجب إعادة استخدام البنية المعتمدة في مشروع الفصل الأول لضمان التوافق وجودة البنية الشجرية.

🧩 كل كلاس جديد = تعديل في ثلاث ملفات:

الكلاس نفسه (في ast/ أو nodes/)

الواجهة AstVisitor

المولد ASTBuilder


