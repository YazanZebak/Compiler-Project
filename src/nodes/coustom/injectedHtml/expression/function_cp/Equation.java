package nodes.coustom.injectedHtml.expression.function_cp;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

import java.util.ArrayList;

public class Equation extends Node {
    ArrayList<EquationParam> equationParamArrayList = new ArrayList<>();
    String VAR_PARAMETER;
    String PARAMETER_NUMBER;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (EquationParam equationParam : equationParamArrayList) {
            equationParam.accept(astVisitor);
        }
    }

    public ArrayList<EquationParam> getEquationParamArrayList() {
        return equationParamArrayList;
    }

    public void setEquationParamArrayList(ArrayList<EquationParam> equationParamArrayList) {
        this.equationParamArrayList = equationParamArrayList;
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

    public String toString(int numberOfSpaces) {
        if (VAR_PARAMETER != null) {
            return "Equation: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    getStringFromArrayList(equationParamArrayList, numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "VAR_PARAMETER: " + VAR_PARAMETER + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "Equation: {" +
                    getStringFromArrayList(equationParamArrayList, numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "PARAMETER_NUMBER: " + PARAMETER_NUMBER + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
    }

    static public String getStringFromArrayList(ArrayList<EquationParam> arrayList, int numberOfSpaces) {
        String result = "";
        for (int i = 0; i < arrayList.size(); i++) {
            result += arrayList.get(i).toString(numberOfSpaces);
            if (arrayList.size() > 1) {
                result += "\n" + PrettyPrinter.addSpaces(numberOfSpaces - 1);
            }
        }
        return result;
    }

}
