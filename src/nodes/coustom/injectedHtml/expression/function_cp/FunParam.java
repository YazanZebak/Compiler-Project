package nodes.coustom.injectedHtml.expression.function_cp;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class FunParam extends Node {
    String VAR_PARAMETER;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getVAR_PARAMETER() {
        return VAR_PARAMETER;
    }

    public void setVAR_PARAMETER(String VAR_PARAMETER) {
        this.VAR_PARAMETER = VAR_PARAMETER;
    }

    public String toString(int numberOfSpaces) {
        return "FunParam: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "VAR_PARAMETER: " + VAR_PARAMETER + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
