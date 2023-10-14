package nodes.coustom.injectedHtml.htmlElement;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.htmlAttributes.HtmlAttribute;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;
import nodes.coustom.javaScript.Script;

import java.util.ArrayList;

public class HtmlElement extends Node {
    String TAG_OPEN;
    String TAG_NAME;
    ArrayList<HtmlAttribute> HtmlAttributes = new ArrayList<HtmlAttribute>();
    CloseHtmlAndContent closeHtmlAndContent;
    Script script;

    public String getTAG_OPEN() {
        return TAG_OPEN;
    }

    public void setTAG_OPEN(String TAG_OPEN) {
        this.TAG_OPEN = TAG_OPEN;
    }

    public String getTAG_NAME() {
        return TAG_NAME;
    }

    public void setTAG_NAME(String TAG_NAME) {
        this.TAG_NAME = TAG_NAME;
    }

    public ArrayList<HtmlAttribute> getHtmlAttributes() {
        return HtmlAttributes;
    }

    public void setHtmlAttributes(ArrayList<HtmlAttribute> HtmlAttributes) {
        this.HtmlAttributes = HtmlAttributes;
    }

    public CloseHtmlAndContent getCloseHtmlAndContent() {
        return closeHtmlAndContent;
    }

    public void setCloseHtmlAndContent(CloseHtmlAndContent closeHtmlAndContent) {
        this.closeHtmlAndContent = closeHtmlAndContent;
    }

    public Script getScript() {
        return script;
    }

    public void setScript(Script script) {
        this.script = script;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (HtmlAttribute htmlAttribute : HtmlAttributes) {
            htmlAttribute.accept(astVisitor);
        }
        if (closeHtmlAndContent != null)
            closeHtmlAndContent.accept(astVisitor);
        if (script != null)
            script.accept(astVisitor);

    }

    public String toString(int numberOfSpaces) {  //3
        if (closeHtmlAndContent == null) {
            if (script != null) {
                return "HtmlElement: " + "(" + TAG_NAME + ")" + " { \n " + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "TagName: " + TAG_NAME + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "HtmlAttributes: " + HtmlAttributes.toString() + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        script.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            } else {
                return "HtmlElement: " + "(" + TAG_NAME + ")" + " { \n " + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "TagName: " + TAG_NAME + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "HtmlAttributes: " + HtmlAttributes.toString() + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            }
        } else {
            if (script != null) {
                return "HtmlElement: " + "(" + TAG_NAME + ")" + " { \n " + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "TagName: " + TAG_NAME + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        getStringFromArrayList(HtmlAttributes, numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        closeHtmlAndContent.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        script.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            } else {
                return "HtmlElement: " + "(" + TAG_NAME + ")" + " { \n " + PrettyPrinter.addSpaces(numberOfSpaces) +
                        "TagName: " + TAG_NAME + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        getStringFromArrayList(HtmlAttributes, numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        closeHtmlAndContent.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            }
        }
    }

    static public String getStringFromArrayList(ArrayList<HtmlAttribute> arrayList, int numberOfSpaces) {
        String result = "";
        for (int i = 0; i < arrayList.size(); i++) {
            result += arrayList.get(i).toString(numberOfSpaces);
            if (arrayList.size() > 1) {
                result += "\n" + PrettyPrinter.addSpaces(numberOfSpaces - 1);
            }
        }
        return result;
    }
}
