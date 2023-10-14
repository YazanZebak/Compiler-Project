package nodes.coustom.injectedHtml.expression.expression_if.expr_if_with_iteration_condition;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

import java.util.ArrayList;

public class Iteration extends Node {
    ArrayList<IterationExprWithGates> iterationExprWithGatesArrayList = new ArrayList<>();
    IterationExpr iterationExpr;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (IterationExprWithGates iterationExprWithGates : iterationExprWithGatesArrayList) {
            iterationExprWithGates.accept(astVisitor);
        }
        iterationExpr.accept(astVisitor);
    }

    public ArrayList<IterationExprWithGates> getIterationExprWithGatesArrayList() {
        return iterationExprWithGatesArrayList;
    }

    public void setIterationExprWithGatesArrayList(ArrayList<IterationExprWithGates> iterationExprWithGatesArrayList) {
        this.iterationExprWithGatesArrayList = iterationExprWithGatesArrayList;
    }

    public IterationExpr getIterationExpr() {
        return iterationExpr;
    }

    public void setIterationExpr(IterationExpr iterationExpr) {
        this.iterationExpr = iterationExpr;
    }

    public String toString(int numberOfSpaces) {
        return "Iteration: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                getStringFromArrayList(iterationExprWithGatesArrayList, numberOfSpaces + 1) +
                iterationExpr.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }

    static public String getStringFromArrayList(ArrayList<IterationExprWithGates> arrayList, int numberOfSpaces) {
        String result = "";
        for (int i = 0; i < arrayList.size(); i++) {
            result += arrayList.get(i).toString(numberOfSpaces);
        }
        return result;
    }
}
