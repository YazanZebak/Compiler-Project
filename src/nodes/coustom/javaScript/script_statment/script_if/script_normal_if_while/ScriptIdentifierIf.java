package nodes.coustom.javaScript.script_statment.script_if.script_normal_if_while;

import AST.ASTVisitor;
import nodes.Node;

public class ScriptIdentifierIf extends Node {
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
