package nodes.coustom.injectedHtml.expression.function_cp;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class EquationParam extends Node {
    String VAR_PARAMETER;
    String PARAMETER_NUMBER;
    String PARAMETER_SIGN;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getVAR_PARAMETER() {
        return VAR_PARAMETER;
    }

    public void setVAR_PARAMETER(String VAR_PARAMETER) {
        this.VAR_PARAMETER = VAR_PARAMETER;
    }

    public String getPARAMETER_NUMBER() {
        return PARAMETER_NUMBER;
    }

    public void setPARAMETER_NUMBER(String PARAMETER_NUMBER) {
        this.PARAMETER_NUMBER = PARAMETER_NUMBER;
    }

    public String getPARAMETER_SIGN() {
        return PARAMETER_SIGN;
    }

    public void setPARAMETER_SIGN(String PARAMETER_SIGN) {
        this.PARAMETER_SIGN = PARAMETER_SIGN;
    }

    public String toString(int numberOfSpaces) {
        if (VAR_PARAMETER != null) {
            return "EquationParam: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "VAR_PARAMETER: " + VAR_PARAMETER + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "PARAMETER_SIGN: " + PARAMETER_SIGN + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "EquationParam: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "PARAMETER_NUMBER: " + PARAMETER_NUMBER + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "PARAMETER_SIGN: " + PARAMETER_SIGN + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }

    }

}
