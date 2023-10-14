package nodes.coustom.javaScript.script_statment.script_for;

import AST.ASTVisitor;
import nodes.Node;

public class ScriptIdentifierForAfterSemicol extends Node {
    ScriptIdentifierFor scriptIdentifierFor;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        scriptIdentifierFor.accept(astVisitor);
    }

    public ScriptIdentifierFor getScriptIdentifierFor() {
        return scriptIdentifierFor;
    }

    public void setScriptIdentifierFor(ScriptIdentifierFor scriptIdentifierFor) {
        this.scriptIdentifierFor = scriptIdentifierFor;
    }
}
