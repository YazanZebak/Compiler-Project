package nodes.coustom.injectedHtml.mustache_expr.varDotVar.properties;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.mustache_expr.filter_mustache.properties.FirstVar;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class IterationMustacheExpr extends Node {
    FirstVar firstVar;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        firstVar.accept(astVisitor);
    }

    public FirstVar getFirstVar() {
        return firstVar;
    }

    public void setFirstVar(FirstVar firstVar) {
        this.firstVar = firstVar;
    }

    public String toString(int numberOfSpaces) {
        return "IterationMustacheExpr: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                firstVar.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }

}
