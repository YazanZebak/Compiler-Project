package nodes.coustom.injectedHtml.mustache_expr.operatot_var.properties;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.mustach_list.variable_bracket.Var;
import nodes.coustom.injectedHtml.mustache_expr.varDotVar.VarDotVar;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;
import nodes.coustom.injectedHtml.var_condition_mustache.NumberMustache;

public class VarType extends Node {
    Var var;
    NumberMustache numberMustache;
    VarDotVar varDotVar;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (var != null)
            var.accept(astVisitor);
        if (numberMustache != null)
            numberMustache.accept(astVisitor);
        if (varDotVar != null)
            varDotVar.accept(astVisitor);
    }

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public NumberMustache getNumberMustache() {
        return numberMustache;
    }

    public void setNumberMustache(NumberMustache numberMustache) {
        this.numberMustache = numberMustache;
    }

    public VarDotVar getVarDotVar() {
        return varDotVar;
    }

    public void setVarDotVar(VarDotVar varDotVar) {
        this.varDotVar = varDotVar;
    }

    public String toString(int numberOfSpaces) {
        if (var != null) {
            return "VarType: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    var.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (numberMustache != null) {
            return "VarType: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    numberMustache.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (varDotVar != null) {
            return "VarType: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    varDotVar.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        return "";
    }
}
