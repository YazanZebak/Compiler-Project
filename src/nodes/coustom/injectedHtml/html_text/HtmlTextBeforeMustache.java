package nodes.coustom.injectedHtml.html_text;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class HtmlTextBeforeMustache extends Node {
    String ANY_HTML_TEXT;

    public String getANY_HTML_TEXT() {
        return ANY_HTML_TEXT;
    }

    public void setANY_HTML_TEXT(String ANY_HTML_TEXT) {
        this.ANY_HTML_TEXT = ANY_HTML_TEXT;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String toString(int numberOfSpaces) {
        return "HtmlTextBeforeMustache: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                "Text: " + ANY_HTML_TEXT + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
