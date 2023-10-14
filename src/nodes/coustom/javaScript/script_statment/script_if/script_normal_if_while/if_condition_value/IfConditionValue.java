package nodes.coustom.javaScript.script_statment.script_if.script_normal_if_while.if_condition_value;

import AST.ASTVisitor;
import nodes.Node;

public class IfConditionValue extends Node {
    IfNumberValue ifNumberValue;
    IfStringValue ifStringValue;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (ifNumberValue != null)
            ifNumberValue.accept(astVisitor);
        if (ifStringValue != null)
            ifStringValue.accept(astVisitor);
    }

    public IfNumberValue getIfNumberValue() {
        return ifNumberValue;
    }

    public void setIfNumberValue(IfNumberValue ifNumberValue) {
        this.ifNumberValue = ifNumberValue;
    }

    public IfStringValue getIfStringValue() {
        return ifStringValue;
    }

    public void setIfStringValue(IfStringValue ifStringValue) {
        this.ifStringValue = ifStringValue;
    }
}
