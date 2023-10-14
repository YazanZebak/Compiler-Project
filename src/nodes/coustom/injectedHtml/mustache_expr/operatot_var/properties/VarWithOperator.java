package nodes.coustom.injectedHtml.mustache_expr.operatot_var.properties;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class VarWithOperator extends Node {
    VarType varType;
    Operator operator;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        varType.accept(astVisitor);
        operator.accept(astVisitor);
    }

    public VarType getVarType() {
        return varType;
    }

    public void setVarType(VarType varType) {
        this.varType = varType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public String toString(int numberOfSpaces) {
        return "VarWithOperator: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                varType.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                operator.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
