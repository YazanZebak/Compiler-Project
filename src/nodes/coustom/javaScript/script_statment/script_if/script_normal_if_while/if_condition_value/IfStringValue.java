package nodes.coustom.javaScript.script_statment.script_if.script_normal_if_while.if_condition_value;

import AST.ASTVisitor;
import nodes.Node;

public class IfStringValue extends Node {
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
