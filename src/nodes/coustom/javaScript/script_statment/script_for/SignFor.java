package nodes.coustom.javaScript.script_statment.script_for;

import AST.ASTVisitor;
import nodes.Node;

public class SignFor extends Node {
    String SIGN_FOR;
    String SIGN_FOR_STEPS;
    int NUMBER_FOR;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getSIGN_FOR() {
        return SIGN_FOR;
    }

    public void setSIGN_FOR(String SIGN_FOR) {
        this.SIGN_FOR = SIGN_FOR;
    }

    public String getSIGN_FOR_STEPS() {
        return SIGN_FOR_STEPS;
    }

    public void setSIGN_FOR_STEPS(String SIGN_FOR_STEPS) {
        this.SIGN_FOR_STEPS = SIGN_FOR_STEPS;
    }

    public int getNUMBER_FOR() {
        return NUMBER_FOR;
    }

    public void setNUMBER_FOR(int NUMBER_FOR) {
        this.NUMBER_FOR = NUMBER_FOR;
    }
}
