package nodes.coustom.injectedHtml.expression.expression_for.varAfter.object;

import AST.ASTVisitor;
import nodes.Node;

public class VarQuote extends Node {
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
}
