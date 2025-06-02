package main.java.compiler.ast.style;

import java.util.ArrayList;
import java.util.List;

public class StyleUrlsDef extends AstNode {
    private List<String> urls = new ArrayList<>();

    public List<String> getUrls() {
        return urls;
    }

    public void addUrl(String url) {
        // إزالة علامات الاقتباس من المسار
        String cleanedUrl = url.replaceAll("^[\"']|[\"']$", "");
        this.urls.add(cleanedUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("styleUrls: [");
        for (int i = 0; i < urls.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append("\"").append(urls.get(i)).append("\"");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitStyleUrlsDef(this);
    }
}