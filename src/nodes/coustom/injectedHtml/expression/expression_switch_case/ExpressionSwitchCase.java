package nodes.coustom.injectedHtml.expression.expression_switch_case;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ExpressionSwitchCase extends Node {
    String VAR;
    int NUMBER;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getVAR() {
        return VAR;
    }

    public void setVAR(String VAR) {
        this.VAR = VAR;
    }

    public int getNUMBER() {
        return NUMBER;
    }

    public void setNUMBER(int NUMBER) {
        this.NUMBER = NUMBER;
    }

    public String toString(int numberOfSpaces) {
        if (VAR != null) {
            return "ExpressionSwitchCase: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "ExpressionSwitchCase: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "NUMBER: " + NUMBER + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
    }
}
