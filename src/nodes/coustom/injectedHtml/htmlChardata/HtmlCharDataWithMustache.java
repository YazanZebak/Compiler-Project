package nodes.coustom.injectedHtml.htmlChardata;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.mustach_list.MustacheList;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

import java.util.ArrayList;

public class HtmlCharDataWithMustache extends Node {
    ArrayList<MustacheList> mustacheListArrayList = new ArrayList<>();

    public ArrayList<MustacheList> getMustacheListArrayList() {
        return mustacheListArrayList;
    }

    public void setMustacheListArrayList(ArrayList<MustacheList> mustacheListArrayList) {
        this.mustacheListArrayList = mustacheListArrayList;
    }


    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for(MustacheList mustacheList : mustacheListArrayList){
            mustacheList.accept(astVisitor);
        }

    }

    public String toString(int numberOfSpaces) {
        return "HtmlCharDataWithMustache: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                getStringFromArrayList(mustacheListArrayList, numberOfSpaces+1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces ) +
                '}';
    }

    static public String getStringFromArrayList(ArrayList<MustacheList> arrayList, int numberOfSpaces) {
        String result = "";
        for (int i = 0; i < arrayList.size(); i++) {
            result += arrayList.get(i).toString(numberOfSpaces);
        }
        return result;
    }
}
