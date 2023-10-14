package nodes.coustom.injectedHtml.htmlAttributes.cp_click;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_click.ExpressionClick;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class CpClick extends Node {
    String CP_CLICK;
    String TAG_EQUALS;
    ExpressionClick expressionClick;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        expressionClick.accept(astVisitor);
    }

    public String getCP_CLICK() {
        return CP_CLICK;
    }

    public void setCP_CLICK(String CP_CLICK) {
        this.CP_CLICK = CP_CLICK;
    }

    public String getTAG_EQUALS() {
        return TAG_EQUALS;
    }

    public void setTAG_EQUALS(String TAG_EQUALS) {
        this.TAG_EQUALS = TAG_EQUALS;
    }

    public ExpressionClick getExpressionClick() {
        return expressionClick;
    }

    public void setExpressionClick(ExpressionClick expressionClick) {
        this.expressionClick = expressionClick;
    }

    public String toString(int numberOfSpaces) {
        return "CpClick: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "CP_CLICK: " + CP_CLICK + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                expressionClick.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
