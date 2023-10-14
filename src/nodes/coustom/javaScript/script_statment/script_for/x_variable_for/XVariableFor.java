package nodes.coustom.javaScript.script_statment.script_for.x_variable_for;

import AST.ASTVisitor;
import nodes.Node;

public class XVariableFor extends Node {
    NumberFor numberFor;
    StringFor stringFor;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (numberFor != null)
            numberFor.accept(astVisitor);
        if (stringFor != null)
            stringFor.accept(astVisitor);
    }

    public NumberFor getNumberFor() {
        return numberFor;
    }

    public void setNumberFor(NumberFor numberFor) {
        this.numberFor = numberFor;
    }

    public StringFor getStringFor() {
        return stringFor;
    }

    public void setStringFor(StringFor stringFor) {
        this.stringFor = stringFor;
    }
}
