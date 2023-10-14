package nodes.coustom.injectedHtml.expression.function_cp;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class FunctionCp extends Node {
    String FUNCTION;
    String var;
    FuncParametersCP funcParametersCP;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(funcParametersCP != null)
            funcParametersCP.accept(astVisitor);
    }

    public String getFUNCTION() {
        return FUNCTION;
    }

    public void setFUNCTION(String FUNCTION) {
        this.FUNCTION = FUNCTION;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public FuncParametersCP getFuncParameters() {
        return funcParametersCP;
    }

    public void setFuncParameters(FuncParametersCP funcParametersCP) {
        this.funcParametersCP = funcParametersCP;
    }

    public String toString(int numberOfSpaces) {
        if (funcParametersCP != null) {
            return "FunctionCp: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "var: " + var + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    funcParametersCP.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "FunctionCp: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "FUNCTION: " + FUNCTION + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
    }
}
