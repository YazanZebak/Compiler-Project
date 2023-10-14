package nodes.coustom.injectedHtml.htmlAttributes.cp_if;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_if.ExpressionIf;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class CpIf extends Node {
    String CP_IF;
    String TAG_EQUALS;
    ExpressionIf expressionIf;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        expressionIf.accept(astVisitor);
    }

    public String getCP_IF() {
        return CP_IF;
    }

    public void setCP_IF(String CP_IF) {
        this.CP_IF = CP_IF;
    }

    public String getTAG_EQUALS() {
        return TAG_EQUALS;
    }

    public void setTAG_EQUALS(String TAG_EQUALS) {
        this.TAG_EQUALS = TAG_EQUALS;
    }

    public ExpressionIf getExpressionIf() {
        return expressionIf;
    }

    public void setExpressionIf(ExpressionIf expressionIf) {
        this.expressionIf = expressionIf;
    }

    public String toString(int numberOfSpaces) {
        return "CpIf: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "CP_IF: " + CP_IF + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                expressionIf.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
