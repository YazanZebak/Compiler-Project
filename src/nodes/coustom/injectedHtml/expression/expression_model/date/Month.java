package nodes.coustom.injectedHtml.expression.expression_model.date;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class Month extends Node {
    String MONTH;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getMONTH() {
        return MONTH;
    }

    public void setMONTH(String MONTH) {
        this.MONTH = MONTH;
    }

    public String toString(int numberOfSpaces) {
        return "Month: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "MONTH: " + MONTH + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
