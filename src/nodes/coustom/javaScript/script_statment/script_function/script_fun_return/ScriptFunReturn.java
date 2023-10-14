package nodes.coustom.javaScript.script_statment.script_function.script_fun_return;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_empty_string.ScriptEmptyString;
import nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_identifier.ScriptIdentifier;
import nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_value_number.ScriptValueNumber;
import nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_value_string.ScriptValueString;

public class ScriptFunReturn extends Node {
    ScriptValueString scriptValueString;
    ScriptValueNumber scriptValueNumber;
    ScriptIdentifier scriptIdentifier;
    ScriptEmptyString scriptEmptyString;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (scriptValueString != null)
            scriptValueString.accept(astVisitor);
        if (scriptValueNumber != null)
            scriptValueNumber.accept(astVisitor);
        if (scriptIdentifier != null)
            scriptIdentifier.accept(astVisitor);
        if (scriptEmptyString != null)
            scriptEmptyString.accept(astVisitor);
    }

    public ScriptValueString getScriptValueString() {
        return scriptValueString;
    }

    public void setScriptValueString(ScriptValueString scriptValueString) {
        this.scriptValueString = scriptValueString;
    }

    public ScriptValueNumber getScriptValueNumber() {
        return scriptValueNumber;
    }

    public void setScriptValueNumber(ScriptValueNumber scriptValueNumber) {
        this.scriptValueNumber = scriptValueNumber;
    }

    public ScriptIdentifier getScriptIdentifier() {
        return scriptIdentifier;
    }

    public void setScriptIdentifier(ScriptIdentifier scriptIdentifier) {
        this.scriptIdentifier = scriptIdentifier;
    }

    public ScriptEmptyString getScriptEmptyString() {
        return scriptEmptyString;
    }

    public void setScriptEmptyString(ScriptEmptyString scriptEmptyString) {
        this.scriptEmptyString = scriptEmptyString;
    }

    public String toString(int numberOfSpaces) {
        return "ScriptFunReturn : { ." + ".. }";
    }
}
