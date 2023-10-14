package nodes.coustom.injectedHtml.htmlAttributes.default_cp;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_default.ExpressionDefault;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class DefaultCp extends Node {
    String DEFAULT_CP;
    ExpressionDefault expressionDefault;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        expressionDefault.accept(astVisitor);
    }

    public String getDEFAULT_CP() {
        return DEFAULT_CP;
    }

    public void setDEFAULT_CP(String DEFAULT_CP) {
        this.DEFAULT_CP = DEFAULT_CP;
    }

    public ExpressionDefault getExpressionDefault() {
        return expressionDefault;
    }

    public void setExpressionDefault(ExpressionDefault expressionDefault) {
        this.expressionDefault = expressionDefault;
    }

    public String toString(int numberOfSpaces) {
        return "DefaultCp: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "DEFAULT_CP: " + DEFAULT_CP + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                expressionDefault.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
