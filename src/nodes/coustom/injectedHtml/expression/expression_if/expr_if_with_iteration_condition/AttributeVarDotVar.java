package nodes.coustom.injectedHtml.expression.expression_if.expr_if_with_iteration_condition;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_hide.Not;
import nodes.coustom.injectedHtml.expression.expression_if.expr_if_with_iteration_condition.dot_iteration.DotIteration;
import nodes.coustom.injectedHtml.expression.expression_show.function_show.SignNumber;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class AttributeVarDotVar extends Node {
    Not not;
    DotIteration dotIteration;
    SignNumber signNumber;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (not != null) {
            not.accept(astVisitor);
        }
        dotIteration.accept(astVisitor);
        if (signNumber != null) {
            signNumber.accept(astVisitor);
        }
    }

    public Not getNot() {
        return not;
    }

    public void setNot(Not not) {
        this.not = not;
    }

    public DotIteration getDotIteration() {
        return dotIteration;
    }

    public void setDotIteration(DotIteration dotIteration) {
        this.dotIteration = dotIteration;
    }

    public SignNumber getSignNumber() {
        return signNumber;
    }

    public void setSignNumber(SignNumber signNumber) {
        this.signNumber = signNumber;
    }

    public String toString(int numberOfSpaces) {
        if (not != null) {
            if (signNumber != null) {
                return "AttributeVarDotVar: {" +
                        not.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        dotIteration.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        signNumber.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            } else {
                return "AttributeVarDotVar: {" +
                        not.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        dotIteration.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            }
        } else {
            if (signNumber != null) {
                return "AttributeVarDotVar: {" +
                        dotIteration.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        signNumber.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            } else {
                return "AttributeVarDotVar: {" +
                        dotIteration.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            }
        }
    }
}
