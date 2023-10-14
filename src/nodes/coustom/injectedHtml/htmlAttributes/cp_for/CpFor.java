package nodes.coustom.injectedHtml.htmlAttributes.cp_for;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_for.ExpressionFor;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class CpFor extends Node {
    String CP_FOR;
    String TAG_EQUALS;
    ExpressionFor expressionFor;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        expressionFor.accept(astVisitor);
    }

    public String getCP_FOR() {
        return CP_FOR;
    }

    public void setCP_FOR(String CP_FOR) {
        this.CP_FOR = CP_FOR;
    }

    public String getTAG_EQUALS() {
        return TAG_EQUALS;
    }

    public void setTAG_EQUALS(String TAG_EQUALS) {
        this.TAG_EQUALS = TAG_EQUALS;
    }

    public ExpressionFor getExpressionFor() {
        return expressionFor;
    }

    public void setExpressionFor(ExpressionFor expressionFor) {
        this.expressionFor = expressionFor;
    }

    public String toString(int numberOfSpaces) {
        return "CpFor: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "CP_FOR: " + CP_FOR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                expressionFor.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
