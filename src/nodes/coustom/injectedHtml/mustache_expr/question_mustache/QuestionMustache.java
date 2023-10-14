package nodes.coustom.injectedHtml.mustache_expr.question_mustache;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.mustache_expr.filter_mustache.properties.FirstVar;
import nodes.coustom.injectedHtml.mustache_expr.question_mustache.properties.SecondVar;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;
import nodes.coustom.injectedHtml.var_condition_txt.VarConditionTxt;

public class QuestionMustache extends Node {
    VarConditionTxt varConditionTxt;
    String QUESTION_MARK;
    FirstVar firstVar;
    String TWO_POINTS_VARIABLE;
    SecondVar secondVar;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        varConditionTxt.accept(astVisitor);
        firstVar.accept(astVisitor);
        secondVar.accept(astVisitor);
    }

    public VarConditionTxt getVarConditionTxt() {
        return varConditionTxt;
    }

    public void setVarConditionTxt(VarConditionTxt varConditionTxt) {
        this.varConditionTxt = varConditionTxt;
    }

    public String getQUESTION_MARK() {
        return QUESTION_MARK;
    }

    public void setQUESTION_MARK(String QUESTION_MARK) {
        this.QUESTION_MARK = QUESTION_MARK;
    }

    public FirstVar getFirstVar() {
        return firstVar;
    }

    public void setFirstVar(FirstVar firstVar) {
        this.firstVar = firstVar;
    }

    public String getTWO_POINTS_VARIABLE() {
        return TWO_POINTS_VARIABLE;
    }

    public void setTWO_POINTS_VARIABLE(String TWO_POINTS_VARIABLE) {
        this.TWO_POINTS_VARIABLE = TWO_POINTS_VARIABLE;
    }

    public SecondVar getSecondVar() {
        return secondVar;
    }

    public void setSecondVar(SecondVar secondVar) {
        this.secondVar = secondVar;
    }

    public String toString(int numberOfSpaces) {
        return "QuestionMustache: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                varConditionTxt.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                firstVar.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                secondVar.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
