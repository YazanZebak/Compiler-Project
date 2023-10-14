package nodes.coustom.injectedHtml.spacesMushtache;

import nodes.Node;
import nodes.coustom.injectedHtml.htmlElement.HtmlMisc;

import java.util.ArrayList;

public class SpacesAfterTextMustacheLEFT extends Node {
    ArrayList<HtmlMisc> htmlMiscArrayList = new ArrayList<>();

    public ArrayList<HtmlMisc> getHtmlMiscArrayList() {
        return htmlMiscArrayList;
    }

    public void setHtmlMiscArrayList(ArrayList<HtmlMisc> htmlMiscArrayList) {
        this.htmlMiscArrayList = htmlMiscArrayList;
    }

    @Override
    public String toString() {
        return "SpacesAfterTextMustacheLEFT: {" +
                htmlMiscArrayList.toString() +
                '}';
    }
}
