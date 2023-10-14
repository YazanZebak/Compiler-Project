package nodes.coustom.injectedHtml.expression.expression_for.varAfter.arr_elements;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ArrElement extends Node {
    String ELEMENT;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getELEMENT() {
        return ELEMENT;
    }

    public void setELEMENT(String ELEMENT) {
        this.ELEMENT = ELEMENT;
    }

    public String toString(int numberOfSpaces) {
        return "ArrElement{" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "ELEMENT: " + ELEMENT + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
