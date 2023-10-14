package nodes.coustom.injectedHtml.expression.expression_hide;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExprHideWithNotVarDotVar extends Node {
    Not not;
    VarAfterHide varAfterHide;
    String VAR;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        varAfterHide.accept(astVisitor);
        if (not != null)
            not.accept(astVisitor);

    }

    public Not getNot() {
        return not;
    }

    public void setNot(Not not) {
        this.not = not;
    }

    public VarAfterHide getVarAfterHide() {
        return varAfterHide;
    }

    public void setVarAfterHide(VarAfterHide varAfterHide) {
        this.varAfterHide = varAfterHide;
    }

    public String getVAR() {
        return VAR;
    }

    public void setVAR(String VAR) {
        this.VAR = VAR;
    }

    public String toString(int numberOfSpaces) {
        if (not != null) {
            return "ExprHideWithNotVarDotVar: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "not: " + not.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    varAfterHide.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "ExprHideWithNotVarDotVar: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    varAfterHide.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
    }
}
