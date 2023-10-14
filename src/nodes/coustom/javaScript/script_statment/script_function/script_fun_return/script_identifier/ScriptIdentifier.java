package nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_identifier;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ScriptIdentifier extends Node {
    String SCRIPT_IDENTIFIER;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getSCRIPT_IDENTIFIER() {
        return SCRIPT_IDENTIFIER;
    }

    public void setSCRIPT_IDENTIFIER(String SCRIPT_IDENTIFIER) {
        this.SCRIPT_IDENTIFIER = SCRIPT_IDENTIFIER;
    }

    public String toString(int numberOfSpaces) {
        return "ScriptIdentifier: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "SCRIPT_IDENTIFIER: " + SCRIPT_IDENTIFIER  + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
