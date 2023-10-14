package nodes.coustom.injectedHtml.htmlElement;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.htmlContent.HtmlContent;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class InnerCloseHtmlElement extends Node {

    HtmlContent htmlContent;
    String TAG_OPEN;
    String TAG_SLASH;
    String TAG_NAME;
    String TAG_CLOSE;

    public HtmlContent getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    public String getTAG_OPEN() {
        return TAG_OPEN;
    }

    public void setTAG_OPEN(String TAG_OPEN) {
        this.TAG_OPEN = TAG_OPEN;
    }

    public String getTAG_SLASH() {
        return TAG_SLASH;
    }

    public void setTAG_SLASH(String TAG_SLASH) {
        this.TAG_SLASH = TAG_SLASH;
    }

    public String getTAG_NAME() {
        return TAG_NAME;
    }

    public void setTAG_NAME(String TAG_NAME) {
        this.TAG_NAME = TAG_NAME;
    }

    public String getTAG_CLOSE() {
        return TAG_CLOSE;
    }

    public void setTAG_CLOSE(String TAG_CLOSE) {
        this.TAG_CLOSE = TAG_CLOSE;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        htmlContent.accept(astVisitor);

    }

    public String toString(int numberOfSpaces) { //5
        return "InnerCloseHtmlElement: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                htmlContent.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                "TAG_NAME: " + TAG_NAME + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
