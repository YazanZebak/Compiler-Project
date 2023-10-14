package nodes.coustom.injectedHtml.expression.expression_for.varAfter.object;

import AST.ASTVisitor;
import nodes.Node;

public class NumberValue extends Node {
    int NUMBER;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public int getNUMBER() {
        return NUMBER;
    }

    public void setNUMBER(int NUMBER) {
        this.NUMBER = NUMBER;
    }
}
