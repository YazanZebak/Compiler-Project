package nodes.coustom.javaScript.script_statment.script_var;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_identifier.ScriptIdentifier;
import nodes.coustom.javaScript.script_statment.script_var.script_value.ScriptValue;

public class ScriptVar extends Node {
    ScriptIdentifier scriptIdentifier;
    ScriptValue scriptValue;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        scriptIdentifier.accept(astVisitor);
        if(scriptValue != null)
            scriptValue.accept(astVisitor);
    }

    public ScriptIdentifier getScriptIdentifier() {
        return scriptIdentifier;
    }

    public void setScriptIdentifier(ScriptIdentifier scriptIdentifier) {
        this.scriptIdentifier = scriptIdentifier;
    }

    public ScriptValue getScriptValue() {
        return scriptValue;
    }

    public void setScriptValue(ScriptValue scriptValue) {
        this.scriptValue = scriptValue;
    }
}
