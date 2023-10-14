package nodes.coustom.javaScript.script_statment.script_for;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.javaScript.ScriptListStatement;
import nodes.coustom.javaScript.script_statment.script_for.x_variable_for.NumberFor;
import nodes.coustom.javaScript.script_statment.script_for.x_variable_for.XVariableFor;

public class ScriptFor extends Node {
    ScriptIdentifierFor scriptIdentifierFor;
    NumberFor numberFor;
    ScriptIdentifierForAfterSemicol scriptIdentifierForAfterSemicol;
    XSignFor xSignFor;
    XVariableFor xVariableFor;
    ScriptIdentifierForBeforeSings scriptIdentifierForBeforeSings;
    SignFor signFor;
    ScriptListStatement scriptListStatement;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        scriptIdentifierFor.accept(astVisitor);
        numberFor.accept(astVisitor);
        scriptIdentifierForAfterSemicol.accept(astVisitor);
        xSignFor.accept(astVisitor);
        xVariableFor.accept(astVisitor);
        scriptIdentifierForBeforeSings.accept(astVisitor);
        if (signFor != null)
            signFor.accept(astVisitor);
        scriptListStatement.accept(astVisitor);
    }

    public ScriptIdentifierFor getScriptIdentifierFor() {
        return scriptIdentifierFor;
    }

    public void setScriptIdentifierFor(ScriptIdentifierFor scriptIdentifierFor) {
        this.scriptIdentifierFor = scriptIdentifierFor;
    }

    public NumberFor getNumberFor() {
        return numberFor;
    }

    public void setNumberFor(NumberFor numberFor) {
        this.numberFor = numberFor;
    }

    public ScriptIdentifierForAfterSemicol getScriptIdentifierForAfterSemicol() {
        return scriptIdentifierForAfterSemicol;
    }

    public void setScriptIdentifierForAfterSemicol(ScriptIdentifierForAfterSemicol scriptIdentifierForAfterSemicol) {
        this.scriptIdentifierForAfterSemicol = scriptIdentifierForAfterSemicol;
    }

    public XSignFor getxSignFor() {
        return xSignFor;
    }

    public void setxSignFor(XSignFor xSignFor) {
        this.xSignFor = xSignFor;
    }

    public XVariableFor getxVariableFor() {
        return xVariableFor;
    }

    public void setxVariableFor(XVariableFor xVariableFor) {
        this.xVariableFor = xVariableFor;
    }

    public ScriptIdentifierForBeforeSings getScriptIdentifierForBeforeSings() {
        return scriptIdentifierForBeforeSings;
    }

    public void setScriptIdentifierForBeforeSings(ScriptIdentifierForBeforeSings scriptIdentifierForBeforeSings) {
        this.scriptIdentifierForBeforeSings = scriptIdentifierForBeforeSings;
    }

    public SignFor getSignFor() {
        return signFor;
    }

    public void setSignFor(SignFor signFor) {
        this.signFor = signFor;
    }

    public ScriptListStatement getScriptListStatement() {
        return scriptListStatement;
    }

    public void setScriptListStatement(ScriptListStatement scriptListStatement) {
        this.scriptListStatement = scriptListStatement;
    }
}
