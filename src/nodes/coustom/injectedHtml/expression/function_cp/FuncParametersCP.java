package nodes.coustom.injectedHtml.expression.function_cp;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

import java.util.ArrayList;

public class FuncParametersCP extends Node {
    String BRACKET_FUNC_OPEN;
    ArrayList<FunParam> funParamArrayList = new ArrayList<>();
    Equation equation;
    String BRACKET_FUNC_CLOSE;


    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (!funParamArrayList.isEmpty()) {
            for (FunParam funParam : funParamArrayList) {
                funParam.accept(astVisitor);
            }
        }
        if (equation != null) {
            equation.accept(astVisitor);
        }

    }

    public String getBRACKET_FUNC_OPEN() {
        return BRACKET_FUNC_OPEN;
    }

    public void setBRACKET_FUNC_OPEN(String BRACKET_FUNC_OPEN) {
        this.BRACKET_FUNC_OPEN = BRACKET_FUNC_OPEN;
    }

    public ArrayList<FunParam> getFunParamArrayList() {
        return funParamArrayList;
    }

    public void setFunParamArrayList(ArrayList<FunParam> funParamArrayList) {
        this.funParamArrayList = funParamArrayList;
    }

    public String getBRACKET_FUNC_CLOSE() {
        return BRACKET_FUNC_CLOSE;
    }

    public void setBRACKET_FUNC_CLOSE(String BRACKET_FUNC_CLOSE) {
        this.BRACKET_FUNC_CLOSE = BRACKET_FUNC_CLOSE;
    }

    public Equation getEquation() {
        return equation;
    }

    public void setEquation(Equation equation) {
        this.equation = equation;
    }

    public String toString(int numberOfSpaces) {
        if (!funParamArrayList.isEmpty()) {
            return "FuncParametersCP: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    getStringFromArrayList(funParamArrayList, numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "FuncParametersCP: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    equation.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
    }

    static public String getStringFromArrayList(ArrayList<FunParam> arrayList, int numberOfSpaces) {
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
