package nodes.coustom.injectedHtml.expression.expression_hide;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class VarAfterHide extends Node {
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
        return "VarAfterHide: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
