package SymbolTable;

import java.util.ArrayList;
import java.util.Stack;

public class SymbolTable {
    private ArrayList<Scope> scopes = new ArrayList<>();

    private Stack<Scope> stackScopes = new Stack<>();

    public ArrayList<Scope> getScopes() {
        return scopes;
    }

    public void setScopes(ArrayList<Scope> scopes) {
        this.scopes = scopes;
    }

    public Stack<Scope> getStackScopes() {
        return stackScopes;
    }

    public void setStackScopes(Stack<Scope> stackScopes) {
        this.stackScopes = stackScopes;
    }

    public void addToScopes(Scope scope) {
        this.scopes.add(scope);
    }

    public void addToStacksScopes(Scope scope) {
        this.stackScopes.push(scope);
    }

    public Scope getScopeByID(int id) {
        for (Scope scope : scopes) {
            if (scope.getId() == id) {
                return scope;
            }
        }
        return null;
    }



}
