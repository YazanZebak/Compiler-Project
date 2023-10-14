package nodes.coustom.javaScript.script_statment.script_comment.multi_line_comment;

import AST.ASTVisitor;
import nodes.Node;

public class ContentComment extends Node {
    String SCRIPT_COMMENT_CONTENT;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getSCRIPT_COMMENT_CONTENT() {
        return SCRIPT_COMMENT_CONTENT;
    }

    public void setSCRIPT_COMMENT_CONTENT(String SCRIPT_COMMENT_CONTENT) {
        this.SCRIPT_COMMENT_CONTENT = SCRIPT_COMMENT_CONTENT;
    }
}
