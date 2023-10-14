package nodes.coustom.injectedHtml.text_mustache;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.html_text.HtmlTextAfterMustache;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;
import nodes.coustom.injectedHtml.var_condition_txt.VarConditionTxt;

public class TextRightMustache extends Node {
    HtmlTextAfterMustache htmlTextAfterMustache;
    VarConditionTxt varConditionTxt;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(varConditionTxt != null)
            varConditionTxt.accept(astVisitor);
        if(htmlTextAfterMustache != null)
            htmlTextAfterMustache.accept(astVisitor);
    }

    public HtmlTextAfterMustache getHtmlTextAfterMustache() {
        return htmlTextAfterMustache;
    }

    public void setHtmlTextAfterMustache(HtmlTextAfterMustache htmlTextAfterMustache) {
        this.htmlTextAfterMustache = htmlTextAfterMustache;
    }

    public VarConditionTxt getVarConditionTxt() {
        return varConditionTxt;
    }

    public void setVarConditionTxt(VarConditionTxt varConditionTxt) {
        this.varConditionTxt = varConditionTxt;
    }


    public String toString(int numberOfSpaces) {
        if (htmlTextAfterMustache == null) {
            return "TextRightMustache{" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    varConditionTxt.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "TextRightMustache{" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    htmlTextAfterMustache.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
    }
}
