package nodes.coustom.javaScript.script_statment.script_var.script_value.script_value_array.array_element;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_value_number.ScriptValueNumber;
import nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_value_string.ScriptValueString;

public class ArrayElement extends Node {
    ScriptValueNumber scriptValueNumber;
    ScriptValueString scriptValueString;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (scriptValueNumber != null)
            scriptValueNumber.accept(astVisitor);
        if (scriptValueString != null)
            scriptValueString.accept(astVisitor);
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
}
