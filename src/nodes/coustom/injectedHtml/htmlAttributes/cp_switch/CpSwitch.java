package nodes.coustom.injectedHtml.htmlAttributes.cp_switch;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_switch.ExpressionSwitch;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class CpSwitch extends Node {
    String CP_SWITCH;
    String TAG_EQUALS;
    ExpressionSwitch expressionSwitch;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        expressionSwitch.accept(astVisitor);
    }

    public String getCP_SWITCH() {
        return CP_SWITCH;
    }

    public void setCP_SWITCH(String CP_SWITCH) {
        this.CP_SWITCH = CP_SWITCH;
    }

    public String getTAG_EQUALS() {
        return TAG_EQUALS;
    }

    public void setTAG_EQUALS(String TAG_EQUALS) {
        this.TAG_EQUALS = TAG_EQUALS;
    }

    public ExpressionSwitch getExpressionSwitch() {
        return expressionSwitch;
    }

    public void setExpressionSwitch(ExpressionSwitch expressionSwitch) {
        this.expressionSwitch = expressionSwitch;
    }

    public String toString(int numberOfSpaces) {
        return "CpSwitch: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "CP_SWITCH: " + CP_SWITCH + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                expressionSwitch.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
