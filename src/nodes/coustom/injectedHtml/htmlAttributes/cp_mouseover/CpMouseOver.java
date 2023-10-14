package nodes.coustom.injectedHtml.htmlAttributes.cp_mouseover;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_mouseover.ExpressionMouseOver;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class CpMouseOver extends Node {
    String CP_MOUSE_OVER;
    String TAG_EQUALS;
    ExpressionMouseOver expressionMouseOver;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        expressionMouseOver.accept(astVisitor);
    }

    public String getCP_MOUSE_OVER() {
        return CP_MOUSE_OVER;
    }

    public void setCP_MOUSE_OVER(String CP_MOUSE_OVER) {
        this.CP_MOUSE_OVER = CP_MOUSE_OVER;
    }

    public String getTAG_EQUALS() {
        return TAG_EQUALS;
    }

    public void setTAG_EQUALS(String TAG_EQUALS) {
        this.TAG_EQUALS = TAG_EQUALS;
    }

    public ExpressionMouseOver getExpressionMouseOver() {
        return expressionMouseOver;
    }

    public void setExpressionMouseOver(ExpressionMouseOver expressionMouseOver) {
        this.expressionMouseOver = expressionMouseOver;
    }

    public String toString(int numberOfSpaces) {
        return "CpMouseOver: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "CP_MOUSE_OVER: " + CP_MOUSE_OVER + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                expressionMouseOver.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
