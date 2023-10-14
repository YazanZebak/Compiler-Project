package nodes.coustom.javaScript.script_statment.script_function.script_function_par;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;
import nodes.coustom.javaScript.script_statment.LeftWhitespaces;
import nodes.coustom.javaScript.script_statment.RightWhitespaces;
import nodes.coustom.javaScript.script_statment.script_function.FuncBody.FuncBody;

import java.util.ArrayList;

public class ScriptFunctionPar extends Node {

    ArrayList<FuncParameters> funcParametersArrayList = new ArrayList<>();
    LeftWhitespaces leftWhitespaces;
    FuncBody funcBody;
    RightWhitespaces rightWhitespaces;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for(FuncParameters funcParameters : funcParametersArrayList){
            funcParameters.accept(astVisitor);
        }
        leftWhitespaces.accept(astVisitor);
        funcBody.accept(astVisitor);
        rightWhitespaces.accept(astVisitor);
    }

    public ArrayList<FuncParameters> getFuncParametersArrayList() {
        return funcParametersArrayList;
    }

    public void setFuncParametersArrayList(ArrayList<FuncParameters> funcParametersArrayList) {
        this.funcParametersArrayList = funcParametersArrayList;
    }

    public LeftWhitespaces getLeftWhitespaces() {
        return leftWhitespaces;
    }

    public void setLeftWhitespaces(LeftWhitespaces leftWhitespaces) {
        this.leftWhitespaces = leftWhitespaces;
    }

    public FuncBody getFuncBody() {
        return funcBody;
    }

    public void setFuncBody(FuncBody funcBody) {
        this.funcBody = funcBody;
    }

    public RightWhitespaces getRightWhitespaces() {
        return rightWhitespaces;
    }

    public void setRightWhitespaces(RightWhitespaces rightWhitespaces) {
        this.rightWhitespaces = rightWhitespaces;
    }

    public String toString(int numberOfSpaces) {
        return "ScriptFunctionPar: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                getStringFromArrayList(funcParametersArrayList , numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                funcBody.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
    static public String getStringFromArrayList(ArrayList<FuncParameters> arrayList, int numberOfSpaces) {
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
