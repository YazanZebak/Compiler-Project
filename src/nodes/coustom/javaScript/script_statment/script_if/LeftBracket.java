package nodes.coustom.javaScript.script_statment.script_if;

import AST.ASTVisitor;
import nodes.Node;

public class LeftBracket extends Node {
    String SCRIPT_PAR_BRACKET_CLOSE;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getSCRIPT_PAR_BRACKET_CLOSE() {
        return SCRIPT_PAR_BRACKET_CLOSE;
    }

    public void setSCRIPT_PAR_BRACKET_CLOSE(String SCRIPT_PAR_BRACKET_CLOSE) {
        this.SCRIPT_PAR_BRACKET_CLOSE = SCRIPT_PAR_BRACKET_CLOSE;
    }
}
