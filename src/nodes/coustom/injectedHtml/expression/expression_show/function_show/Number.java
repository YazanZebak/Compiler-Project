package nodes.coustom.injectedHtml.expression.expression_show.function_show;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class Number extends Node {
    int NUMBER;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public int getNUMBER() {
        return NUMBER;
    }

    public void setNUMBER(int NUMBER) {
        this.NUMBER = NUMBER;
    }

    public String toString(int numberOfSpaces) {
        return "Number: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "NUMBER: " + NUMBER + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
