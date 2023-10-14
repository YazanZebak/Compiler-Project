package nodes.coustom.injectedHtml.expression.expression_show.function_show;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class Sign extends Node {
    String SIGN;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getSIGN() {
        return SIGN;
    }

    public void setSIGN(String SIGN) {
        this.SIGN = SIGN;
    }

    public String toString(int numberOfSpaces) {
        return "Sign: {" +"\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "SIGN: " + SIGN  + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
