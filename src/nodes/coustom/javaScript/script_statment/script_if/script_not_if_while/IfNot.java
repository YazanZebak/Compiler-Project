package nodes.coustom.javaScript.script_statment.script_if.script_not_if_while;

import AST.ASTVisitor;
import nodes.Node;

public class IfNot extends Node {
    String IF_NOT;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getIF_NOT() {
        return IF_NOT;
    }

    public void setIF_NOT(String IF_NOT) {
        this.IF_NOT = IF_NOT;
    }
}
