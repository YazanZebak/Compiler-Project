package nodes.coustom.injectedHtml.mustach_list.variable_bracket;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class VarWithQuote extends Node {
    String Q_O_VAR_BRACKET;
    String VAR_BRACKET;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getQ_O_VAR_BRACKET() {
        return Q_O_VAR_BRACKET;
    }

    public void setQ_O_VAR_BRACKET(String q_O_VAR_BRACKET) {
        Q_O_VAR_BRACKET = q_O_VAR_BRACKET;
    }

    public String getVAR_BRACKET() {
        return VAR_BRACKET;
    }

    public void setVAR_BRACKET(String VAR_BRACKET) {
        this.VAR_BRACKET = VAR_BRACKET;
    }

    public String toString(int numberOfSpaces) {
        return "VarWithQuote: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                "VAR_BRACKET: " + VAR_BRACKET + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
