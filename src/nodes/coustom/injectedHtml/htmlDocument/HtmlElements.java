package nodes.coustom.injectedHtml.htmlDocument;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.htmlElement.HtmlElement;
import nodes.coustom.injectedHtml.htmlElement.HtmlMisc;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

import java.util.ArrayList;

public class HtmlElements extends Node {
    HtmlElement htmlElement;
    ArrayList<HtmlMisc> HtmlMiscs = new ArrayList<>();

    public HtmlElement getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(HtmlElement htmlElement) {
        this.htmlElement = htmlElement;
    }

    public ArrayList<HtmlMisc> getHtmlMiscs() {
        return HtmlMiscs;
    }

    public void setHtmlMiscs(ArrayList<HtmlMisc> HtmlMiscs) {
        this.HtmlMiscs = HtmlMiscs;
    }


    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        htmlElement.accept(astVisitor);
        for (HtmlMisc htmlMisc : HtmlMiscs) {
            htmlMisc.accept(astVisitor);
        }
    }

    @Override
    public String toString() {
        return "HtmlElements: { \n" + PrettyPrinter.addSpaces(2) +
                htmlElement.toString(3) + '\n' + PrettyPrinter.addSpaces(2) +
                HtmlMiscs + '\n' + PrettyPrinter.addSpaces(1) +
                '}';
    }
}
