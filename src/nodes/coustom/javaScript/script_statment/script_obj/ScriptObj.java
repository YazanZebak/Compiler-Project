package nodes.coustom.javaScript.script_statment.script_obj;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_identifier.ScriptIdentifier;
import nodes.coustom.javaScript.script_statment.script_obj.script_obj_value.ScriptObjValue;

public class ScriptObj extends Node {
    ScriptIdentifier scriptIdentifier;
    ScriptObjValue scriptObjValue;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        scriptIdentifier.accept(astVisitor);
        scriptObjValue.accept(astVisitor);

    }

    public ScriptIdentifier getScriptIdentifier() {
        return scriptIdentifier;
    }

    public void setScriptIdentifier(ScriptIdentifier scriptIdentifier) {
        this.scriptIdentifier = scriptIdentifier;
    }

    public ScriptObjValue getScriptObjValue() {
        return scriptObjValue;
    }

    public void setScriptObjValue(ScriptObjValue scriptObjValue) {
        this.scriptObjValue = scriptObjValue;
    }
}
