package nodes.coustom.javaScript.script_statment.script_for;

import AST.ASTVisitor;
import nodes.Node;

public class ScriptIdentifierForBeforeSings extends Node {
    ScriptIdentifierFor scriptIdentifierFor;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public ScriptIdentifierFor getScriptIdentifierFor() {
        return scriptIdentifierFor;
    }

    public void setScriptIdentifierFor(ScriptIdentifierFor scriptIdentifierFor) {
        this.scriptIdentifierFor = scriptIdentifierFor;
    }
}
