package nodes.coustom.injectedHtml.expression.expression_model;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_if.expr_if_with_iteration_condition.Iteration;
import nodes.coustom.injectedHtml.expression.expression_model.date.Date;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExpressionModel extends Node {
    String VAR;
    Date date;
    Iteration iteration;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (date != null)
            date.accept(astVisitor);
        if (iteration != null)
            iteration.accept(astVisitor);
    }

    public String getVAR() {
        return VAR;
    }

    public void setVAR(String VAR) {
        this.VAR = VAR;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Iteration getIteration() {
        return iteration;
    }

    public void setIteration(Iteration iteration) {
        this.iteration = iteration;
    }

    public String toString(int numberOfSpaces) {
        if (date != null) {
            return "ExpressionModel: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    date.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (iteration != null) {
            return "ExpressionModel: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    iteration.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "ExpressionModel: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
    }
}
