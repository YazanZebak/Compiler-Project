package nodes.coustom.injectedHtml.var_condition_mustache;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class VarConditionMustache extends Node {
    String VAR_BRACKET;
    String FUNCTION_BRACKET;
    SignMustache signMustache = new SignMustache();
    NumberMustache numberMustache = new NumberMustache();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (numberMustache != null)
            numberMustache.accept(astVisitor);
        if (signMustache != null)
            signMustache.accept(astVisitor);
    }

    public String getVAR_BRACKET() {
        return VAR_BRACKET;
    }

    public void setVAR_BRACKET(String VAR_BRACKET) {
        this.VAR_BRACKET = VAR_BRACKET;
    }

    public SignMustache getSignMustache() {
        return signMustache;
    }

    public void setSignMustache(SignMustache signMustache) {
        this.signMustache = signMustache;
    }

    public NumberMustache getNumberMustache() {
        return numberMustache;
    }

    public void setNumberMustache(NumberMustache numberMustache) {
        this.numberMustache = numberMustache;
    }

    public String getFUNCTION_BRACKET() {
        return FUNCTION_BRACKET;
    }

    public void setFUNCTION_BRACKET(String FUNCTION_BRACKET) {
        this.FUNCTION_BRACKET = FUNCTION_BRACKET;
    }

    public String toString(int numberOfSpaces) {
        if (FUNCTION_BRACKET != null) {
            return "VarConditionMustache: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "FUNCTION_BRACKET: " + FUNCTION_BRACKET + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    signMustache.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    numberMustache.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "VarConditionMustache: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "VAR_BRACKET: " + VAR_BRACKET + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    signMustache.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    numberMustache.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
    }


}
