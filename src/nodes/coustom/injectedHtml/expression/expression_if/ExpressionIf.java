package nodes.coustom.injectedHtml.expression.expression_if;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_hide.Not;
import nodes.coustom.injectedHtml.expression.expression_if.expr_if_with_iteration_condition.ExprIfWithIterationCondition;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExpressionIf extends Node {
    Not not;
    ExprIfWithVarDotVarSign exprIfWithVarDotVarSign;
    ExprIfWithFunc exprIfWithFunc;
    String VAR;
    ExprIfWithIterationCondition exprIfWithIterationCondition;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (not != null)
            not.accept(astVisitor);
        if (exprIfWithFunc != null)
            exprIfWithFunc.accept(astVisitor);
        if (exprIfWithVarDotVarSign != null)
            exprIfWithVarDotVarSign.accept(astVisitor);
        if (exprIfWithIterationCondition != null)
            exprIfWithIterationCondition.accept(astVisitor);
    }

    public Not getNot() {
        return not;
    }

    public void setNot(Not not) {
        this.not = not;
    }

    public ExprIfWithVarDotVarSign getExprIfWithVarDotVarSign() {
        return exprIfWithVarDotVarSign;
    }

    public void setExprIfWithVarDotVarSign(ExprIfWithVarDotVarSign exprIfWithVarDotVarSign) {
        this.exprIfWithVarDotVarSign = exprIfWithVarDotVarSign;
    }

    public ExprIfWithFunc getExprIfWithFunc() {
        return exprIfWithFunc;
    }

    public void setExprIfWithFunc(ExprIfWithFunc exprIfWithFunc) {
        this.exprIfWithFunc = exprIfWithFunc;
    }

    public String getVAR() {
        return VAR;
    }

    public void setVAR(String VAR) {
        this.VAR = VAR;
    }

    public ExprIfWithIterationCondition getExprIfWithIterationCondition() {
        return exprIfWithIterationCondition;
    }

    public void setExprIfWithIterationCondition(ExprIfWithIterationCondition exprIfWithIterationCondition) {
        this.exprIfWithIterationCondition = exprIfWithIterationCondition;
    }

    public String toString(int numberOfSpaces) {
        if (exprIfWithFunc != null) {
            return "ExpressionIf: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    exprIfWithFunc.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (exprIfWithVarDotVarSign != null) {
            return "ExpressionIf: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    exprIfWithVarDotVarSign.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (exprIfWithIterationCondition != null) {
            return "ExpressionIf: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    exprIfWithIterationCondition.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            if (not != null) {
                return "ExpressionIf: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "not: " + not.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            } else {
                return "ExpressionIf: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            }
        }
    }
}
