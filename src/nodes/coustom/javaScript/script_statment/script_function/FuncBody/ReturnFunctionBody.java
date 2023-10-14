package nodes.coustom.javaScript.script_statment.script_function.FuncBody;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;
import nodes.coustom.javaScript.script_statment.LeftWhitespaces;
import nodes.coustom.javaScript.script_statment.RightWhitespaces;
import nodes.coustom.javaScript.script_statment.script_function.script_fun_return.ScriptFunReturn;

public class ReturnFunctionBody extends Node {
    LeftWhitespaces leftWhitespaces;
    ScriptFunReturn scriptFunReturn;
    RightWhitespaces rightWhitespaces;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        scriptFunReturn.accept(astVisitor);
    }

    public LeftWhitespaces getLeftWhitespaces() {
        return leftWhitespaces;
    }

    public void setLeftWhitespaces(LeftWhitespaces leftWhitespaces) {
        this.leftWhitespaces = leftWhitespaces;
    }

    public ScriptFunReturn getScriptFunReturn() {
        return scriptFunReturn;
    }

    public void setScriptFunReturn(ScriptFunReturn scriptFunReturn) {
        this.scriptFunReturn = scriptFunReturn;
    }

    public RightWhitespaces getRightWhitespaces() {
        return rightWhitespaces;
    }

    public void setRightWhitespaces(RightWhitespaces rightWhitespaces) {
        this.rightWhitespaces = rightWhitespaces;
    }

    public String toString(int numberOfSpaces) {
        return "ReturnFunctionBody: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                scriptFunReturn.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
