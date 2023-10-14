package nodes.coustom.injectedHtml.mustache_expr.operatot_var.properties;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class Operator extends Node {
    String OPERATOR;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getOPERATOR() {
        return OPERATOR;
    }

    public void setOPERATOR(String OPERATOR) {
        this.OPERATOR = OPERATOR;
    }

    public String toString(int numberOfSpaces) {
        return "Operator: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "OPERATOR: "+OPERATOR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
