package nodes.coustom.injectedHtml.mustache_expr.formatter_mustache.properties;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExprFormatter extends Node {
    String MY_FORMATER;
    String TWO_POINTS_VARIABLE;
    Formatter formatter;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        formatter.accept(astVisitor);

    }

    public String getMY_FORMATER() {
        return MY_FORMATER;
    }

    public void setMY_FORMATER(String MY_FORMATER) {
        this.MY_FORMATER = MY_FORMATER;
    }

    public String getTWO_POINTS_VARIABLE() {
        return TWO_POINTS_VARIABLE;
    }

    public void setTWO_POINTS_VARIABLE(String TWO_POINTS_VARIABLE) {
        this.TWO_POINTS_VARIABLE = TWO_POINTS_VARIABLE;
    }

    public Formatter getFormatter() {
        return formatter;
    }

    public void setFormatter(Formatter formatter) {
        this.formatter = formatter;
    }

    public String toString(int numberOfSpaces) {
        return "ExprFormatter: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "MY_FORMATER: " + MY_FORMATER + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                formatter.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
