package nodes.coustom.injectedHtml.text_mustache;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.html_text.HtmlTextBeforeMustache;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;
import nodes.coustom.injectedHtml.var_condition_txt.VarConditionTxt;

public class TextLeftMustache extends Node {
    HtmlTextBeforeMustache htmlTextBeforeMustache;
    VarConditionTxt varConditionTxt;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (htmlTextBeforeMustache != null)
            htmlTextBeforeMustache.accept(astVisitor);
        if (varConditionTxt != null)
            varConditionTxt.accept(astVisitor);
    }

    public HtmlTextBeforeMustache getHtmlTextBeforeMustache() {
        return htmlTextBeforeMustache;
    }

    public void setHtmlTextBeforeMustache(HtmlTextBeforeMustache htmlTextBeforeMustache) {
        this.htmlTextBeforeMustache = htmlTextBeforeMustache;
    }

    public VarConditionTxt getVarConditionTxt() {
        return varConditionTxt;
    }

    public void setVarConditionTxt(VarConditionTxt varConditionTxt) {
        this.varConditionTxt = varConditionTxt;
    }


    public String toString(int numberOfSpaces) {
        if (htmlTextBeforeMustache == null) {
            return "TextLeftMustache: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    varConditionTxt.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "TextLeftMustache: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    htmlTextBeforeMustache.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }

    }
}
