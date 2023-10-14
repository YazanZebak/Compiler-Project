package nodes.coustom.injectedHtml.expression.expression_model.date;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

public class Date extends Node {
    Year year;
    Month month;
    Day day;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        day.accept(astVisitor);
        month.accept(astVisitor);
        year.accept(astVisitor);
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public String toString(int numberOfSpaces) {
        return "Date: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                year.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                month.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                day.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                '}';
    }
}
