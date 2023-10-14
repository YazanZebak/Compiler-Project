package nodes.coustom.javaScript.script_statment.script_for.x_variable_for;

import AST.ASTVisitor;
import nodes.Node;

public class StringFor extends Node {
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
}
