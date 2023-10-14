package nodes.coustom.injectedHtml.htmlAttributes.cp_switch_default;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class CpSwitchDefault extends Node {
    String CP_SWITCH_DEFAULT;
    String TAG_EQUALS;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public String getCP_SWITCH_DEFAULT() {
        return CP_SWITCH_DEFAULT;
    }

    public void setCP_SWITCH_DEFAULT(String CP_SWITCH_DEFAULT) {
        this.CP_SWITCH_DEFAULT = CP_SWITCH_DEFAULT;
    }

    public String getTAG_EQUALS() {
        return TAG_EQUALS;
    }

    public void setTAG_EQUALS(String TAG_EQUALS) {
        this.TAG_EQUALS = TAG_EQUALS;
    }


    public String toString(int numberOfSpaces) {
        return "CpSwitchDefault: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "CP_SWITCH_DEFAULT: " + CP_SWITCH_DEFAULT + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
