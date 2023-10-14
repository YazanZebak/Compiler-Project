package nodes.coustom.injectedHtml.htmlAttributes.cp_switch_case;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_switch_case.ExpressionSwitchCase;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class CpSwitchCase extends Node {
    String CP_SWITCH_CASE;
    String TAG_EQUALS;
    ExpressionSwitchCase expressionSwitchCase;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        expressionSwitchCase.accept(astVisitor);
    }

    public String getCP_SWITCH_CASE() {
        return CP_SWITCH_CASE;
    }

    public void setCP_SWITCH_CASE(String CP_SWITCH_CASE) {
        this.CP_SWITCH_CASE = CP_SWITCH_CASE;
    }

    public String getTAG_EQUALS() {
        return TAG_EQUALS;
    }

    public void setTAG_EQUALS(String TAG_EQUALS) {
        this.TAG_EQUALS = TAG_EQUALS;
    }

    public ExpressionSwitchCase getExpressionSwitchCase() {
        return expressionSwitchCase;
    }

    public void setExpressionSwitchCase(ExpressionSwitchCase expressionSwitchCase) {
        this.expressionSwitchCase = expressionSwitchCase;
    }

    public String toString(int numberOfSpaces) {
        return "CpSwitchCase: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "CP_SWITCH_CASE: " + CP_SWITCH_CASE + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                expressionSwitchCase.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
