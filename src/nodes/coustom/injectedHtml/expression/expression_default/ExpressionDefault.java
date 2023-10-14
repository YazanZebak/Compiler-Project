package nodes.coustom.injectedHtml.expression.expression_default;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExpressionDefault extends Node {
    String TAG_EQUALS;
    String var;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getTAG_EQUALS() {
        return TAG_EQUALS;
    }

    public void setTAG_EQUALS(String TAG_EQUALS) {
        this.TAG_EQUALS = TAG_EQUALS;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public String toString(int numberOfSpaces) {
        return "ExpressionDefault: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "var: " + var + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
