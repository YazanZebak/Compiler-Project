package nodes.coustom.javaScript;

import AST.ASTVisitor;
import nodes.Node;

public class WhiteSpaces extends Node {
    String SCRIPT_WHITESPACE;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getSCRIPT_WHITESPACE() {
        return SCRIPT_WHITESPACE;
    }

    public void setSCRIPT_WHITESPACE(String SCRIPT_WHITESPACE) {
        this.SCRIPT_WHITESPACE = SCRIPT_WHITESPACE;
    }
}
