package nodes.coustom.javaScript.script_statment.script_if;

import AST.ASTVisitor;
import nodes.Node;

public class RightBracket extends Node {
    String SCRIPT_PAR_BRACKET_NOT_OPEN_CONDITION;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getSCRIPT_PAR_BRACKET_NOT_OPEN_CONDITION() {
        return SCRIPT_PAR_BRACKET_NOT_OPEN_CONDITION;
    }

    public void setSCRIPT_PAR_BRACKET_NOT_OPEN_CONDITION(String SCRIPT_PAR_BRACKET_NOT_OPEN_CONDITION) {
        this.SCRIPT_PAR_BRACKET_NOT_OPEN_CONDITION = SCRIPT_PAR_BRACKET_NOT_OPEN_CONDITION;
    }
}
