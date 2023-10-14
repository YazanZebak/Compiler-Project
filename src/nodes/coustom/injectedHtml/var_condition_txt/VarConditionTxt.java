package nodes.coustom.injectedHtml.var_condition_txt;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;
import nodes.coustom.injectedHtml.var_condition_mustache.VarConditionMustache;

public class VarConditionTxt extends Node {
    String VAR_BRACKET;
    VarConditionMustache varConditionMustache;
    IterationCondition iterationCondition;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (varConditionMustache != null)
            varConditionMustache.accept(astVisitor);
        if (iterationCondition != null)
            iterationCondition.accept(astVisitor);
    }

    public String getVAR_BRACKET() {
        return VAR_BRACKET;
    }

    public void setVAR_BRACKET(String VAR_BRACKET) {
        this.VAR_BRACKET = VAR_BRACKET;
    }

    public VarConditionMustache getVarConditionMustache() {
        return varConditionMustache;
    }

    public void setVarConditionMustache(VarConditionMustache varConditionMustache) {
        this.varConditionMustache = varConditionMustache;
    }

    public IterationCondition getIterationCondition() {
        return iterationCondition;
    }

    public void setIterationCondition(IterationCondition iterationCondition) {
        this.iterationCondition = iterationCondition;
    }

    public String toString(int numberOfSpaces) {
        if (VAR_BRACKET != null) {
            return "VarConditionTxt: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "VAR_BRACKET: " + VAR_BRACKET + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (iterationCondition != null) {
            return "VarConditionTxt: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    iterationCondition.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "VarConditionTxt: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    varConditionMustache.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }

    }
}
