package nodes.coustom.javaScript.script_statment.script_obj.script_obj_value;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_empty_string.ScriptEmptyString;
import nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_identifier.ScriptIdentifier;
import nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_value_number.ScriptValueNumber;
import nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_value_string.ScriptValueString;
import nodes.coustom.javaScript.script_statment.script_var.script_value.script_value_array.ScriptValueArray;

public class ScriptObjElement extends Node {
    ScriptIdentifier scriptIdentifier;

    ScriptValueNumber scriptValueNumber;
    ScriptValueString scriptValueString;
    ScriptValueArray scriptValueArray;
    ScriptEmptyString scriptEmptyString;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        scriptIdentifier.accept(astVisitor);
        if (scriptValueString != null)
            scriptValueString.accept(astVisitor);
        if (scriptValueNumber != null)
            scriptValueNumber.accept(astVisitor);
        if (scriptValueArray != null)
            scriptValueArray.accept(astVisitor);
        if (scriptEmptyString != null)
            scriptEmptyString.accept(astVisitor);
    }

    public ScriptIdentifier getScriptIdentifier() {
        return scriptIdentifier;
    }

    public void setScriptIdentifier(ScriptIdentifier scriptIdentifier) {
        this.scriptIdentifier = scriptIdentifier;
    }

    public ScriptValueNumber getScriptValueNumber() {
        return scriptValueNumber;
    }

    public void setScriptValueNumber(ScriptValueNumber scriptValueNumber) {
        this.scriptValueNumber = scriptValueNumber;
    }

    public ScriptValueString getScriptValueString() {
        return scriptValueString;
    }

    public void setScriptValueString(ScriptValueString scriptValueString) {
        this.scriptValueString = scriptValueString;
    }

    public ScriptValueArray getScriptValueArray() {
        return scriptValueArray;
    }

    public void setScriptValueArray(ScriptValueArray scriptValueArray) {
        this.scriptValueArray = scriptValueArray;
    }

    public ScriptEmptyString getScriptEmptyString() {
        return scriptEmptyString;
    }

    public void setScriptEmptyString(ScriptEmptyString scriptEmptyString) {
        this.scriptEmptyString = scriptEmptyString;
    }
}
