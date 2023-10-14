package nodes.coustom.injectedHtml.spacesMushtache;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.htmlElement.HtmlMisc;

import java.util.ArrayList;

public class SpacesBeforeText extends Node {
    ArrayList<HtmlMisc> htmlMiscArrayList = new ArrayList<>();


    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (HtmlMisc htmlMisc : htmlMiscArrayList) {
            htmlMisc.accept(astVisitor);
        }
    }

    public ArrayList<HtmlMisc> getHtmlMiscArrayList() {
        return htmlMiscArrayList;
    }

    public void setHtmlMiscArrayList(ArrayList<HtmlMisc> htmlMiscArrayList) {
        this.htmlMiscArrayList = htmlMiscArrayList;
    }


    @Override
    public String toString() {
        return "SpacesBeforeText: {" +
                htmlMiscArrayList.toString() +
                '}';
    }
}
