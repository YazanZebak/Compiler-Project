package nodes.coustom.injectedHtml.mustache_expr.formatter_mustache;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.mustache_expr.filter_mustache.properties.FirstVar;
import nodes.coustom.injectedHtml.mustache_expr.formatter_mustache.properties.ExprFormatter;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class FormatterMustache extends Node {
    FirstVar firstVar;
    String PIPE;
    ExprFormatter exprFormatter;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        firstVar.accept(astVisitor);
        exprFormatter.accept(astVisitor);
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

    public ExprFormatter getExprFormatter() {
        return exprFormatter;
    }

    public void setExprFormatter(ExprFormatter exprFormatter) {
        this.exprFormatter = exprFormatter;
    }

    public String toString(int numberOfSpaces) {
        return "FormatterMustache: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                firstVar.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                exprFormatter.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
