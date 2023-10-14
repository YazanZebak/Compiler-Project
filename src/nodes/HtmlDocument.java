package nodes;

import AST.ASTVisitor;
import nodes.coustom.injectedHtml.htmlDocument.HtmlElements;
import nodes.coustom.injectedHtml.htmlDocument.ScriptletOrSeaWs;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument extends Node {

private List<HtmlElements> elements = new ArrayList<>();
    private List<ScriptletOrSeaWs> scriptletOrSeaWs = new ArrayList<>();

    public void setElements(List<HtmlElements> elements) {
        this.elements = elements;
    }

    public List<HtmlElements> getElements() {
        return elements;
    }

    public List<ScriptletOrSeaWs> getScriptletOrSeaWs() {
        return scriptletOrSeaWs;
    }

    public void setScriptletOrSeaWs(List<ScriptletOrSeaWs> scriptletOrSeaWs) {
        this.scriptletOrSeaWs = scriptletOrSeaWs;
    }


    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (HtmlElements htmlElements : elements) {
            htmlElements.accept(astVisitor);
        }
        for (ScriptletOrSeaWs scriptletOrSeaWs : scriptletOrSeaWs) {
            scriptletOrSeaWs.accept(astVisitor);
        }

    }

    @Override
    public String toString() {
        return "HtmlDocument: {\n" + PrettyPrinter.addSpaces(1) +
                elements.toString() + " ]\n" + PrettyPrinter.addSpaces(1) +
                scriptletOrSeaWs + " ]\n" + PrettyPrinter.addSpaces(0) +
                '}';
    }
}
