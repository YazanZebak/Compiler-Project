package nodes.coustom.injectedHtml.expression.expression_for.varAfter.arr_elements;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

import java.util.ArrayList;

public class ArrElements extends Node {
    ArrayList<ArrElement> arrElementArrayList = new ArrayList<>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (ArrElement arrElement : arrElementArrayList) {
            arrElement.accept(astVisitor);
        }
    }

    public ArrayList<ArrElement> getArrElementArrayList() {
        return arrElementArrayList;
    }

    public void setArrElementArrayList(ArrayList<ArrElement> arrElementArrayList) {
        this.arrElementArrayList = arrElementArrayList;
    }

    public String toString(int numberOfSpaces) {
        return "ArrElements: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                getStringFromArrayList(arrElementArrayList, numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }

    static public String getStringFromArrayList(ArrayList<ArrElement> arrayList, int numberOfSpaces) {
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
