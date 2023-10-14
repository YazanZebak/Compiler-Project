package Main;

import AST.BaseASTVisitor;
import Base.BaseVisitor;
import SymbolTable.SymbolTable;
import SymbolTable.Scope;
import SymbolTable.Symbol;
import gen.HTMLLexer;
import gen.HTMLParser;
import nodes.HtmlDocument;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static SymbolTable symbolTable = new SymbolTable();

    public static void main(String[] args) {

        try {
            String source = "src/samples/sample.txt";
            CharStream cs = fromFileName(source);
            HTMLLexer lexer = new HTMLLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            HTMLParser parser = new HTMLParser(token);
            ParseTree tree = parser.htmlDocument();

            HtmlDocument htmlDocument = (HtmlDocument) new BaseVisitor().visit(tree);
            System.out.println("\n------------------------------------ BASE AST TREE ------------------------------------\n");
            System.out.println(htmlDocument);
            System.out.println("\n------------------------------------ AST TREE ------------------------------------\n");
            htmlDocument.accept(new BaseASTVisitor());
            System.out.println("\n------------------------------------ Main Scopes ------------------------------------\n");
            System.out.println("Number of scopes: " + symbolTable.getScopes().size());
            System.out.println("\n------------------------------------ Symbol Table ------------------------------------\n");
            for (Scope scope : symbolTable.getScopes()) {
                System.out.println(scope.getId());
                for (Map.Entry<String, Symbol> entry : scope.getSymbolMap().entrySet()) {
                    System.out.print(entry.getKey() + " : ");
                    if (entry.getValue().getType() != null) {
                        System.out.print(entry.getValue().getType().getName());
                    } else {
                        System.out.print(entry.getValue().getType());
                    }
                    System.out.println();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
