package nodes.coustom.injectedHtml.htmlAttributes.cp_type;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_type.ExpressionType;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class CpType extends Node {
    String CP_TYPE;
    String TAG_EQUALS;
    ExpressionType expressionType;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        expressionType.accept(astVisitor);
    }

    public String getCP_TYPE() {
        return CP_TYPE;
    }

    public void setCP_TYPE(String CP_TYPE) {
        this.CP_TYPE = CP_TYPE;
    }

    public String getTAG_EQUALS() {
        return TAG_EQUALS;
    }

    public void setTAG_EQUALS(String TAG_EQUALS) {
        this.TAG_EQUALS = TAG_EQUALS;
    }

    public ExpressionType getExpressionType() {
        return expressionType;
    }

    public void setExpressionType(ExpressionType expressionType) {
        this.expressionType = expressionType;
    }

    public String toString(int numberOfSpaces) {
        return "CpType: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "CP_TYPE: " + CP_TYPE + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                expressionType.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
