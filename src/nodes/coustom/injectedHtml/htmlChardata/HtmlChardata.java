package nodes.coustom.injectedHtml.htmlChardata;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class HtmlChardata extends Node {
    HtmlCharDataWithMustache htmlCharDataWithMustache;
    HtmlCharDataWithoutMustache htmlCharDataWithoutMustache;
    String SEA_WS;


    public HtmlCharDataWithMustache getHtmlCharDataWithMustache() {
        return htmlCharDataWithMustache;
    }

    public void setHtmlCharDataWithMustache(HtmlCharDataWithMustache htmlCharDataWithMustache) {
        this.htmlCharDataWithMustache = htmlCharDataWithMustache;
    }

    public HtmlCharDataWithoutMustache getHtmlCharDataWithoutMustache() {
        return htmlCharDataWithoutMustache;
    }

    public void setHtmlCharDataWithoutMustache(HtmlCharDataWithoutMustache htmlCharDataWithoutMustache) {
        this.htmlCharDataWithoutMustache = htmlCharDataWithoutMustache;
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
        if (htmlCharDataWithMustache != null)
            htmlCharDataWithMustache.accept(astVisitor);
        if (htmlCharDataWithoutMustache != null)
            htmlCharDataWithoutMustache.accept(astVisitor);
    }

    public String toString(int numberOfSpaces) {
        if (htmlCharDataWithoutMustache != null) {
            return "HtmlChardata: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    htmlCharDataWithoutMustache.toString(numberOfSpaces) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces - 1) +
                    '}';
        }
        if (htmlCharDataWithMustache != null) {
            return "HtmlChardata: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    htmlCharDataWithMustache.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "HtmlChardata: { }";
        }
    }
}
