package nodes.coustom.injectedHtml.html_text;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class HtmlText extends Node {
    String ANY_HTML_TEXT;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getANY_HTML_TEXT() {
        return ANY_HTML_TEXT;
    }

    public void setANY_HTML_TEXT(String ANY_HTML_TEXT) {
        this.ANY_HTML_TEXT = ANY_HTML_TEXT;
    }

    public String toString(int numberOfSpaces) {
        return "HtmlText: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces + 1) +
                "Text: " + ANY_HTML_TEXT + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
