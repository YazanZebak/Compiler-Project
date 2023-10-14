package nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_value_number;

import AST.ASTVisitor;
import nodes.Node;

public class ScriptValueNumber extends Node {
    int SCRIPT_NUMBER;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public int getSCRIPT_NUMBER() {
        return SCRIPT_NUMBER;
    }

    public void setSCRIPT_NUMBER(int SCRIPT_NUMBER) {
        this.SCRIPT_NUMBER = SCRIPT_NUMBER;
    }
}
