package nodes;


import AST.ASTVisitor;

public class Node {

    private int scopeId = -1;
    private int line;
    private int col;

    public void setLine(int line) {
        this.line = line;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getLine() {
        return line;
    }

    public int getCol() {
        return col;
    }

    public int getScopeId() {
        return scopeId;
    }

    public void setScopeId(int scopeId) {
        this.scopeId = scopeId;
    }

    public void accept(ASTVisitor astVisitor) {
    }

}
