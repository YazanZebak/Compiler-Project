package nodes.coustom.injectedHtml.expression.expression_show;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class VarAfterShow extends Node {
    String var;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public String toString(int numberOfSpaces) {
        return "VarAfterShow: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "var: " + var + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
