package nodes.coustom.injectedHtml.expression.expression_for;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_for.varAfter.VarAfter;
import nodes.coustom.injectedHtml.expression.expression_for.varAfter.VarAftercomma;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExprForWithArr extends Node {
    String VAR;
    VarAftercomma varAftercomma;
    String IN;
    VarAfter varAfter;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        varAfter.accept(astVisitor);
        varAftercomma.accept(astVisitor);

    }

    public String getVAR() {
        return VAR;
    }

    public void setVAR(String VAR) {
        this.VAR = VAR;
    }

    public VarAftercomma getVarAftercomma() {
        return varAftercomma;
    }

    public void setVarAftercomma(VarAftercomma varAftercomma) {
        this.varAftercomma = varAftercomma;
    }

    public String getIN() {
        return IN;
    }

    public void setIN(String IN) {
        this.IN = IN;
    }

    public VarAfter getVarAfter() {
        return varAfter;
    }

    public void setVarAfter(VarAfter varAfter) {
        this.varAfter = varAfter;
    }

    public String toString(int numberOfSpaces) {
        return "ExprForWithArr: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                varAftercomma.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "IN: " + IN + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                varAfter.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
