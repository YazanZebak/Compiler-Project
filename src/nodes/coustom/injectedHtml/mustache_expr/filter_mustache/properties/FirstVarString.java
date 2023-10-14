package nodes.coustom.injectedHtml.mustache_expr.filter_mustache.properties;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class FirstVarString extends Node {
    String VAR_BRACKET;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getVAR_BRACKET() {
        return VAR_BRACKET;
    }

    public void setVAR_BRACKET(String VAR_BRACKET) {
        this.VAR_BRACKET = VAR_BRACKET;
    }

    public String toString(int numberOfSpaces) {
        return "FirstVarString: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "VAR_BRACKET: " + VAR_BRACKET + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
