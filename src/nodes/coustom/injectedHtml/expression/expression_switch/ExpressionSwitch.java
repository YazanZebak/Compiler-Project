/*
package nodes.coustom.injectedHtml.expression.expression_switch;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExpressionSwitch extends Node {
    String VAR;
    VarAfterSwitch varAfterSwitch;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (varAfterSwitch != null)
            varAfterSwitch.accept(astVisitor);
    }

    public String getVAR() {
        return VAR;
    }

    public void setVAR(String VAR) {
        this.VAR = VAR;
    }

    public VarAfterSwitch getVarAfterSwitch() {
        return varAfterSwitch;
    }

    public void setVarAfterSwitch(VarAfterSwitch varAfterSwitch) {
        this.varAfterSwitch = varAfterSwitch;
    }

    public String toString(int numberOfSpaces) {
        if (varAfterSwitch != null) {
            return "ExpressionSwitch: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    varAfterSwitch.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "ExpressionSwitch: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
    }
}
*/

package nodes.coustom.injectedHtml.expression.expression_switch;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_if.expr_if_with_iteration_condition.Iteration;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExpressionSwitch extends Node {
    String VAR;
    Iteration iteration;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(iteration != null)
            iteration.accept(astVisitor);
    }

    public String getVAR() {
        return VAR;
    }

    public void setVAR(String VAR) {
        this.VAR = VAR;
    }

    public Iteration getIteration() {
        return iteration;
    }

    public void setIteration(Iteration iteration) {
        this.iteration = iteration;
    }

    public String toString(int numberOfSpaces) {
        if (iteration != null) {
            return "ExpressionSwitch: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    iteration.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "ExpressionSwitch: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
    }
}

