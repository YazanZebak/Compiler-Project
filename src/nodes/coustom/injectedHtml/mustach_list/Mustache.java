package nodes.coustom.injectedHtml.mustach_list;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class Mustache extends Node {

    MustacheWithExpr mustacheWithExpr;
    MustacheWithoutExpr mustacheWithoutExpr;

    public MustacheWithExpr getMustacheWithExpr() {
        return mustacheWithExpr;
    }

    public void setMustacheWithExpr(MustacheWithExpr mustacheWithExpr) {
        this.mustacheWithExpr = mustacheWithExpr;
    }

    public MustacheWithoutExpr getMustacheWithoutExpr() {
        return mustacheWithoutExpr;
    }

    public void setMustacheWithoutExpr(MustacheWithoutExpr mustacheWithoutExpr) {
        this.mustacheWithoutExpr = mustacheWithoutExpr;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (mustacheWithExpr != null)
            mustacheWithExpr.accept(astVisitor);
        if (mustacheWithoutExpr != null)
            mustacheWithoutExpr.accept(astVisitor);
    }

    public String toString(int numberOfSpaces) {
        if (mustacheWithExpr != null) {
            return "Mustache: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    mustacheWithExpr.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "Mustache: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    mustacheWithoutExpr.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
    }
}
