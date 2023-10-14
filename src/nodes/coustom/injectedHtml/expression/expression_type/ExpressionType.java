package nodes.coustom.injectedHtml.expression.expression_type;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExpressionType extends Node {
    String TYPE;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String toString(int numberOfSpaces) {
        return "ExpressionType: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "TYPE: " + TYPE + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
