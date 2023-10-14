package nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_value_string;

import AST.ASTVisitor;
import nodes.Node;

public class Value extends Node {
    String SCRIPT_STRING;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getSCRIPT_STRING() {
        return SCRIPT_STRING;
    }

    public void setSCRIPT_STRING(String SCRIPT_STRING) {
        this.SCRIPT_STRING = SCRIPT_STRING;
    }
}
