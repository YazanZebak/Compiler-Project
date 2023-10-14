package nodes.coustom.injectedHtml.htmlMisc;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class HTMLComment extends Node {
    String HTML_COMMENT;
    String HTML_CONDITIONAL_COMMENT;


    public String getHTML_COMMENT() {
        return HTML_COMMENT;
    }

    public void setHTML_COMMENT(String HTML_COMMENT) {
        this.HTML_COMMENT = HTML_COMMENT;
    }

    public String getHTML_CONDITIONAL_COMMENT() {
        return HTML_CONDITIONAL_COMMENT;
    }

    public void setHTML_CONDITIONAL_COMMENT(String HTML_CONDITIONAL_COMMENT) {
        this.HTML_CONDITIONAL_COMMENT = HTML_CONDITIONAL_COMMENT;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String toString(int numberOfSpaces) {
        if (HTML_COMMENT != null) {
            if (HTML_CONDITIONAL_COMMENT != null) {
                return "HTMLComment: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        HTML_COMMENT + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        HTML_CONDITIONAL_COMMENT + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}' + '\n' + PrettyPrinter.addSpaces(numberOfSpaces);
            } else {
                return "HTMLComment: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        HTML_COMMENT + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}' + '\n' + PrettyPrinter.addSpaces(numberOfSpaces);
            }
        }

        else {
            return "HTMLComment: { " + '}' + '\n' + PrettyPrinter.addSpaces(numberOfSpaces);
        }
    }
}
