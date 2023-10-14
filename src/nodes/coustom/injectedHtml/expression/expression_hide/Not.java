package nodes.coustom.injectedHtml.expression.expression_hide;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class Not extends Node {
    String NOT_CONDITION;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getNOT_CONDITION() {
        return NOT_CONDITION;
    }

    public void setNOT_CONDITION(String NOT_CONDITION) {
        this.NOT_CONDITION = NOT_CONDITION;
    }

    public String toString(int numberOfSpaces) {
        return "Not: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "NOT_CONDITION: " + NOT_CONDITION +  "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
