package nodes.coustom.injectedHtml.htmlElement;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.htmlMisc.HTMLComment;

public class HtmlMisc extends Node {
    HTMLComment htmlComment;
    String SEA_WS;


    public HTMLComment getHtmlComment() {
        return htmlComment;
    }

    public void setHtmlComment(HTMLComment htmlComment) {
        this.htmlComment = htmlComment;
    }

    public String getSEA_WS() {
        return SEA_WS;
    }

    public void setSEA_WS(String SEA_WS) {
        this.SEA_WS = SEA_WS;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String toString() {
        if (htmlComment != null) {
            return "HtmlMisc: {" +
                    "htmlComment: { ... }" +
                    '}';
        } else {
            return "HtmlMisc: { " + " }";
        }
    }
}
