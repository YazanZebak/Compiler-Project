package nodes.coustom.injectedHtml.prettyPrinter;

import java.util.ArrayList;

public class PrettyPrinter {
    static StringBuilder stringBuilder = new StringBuilder();

    static public void addToStringBuilder(String expr) {
        stringBuilder.append(expr);
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    static public String addSpaces(int numberOfSpaces) {
        String spaces = "";

        for (int i = 0; i < numberOfSpaces; i++) {
            spaces += '\t';
        }
        return spaces;
    }

    static public <T> String getStringFromArrayList(ArrayList<T> arrayList , int numberOfSpaces) {
        String result = "";
        for (int i = 0; i < arrayList.size(); i++) {
            result += arrayList.get(i).toString();
        }
        return result;
    }
}
