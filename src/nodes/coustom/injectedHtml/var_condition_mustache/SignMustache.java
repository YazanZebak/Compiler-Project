package nodes.coustom.injectedHtml.var_condition_mustache;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class SignMustache extends Node {
    String SIGN_MUSTACHE;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getSIGN_MUSTACHE() {
        return SIGN_MUSTACHE;
    }

    public void setSIGN_MUSTACHE(String SIGN_MUSTACHE) {
        this.SIGN_MUSTACHE = SIGN_MUSTACHE;
    }


    public String toString(int numberOfSpaces) {
        return "SignMustache: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                "SIGN_MUSTACHE: " + SIGN_MUSTACHE + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
