package nodes.coustom.injectedHtml.var_condition_mustache;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class NumberMustache extends Node {
    String NUMBER_BRACKET;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getNUMBER_BRACKET() {
        return NUMBER_BRACKET;
    }

    public void setNUMBER_BRACKET(String NUMBER_BRACKET) {
        this.NUMBER_BRACKET = NUMBER_BRACKET;
    }

    public String toString(int numberOfSpaces) {
        return "NumberMustache: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                "NUMBER_BRACKET: " + NUMBER_BRACKET + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
