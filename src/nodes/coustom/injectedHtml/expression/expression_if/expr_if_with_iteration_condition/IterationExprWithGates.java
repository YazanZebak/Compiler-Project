package nodes.coustom.injectedHtml.expression.expression_if.expr_if_with_iteration_condition;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class IterationExprWithGates extends Node {
    IterationExpr iterationExpr;
    String AND;
    String OR;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        iterationExpr.accept(astVisitor);
    }

    public IterationExpr getIterationExpr() {
        return iterationExpr;
    }

    public void setIterationExpr(IterationExpr iterationExpr) {
        this.iterationExpr = iterationExpr;
    }

    public String getAND() {
        return AND;
    }

    public void setAND(String AND) {
        this.AND = AND;
    }

    public String getOR() {
        return OR;
    }

    public void setOR(String OR) {
        this.OR = OR;
    }

    public String toString(int numberOfSpaces) {
        if (AND != null) {
            return "IterationExprWithGates: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    iterationExpr.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "AND: " + AND + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "IterationExprWithGates: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    iterationExpr.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "OR: " + OR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
    }
}
