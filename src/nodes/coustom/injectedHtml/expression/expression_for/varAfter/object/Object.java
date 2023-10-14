package nodes.coustom.injectedHtml.expression.expression_for.varAfter.object;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

import java.util.ArrayList;

public class Object extends Node {
    ArrayList<ElementObj> elementObjArrayList = new ArrayList<>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (ElementObj elementObj : elementObjArrayList) {
            elementObj.accept(astVisitor);
        }
    }

    public ArrayList<ElementObj> getElementObjArrayList() {
        return elementObjArrayList;
    }

    public void setElementObjArrayList(ArrayList<ElementObj> elementObjArrayList) {
        this.elementObjArrayList = elementObjArrayList;
    }

    public String toString(int numberOfSpaces) {
        return "Object: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                getStringFromArrayList(elementObjArrayList, numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }

    static public String getStringFromArrayList(ArrayList<ElementObj> arrayList, int numberOfSpaces) {
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
