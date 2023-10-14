package nodes.coustom.javaScript.script_statment.script_function.script_function_par;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class FuncParameters extends Node {
    String PARAMETER;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getPARAMETER() {
        return PARAMETER;
    }

    public void setPARAMETER(String PARAMETER) {
        this.PARAMETER = PARAMETER;
    }


    public String toString(int numberOfSpaces) {
        return "FuncParameters: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "PARAMETER: " + PARAMETER + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
