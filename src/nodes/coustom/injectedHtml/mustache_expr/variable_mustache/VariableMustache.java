package nodes.coustom.injectedHtml.mustache_expr.variable_mustache;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.mustach_list.variable_bracket.Var;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class VariableMustache extends Node {
    Var var;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        var.accept(astVisitor);
    }

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public String toString(int numberOfSpaces) {
        return "VariableMustache: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                var.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
