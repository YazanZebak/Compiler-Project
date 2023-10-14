package nodes.coustom.javaScript.script_statment.script_obj.script_obj_value;

import AST.ASTVisitor;
import nodes.Node;

import java.util.ArrayList;

public class ScriptObjValue extends Node {
    ArrayList<ScriptObjElement> scriptObjElementArrayList = new ArrayList<>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for(ScriptObjElement scriptObjElement : scriptObjElementArrayList){
            scriptObjElement.accept(astVisitor);
        }
    }

    public ArrayList<ScriptObjElement> getScriptObjElementArrayList() {
        return scriptObjElementArrayList;
    }

    public void setScriptObjElementArrayList(ArrayList<ScriptObjElement> scriptObjElementArrayList) {
        this.scriptObjElementArrayList = scriptObjElementArrayList;
    }
}
