package nodes.coustom.injectedHtml.htmlCharDataValues;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.htmlChardata.HtmlChardata;
import nodes.coustom.injectedHtml.htmlElement.HtmlElement;
import nodes.coustom.injectedHtml.htmlMisc.HTMLComment;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class HtmlChardataValues extends Node {
    HtmlElement htmlElement;
    String CDATA;
    HTMLComment htmlComment;
    HtmlChardata htmlChardata;


    public HtmlElement getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(HtmlElement htmlElement) {
        this.htmlElement = htmlElement;
    }

    public String getCDATA() {
        return CDATA;
    }

    public void setCDATA(String CDATA) {
        this.CDATA = CDATA;
    }

    public HTMLComment getHtmlComment() {
        return htmlComment;
    }

    public void setHtmlComment(HTMLComment htmlComment) {
        this.htmlComment = htmlComment;
    }

    public HtmlChardata getHtmlChardata() {
        return htmlChardata;
    }

    public void setHtmlChardata(HtmlChardata htmlChardata) {
        this.htmlChardata = htmlChardata;
    }


    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (htmlElement != null)
            htmlElement.accept(astVisitor);
        if (htmlComment != null)
            htmlComment.accept(astVisitor);
        if (htmlChardata != null)
            htmlChardata.accept(astVisitor);
    }

    public String toString(int numberOfSpaces) { // 8

        if (htmlComment != null) {
            return "HtmlChardataValues: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    htmlComment.toString(numberOfSpaces) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    htmlChardata.toString(numberOfSpaces) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (htmlElement != null) {
            return "HtmlChardataValues: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    htmlElement.toString(numberOfSpaces) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    htmlChardata.toString(numberOfSpaces) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "HtmlChardataValues: { }";
        }

    }
}
