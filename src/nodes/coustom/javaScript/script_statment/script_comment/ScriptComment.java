package nodes.coustom.javaScript.script_statment.script_comment;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.javaScript.script_statment.script_comment.line_comment.LineComment;
import nodes.coustom.javaScript.script_statment.script_comment.multi_line_comment.MultiLineComment;

public class ScriptComment extends Node {
    LineComment lineComment;
    MultiLineComment multiLineComment;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(lineComment != null)
            lineComment.accept(astVisitor);
        if(multiLineComment != null)
            multiLineComment.accept(astVisitor);
    }

    public LineComment getLineComment() {
        return lineComment;
    }

    public void setLineComment(LineComment lineComment) {
        this.lineComment = lineComment;
    }

    public MultiLineComment getMultiLineComment() {
        return multiLineComment;
    }

    public void setMultiLineComment(MultiLineComment multiLineComment) {
        this.multiLineComment = multiLineComment;
    }
}
