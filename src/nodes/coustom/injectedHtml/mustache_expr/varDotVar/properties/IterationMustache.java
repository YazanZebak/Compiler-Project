package nodes.coustom.injectedHtml.mustache_expr.varDotVar.properties;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.mustache_expr.question_mustache.properties.SecondVar;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

import java.util.ArrayList;

public class IterationMustache extends Node {
    ArrayList<IterationMustacheExpr> iterationMustacheExprArrayList = new ArrayList<>();
    SecondVar secondVar;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (IterationMustacheExpr iterationMustacheExpr : iterationMustacheExprArrayList)
            iterationMustacheExpr.accept(astVisitor);
        secondVar.accept(astVisitor);
    }

    public ArrayList<IterationMustacheExpr> getIterationMustacheExprArrayList() {
        return iterationMustacheExprArrayList;
    }

    public void setIterationMustacheExprArrayList(ArrayList<IterationMustacheExpr> iterationMustacheExprArrayList) {
        this.iterationMustacheExprArrayList = iterationMustacheExprArrayList;
    }

    public SecondVar getSecondVar() {
        return secondVar;
    }

    public void setSecondVar(SecondVar secondVar) {
        this.secondVar = secondVar;
    }

    public String toString(int numberOfSpaces) {
        return "IterationMustache: {" +
                getStringFromArrayList(iterationMustacheExprArrayList, numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                secondVar.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }

    static public String getStringFromArrayList(ArrayList<IterationMustacheExpr> arrayList, int numberOfSpaces) {
        String result = "";
        for (int i = 0; i < arrayList.size(); i++) {
            result += arrayList.get(i).toString(numberOfSpaces);
        }
        return result;
    }
}
