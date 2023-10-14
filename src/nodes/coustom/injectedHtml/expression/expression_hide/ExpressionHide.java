/*
package nodes.coustom.injectedHtml.expression.expression_hide;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExpressionHide extends Node {
    Not not;
    String VAR;
    ExprHideWithFunc exprHideWithFunc;
    ExprHideWithNotVarDotVar exprHideWithNotVarDotVar;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (not != null)
            not.accept(astVisitor);
        if (exprHideWithFunc != null)
            exprHideWithFunc.accept(astVisitor);
        if (exprHideWithNotVarDotVar != null)
            exprHideWithNotVarDotVar.accept(astVisitor);
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

    public ExprHideWithFunc getExprHideWithFunc() {
        return exprHideWithFunc;
    }

    public void setExprHideWithFunc(ExprHideWithFunc exprHideWithFunc) {
        this.exprHideWithFunc = exprHideWithFunc;
    }

    public ExprHideWithNotVarDotVar getExprHideWithNotVarDotVar() {
        return exprHideWithNotVarDotVar;
    }

    public void setExprHideWithNotVarDotVar(ExprHideWithNotVarDotVar exprHideWithNotVarDotVar) {
        this.exprHideWithNotVarDotVar = exprHideWithNotVarDotVar;
    }

    public String toString(int numberOfSpaces) {
        if (exprHideWithFunc != null) {
            return "ExpressionHide: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    exprHideWithFunc.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (exprHideWithNotVarDotVar != null) {
            return "ExpressionHide: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    exprHideWithNotVarDotVar.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            if (not != null) {
                return "ExpressionHide: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "not: " + not.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            } else {
                return "ExpressionHide: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            }
        }
    }
}
*/

package nodes.coustom.injectedHtml.expression.expression_hide;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_if.expr_if_with_iteration_condition.Iteration;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExpressionHide extends Node {
    Not not;
    String VAR;
    ExprHideWithFunc exprHideWithFunc;
    Iteration iteration;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (not != null)
            not.accept(astVisitor);
        if (exprHideWithFunc != null)
            exprHideWithFunc.accept(astVisitor);
        if (iteration != null)
            iteration.accept(astVisitor);
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

    public ExprHideWithFunc getExprHideWithFunc() {
        return exprHideWithFunc;
    }

    public void setExprHideWithFunc(ExprHideWithFunc exprHideWithFunc) {
        this.exprHideWithFunc = exprHideWithFunc;
    }

    public Iteration getIteration() {
        return iteration;
    }

    public void setIteration(Iteration iteration) {
        this.iteration = iteration;
    }

    public String toString(int numberOfSpaces) {
        if (exprHideWithFunc != null) {
            return "ExpressionHide: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    exprHideWithFunc.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (iteration != null) {
            return "ExpressionHide: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    iteration.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            if (not != null) {
                return "ExpressionHide: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "not: " + not.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            } else {
                return "ExpressionHide: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            }
        }
    }
}
