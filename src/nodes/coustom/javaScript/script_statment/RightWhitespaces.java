package nodes.coustom.javaScript.script_statment;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.javaScript.WhiteSpaces;

import java.util.ArrayList;

public class RightWhitespaces extends Node {
    ArrayList<WhiteSpaces> whiteSpaces = new ArrayList<>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (WhiteSpaces whiteSpaces : whiteSpaces) {
            whiteSpaces.accept(astVisitor);
        }
    }

    public ArrayList<WhiteSpaces> getWhiteSpaces() {
        return whiteSpaces;
    }

    public void setWhiteSpaces(ArrayList<WhiteSpaces> whiteSpaces) {
        this.whiteSpaces = whiteSpaces;
    }
}
