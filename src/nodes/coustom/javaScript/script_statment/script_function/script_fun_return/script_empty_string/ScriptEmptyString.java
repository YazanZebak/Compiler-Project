package nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_empty_string;

import AST.ASTVisitor;
import nodes.Node;

public class ScriptEmptyString extends Node {
    String SCRIPT_QUOTE_OPEN;
    String SCRIPT_QUOTE_CLOSE;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getSCRIPT_QUOTE_OPEN() {
        return SCRIPT_QUOTE_OPEN;
    }

    public void setSCRIPT_QUOTE_OPEN(String SCRIPT_QUOTE_OPEN) {
        this.SCRIPT_QUOTE_OPEN = SCRIPT_QUOTE_OPEN;
    }

    public String getSCRIPT_QUOTE_CLOSE() {
        return SCRIPT_QUOTE_CLOSE;
    }

    public void setSCRIPT_QUOTE_CLOSE(String SCRIPT_QUOTE_CLOSE) {
        this.SCRIPT_QUOTE_CLOSE = SCRIPT_QUOTE_CLOSE;
    }
}
