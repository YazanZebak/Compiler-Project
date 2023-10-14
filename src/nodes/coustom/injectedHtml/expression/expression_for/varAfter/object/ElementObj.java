package nodes.coustom.injectedHtml.expression.expression_for.varAfter.object;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_for.varAfter.VarAfter;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class ElementObj extends Node {
    String VAR;
    VarAfter varAfter;
    VarQuote varQuote;
    NumberValue numberValue;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (varAfter != null)
            varAfter.accept(astVisitor);
        if (varQuote != null)
            varQuote.accept(astVisitor);
        if (numberValue != null)
            numberValue.accept(astVisitor);
    }

    public String getVAR() {
        return VAR;
    }

    public void setVAR(String VAR) {
        this.VAR = VAR;
    }

    public VarAfter getVarAfter() {
        return varAfter;
    }

    public void setVarAfter(VarAfter varAfter) {
        this.varAfter = varAfter;
    }

    public VarQuote getVarQuote() {
        return varQuote;
    }

    public void setVarQuote(VarQuote varQuote) {
        this.varQuote = varQuote;
    }

    public NumberValue getNumberValue() {
        return numberValue;
    }

    public void setNumberValue(NumberValue numberValue) {
        this.numberValue = numberValue;
    }

    public String toString(int numberOfSpaces) {
        if (varAfter != null) {
            return "ElementObj: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    varAfter + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (varQuote != null) {
            return "ElementObj: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    varQuote + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (numberValue != null) {
            return "ElementObj: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "VAR: " + VAR + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    numberValue + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "ElementObj { }";
        }


    }
}
