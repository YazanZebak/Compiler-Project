/*
package nodes.coustom.injectedHtml.expression.expression_show;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_show.function_show.FunctionShow;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExpressionShow extends Node {
    String var;
    FunctionShow functionShow;
    VarAfterShow afterShow;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (functionShow != null)
            functionShow.accept(astVisitor);
        if (afterShow != null)
            afterShow.accept(astVisitor);
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public FunctionShow getFunctionShow() {
        return functionShow;
    }

    public void setFunctionShow(FunctionShow functionShow) {
        this.functionShow = functionShow;
    }

    public VarAfterShow getAfterShow() {
        return afterShow;
    }

    public void setAfterShow(VarAfterShow afterShow) {
        this.afterShow = afterShow;
    }

    public String toString(int numberOfSpaces) {

        if (functionShow != null) {
            return "ExpressionShow: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    functionShow.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (afterShow != null) {
            return "ExpressionShow: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "var: " + var + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    afterShow.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "ExpressionShow: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "var: " + var + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }

    }
}
*/

package nodes.coustom.injectedHtml.expression.expression_show;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_if.expr_if_with_iteration_condition.Iteration;
import nodes.coustom.injectedHtml.expression.expression_show.function_show.FunctionShow;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExpressionShow extends Node {
    String var;
    FunctionShow functionShow;
    Iteration iteration;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (functionShow != null)
            functionShow.accept(astVisitor);
        if (iteration != null)
            iteration.accept(astVisitor);
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public FunctionShow getFunctionShow() {
        return functionShow;
    }

    public void setFunctionShow(FunctionShow functionShow) {
        this.functionShow = functionShow;
    }

    public Iteration getIteration() {
        return iteration;
    }

    public void setIteration(Iteration iteration) {
        this.iteration = iteration;
    }

    public String toString(int numberOfSpaces) {
        if (functionShow != null) {
            return "ExpressionShow: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    functionShow.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (iteration != null) {
            return "ExpressionShow: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    iteration.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "ExpressionShow: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "var: " + var + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }

    }
}

