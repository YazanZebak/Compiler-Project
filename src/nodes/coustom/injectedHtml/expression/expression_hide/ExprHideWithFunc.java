package nodes.coustom.injectedHtml.expression.expression_hide;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_show.function_show.SignNumber;
import nodes.coustom.injectedHtml.expression.function_cp.FunctionCp;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExprHideWithFunc extends Node {
    Not not;
    FunctionCp functionCp;
    SignNumber signNumber;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        functionCp.accept(astVisitor);
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

    public FunctionCp getFunctionCp() {
        return functionCp;
    }

    public void setFunctionCp(FunctionCp functionCp) {
        this.functionCp = functionCp;
    }

    public SignNumber getSignNumber() {
        return signNumber;
    }

    public void setSignNumber(SignNumber signNumber) {
        this.signNumber = signNumber;
    }

    public String toString(int numberOfSpaces) {
        if (not != null) {
            if (signNumber != null) {
                return "ExprHideWithFunc: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "not: " + not.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        functionCp.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        signNumber.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            } else {
                return "ExprHideWithFunc: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "not: " + not.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        functionCp.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            }
        } else {
            if (signNumber != null) {
                return "ExprHideWithFunc: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        functionCp.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        signNumber.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            } else {
                return "ExprHideWithFunc: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        functionCp.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            }
        }
    }
}
