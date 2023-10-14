package nodes.coustom.injectedHtml.expression.expression_show.function_show;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.function_cp.FunctionCp;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class FunctionShow extends Node {
    FunctionCp functionCp;
    SignNumber signNumber;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        functionCp.accept(astVisitor);
        if(signNumber != null)
            signNumber.accept(astVisitor);
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
        if (signNumber != null) {
            return "FunctionShow: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    functionCp.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    signNumber.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "FunctionShow: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    functionCp.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }

    }
}
