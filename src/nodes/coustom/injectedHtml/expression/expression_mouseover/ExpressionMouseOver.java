package nodes.coustom.injectedHtml.expression.expression_mouseover;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExpressionMouseOver extends Node {
    String FUNCTION;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getFUNCTION() {
        return FUNCTION;
    }

    public void setFUNCTION(String FUNCTION) {
        this.FUNCTION = FUNCTION;
    }

    public String toString(int numberOfSpaces) {
        return "ExpressionMouseOver: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "FUNCTION: " + FUNCTION + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
