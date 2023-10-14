package nodes.coustom.javaScript;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class Script extends Node {
    String SCRIPT_OPEN;
    ScriptBody scriptBody;
    String SCRIPT_CLOSE;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        scriptBody.accept(astVisitor);
    }

    public String getSCRIPT_OPEN() {
        return SCRIPT_OPEN;
    }

    public void setSCRIPT_OPEN(String SCRIPT_OPEN) {
        this.SCRIPT_OPEN = SCRIPT_OPEN;
    }

    public ScriptBody getScriptBody() {
        return scriptBody;
    }

    public void setScriptBody(ScriptBody scriptBody) {
        this.scriptBody = scriptBody;
    }

    public String getSCRIPT_CLOSE() {
        return SCRIPT_CLOSE;
    }

    public void setSCRIPT_CLOSE(String SCRIPT_CLOSE) {
        this.SCRIPT_CLOSE = SCRIPT_CLOSE;
    }

    public String toString(int numberOfSpaces) {
        return "Script: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                 scriptBody.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
