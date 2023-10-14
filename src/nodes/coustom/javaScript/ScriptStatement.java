package nodes.coustom.javaScript;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.javaScript.script_statment.*;
import nodes.coustom.javaScript.script_statment.script_comment.ScriptComment;
import nodes.coustom.javaScript.script_statment.script_do_while.ScriptDoWhile;
import nodes.coustom.javaScript.script_statment.script_for.ScriptFor;
import nodes.coustom.javaScript.script_statment.script_function.ScriptFunction;
import nodes.coustom.javaScript.script_statment.script_if.ScriptIf;
import nodes.coustom.javaScript.script_statment.script_obj.ScriptObj;
import nodes.coustom.javaScript.script_statment.script_var.ScriptVar;
import nodes.coustom.javaScript.script_statment.script_while.ScriptWhile;

public class ScriptStatement extends Node {
    LeftWhitespaces leftWhitespaces;
    ScriptFunction scriptFunction;
    ScriptVar scriptVar;
    ScriptObj scriptObj;
    ScriptComment scriptComment;
    ScriptFor scriptFor;
    ScriptIf scriptIf;
    ScriptWhile scriptWhile;
    ScriptDoWhile scriptDoWhile;
    RightWhitespaces rightWhitespaces;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        leftWhitespaces.accept(astVisitor);
        if (scriptFunction != null)
            scriptFunction.accept(astVisitor);
        if (scriptVar != null)
            scriptVar.accept(astVisitor);
        if (scriptObj != null)
            scriptObj.accept(astVisitor);
        if (scriptComment != null)
            scriptComment.accept(astVisitor);
        if (scriptFor != null)
            scriptFor.accept(astVisitor);
        if (scriptIf != null)
            scriptIf.accept(astVisitor);
        if (scriptWhile != null)
            scriptWhile.accept(astVisitor);
        if (scriptDoWhile != null)
            scriptDoWhile.accept(astVisitor);
        rightWhitespaces.accept(astVisitor);
    }

    public LeftWhitespaces getLeftWhitespaces() {
        return leftWhitespaces;
    }

    public void setLeftWhitespaces(LeftWhitespaces leftWhitespaces) {
        this.leftWhitespaces = leftWhitespaces;
    }

    public ScriptFunction getScriptFunction() {
        return scriptFunction;
    }

    public void setScriptFunction(ScriptFunction scriptFunction) {
        this.scriptFunction = scriptFunction;
    }

    public ScriptVar getScriptVar() {
        return scriptVar;
    }

    public void setScriptVar(ScriptVar scriptVar) {
        this.scriptVar = scriptVar;
    }

    public ScriptObj getScriptObj() {
        return scriptObj;
    }

    public void setScriptObj(ScriptObj scriptObj) {
        this.scriptObj = scriptObj;
    }

    public ScriptComment getScriptComment() {
        return scriptComment;
    }

    public void setScriptComment(ScriptComment scriptComment) {
        this.scriptComment = scriptComment;
    }

    public ScriptFor getScriptFor() {
        return scriptFor;
    }

    public void setScriptFor(ScriptFor scriptFor) {
        this.scriptFor = scriptFor;
    }

    public ScriptIf getScriptIf() {
        return scriptIf;
    }

    public void setScriptIf(ScriptIf scriptIf) {
        this.scriptIf = scriptIf;
    }

    public ScriptWhile getScriptWhile() {
        return scriptWhile;
    }

    public void setScriptWhile(ScriptWhile scriptWhile) {
        this.scriptWhile = scriptWhile;
    }

    public ScriptDoWhile getScriptDoWhile() {
        return scriptDoWhile;
    }

    public void setScriptDoWhile(ScriptDoWhile scriptDoWhile) {
        this.scriptDoWhile = scriptDoWhile;
    }

    public RightWhitespaces getRightWhitespaces() {
        return rightWhitespaces;
    }

    public void setRightWhitespaces(RightWhitespaces rightWhitespaces) {
        this.rightWhitespaces = rightWhitespaces;
    }


    public String toString(int numberOfSpaces) {
        /*Map<String, String> objects = new HashMap<String, String>();
        String result = "ScriptStatement: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces);

        if (scriptFunction != null) {
            objects.put("scriptFunction", scriptFunction.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }
        if (scriptVar != null) {
            objects.put("scriptVar", scriptVar.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }
        if (scriptObj != null) {
            objects.put("scriptObj", scriptObj.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }
        if (scriptComment != null) {
            objects.put("scriptComment", scriptComment.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }
        if (scriptFor != null) {
            objects.put("scriptFor", scriptFor.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }
        if (scriptIf != null) {
            objects.put("scriptIf", scriptIf.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }
        if (scriptWhile != null) {
            objects.put("scriptWhile", scriptWhile.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }
        if (scriptDoWhile != null) {
            objects.put("scriptDoWhile", scriptDoWhile.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }

        for (Map.Entry<String, String> object : objects.entrySet()) {
            result += object.getValue();
        }
        result += '}';

        return result;*/

        return "ScriptStatement: { ." + ".. }";

    }
}
