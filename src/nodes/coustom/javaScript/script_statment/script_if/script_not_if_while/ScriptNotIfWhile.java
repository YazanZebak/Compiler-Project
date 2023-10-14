package nodes.coustom.javaScript.script_statment.script_if.script_not_if_while;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.javaScript.ScriptListStatement;
import nodes.coustom.javaScript.script_statment.script_if.LeftBracket;
import nodes.coustom.javaScript.script_statment.script_if.RightBracket;
import nodes.coustom.javaScript.script_statment.script_if.script_normal_if_while.IfSign;
import nodes.coustom.javaScript.script_statment.script_if.script_normal_if_while.ScriptIdentifierIf;
import nodes.coustom.javaScript.script_statment.script_if.script_normal_if_while.if_condition_value.IfConditionValue;

import java.util.ArrayList;

public class ScriptNotIfWhile extends Node {
    IfNot ifNot = new IfNot();
    ScriptIdentifierIf scriptIdentifierIf;
    IfSign ifSign;
    IfConditionValue ifConditionValue;
    ScriptListStatement scriptListStatement;
    ArrayList<RightBracket> rightBracketArrayList = new ArrayList<>();
    ArrayList<LeftBracket> leftBracketArrayList = new ArrayList<>();
    IfNotInBracket ifNotInBracket;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (ifNot != null)
            ifNot.accept(astVisitor);
        scriptIdentifierIf.accept(astVisitor);
        if(ifSign != null) {
            ifSign.accept(astVisitor);
            ifConditionValue.accept(astVisitor);
        }
        scriptListStatement.accept(astVisitor);
        for (RightBracket rightBracket : rightBracketArrayList) {
            rightBracket.accept(astVisitor);
        }
        for (LeftBracket leftBracket : leftBracketArrayList) {
            leftBracket.accept(astVisitor);
        }
        if (ifNotInBracket != null) {
            ifNotInBracket.accept(astVisitor);
        }
    }

    public IfNot getIfNot() {
        return ifNot;
    }

    public void setIfNot(IfNot ifNot) {
        this.ifNot = ifNot;
    }

    public ScriptIdentifierIf getScriptIdentifierIf() {
        return scriptIdentifierIf;
    }

    public void setScriptIdentifierIf(ScriptIdentifierIf scriptIdentifierIf) {
        this.scriptIdentifierIf = scriptIdentifierIf;
    }

    public IfSign getIfSign() {
        return ifSign;
    }

    public void setIfSign(IfSign ifSign) {
        this.ifSign = ifSign;
    }

    public IfConditionValue getIfConditionValue() {
        return ifConditionValue;
    }

    public void setIfConditionValue(IfConditionValue ifConditionValue) {
        this.ifConditionValue = ifConditionValue;
    }

    public ScriptListStatement getScriptListStatement() {
        return scriptListStatement;
    }

    public void setScriptListStatement(ScriptListStatement scriptListStatement) {
        this.scriptListStatement = scriptListStatement;
    }

    public ArrayList<RightBracket> getRightBracketArrayList() {
        return rightBracketArrayList;
    }

    public void setRightBracketArrayList(ArrayList<RightBracket> rightBracketArrayList) {
        this.rightBracketArrayList = rightBracketArrayList;
    }

    public ArrayList<LeftBracket> getLeftBracketArrayList() {
        return leftBracketArrayList;
    }

    public void setLeftBracketArrayList(ArrayList<LeftBracket> leftBracketArrayList) {
        this.leftBracketArrayList = leftBracketArrayList;
    }

    public IfNotInBracket getIfNotInBracket() {
        return ifNotInBracket;
    }

    public void setIfNotInBracket(IfNotInBracket ifNotInBracket) {
        this.ifNotInBracket = ifNotInBracket;
    }
}
