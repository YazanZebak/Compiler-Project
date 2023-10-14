package nodes.coustom.injectedHtml.expression.expression_for.varAfter;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_for.varAfter.arr_elements.ArrElements;
import nodes.coustom.injectedHtml.expression.expression_for.varAfter.object.Object;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class VarAfter extends Node {
    String VAR;
    ArrElements arrElements;
    Object object;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (object != null)
            object.accept(astVisitor);
        if (arrElements != null)
            arrElements.accept(astVisitor);
    }

    public String getVAR() {
        return VAR;
    }

    public void setVAR(String VAR) {
        this.VAR = VAR;
    }

    public ArrElements getArrElements() {
        return arrElements;
    }

    public void setArrElements(ArrElements arrElements) {
        this.arrElements = arrElements;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String toString(int numberOfSpaces) {
        if (arrElements != null) {
            return "VarAfter: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    arrElements.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (object != null) {
            return "VarAfter: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    object.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "VarAfter: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }


    }
}
