package nodes.coustom.injectedHtml.expression.expression_if.expr_if_with_iteration_condition;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_hide.Not;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class IterationExpr extends Node {
    Not not;
    String VAR;
    AttributeFunc attributeFunc;
    AttributeVarDotVar attributeVarDotVar;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (not != null) {
            not.accept(astVisitor);
        }
        if (attributeFunc != null) {
            attributeFunc.accept(astVisitor);
        }
        if (attributeVarDotVar != null) {
            attributeVarDotVar.accept(astVisitor);
        }
    }


    public Not getNot() {
        return not;
    }

    public void setNot(Not not) {
        this.not = not;
    }

    public String getVAR() {
        return VAR;
    }

    public void setVAR(String VAR) {
        this.VAR = VAR;
    }

    public AttributeFunc getAttributeFunc() {
        return attributeFunc;
    }

    public void setAttributeFunc(AttributeFunc attributeFunc) {
        this.attributeFunc = attributeFunc;
    }

    public AttributeVarDotVar getAttributeVarDotVar() {
        return attributeVarDotVar;
    }

    public void setAttributeVarDotVar(AttributeVarDotVar attributeVarDotVar) {
        this.attributeVarDotVar = attributeVarDotVar;
    }

    public String toString(int numberOfSpaces) {
        if (not != null && VAR != null) {
            return "IterationExpr: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    not.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else if (VAR != null) {
            return "IterationExpr: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else if (attributeFunc != null) {
            return "IterationExpr: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    attributeFunc.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else if (attributeVarDotVar != null) {
            return "IterationExpr: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    attributeVarDotVar.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "";
        }

    }
}
