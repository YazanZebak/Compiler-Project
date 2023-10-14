package nodes.coustom.injectedHtml.mustach_list;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.mustache_expr.MustacheExpr;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;
import nodes.coustom.injectedHtml.spacesMushtache.SpacesAfterTextMustacheRIGHT;
import nodes.coustom.injectedHtml.spacesMushtache.SpacesBeforeTextMustacheLEFT;

public class MustacheWithExpr extends Node {
    SpacesBeforeTextMustacheLEFT spacesBeforeTextMustacheLEFT;
    String MUSTACHE_OPEN;
    MustacheExpr mustacheExpr;
    String MUSTACHE_CLOSE;
    SpacesAfterTextMustacheRIGHT spacesAfterTextMustacheRIGHT;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        mustacheExpr.accept(astVisitor);
        if (spacesBeforeTextMustacheLEFT != null)
            spacesBeforeTextMustacheLEFT.accept(astVisitor);
        if (spacesAfterTextMustacheRIGHT != null)
            spacesAfterTextMustacheRIGHT.accept(astVisitor);
    }

    public SpacesBeforeTextMustacheLEFT getSpacesBeforeTextMustacheLEFT() {
        return spacesBeforeTextMustacheLEFT;
    }

    public void setSpacesBeforeTextMustacheLEFT(SpacesBeforeTextMustacheLEFT spacesBeforeTextMustacheLEFT) {
        this.spacesBeforeTextMustacheLEFT = spacesBeforeTextMustacheLEFT;
    }

    public String getMUSTACHE_OPEN() {
        return MUSTACHE_OPEN;
    }

    public void setMUSTACHE_OPEN(String MUSTACHE_OPEN) {
        this.MUSTACHE_OPEN = MUSTACHE_OPEN;
    }

    public MustacheExpr getMustacheExpr() {
        return mustacheExpr;
    }

    public void setMustacheExpr(MustacheExpr mustacheExpr) {
        this.mustacheExpr = mustacheExpr;
    }

    public String getMUSTACHE_CLOSE() {
        return MUSTACHE_CLOSE;
    }

    public void setMUSTACHE_CLOSE(String MUSTACHE_CLOSE) {
        this.MUSTACHE_CLOSE = MUSTACHE_CLOSE;
    }

    public SpacesAfterTextMustacheRIGHT getSpacesAfterTextMustacheRIGHT() {
        return spacesAfterTextMustacheRIGHT;
    }

    public void setSpacesAfterTextMustacheRIGHT(SpacesAfterTextMustacheRIGHT spacesAfterTextMustacheRIGHT) {
        this.spacesAfterTextMustacheRIGHT = spacesAfterTextMustacheRIGHT;
    }

    public String toString(int numberOfSpaces) {
        return "MustacheWithExpr: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                spacesBeforeTextMustacheLEFT + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                "MustaOpen: " + MUSTACHE_OPEN + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                mustacheExpr.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                "MustaClose: " + MUSTACHE_CLOSE + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                spacesAfterTextMustacheRIGHT.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
