package nodes.coustom.injectedHtml.mustache_expr;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.mustache_expr.filter_mustache.FilterMustache;
import nodes.coustom.injectedHtml.mustache_expr.formatter_mustache.FormatterMustache;
import nodes.coustom.injectedHtml.mustache_expr.operatot_var.OperatorVar;
import nodes.coustom.injectedHtml.mustache_expr.question_mustache.QuestionMustache;
import nodes.coustom.injectedHtml.mustache_expr.varDotVar.VarDotVar;
import nodes.coustom.injectedHtml.mustache_expr.variable_mustache.VariableMustache;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class MustacheExpr extends Node {
    FilterMustache filterMustache;
    QuestionMustache questionMustache;
    VariableMustache variableMustache;
    FormatterMustache formatterMustache;
    VarDotVar varDotVar;
    OperatorVar operatorVar;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (filterMustache != null)
            filterMustache.accept(astVisitor);
        if (questionMustache != null)
            questionMustache.accept(astVisitor);
        if (varDotVar != null)
            varDotVar.accept(astVisitor);
        if (variableMustache != null)
            variableMustache.accept(astVisitor);
        if (formatterMustache != null)
            formatterMustache.accept(astVisitor);
        if (operatorVar != null)
            operatorVar.accept(astVisitor);
    }

    public FilterMustache getFilterMustache() {
        return filterMustache;
    }

    public void setFilterMustache(FilterMustache filterMustache) {
        this.filterMustache = filterMustache;
    }

    public QuestionMustache getQuestionMustache() {
        return questionMustache;
    }

    public void setQuestionMustache(QuestionMustache questionMustache) {
        this.questionMustache = questionMustache;
    }

    public VariableMustache getVariableMustache() {
        return variableMustache;
    }

    public void setVariableMustache(VariableMustache variableMustache) {
        this.variableMustache = variableMustache;
    }

    public FormatterMustache getFormatterMustache() {
        return formatterMustache;
    }

    public void setFormatterMustache(FormatterMustache formatterMustache) {
        this.formatterMustache = formatterMustache;
    }

    public VarDotVar getVarDotVar() {
        return varDotVar;
    }

    public void setVarDotVar(VarDotVar varDotVar) {
        this.varDotVar = varDotVar;
    }

    public OperatorVar getOperatorVar() {
        return operatorVar;
    }

    public void setOperatorVar(OperatorVar operatorVar) {
        this.operatorVar = operatorVar;
    }

    public String toString(int numberOfSpaces) {
        if (filterMustache != null) {
            return "MustacheExpr: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    filterMustache.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (questionMustache != null) {
            return "MustacheExpr: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    questionMustache.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (variableMustache != null) {
            return "MustacheExpr: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    variableMustache.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (formatterMustache != null) {
            return "MustacheExpr: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    formatterMustache.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (varDotVar != null) {
            return "MustacheExpr: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    varDotVar.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (operatorVar != null) {
            return "MustacheExpr: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    operatorVar.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "MustacheExpr: { }";
        }
    }
}
