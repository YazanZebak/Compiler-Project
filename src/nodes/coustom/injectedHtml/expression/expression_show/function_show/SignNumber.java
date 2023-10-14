package nodes.coustom.injectedHtml.expression.expression_show.function_show;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class SignNumber extends Node {
    Sign sign;
    Number number;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        sign.accept(astVisitor);
        number.accept(astVisitor);
    }

    public Sign getSign() {
        return sign;
    }

    public void setSign(Sign sign) {
        this.sign = sign;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public String toString(int numberOfSpaces) {
        return "SignNumber: {" +"\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                sign.toString(numberOfSpaces + 1) +"\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                number.toString(numberOfSpaces + 1) +"\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
