package nodes.coustom.javaScript.script_statment.script_do_while;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.javaScript.ScriptListStatement;

public class ScriptDoWhile extends Node {
    ScriptListStatement scriptListStatement;
    ScriptWhileHeader scriptWhileHeader;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        scriptListStatement.accept(astVisitor);
        scriptWhileHeader.accept(astVisitor);
    }

    public ScriptListStatement getScriptListStatement() {
        return scriptListStatement;
    }

    public void setScriptListStatement(ScriptListStatement scriptListStatement) {
        this.scriptListStatement = scriptListStatement;
    }

    public ScriptWhileHeader getScriptWhileHeader() {
        return scriptWhileHeader;
    }

    public void setScriptWhileHeader(ScriptWhileHeader scriptWhileHeader) {
        this.scriptWhileHeader = scriptWhileHeader;
    }
}
