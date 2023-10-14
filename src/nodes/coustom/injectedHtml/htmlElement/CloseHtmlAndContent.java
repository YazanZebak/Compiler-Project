package nodes.coustom.injectedHtml.htmlElement;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class CloseHtmlAndContent extends Node {

    String TAG_SLASH_CLOSE;
    String TAG_CLOSE;
    InnerCloseHtmlElement innerCloseHtmlElement;

    public String getTAG_SLASH_CLOSE() {
        return TAG_SLASH_CLOSE;
    }

    public void setTAG_SLASH_CLOSE(String TAG_SLASH_CLOSE) {
        this.TAG_SLASH_CLOSE = TAG_SLASH_CLOSE;
    }

    public String getTAG_CLOSE() {
        return TAG_CLOSE;
    }

    public void setTAG_CLOSE(String TAG_CLOSE) {
        this.TAG_CLOSE = TAG_CLOSE;
    }

    public InnerCloseHtmlElement getInnerCloseHtmlElement() {
        return innerCloseHtmlElement;
    }

    public void setInnerCloseHtmlElement(InnerCloseHtmlElement innerCloseHtmlElement) {
        this.innerCloseHtmlElement = innerCloseHtmlElement;
    }


    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (innerCloseHtmlElement != null)
            innerCloseHtmlElement.accept(astVisitor);
    }

    public String toString(int numberOfSpaces) { //4
        if (innerCloseHtmlElement == null) {
            return "CloseHtmlAndContent: { " + '}';
        } else {
            return "CloseHtmlAndContent: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    innerCloseHtmlElement.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }

    }
}
