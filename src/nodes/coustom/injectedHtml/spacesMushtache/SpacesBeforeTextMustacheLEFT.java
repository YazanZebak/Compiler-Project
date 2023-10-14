package nodes.coustom.injectedHtml.spacesMushtache;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.htmlElement.HtmlMisc;

import java.util.ArrayList;

public class SpacesBeforeTextMustacheLEFT extends Node {
    ArrayList<HtmlMisc> htmlMiscArrayList = new ArrayList<>();

    public ArrayList<HtmlMisc> getHtmlMiscArrayList() {
        return htmlMiscArrayList;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (HtmlMisc htmlMisc : htmlMiscArrayList) {
            htmlMisc.accept(astVisitor);
        }
    }

    public void setHtmlMiscArrayList(ArrayList<HtmlMisc> htmlMiscArrayList) {
        this.htmlMiscArrayList = htmlMiscArrayList;
    }

    @Override
    public String toString() {
        return "SpacesBeforeTextMustacheLEFT: {" +
                htmlMiscArrayList.toString() +
                '}';
    }
}
