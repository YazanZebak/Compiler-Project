package nodes.coustom.injectedHtml.htmlAttributes.cp_show;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_show.ExpressionShow;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class CpShow extends Node {
    String CP_SHOW;
    String TAG_EQUALS;
    ExpressionShow expressionShow;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        expressionShow.accept(astVisitor);
    }

    public String getCP_SHOW() {
        return CP_SHOW;
    }

    public void setCP_SHOW(String CP_SHOW) {
        this.CP_SHOW = CP_SHOW;
    }

    public String getTAG_EQUALS() {
        return TAG_EQUALS;
    }

    public void setTAG_EQUALS(String TAG_EQUALS) {
        this.TAG_EQUALS = TAG_EQUALS;
    }

    public ExpressionShow getExpressionShow() {
        return expressionShow;
    }

    public void setExpressionShow(ExpressionShow expressionShow) {
        this.expressionShow = expressionShow;
    }

    public String toString(int numberOfSpaces) {
        return "CpShow: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "CP_SHOW: " + CP_SHOW + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                expressionShow.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
