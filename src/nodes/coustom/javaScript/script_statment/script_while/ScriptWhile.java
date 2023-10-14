package nodes.coustom.javaScript.script_statment.script_while;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.javaScript.script_statment.script_if.script_normal_if_while.ScriptNormalIfWhile;
import nodes.coustom.javaScript.script_statment.script_if.script_not_if_while.ScriptNotIfWhile;

public class ScriptWhile extends Node {
    ScriptNormalIfWhile scriptNormalIfWhile;
    ScriptNotIfWhile scriptNotIfWhile;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (scriptNormalIfWhile != null)
            scriptNormalIfWhile.accept(astVisitor);
        if (scriptNotIfWhile != null)
            scriptNotIfWhile.accept(astVisitor);
    }

    public ScriptNormalIfWhile getScriptNormalIfWhile() {
        return scriptNormalIfWhile;
    }

    public void setScriptNormalIfWhile(ScriptNormalIfWhile scriptNormalIfWhile) {
        this.scriptNormalIfWhile = scriptNormalIfWhile;
    }

    public ScriptNotIfWhile getScriptNotIfWhile() {
        return scriptNotIfWhile;
    }

    public void setScriptNotIfWhile(ScriptNotIfWhile scriptNotIfWhile) {
        this.scriptNotIfWhile = scriptNotIfWhile;
    }

}
