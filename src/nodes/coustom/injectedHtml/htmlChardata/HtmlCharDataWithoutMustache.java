package nodes.coustom.injectedHtml.htmlChardata;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.html_text.HtmlText;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;
import nodes.coustom.injectedHtml.spacesMushtache.SpacesAfterText;
import nodes.coustom.injectedHtml.spacesMushtache.SpacesBeforeText;
import nodes.coustom.injectedHtml.var_condition_txt.VarConditionTxt;

public class HtmlCharDataWithoutMustache extends Node {
    SpacesBeforeText spacesBeforeText;
    HtmlText htmlText;
    VarConditionTxt varConditionTxt;
    SpacesAfterText spacesAfterText;

    public SpacesBeforeText getSpacesBeforeText() {
        return spacesBeforeText;
    }

    public void setSpacesBeforeText(SpacesBeforeText spacesBeforeText) {
        this.spacesBeforeText = spacesBeforeText;
    }

    public HtmlText getHtmlText() {
        return htmlText;
    }

    public void setHtmlText(HtmlText htmlText) {
        this.htmlText = htmlText;
    }

    public VarConditionTxt getVarConditionTxt() {
        return varConditionTxt;
    }

    public void setVarConditionTxt(VarConditionTxt varConditionTxt) {
        this.varConditionTxt = varConditionTxt;
    }

    public SpacesAfterText getSpacesAfterText() {
        return spacesAfterText;
    }

    public void setSpacesAfterText(SpacesAfterText spacesAfterText) {
        this.spacesAfterText = spacesAfterText;
    }


    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (htmlText != null)
            htmlText.accept(astVisitor);
        if (varConditionTxt != null)
            varConditionTxt.accept(astVisitor);
    }

    public String toString(int numberOfSpaces) {
        if (htmlText == null) {
            return "HtmlCharDataWithoutMustache: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    spacesBeforeText.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    varConditionTxt.toString(numberOfSpaces) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    spacesAfterText.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "HtmlCharDataWithoutMustache: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    spacesBeforeText.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    htmlText.toString(numberOfSpaces) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    spacesAfterText.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
    }
}
