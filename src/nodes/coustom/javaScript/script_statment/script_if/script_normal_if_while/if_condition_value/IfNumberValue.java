package nodes.coustom.javaScript.script_statment.script_if.script_normal_if_while.if_condition_value;

import AST.ASTVisitor;
import nodes.Node;

public class IfNumberValue extends Node {
    int NUMBER_FOR;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public int getNUMBER_FOR() {
        return NUMBER_FOR;
    }

    public void setNUMBER_FOR(int NUMBER_FOR) {
        this.NUMBER_FOR = NUMBER_FOR;
    }
}
