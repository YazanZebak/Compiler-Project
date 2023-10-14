package nodes.coustom.injectedHtml.expression.expression_if.expr_if_with_iteration_condition.dot_iteration;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class VarDot extends Node {
    String VAR;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getVAR() {
        return VAR;
    }

    public void setVAR(String VAR) {
        this.VAR = VAR;
    }

    public String toString(int numberOfSpaces) {
        return "VarDot: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
