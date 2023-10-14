package nodes.coustom.injectedHtml.mustache_expr.operatot_var;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.mustache_expr.operatot_var.properties.VarType;
import nodes.coustom.injectedHtml.mustache_expr.operatot_var.properties.VarWithOperator;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

import java.util.ArrayList;
import java.util.List;

public class OperatorVar  extends Node {
    ArrayList<VarWithOperator> varWithOperatorList = new ArrayList<>();
    VarType varType;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        varType.accept(astVisitor);
        for(VarWithOperator varWithOperator : varWithOperatorList){
            varWithOperator.accept(astVisitor);
        }
    }

    public List<VarWithOperator> getVarWithOperatorList() {
        return varWithOperatorList;
    }

    public void setVarWithOperatorList(ArrayList<VarWithOperator> varWithOperatorList) {
        this.varWithOperatorList = varWithOperatorList;
    }

    public VarType getVarType() {
        return varType;
    }

    public void setVarType(VarType varType) {
        this.varType = varType;
    }

    public String toString(int numberOfSpaces) {
        return "OperatorVar: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                getStringFromArrayList(varWithOperatorList , numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                varType.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
    static public String getStringFromArrayList(ArrayList<VarWithOperator> arrayList, int numberOfSpaces) {
        String result = "";
        for (int i = 0; i < arrayList.size(); i++) {
            result += arrayList.get(i).toString(numberOfSpaces + 1);
            if (arrayList.size() > 1) {
                result += "\n" + PrettyPrinter.addSpaces(numberOfSpaces - 1);
            }
        }
        return result;
    }

}
