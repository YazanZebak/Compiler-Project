package nodes.coustom.javaScript.script_statment.script_function.FuncBody;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;
import nodes.coustom.javaScript.ScriptListStatement;

public class FuncBody extends Node {
    ScriptListStatement scriptListStatement;
    ReturnFunctionBody returnFunctionBody;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        scriptListStatement.accept(astVisitor);
        if(returnFunctionBody != null)
            returnFunctionBody.accept(astVisitor);
    }

    public ScriptListStatement getScriptListStatement() {
        return scriptListStatement;
    }

    public void setScriptListStatement(ScriptListStatement scriptListStatement) {
        this.scriptListStatement = scriptListStatement;
    }

    public ReturnFunctionBody getReturnFunctionBody() {
        return returnFunctionBody;
    }

    public void setReturnFunctionBody(ReturnFunctionBody returnFunctionBody) {
        this.returnFunctionBody = returnFunctionBody;
    }

    public String toString(int numberOfSpaces) {
        if(returnFunctionBody != null) {
            return "FuncBody: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    scriptListStatement.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    returnFunctionBody.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else{
            return "FuncBody: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    scriptListStatement.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
    }
}
