/*
package nodes.coustom.injectedHtml.mustache_expr.varDotVar;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.mustache_expr.filter_mustache.properties.FirstVar;
import nodes.coustom.injectedHtml.mustache_expr.question_mustache.properties.SecondVar;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class VarDotVar extends Node {
    FirstVar firstVar;
    String DOT_M;
    SecondVar secondVar;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        firstVar.accept(astVisitor);
        secondVar.accept(astVisitor);
    }

    public FirstVar getFirstVar() {
        return firstVar;
    }

    public void setFirstVar(FirstVar firstVar) {
        this.firstVar = firstVar;
    }

    public String getDOT_M() {
        return DOT_M;
    }

    public void setDOT_M(String DOT_M) {
        this.DOT_M = DOT_M;
    }

    public SecondVar getSecondVar() {
        return secondVar;
    }

    public void setSecondVar(SecondVar secondVar) {
        this.secondVar = secondVar;
    }

    public String toString(int numberOfSpaces) {
        return "VarDotVar: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                firstVar.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                secondVar.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
*/

package nodes.coustom.injectedHtml.mustache_expr.varDotVar;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.mustache_expr.varDotVar.properties.IterationMustache;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class VarDotVar extends Node {
    IterationMustache iterationMustache;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        iterationMustache.accept(astVisitor);
    }

    public IterationMustache getIterationMustache() {
        return iterationMustache;
    }

    public void setIterationMustache(IterationMustache iterationMustache) {
        this.iterationMustache = iterationMustache;
    }

    public String toString(int numberOfSpaces) {
        return "VarDotVar: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                iterationMustache.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}

