package nodes.coustom.injectedHtml.expression.expression_click;

import nodes.Node;
import nodes.coustom.injectedHtml.expression.function_cp.FunctionCp;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExpressionClick extends Node {
    /*String FUNCTION;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getFUNCTION() {
        return FUNCTION;
    }

    public void setFUNCTION(String FUNCTION) {
        this.FUNCTION = FUNCTION;
    }

    public String toString(int numberOfSpaces) {
        return "ExpressionClick: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "FUNCTION: " + FUNCTION + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }*/

    FunctionCp functionCp;

    public FunctionCp getFunctionCp() {
        return functionCp;
    }

    public void setFunctionCp(FunctionCp functionCp) {
        this.functionCp = functionCp;
    }

    public String toString(int numberOfSpaces) {
        return "ExpressionClick: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                functionCp.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }

}
