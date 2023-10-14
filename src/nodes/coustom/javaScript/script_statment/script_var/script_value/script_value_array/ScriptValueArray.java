package nodes.coustom.javaScript.script_statment.script_var.script_value.script_value_array;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.javaScript.script_statment.script_var.script_value.script_value_array.array_element.ArrayElement;

import java.util.ArrayList;

public class ScriptValueArray extends Node {
    ArrayList<ArrayElement> arrayElementArrayList = new ArrayList<>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for(ArrayElement arrayElement : arrayElementArrayList){
            arrayElement.accept(astVisitor);
        }
    }

    public ArrayList<ArrayElement> getArrayElementArrayList() {
        return arrayElementArrayList;
    }

    public void setArrayElementArrayList(ArrayList<ArrayElement> arrayElementArrayList) {
        this.arrayElementArrayList = arrayElementArrayList;
    }
}
