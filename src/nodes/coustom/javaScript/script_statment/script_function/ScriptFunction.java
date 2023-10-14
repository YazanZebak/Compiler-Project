package nodes.coustom.javaScript.script_statment.script_function;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;
import nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_identifier.ScriptIdentifier;
import nodes.coustom.javaScript.script_statment.script_function.script_function_par.ScriptFunctionPar;

public class ScriptFunction extends Node {
    ScriptIdentifier scriptIdentifier;
    String SCRIP_K_FUNCTION;
    ScriptFunctionPar scriptFunctionPar;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        scriptIdentifier.accept(astVisitor);
        scriptFunctionPar.accept(astVisitor);
    }

    public ScriptIdentifier getScriptIdentifier() {
        return scriptIdentifier;
    }

    public void setScriptIdentifier(ScriptIdentifier scriptIdentifier) {
        this.scriptIdentifier = scriptIdentifier;
    }

    public String getSCRIP_K_FUNCTION() {
        return SCRIP_K_FUNCTION;
    }

    public void setSCRIP_K_FUNCTION(String SCRIP_K_FUNCTION) {
        this.SCRIP_K_FUNCTION = SCRIP_K_FUNCTION;
    }

    public ScriptFunctionPar getScriptFunctionPar() {
        return scriptFunctionPar;
    }

    public void setScriptFunctionPar(ScriptFunctionPar scriptFunctionPar) {
        this.scriptFunctionPar = scriptFunctionPar;
    }

    public String toString(int numberOfSpaces) {
        return "ScriptFunction: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                scriptIdentifier.toString(numberOfSpaces + 1) +"\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                scriptFunctionPar.toString(numberOfSpaces + 1) +"\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
