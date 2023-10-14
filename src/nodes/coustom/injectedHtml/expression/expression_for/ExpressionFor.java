package nodes.coustom.injectedHtml.expression.expression_for;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_for.varAfter.VarAfter;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExpressionFor extends Node {
    String VAR;
    VarAfter varAfter;
    ExprForWithArr exprForWithArr;
    ExprForWithIndex exprForWithIndex;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (varAfter != null)
            varAfter.accept(astVisitor);
        if (exprForWithArr != null)
            exprForWithArr.accept(astVisitor);
        if (exprForWithIndex != null)
            exprForWithIndex.accept(astVisitor);
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

    public ExprForWithArr getExprForWithArr() {
        return exprForWithArr;
    }

    public void setExprForWithArr(ExprForWithArr exprForWithArr) {
        this.exprForWithArr = exprForWithArr;
    }

    public ExprForWithIndex getExprForWithIndex() {
        return exprForWithIndex;
    }

    public void setExprForWithIndex(ExprForWithIndex exprForWithIndex) {
        this.exprForWithIndex = exprForWithIndex;
    }

    public String toString(int numberOfSpaces) {
        if (exprForWithArr != null) {
            return "ExpressionFor: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    exprForWithArr.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (exprForWithIndex != null) {
            return "ExpressionFor: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    exprForWithIndex.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "ExpressionFor: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    varAfter.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
    }
}
