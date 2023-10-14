package nodes.coustom.injectedHtml.htmlAttributes.cp_hide;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_hide.ExpressionHide;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class CpHide extends Node {
    String CP_HIDE;
    String TAG_EQUALS;
    ExpressionHide expressionHide;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        expressionHide.accept(astVisitor);
    }


    public String getCP_HIDE() {
        return CP_HIDE;
    }

    public void setCP_HIDE(String CP_HIDE) {
        this.CP_HIDE = CP_HIDE;
    }

    public String getTAG_EQUALS() {
        return TAG_EQUALS;
    }

    public void setTAG_EQUALS(String TAG_EQUALS) {
        this.TAG_EQUALS = TAG_EQUALS;
    }

    public ExpressionHide getExpressionHide() {
        return expressionHide;
    }

    public void setExpressionHide(ExpressionHide expressionHide) {
        this.expressionHide = expressionHide;
    }

    public String toString(int numberOfSpaces) {
        return "CpHide: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "CP_HIDE: " + CP_HIDE + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                expressionHide.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
