package nodes.coustom.injectedHtml.mustache_expr.filter_mustache.properties;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class FilterKind extends Node {
    String FILTER_KIND;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getFILTER_KIND() {
        return FILTER_KIND;
    }

    public void setFILTER_KIND(String FILTER_KIND) {
        this.FILTER_KIND = FILTER_KIND;
    }

    public String toString(int numberOfSpaces) {
        return "FilterKind: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "FILTER_KIND: " + FILTER_KIND + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
