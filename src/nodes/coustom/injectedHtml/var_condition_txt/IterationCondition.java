package nodes.coustom.injectedHtml.var_condition_txt;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.mustache_expr.varDotVar.properties.IterationMustache;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;
import nodes.coustom.injectedHtml.var_condition_mustache.NumberMustache;
import nodes.coustom.injectedHtml.var_condition_mustache.SignMustache;

public class IterationCondition extends Node {
    IterationMustache iterationMustache;
    SignMustache signMustache;
    NumberMustache numberMustache;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (iterationMustache != null)
            iterationMustache.accept(astVisitor);
        else {
            signMustache.accept(astVisitor);
            numberMustache.accept(astVisitor);
        }
    }

    public IterationMustache getIterationMustache() {
        return iterationMustache;
    }

    public void setIterationMustache(IterationMustache iterationMustache) {
        this.iterationMustache = iterationMustache;
    }

    public SignMustache getSignMustache() {
        return signMustache;
    }

    public void setSignMustache(SignMustache signMustache) {
        this.signMustache = signMustache;
    }

    public NumberMustache getNumberMustache() {
        return numberMustache;
    }

    public void setNumberMustache(NumberMustache numberMustache) {
        this.numberMustache = numberMustache;
    }

    public String toString(int numberOfSpaces) {
        if (iterationMustache != null) {
            return "IterationCondition: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    iterationMustache.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "IterationCondition: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    signMustache.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    numberMustache.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
    }
}
