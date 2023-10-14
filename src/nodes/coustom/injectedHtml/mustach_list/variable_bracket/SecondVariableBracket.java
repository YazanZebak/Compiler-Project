package nodes.coustom.injectedHtml.mustach_list.variable_bracket;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class SecondVariableBracket extends Node {
    String MUSTACHE_OPEN;
    Var var;
    String MUSTACHE_CLOSE;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        var.accept(astVisitor);
    }

    public String getMUSTACHE_OPEN() {
        return MUSTACHE_OPEN;
    }

    public void setMUSTACHE_OPEN(String MUSTACHE_OPEN) {
        this.MUSTACHE_OPEN = MUSTACHE_OPEN;
    }

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public String getMUSTACHE_CLOSE() {
        return MUSTACHE_CLOSE;
    }

    public void setMUSTACHE_CLOSE(String MUSTACHE_CLOSE) {
        this.MUSTACHE_CLOSE = MUSTACHE_CLOSE;
    }

    public String toString(int numberOfSpaces) {
        return "SecondVariableBracket: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "MUSTACHE_OPEN: " + MUSTACHE_OPEN + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "var=" + var + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "MUSTACHE_CLOSE: " + MUSTACHE_CLOSE +  "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }

}
