package nodes.coustom.javaScript;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;
import nodes.coustom.javaScript.script_statment.LeftWhitespaces;
import nodes.coustom.javaScript.script_statment.RightWhitespaces;

import java.util.ArrayList;

public class ScriptListStatement extends Node {
    LeftWhitespaces leftWhitespaces;
    ArrayList<ScriptStatement> scriptStatementArrayList = new ArrayList<>();
    RightWhitespaces rightWhitespaces;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        leftWhitespaces.accept(astVisitor);
        for (ScriptStatement scriptStatement : scriptStatementArrayList) {
            scriptStatement.accept(astVisitor);
        }
        rightWhitespaces.accept(astVisitor);
    }

    public LeftWhitespaces getLeftWhitespaces() {
        return leftWhitespaces;
    }

    public void setLeftWhitespaces(LeftWhitespaces leftWhitespaces) {
        this.leftWhitespaces = leftWhitespaces;
    }

    public ArrayList<ScriptStatement> getScriptStatementArrayList() {
        return scriptStatementArrayList;
    }

    public void setScriptStatementArrayList(ArrayList<ScriptStatement> scriptStatementArrayList) {
        this.scriptStatementArrayList = scriptStatementArrayList;
    }

    public RightWhitespaces getRightWhitespaces() {
        return rightWhitespaces;
    }

    public void setRightWhitespaces(RightWhitespaces rightWhitespaces) {
        this.rightWhitespaces = rightWhitespaces;
    }

    public String toString(int numberOfSpaces) {
        return "ScriptListStatement{" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                getStringFromArrayList(scriptStatementArrayList, numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }

    static public String getStringFromArrayList(ArrayList<ScriptStatement> arrayList, int numberOfSpaces) {
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
