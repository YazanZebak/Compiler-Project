package nodes.coustom.injectedHtml.expression.expression_model.date;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class Year extends Node {
    String YEAR;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getYEAR() {
        return YEAR;
    }

    public void setYEAR(String YEAR) {
        this.YEAR = YEAR;
    }


    public String toString(int numberOfSpaces) {
        return "Year: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "YEAR: " + YEAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
