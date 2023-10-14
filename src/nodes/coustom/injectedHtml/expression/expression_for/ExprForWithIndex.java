package nodes.coustom.injectedHtml.expression.expression_for;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_for.varAfter.VarAfter;
import nodes.coustom.injectedHtml.expression.expression_for.varAfter.VarBeforeIndex;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExprForWithIndex extends Node {
    String VAR;
    VarAfter varAfter;
    VarBeforeIndex varBeforeIndex;
    String INDEX;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        varAfter.accept(astVisitor);
        varBeforeIndex.accept(astVisitor);
    }

    public String getVAR() {
        return VAR;
    }

    public void setVAR(String VAR) {
        this.VAR = VAR;
    }

    public VarAfter getVarAfter() {
        return varAfter;
    }

    public void setVarAfter(VarAfter varAfter) {
        this.varAfter = varAfter;
    }

    public VarBeforeIndex getVarBeforeIndex() {
        return varBeforeIndex;
    }

    public void setVarBeforeIndex(VarBeforeIndex varBeforeIndex) {
        this.varBeforeIndex = varBeforeIndex;
    }

    public String getINDEX() {
        return INDEX;
    }

    public void setINDEX(String INDEX) {
        this.INDEX = INDEX;
    }

    public String toString(int numberOfSpaces) {
        return "ExprForWithIndex: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                varAfter.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                varBeforeIndex.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "INDEX: " + INDEX + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
