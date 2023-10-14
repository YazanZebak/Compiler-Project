package nodes.coustom.javaScript.script_statment.script_comment.line_comment;

import AST.ASTVisitor;
import nodes.Node;

public class LineComment extends Node {
    String DOUBLE_SLASH;
    ContentLineComment contentLineComment;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        contentLineComment.accept(astVisitor);
    }

    public String getDOUBLE_SLASH() {
        return DOUBLE_SLASH;
    }

    public void setDOUBLE_SLASH(String DOUBLE_SLASH) {
        this.DOUBLE_SLASH = DOUBLE_SLASH;
    }

    public ContentLineComment getContentLineComment() {
        return contentLineComment;
    }

    public void setContentLineComment(ContentLineComment contentLineComment) {
        this.contentLineComment = contentLineComment;
    }
}
