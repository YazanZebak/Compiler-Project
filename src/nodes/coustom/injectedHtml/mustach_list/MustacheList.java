package nodes.coustom.injectedHtml.mustach_list;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;
import nodes.coustom.injectedHtml.spacesMushtache.SpacesAfterTextMustacheLEFT;
import nodes.coustom.injectedHtml.spacesMushtache.SpacesAfterTextMustacheRIGHT;
import nodes.coustom.injectedHtml.spacesMushtache.SpacesBeforeTextMustacheLEFT;
import nodes.coustom.injectedHtml.spacesMushtache.SpacesBeforeTextMustacheRIGHT;
import nodes.coustom.injectedHtml.text_mustache.TextLeftMustache;
import nodes.coustom.injectedHtml.text_mustache.TextRightMustache;

import java.util.ArrayList;

public class MustacheList extends Node {
    SpacesBeforeTextMustacheLEFT spacesBeforeTextMustacheLEFT;
    TextLeftMustache textLeftMustache;
    SpacesAfterTextMustacheLEFT spacesAfterTextMustacheLEFT;
    ArrayList<Mustache> mustacheArrayList = new ArrayList<>();
    SpacesBeforeTextMustacheRIGHT spacesBeforeTextMustacheRIGHT;
    TextRightMustache textRightMustache;
    SpacesAfterTextMustacheRIGHT spacesAfterTextMustacheRIGHT;


    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(textLeftMustache != null)
            textLeftMustache.accept(astVisitor);
        if(textRightMustache != null)
            textRightMustache.accept(astVisitor);
        for(Mustache mustache : mustacheArrayList){
            mustache.accept(astVisitor);
        }
    }

    public SpacesBeforeTextMustacheLEFT getSpacesBeforeTextMustacheLEFT() {
        return spacesBeforeTextMustacheLEFT;
    }

    public void setSpacesBeforeTextMustacheLEFT(SpacesBeforeTextMustacheLEFT spacesBeforeTextMustacheLEFT) {
        this.spacesBeforeTextMustacheLEFT = spacesBeforeTextMustacheLEFT;
    }

    public TextLeftMustache getTextLeftMustache() {
        return textLeftMustache;
    }

    public void setTextLeftMustache(TextLeftMustache textLeftMustache) {
        this.textLeftMustache = textLeftMustache;
    }

    public SpacesAfterTextMustacheLEFT getSpacesAfterTextMustacheLEFT() {
        return spacesAfterTextMustacheLEFT;
    }

    public void setSpacesAfterTextMustacheLEFT(SpacesAfterTextMustacheLEFT spacesAfterTextMustacheLEFT) {
        this.spacesAfterTextMustacheLEFT = spacesAfterTextMustacheLEFT;
    }

    public ArrayList<Mustache> getMustacheArrayList() {
        return mustacheArrayList;
    }

    public void setMustacheArrayList(ArrayList<Mustache> mustacheArrayList) {
        this.mustacheArrayList = mustacheArrayList;
    }

    public SpacesBeforeTextMustacheRIGHT getSpacesBeforeTextMustacheRIGHT() {
        return spacesBeforeTextMustacheRIGHT;
    }

    public void setSpacesBeforeTextMustacheRIGHT(SpacesBeforeTextMustacheRIGHT spacesBeforeTextMustacheRIGHT) {
        this.spacesBeforeTextMustacheRIGHT = spacesBeforeTextMustacheRIGHT;
    }

    public TextRightMustache getTextRightMustache() {
        return textRightMustache;
    }

    public void setTextRightMustache(TextRightMustache textRightMustache) {
        this.textRightMustache = textRightMustache;
    }

    public SpacesAfterTextMustacheRIGHT getSpacesAfterTextMustacheRIGHT() {
        return spacesAfterTextMustacheRIGHT;
    }

    public void setSpacesAfterTextMustacheRIGHT(SpacesAfterTextMustacheRIGHT spacesAfterTextMustacheRIGHT) {
        this.spacesAfterTextMustacheRIGHT = spacesAfterTextMustacheRIGHT;
    }


    public String toString(int numberOfSpaces) {
        if (textLeftMustache == null) {
            if (textRightMustache == null) {
                return "MustacheList: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        spacesBeforeTextMustacheLEFT.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        spacesAfterTextMustacheLEFT.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        getStringFromArrayList(mustacheArrayList, numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        spacesBeforeTextMustacheRIGHT.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        spacesAfterTextMustacheRIGHT.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            } else {
                return "MustacheList: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        spacesBeforeTextMustacheLEFT.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        spacesAfterTextMustacheLEFT.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        getStringFromArrayList(mustacheArrayList, numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        spacesBeforeTextMustacheRIGHT.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        textRightMustache.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        spacesAfterTextMustacheRIGHT.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            }
        }
        if (textRightMustache == null) {
            return "MustacheList: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    spacesBeforeTextMustacheLEFT.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    textLeftMustache.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    spacesAfterTextMustacheLEFT.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    getStringFromArrayList(mustacheArrayList, numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    spacesBeforeTextMustacheRIGHT.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    spacesAfterTextMustacheRIGHT.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            return "MustacheList: {" + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    spacesBeforeTextMustacheLEFT.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    textLeftMustache.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    spacesAfterTextMustacheLEFT.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    getStringFromArrayList(mustacheArrayList, numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    spacesBeforeTextMustacheRIGHT.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    textRightMustache.toString(numberOfSpaces + 1) + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    spacesAfterTextMustacheRIGHT.toString() + '\n' + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
    }

    static public String getStringFromArrayList(ArrayList<Mustache> arrayList, int numberOfSpaces) {
        String result = "";
        for (int i = 0; i < arrayList.size(); i++) {
            result += arrayList.get(i).toString(numberOfSpaces);
        }
        return result;
    }

}
