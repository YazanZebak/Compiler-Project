package nodes.coustom.injectedHtml.expression.expression_if.expr_if_with_iteration_condition;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExprIfWithIterationCondition extends Node {
    Iteration iteration;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        iteration.accept(astVisitor);
    }

    public Iteration getIteration() {
        return iteration;
    }

    public void setIteration(Iteration iteration) {
        this.iteration = iteration;
    }

    public String toString(int numberOfSpaces) {
        return "ExprIfWithIterationCondition: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                iteration.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
