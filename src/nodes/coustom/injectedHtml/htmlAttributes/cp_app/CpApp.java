package nodes.coustom.injectedHtml.htmlAttributes.cp_app;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.expression.expression_app.ExpressionApp;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class CpApp extends Node {
    String CP_APP;
    String TAG_EQUALS;
    ExpressionApp expressionApp;
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        expressionApp.accept(astVisitor);
    }

    public String getCP_APP() {
        return CP_APP;
    }

    public void setCP_APP(String CP_APP) {
        this.CP_APP = CP_APP;
    }

    public String getTAG_EQUALS() {
        return TAG_EQUALS;
    }

    public void setTAG_EQUALS(String TAG_EQUALS) {
        this.TAG_EQUALS = TAG_EQUALS;
    }

    public ExpressionApp getExpressionApp() {
        return expressionApp;
    }

    public void setExpressionApp(ExpressionApp expressionApp) {
        this.expressionApp = expressionApp;
    }

    public String toString(int numberOfSpaces) {
        return "CpApp: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "CP_APP: " + CP_APP + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                expressionApp.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
