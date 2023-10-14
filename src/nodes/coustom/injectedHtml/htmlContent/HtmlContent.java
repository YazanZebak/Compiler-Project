package nodes.coustom.injectedHtml.htmlContent;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.htmlCharDataValues.HtmlChardataValues;
import nodes.coustom.injectedHtml.htmlChardata.HtmlChardata;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

import java.util.ArrayList;

public class HtmlContent extends Node {
    HtmlChardata htmlChardata;
    ArrayList<HtmlChardataValues> htmlChardataValues = new ArrayList<>();

    public HtmlChardata getHtmlChardata() {
        return htmlChardata;
    }

    public void setHtmlChardata(HtmlChardata htmlChardata) {
        this.htmlChardata = htmlChardata;
    }

    public ArrayList<HtmlChardataValues> getHtmlChardataValues() {
        return htmlChardataValues;
    }

    public void setHtmlChardataValues(ArrayList<HtmlChardataValues> htmlChardataValues) {
        this.htmlChardataValues = htmlChardataValues;
    }


    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (htmlChardata != null)
            htmlChardata.accept(astVisitor);
        for (HtmlChardataValues htmlChardataValues : htmlChardataValues) {
            htmlChardataValues.accept(astVisitor);
        }
    }

    public String toString(int numberOfSpaces) { // 7
        return "HtmlContent: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                htmlChardata.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                getStringFromArrayList(htmlChardataValues, numberOfSpaces + 1) +
                '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}' + '\n' + PrettyPrinter.addSpaces(numberOfSpaces);
    }

    static public String getStringFromArrayList(ArrayList<HtmlChardataValues> arrayList, int numberOfSpaces) {
        String result = "";
        for (int i = 0; i < arrayList.size(); i++) {
            result += arrayList.get(i).toString(numberOfSpaces);
        }
        return result;
    }


}
