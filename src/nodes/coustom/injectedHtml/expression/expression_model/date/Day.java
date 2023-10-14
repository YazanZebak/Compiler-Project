package nodes.coustom.injectedHtml.expression.expression_model.date;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class Day extends Node {
    String DAY;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getDAY() {
        return DAY;
    }

    public void setDAY(String DAY) {
        this.DAY = DAY;
    }

    public String toString(int numberOfSpaces) {
        return "Day: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "DAY: " + DAY + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
