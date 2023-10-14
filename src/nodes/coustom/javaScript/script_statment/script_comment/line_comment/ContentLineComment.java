package nodes.coustom.javaScript.script_statment.script_comment.line_comment;

import AST.ASTVisitor;
import nodes.Node;

public class ContentLineComment extends Node {
    String SCRIPT_COMMENT_LINE_CONTENT;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

    }

    public String getSCRIPT_COMMENT_LINE_CONTENT() {
        return SCRIPT_COMMENT_LINE_CONTENT;
    }

    public void setSCRIPT_COMMENT_LINE_CONTENT(String SCRIPT_COMMENT_LINE_CONTENT) {
        this.SCRIPT_COMMENT_LINE_CONTENT = SCRIPT_COMMENT_LINE_CONTENT;
    }
}
