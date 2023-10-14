package nodes.coustom.injectedHtml.htmlAttributes.cp_model;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_model.ExpressionModel;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class CpModel extends Node {
    String CP_MODEL;
    String TAG_EQUALS;
    ExpressionModel expressionModel;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        expressionModel.accept(astVisitor);
    }

    public String getCP_MODEL() {
        return CP_MODEL;
    }

    public void setCP_MODEL(String CP_MODEL) {
        this.CP_MODEL = CP_MODEL;
    }

    public String getTAG_EQUALS() {
        return TAG_EQUALS;
    }

    public void setTAG_EQUALS(String TAG_EQUALS) {
        this.TAG_EQUALS = TAG_EQUALS;
    }

    public ExpressionModel getExpressionModel() {
        return expressionModel;
    }

    public void setExpressionModel(ExpressionModel expressionModel) {
        this.expressionModel = expressionModel;
    }

    public String toString(int numberOfSpaces) {
        return "CpModel: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "CP_MODEL: " + CP_MODEL + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                expressionModel.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
