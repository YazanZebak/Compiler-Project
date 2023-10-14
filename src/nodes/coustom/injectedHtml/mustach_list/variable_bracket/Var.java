package nodes.coustom.injectedHtml.mustach_list.variable_bracket;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class Var extends Node {
    String VAR_BRACKET;
    VarWithQuote varWithQuote;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (varWithQuote != null)
            varWithQuote.accept(astVisitor);
    }

    public String getVAR_BRACKET() {
        return VAR_BRACKET;
    }

    public void setVAR_BRACKET(String VAR_BRACKET) {
        this.VAR_BRACKET = VAR_BRACKET;
    }

    public VarWithQuote getVarWithQuote() {
        return varWithQuote;
    }

    public void setVarWithQuote(VarWithQuote varWithQuote) {
        this.varWithQuote = varWithQuote;
    }

    public String toString(int numberOfSpaces) {
        if (varWithQuote == null) {
            return "Var: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "VAR_BRACKET: " + VAR_BRACKET + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "Var: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    varWithQuote.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }

    }
}
