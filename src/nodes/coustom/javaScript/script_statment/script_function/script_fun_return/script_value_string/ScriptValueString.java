package nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_value_string;

import AST.ASTVisitor;
import nodes.Node;

public class ScriptValueString extends Node {
    Value value;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
