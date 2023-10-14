package nodes.coustom.injectedHtml.expression.expression_if.expr_if_with_iteration_condition.dot_iteration;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

import java.util.ArrayList;

public class DotIteration extends Node {
    ArrayList<VarDot> varDotArrayList = new ArrayList<>();
    String VAR;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for(VarDot varDot : varDotArrayList){
            varDot.accept(astVisitor);
        }
    }

    public ArrayList<VarDot> getVarDotArrayList() {
        return varDotArrayList;
    }

    public void setVarDotArrayList(ArrayList<VarDot> varDotArrayList) {
        this.varDotArrayList = varDotArrayList;
    }

    public String getVAR() {
        return VAR;
    }

    public void setVAR(String VAR) {
        this.VAR = VAR;
    }

    public String toString(int numberOfSpaces) {
        return "DotIteration: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                getStringFromArrayList(varDotArrayList, numberOfSpaces + 1) +
                "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }

    static public String getStringFromArrayList(ArrayList<VarDot> arrayList, int numberOfSpaces) {
        String result = "";
        for (int i = 0; i < arrayList.size(); i++) {
            result += arrayList.get(i).toString(numberOfSpaces);
        }
        return result;
    }
}
