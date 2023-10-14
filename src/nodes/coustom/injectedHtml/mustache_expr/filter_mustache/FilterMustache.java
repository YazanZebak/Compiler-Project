package nodes.coustom.injectedHtml.mustache_expr.filter_mustache;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.mustache_expr.filter_mustache.properties.FilterKind;
import nodes.coustom.injectedHtml.mustache_expr.filter_mustache.properties.FirstVar;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class FilterMustache extends Node {
    FirstVar firstVar;
    String PIPE;
    FilterKind filterKind;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        filterKind.accept(astVisitor);
        firstVar.accept(astVisitor);
    }

    public FirstVar getFirstVar() {
        return firstVar;
    }

    public void setFirstVar(FirstVar firstVar) {
        this.firstVar = firstVar;
    }

    public String getPIPE() {
        return PIPE;
    }

    public void setPIPE(String PIPE) {
        this.PIPE = PIPE;
    }

    public FilterKind getFilterKind() {
        return filterKind;
    }

    public void setFilterKind(FilterKind filterKind) {
        this.filterKind = filterKind;
    }

    public String toString(int numberOfSpaces) {
        return "FilterMustache: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                firstVar.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                filterKind.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
