package nodes.coustom.injectedHtml.expression.expression_if;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_hide.Not;
import nodes.coustom.injectedHtml.expression.expression_show.function_show.SignNumber;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExprIfWithVarDotVarSign extends Node {
    Not not;
    String VAR;
    SignNumber signNumber;
    VarAfterIf varAfterIf;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        varAfterIf.accept(astVisitor);
        if (not != null)
            not.accept(astVisitor);
        if (signNumber != null)
            signNumber.accept(astVisitor);
    }

    public Not getNot() {
        return not;
    }

    public void setNot(Not not) {
        this.not = not;
    }

    public String getVAR() {
        return VAR;
    }

    public void setVAR(String VAR) {
        this.VAR = VAR;
    }

    public SignNumber getSignNumber() {
        return signNumber;
    }

    public void setSignNumber(SignNumber signNumber) {
        this.signNumber = signNumber;
    }

    public VarAfterIf getVarAfterIf() {
        return varAfterIf;
    }

    public void setVarAfterIf(VarAfterIf varAfterIf) {
        this.varAfterIf = varAfterIf;
    }

    public String toString(int numberOfSpaces) {
        if (not != null) {
            if (signNumber != null) {
                return "ExprIfWithVarDotVarSign: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "not: " + not.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        signNumber.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        varAfterIf.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            } else {
                return "ExprIfWithVarDotVarSign: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "not: " + not.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        varAfterIf.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            }
        } else {
            if (signNumber != null) {
                return "ExprIfWithVarDotVarSign: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        signNumber.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        varAfterIf.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            } else {
                return "ExprIfWithVarDotVarSign: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        varAfterIf.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            }
        }
    }
}
