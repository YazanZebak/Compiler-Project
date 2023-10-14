package nodes.coustom.injectedHtml.mustach_list;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.html_text.HtmlText;
import nodes.coustom.injectedHtml.mustach_list.variable_bracket.FirstVariableBracket;
import nodes.coustom.injectedHtml.mustach_list.variable_bracket.SecondVariableBracket;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;
import nodes.coustom.injectedHtml.spacesMushtache.SpacesAfterText;
import nodes.coustom.injectedHtml.spacesMushtache.SpacesBeforeText;

public class MustacheWithoutExpr extends Node {
    FirstVariableBracket firstVariableBracket;
    SpacesBeforeText spacesBeforeText;
    HtmlText htmlText;
    SpacesAfterText spacesAfterText;
    SecondVariableBracket secondVariableBracket;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        spacesBeforeText.accept(astVisitor);
        htmlText.accept(astVisitor);
        spacesAfterText.accept(astVisitor);
        secondVariableBracket.accept(astVisitor);

    }

    public FirstVariableBracket getFirstVariableBracket() {
        return firstVariableBracket;
    }

    public void setFirstVariableBracket(FirstVariableBracket firstVariableBracket) {
        this.firstVariableBracket = firstVariableBracket;
    }

    public SpacesBeforeText getSpacesBeforeText() {
        return spacesBeforeText;
    }

    public void setSpacesBeforeText(SpacesBeforeText spacesBeforeText) {
        this.spacesBeforeText = spacesBeforeText;
    }

    public HtmlText getHtmlText() {
        return htmlText;
    }

    public void setHtmlText(HtmlText htmlText) {
        this.htmlText = htmlText;
    }

    public SpacesAfterText getSpacesAfterText() {
        return spacesAfterText;
    }

    public void setSpacesAfterText(SpacesAfterText spacesAfterText) {
        this.spacesAfterText = spacesAfterText;
    }

    public SecondVariableBracket getSecondVariableBracket() {
        return secondVariableBracket;
    }

    public void setSecondVariableBracket(SecondVariableBracket secondVariableBracket) {
        this.secondVariableBracket = secondVariableBracket;
    }

    public String toString(int numberOfSpaces) {
        return "MustacheWithoutExpr: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                firstVariableBracket.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                spacesBeforeText.toString() + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                htmlText.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                spacesAfterText + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                secondVariableBracket.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
