package nodes.coustom.javaScript.script_statment.script_if.script_normal_if_while;

import AST.ASTVisitor;
import nodes.Node;

public class IfSign extends Node {
    String X_SIGN;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getX_SIGN() {
        return X_SIGN;
    }

    public void setX_SIGN(String x_SIGN) {
        X_SIGN = x_SIGN;
    }
}
