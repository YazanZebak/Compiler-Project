package nodes.coustom.injectedHtml.mustache_expr.question_mustache.properties;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.mustache_expr.filter_mustache.properties.FirstVarString;
import nodes.coustom.injectedHtml.mustache_expr.question_mustache.QuestionMustache;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

import java.util.ArrayList;

public class SecondVar extends Node {
    String VAR_BRACKET;
    int NUMBER_BRACKET;
    FirstVarString firstVarString;
    String BRACKET_MUSTACHE_Q_OPEN;
    String BRACKET_MUSTACHE_Q_CLOSE;
    ArrayList<QuestionMustache> questionMustacheArrayList = new ArrayList<>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (firstVarString != null)
            firstVarString.accept(astVisitor);
        for (QuestionMustache questionMustache : questionMustacheArrayList) {
            questionMustache.accept(astVisitor);
        }


    }


    public String getVAR_BRACKET() {
        return VAR_BRACKET;
    }

    public void setVAR_BRACKET(String VAR_BRACKET) {
        this.VAR_BRACKET = VAR_BRACKET;
    }

    public int getNUMBER_BRACKET() {
        return NUMBER_BRACKET;
    }

    public void setNUMBER_BRACKET(int NUMBER_BRACKET) {
        this.NUMBER_BRACKET = NUMBER_BRACKET;
    }

    public FirstVarString getFirstVarString() {
        return firstVarString;
    }

    public void setFirstVarString(FirstVarString firstVarString) {
        this.firstVarString = firstVarString;
    }

    public String getBRACKET_MUSTACHE_Q_OPEN() {
        return BRACKET_MUSTACHE_Q_OPEN;
    }

    public void setBRACKET_MUSTACHE_Q_OPEN(String BRACKET_MUSTACHE_Q_OPEN) {
        this.BRACKET_MUSTACHE_Q_OPEN = BRACKET_MUSTACHE_Q_OPEN;
    }

    public String getBRACKET_MUSTACHE_Q_CLOSE() {
        return BRACKET_MUSTACHE_Q_CLOSE;
    }

    public void setBRACKET_MUSTACHE_Q_CLOSE(String BRACKET_MUSTACHE_Q_CLOSE) {
        this.BRACKET_MUSTACHE_Q_CLOSE = BRACKET_MUSTACHE_Q_CLOSE;
    }

    public ArrayList<QuestionMustache> getQuestionMustacheArrayList() {
        return questionMustacheArrayList;
    }

    public void setQuestionMustacheArrayList(ArrayList<QuestionMustache> questionMustacheArrayList) {
        this.questionMustacheArrayList = questionMustacheArrayList;
    }

    public String toString(int numberOfSpaces) {
        if (VAR_BRACKET != null) {
            return "SecondVar: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "VAR_BRACKET: " + VAR_BRACKET + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (firstVarString != null) {
            return "SecondVar: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    "firstVarString: " + firstVarString.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        if (!questionMustacheArrayList.isEmpty()) {
            return "SecondVar: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    getStringFromArrayList(questionMustacheArrayList, numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        }
        return "SecondVar: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                "NUMBER_BRACKET: " + NUMBER_BRACKET + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }

    static public String getStringFromArrayList(ArrayList<QuestionMustache> arrayList, int numberOfSpaces) {
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
