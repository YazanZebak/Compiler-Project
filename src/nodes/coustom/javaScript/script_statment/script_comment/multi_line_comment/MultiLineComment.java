package nodes.coustom.javaScript.script_statment.script_comment.multi_line_comment;

import AST.ASTVisitor;
import nodes.Node;

public class MultiLineComment extends Node {
    SlashOpen slashOpen;
    SlashClose slashClose;
    ContentComment contentComment;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (contentComment != null)
            contentComment.accept(astVisitor);
    }

    public SlashOpen getSlashOpen() {
        return slashOpen;
    }

    public void setSlashOpen(SlashOpen slashOpen) {
        this.slashOpen = slashOpen;
    }

    public SlashClose getSlashClose() {
        return slashClose;
    }

    public void setSlashClose(SlashClose slashClose) {
        this.slashClose = slashClose;
    }

    public ContentComment getContentComment() {
        return contentComment;
    }

    public void setContentComment(ContentComment contentComment) {
        this.contentComment = contentComment;
    }
}
