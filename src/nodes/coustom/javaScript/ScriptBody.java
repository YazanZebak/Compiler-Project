package nodes.coustom.javaScript;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ScriptBody extends Node {
    ScriptListStatement scriptListStatement;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        scriptListStatement.accept(astVisitor);
    }

    public ScriptListStatement getScriptListStatement() {
        return scriptListStatement;
    }

    public void setScriptListStatement(ScriptListStatement scriptListStatement) {
        this.scriptListStatement = scriptListStatement;
    }

    public String toString(int numberOfSpaces) {
        return "ScriptBody: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                scriptListStatement.toString(numberOfSpaces + 1) +"\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
