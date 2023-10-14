package AST;

import Main.Main;
import SymbolTable.Scope;
import SymbolTable.Symbol;
import SymbolTable.Type;
import nodes.HtmlDocument;
import nodes.coustom.injectedHtml.expression.expression_app.ExpressionApp;
import nodes.coustom.injectedHtml.expression.expression_click.ExpressionClick;
import nodes.coustom.injectedHtml.expression.expression_default.ExpressionDefault;
import nodes.coustom.injectedHtml.expression.expression_for.ExprForWithArr;
import nodes.coustom.injectedHtml.expression.expression_for.ExprForWithIndex;
import nodes.coustom.injectedHtml.expression.expression_for.ExpressionFor;
import nodes.coustom.injectedHtml.expression.expression_for.varAfter.VarAfter;
import nodes.coustom.injectedHtml.expression.expression_for.varAfter.VarAftercomma;
import nodes.coustom.injectedHtml.expression.expression_for.varAfter.VarBeforeIndex;
import nodes.coustom.injectedHtml.expression.expression_for.varAfter.arr_elements.ArrElement;
import nodes.coustom.injectedHtml.expression.expression_for.varAfter.arr_elements.ArrElements;
import nodes.coustom.injectedHtml.expression.expression_for.varAfter.object.ElementObj;
import nodes.coustom.injectedHtml.expression.expression_for.varAfter.object.NumberValue;
import nodes.coustom.injectedHtml.expression.expression_for.varAfter.object.Object;
import nodes.coustom.injectedHtml.expression.expression_for.varAfter.object.VarQuote;
import nodes.coustom.injectedHtml.expression.expression_hide.*;
import nodes.coustom.injectedHtml.expression.expression_if.ExprIfWithFunc;
import nodes.coustom.injectedHtml.expression.expression_if.ExprIfWithVarDotVarSign;
import nodes.coustom.injectedHtml.expression.expression_if.ExpressionIf;
import nodes.coustom.injectedHtml.expression.expression_if.VarAfterIf;
import nodes.coustom.injectedHtml.expression.expression_if.expr_if_with_iteration_condition.*;
import nodes.coustom.injectedHtml.expression.expression_if.expr_if_with_iteration_condition.dot_iteration.DotIteration;
import nodes.coustom.injectedHtml.expression.expression_if.expr_if_with_iteration_condition.dot_iteration.VarDot;
import nodes.coustom.injectedHtml.expression.expression_model.ExpressionModel;
import nodes.coustom.injectedHtml.expression.expression_model.date.Date;
import nodes.coustom.injectedHtml.expression.expression_model.date.Day;
import nodes.coustom.injectedHtml.expression.expression_model.date.Month;
import nodes.coustom.injectedHtml.expression.expression_model.date.Year;
import nodes.coustom.injectedHtml.expression.expression_mouseover.ExpressionMouseOver;
import nodes.coustom.injectedHtml.expression.expression_show.ExpressionShow;
import nodes.coustom.injectedHtml.expression.expression_show.VarAfterShow;
import nodes.coustom.injectedHtml.expression.expression_show.function_show.FunctionShow;
import nodes.coustom.injectedHtml.expression.expression_show.function_show.Number;
import nodes.coustom.injectedHtml.expression.expression_show.function_show.Sign;
import nodes.coustom.injectedHtml.expression.expression_show.function_show.SignNumber;
import nodes.coustom.injectedHtml.expression.expression_switch.ExpressionSwitch;
import nodes.coustom.injectedHtml.expression.expression_switch.VarAfterSwitch;
import nodes.coustom.injectedHtml.expression.expression_switch_case.ExpressionSwitchCase;
import nodes.coustom.injectedHtml.expression.expression_type.ExpressionType;
import nodes.coustom.injectedHtml.expression.function_cp.*;
import nodes.coustom.injectedHtml.htmlAttributes.HtmlAttribute;
import nodes.coustom.injectedHtml.htmlAttributes.cp_app.CpApp;
import nodes.coustom.injectedHtml.htmlAttributes.cp_click.CpClick;
import nodes.coustom.injectedHtml.htmlAttributes.cp_for.CpFor;
import nodes.coustom.injectedHtml.htmlAttributes.cp_hide.CpHide;
import nodes.coustom.injectedHtml.htmlAttributes.cp_if.CpIf;
import nodes.coustom.injectedHtml.htmlAttributes.cp_model.CpModel;
import nodes.coustom.injectedHtml.htmlAttributes.cp_mouseover.CpMouseOver;
import nodes.coustom.injectedHtml.htmlAttributes.cp_show.CpShow;
import nodes.coustom.injectedHtml.htmlAttributes.cp_switch.CpSwitch;
import nodes.coustom.injectedHtml.htmlAttributes.cp_switch_case.CpSwitchCase;
import nodes.coustom.injectedHtml.htmlAttributes.cp_switch_default.CpSwitchDefault;
import nodes.coustom.injectedHtml.htmlAttributes.cp_type.CpType;
import nodes.coustom.injectedHtml.htmlAttributes.default_cp.DefaultCp;
import nodes.coustom.injectedHtml.htmlCharDataValues.HtmlChardataValues;
import nodes.coustom.injectedHtml.htmlChardata.HtmlCharDataWithMustache;
import nodes.coustom.injectedHtml.htmlChardata.HtmlCharDataWithoutMustache;
import nodes.coustom.injectedHtml.htmlChardata.HtmlChardata;
import nodes.coustom.injectedHtml.htmlContent.HtmlContent;
import nodes.coustom.injectedHtml.htmlDocument.HtmlElements;
import nodes.coustom.injectedHtml.htmlDocument.ScriptletOrSeaWs;
import nodes.coustom.injectedHtml.htmlElement.CloseHtmlAndContent;
import nodes.coustom.injectedHtml.htmlElement.HtmlElement;
import nodes.coustom.injectedHtml.htmlElement.HtmlMisc;
import nodes.coustom.injectedHtml.htmlElement.InnerCloseHtmlElement;
import nodes.coustom.injectedHtml.htmlMisc.HTMLComment;
import nodes.coustom.injectedHtml.html_text.HtmlText;
import nodes.coustom.injectedHtml.html_text.HtmlTextAfterMustache;
import nodes.coustom.injectedHtml.html_text.HtmlTextBeforeMustache;
import nodes.coustom.injectedHtml.mustach_list.Mustache;
import nodes.coustom.injectedHtml.mustach_list.MustacheList;
import nodes.coustom.injectedHtml.mustach_list.MustacheWithExpr;
import nodes.coustom.injectedHtml.mustach_list.MustacheWithoutExpr;
import nodes.coustom.injectedHtml.mustach_list.variable_bracket.FirstVariableBracket;
import nodes.coustom.injectedHtml.mustach_list.variable_bracket.SecondVariableBracket;
import nodes.coustom.injectedHtml.mustach_list.variable_bracket.Var;
import nodes.coustom.injectedHtml.mustach_list.variable_bracket.VarWithQuote;
import nodes.coustom.injectedHtml.mustache_expr.MustacheExpr;
import nodes.coustom.injectedHtml.mustache_expr.filter_mustache.FilterMustache;
import nodes.coustom.injectedHtml.mustache_expr.filter_mustache.properties.FilterKind;
import nodes.coustom.injectedHtml.mustache_expr.filter_mustache.properties.FirstVar;
import nodes.coustom.injectedHtml.mustache_expr.filter_mustache.properties.FirstVarString;
import nodes.coustom.injectedHtml.mustache_expr.formatter_mustache.FormatterMustache;
import nodes.coustom.injectedHtml.mustache_expr.formatter_mustache.properties.ExprFormatter;
import nodes.coustom.injectedHtml.mustache_expr.formatter_mustache.properties.Formatter;
import nodes.coustom.injectedHtml.mustache_expr.operatot_var.OperatorVar;
import nodes.coustom.injectedHtml.mustache_expr.operatot_var.properties.Operator;
import nodes.coustom.injectedHtml.mustache_expr.operatot_var.properties.VarType;
import nodes.coustom.injectedHtml.mustache_expr.operatot_var.properties.VarWithOperator;
import nodes.coustom.injectedHtml.mustache_expr.question_mustache.QuestionMustache;
import nodes.coustom.injectedHtml.mustache_expr.question_mustache.properties.SecondVar;
import nodes.coustom.injectedHtml.mustache_expr.varDotVar.VarDotVar;
import nodes.coustom.injectedHtml.mustache_expr.varDotVar.properties.IterationMustache;
import nodes.coustom.injectedHtml.mustache_expr.varDotVar.properties.IterationMustacheExpr;
import nodes.coustom.injectedHtml.mustache_expr.variable_mustache.VariableMustache;
import nodes.coustom.injectedHtml.spacesMushtache.SpacesAfterText;
import nodes.coustom.injectedHtml.spacesMushtache.SpacesAfterTextMustacheRIGHT;
import nodes.coustom.injectedHtml.spacesMushtache.SpacesBeforeText;
import nodes.coustom.injectedHtml.spacesMushtache.SpacesBeforeTextMustacheLEFT;
import nodes.coustom.injectedHtml.text_mustache.TextLeftMustache;
import nodes.coustom.injectedHtml.text_mustache.TextRightMustache;
import nodes.coustom.injectedHtml.var_condition_mustache.NumberMustache;
import nodes.coustom.injectedHtml.var_condition_mustache.SignMustache;
import nodes.coustom.injectedHtml.var_condition_mustache.VarConditionMustache;
import nodes.coustom.injectedHtml.var_condition_txt.IterationCondition;
import nodes.coustom.injectedHtml.var_condition_txt.VarConditionTxt;
import nodes.coustom.javaScript.*;
import nodes.coustom.javaScript.script_statment.LeftWhitespaces;
import nodes.coustom.javaScript.script_statment.RightWhitespaces;
import nodes.coustom.javaScript.script_statment.script_comment.ScriptComment;
import nodes.coustom.javaScript.script_statment.script_comment.line_comment.ContentLineComment;
import nodes.coustom.javaScript.script_statment.script_comment.line_comment.LineComment;
import nodes.coustom.javaScript.script_statment.script_comment.multi_line_comment.ContentComment;
import nodes.coustom.javaScript.script_statment.script_comment.multi_line_comment.MultiLineComment;
import nodes.coustom.javaScript.script_statment.script_do_while.ScriptDoWhile;
import nodes.coustom.javaScript.script_statment.script_do_while.ScriptWhileHeader;
import nodes.coustom.javaScript.script_statment.script_for.*;
import nodes.coustom.javaScript.script_statment.script_for.x_variable_for.NumberFor;
import nodes.coustom.javaScript.script_statment.script_for.x_variable_for.StringFor;
import nodes.coustom.javaScript.script_statment.script_for.x_variable_for.XVariableFor;
import nodes.coustom.javaScript.script_statment.script_function.FuncBody.FuncBody;
import nodes.coustom.javaScript.script_statment.script_function.FuncBody.ReturnFunctionBody;
import nodes.coustom.javaScript.script_statment.script_function.ScriptFunction;
import nodes.coustom.javaScript.script_statment.script_function.script_fun_return.ScriptFunReturn;
import nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_empty_string.ScriptEmptyString;
import nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_identifier.ScriptIdentifier;
import nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_value_number.ScriptValueNumber;
import nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_value_string.ScriptValueString;
import nodes.coustom.javaScript.script_statment.script_function.script_fun_return.script_value_string.Value;
import nodes.coustom.javaScript.script_statment.script_function.script_function_par.FuncParameters;
import nodes.coustom.javaScript.script_statment.script_function.script_function_par.ScriptFunctionPar;
import nodes.coustom.javaScript.script_statment.script_if.LeftBracket;
import nodes.coustom.javaScript.script_statment.script_if.RightBracket;
import nodes.coustom.javaScript.script_statment.script_if.ScriptIf;
import nodes.coustom.javaScript.script_statment.script_if.script_normal_if_while.IfSign;
import nodes.coustom.javaScript.script_statment.script_if.script_normal_if_while.ScriptIdentifierIf;
import nodes.coustom.javaScript.script_statment.script_if.script_normal_if_while.ScriptNormalIfWhile;
import nodes.coustom.javaScript.script_statment.script_if.script_normal_if_while.if_condition_value.IfConditionValue;
import nodes.coustom.javaScript.script_statment.script_if.script_normal_if_while.if_condition_value.IfNumberValue;
import nodes.coustom.javaScript.script_statment.script_if.script_normal_if_while.if_condition_value.IfStringValue;
import nodes.coustom.javaScript.script_statment.script_if.script_not_if_while.IfNot;
import nodes.coustom.javaScript.script_statment.script_if.script_not_if_while.IfNotInBracket;
import nodes.coustom.javaScript.script_statment.script_if.script_not_if_while.ScriptNotIfWhile;
import nodes.coustom.javaScript.script_statment.script_obj.ScriptObj;
import nodes.coustom.javaScript.script_statment.script_obj.script_obj_value.ScriptObjElement;
import nodes.coustom.javaScript.script_statment.script_obj.script_obj_value.ScriptObjValue;
import nodes.coustom.javaScript.script_statment.script_var.ScriptVar;
import nodes.coustom.javaScript.script_statment.script_var.script_value.ScriptValue;
import nodes.coustom.javaScript.script_statment.script_var.script_value.script_value_array.ScriptValueArray;
import nodes.coustom.javaScript.script_statment.script_var.script_value.script_value_array.array_element.ArrayElement;
import nodes.coustom.javaScript.script_statment.script_while.ScriptWhile;


public class BaseASTVisitor implements ASTVisitor {

    @Override
    public void visit(HtmlDocument htmlDocument) {
        System.out.println("ast HTMLDocument");
        System.out.println(htmlDocument.toString());
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(HtmlElements htmlElements) {
        System.out.println("ast HtmlElements");
        System.out.println(htmlElements.toString());
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptletOrSeaWs scriptletOrSeaWs) {
        System.out.println("ast scriptletOrSeaWs");
        System.out.println(scriptletOrSeaWs.toString());
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(HtmlElement htmlElement) {
        System.out.println("ast HtmlElement");
        System.out.println(htmlElement.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(HtmlMisc htmlMisc) {
        System.out.println("ast HtmlMisc");
        System.out.println(htmlMisc.toString());
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(HtmlAttribute htmlAttribute) {
        System.out.println("ast HtmlAttribute");
        System.out.println(htmlAttribute.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(CloseHtmlAndContent closeHtmlAndContent) {
        System.out.println("ast CloseHtmlAndContent");
        System.out.println(closeHtmlAndContent.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(Script script) {
        System.out.println("ast Script");
        System.out.println(script.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(InnerCloseHtmlElement innerCloseHtmlElement) {
        System.out.println("ast InnerCloseHtmlElement");
        System.out.println(innerCloseHtmlElement.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(HtmlContent htmlContent) {
        System.out.println("ast HtmlContent");
        System.out.println(htmlContent.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(HtmlChardata htmlChardata) {
        System.out.println("ast HtmlChardata");
        System.out.println(htmlChardata.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(HtmlChardataValues htmlChardataValues) {
        System.out.println("ast HtmlChardataValues");
        System.out.println(htmlChardataValues.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(HtmlCharDataWithMustache htmlCharDataWithMustache) {
        System.out.println("ast HtmlCharDataWithMustache");
        System.out.println(htmlCharDataWithMustache.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(HtmlCharDataWithoutMustache htmlCharDataWithoutMustache) {
        System.out.println("ast HtmlCharDataWithoutMustache");
        System.out.println(htmlCharDataWithoutMustache.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(HTMLComment htmlComment) {
        System.out.println("ast HTMLComment");
        System.out.println(htmlComment.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(MustacheList mustacheList) {
        System.out.println("ast MustacheList");
        System.out.println(mustacheList.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(TextLeftMustache textLeftMustache) {
        System.out.println("ast TextLeftMustache");
        System.out.println(textLeftMustache.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(Mustache mustache) {
        System.out.println("ast Mustache");
        System.out.println(mustache.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(TextRightMustache textRightMustache) {
        System.out.println("ast TextRightMustache");
        System.out.println(textRightMustache.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(HtmlTextBeforeMustache htmlTextBeforeMustache) {
        System.out.println("ast HtmlTextBeforeMustache");
        System.out.println(htmlTextBeforeMustache.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(VarConditionTxt varConditionTxt) {
        System.out.println("ast VarConditionTxt");
        System.out.println(varConditionTxt.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(VarConditionMustache varConditionMustache) {
        System.out.println("ast VarConditionMustache");
        System.out.println(varConditionMustache.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(SignMustache signMustache) {
        System.out.println("ast SignMustache");
        System.out.println(signMustache.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(NumberMustache numberMustache) {
        System.out.println("ast NumberMustache");
        System.out.println(numberMustache.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(HtmlTextAfterMustache htmlTextAfterMustache) {
        System.out.println("ast HtmlTextAfterMustache");
        System.out.println(htmlTextAfterMustache.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(MustacheWithExpr mustacheWithExpr) {
        System.out.println("ast MustacheWithExpr");
        System.out.println(mustacheWithExpr.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(MustacheWithoutExpr mustacheWithoutExpr) {
        System.out.println("ast MustacheWithoutExpr");
        System.out.println(mustacheWithoutExpr.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(SpacesBeforeTextMustacheLEFT spacesBeforeTextMustacheLEFT) {
        System.out.println("ast SpacesBeforeTextMustacheLEFT");
        System.out.println(spacesBeforeTextMustacheLEFT.toString());
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(MustacheExpr mustacheExpr) {
        System.out.println("ast MustacheExpr");
        System.out.println(mustacheExpr.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(SpacesAfterTextMustacheRIGHT spacesAfterTextMustacheRIGHT) {
        System.out.println("ast SpacesAfterTextMustacheRIGHT");
        System.out.println(spacesAfterTextMustacheRIGHT.toString());
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(FilterMustache filterMustache) {
        System.out.println("ast FilterMustache");
        System.out.println(filterMustache.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(QuestionMustache questionMustache) {
        System.out.println("ast QuestionMustache");
        System.out.println(questionMustache.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(VariableMustache variableMustache) {
        System.out.println("ast VariableMustache");
        System.out.println(variableMustache.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(FormatterMustache formatterMustache) {
        System.out.println("ast FormatterMustache");
        System.out.println(formatterMustache.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(VarDotVar varDotVar) {
        System.out.println("ast VarDotVar");
        System.out.println(varDotVar.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(FirstVariableBracket firstVariableBracket) {
        System.out.println("ast FirstVariableBracket");
        System.out.println(firstVariableBracket.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(SpacesBeforeText spacesBeforeText) {
        System.out.println("ast SpacesBeforeText");
        System.out.println(spacesBeforeText.toString());
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(HtmlText htmlText) {
        System.out.println("ast HtmlText");
        System.out.println(htmlText.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(SpacesAfterText spacesAfterText) {
        System.out.println("ast SpacesAfterText");
        System.out.println(spacesAfterText.toString());
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(SecondVariableBracket secondVariableBracket) {
        System.out.println("ast SecondVariableBracket");
        System.out.println(secondVariableBracket.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(Var var) {
        System.out.println("ast Var");
        System.out.println(var.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(VarWithQuote varWithQuote) {
        System.out.println("ast VarWithQuote");
        System.out.println(varWithQuote.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(FirstVar firstVar) {
        System.out.println("ast FirstVar");
        System.out.println(firstVar.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(FilterKind filterKind) {
        System.out.println("ast FilterKind");
        System.out.println(filterKind.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(FirstVarString firstVarString) {
        System.out.println("ast FirstVarString");
        System.out.println(firstVarString.toString());
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(SecondVar secondVar) {
        System.out.println("ast SecondVar");
        System.out.println(secondVar.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ExprFormatter exprFormatter) {
        System.out.println("ast ExprFormatter");
        System.out.println(exprFormatter.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(Formatter formatter) {
        System.out.println("ast Formatter");
        System.out.println(formatter.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(CpShow cpShow) {
        System.out.println("ast CpShow");
        System.out.println(cpShow.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(CpApp cpApp) {
        System.out.println("ast CpApp");
        System.out.println(cpApp.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(CpFor cpFor) {
        System.out.println("ast CpFor");
        System.out.println(cpFor.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(CpIf cpIf) {
        System.out.println("ast CpIf");
        System.out.println(cpIf.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(CpHide cpHide) {
        System.out.println("ast CpHide");
        System.out.println(cpHide.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(CpSwitch cpSwitch) {
        System.out.println("ast CpSwitch");
        System.out.println(cpSwitch.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(CpSwitchCase cpSwitchCase) {
        System.out.println("ast CpSwitchCase");
        System.out.println(cpSwitchCase.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(CpSwitchDefault cpSwitchDefault) {
        System.out.println("ast CpSwitchDefault");
        System.out.println(cpSwitchDefault.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(CpModel cpModel) {
        System.out.println("ast CpModel");
        System.out.println(cpModel.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(CpType cpType) {
        System.out.println("ast CpType");
        System.out.println(cpType.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(CpClick cpClick) {
        System.out.println("ast CpClick");
        System.out.println(cpClick.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(CpMouseOver cpMouseOver) {
        System.out.println("ast CpMouseOver");
        System.out.println(cpMouseOver.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(DefaultCp defaultCp) {
        System.out.println("ast DefaultCp");
        System.out.println(defaultCp.toString());
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ExpressionShow expressionShow) {
        System.out.println("ast ExpressionShow");
        System.out.println(expressionShow.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(VarAfterShow varAfterShow) {
        System.out.println("ast VarAfterShow");
        System.out.println(varAfterShow.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(FunctionShow functionShow) {
        System.out.println("ast FunctionShow");
        System.out.println(functionShow.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(FunctionCp functionCp) {
        System.out.println("ast FunctionCp");
        System.out.println(functionCp.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(SignNumber signNumber) {
        System.out.println("ast SignNumber");
        System.out.println(signNumber.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(Sign sign) {
        System.out.println("ast Sign");
        System.out.println(sign.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(Number number) {
        System.out.println("ast Number");
        System.out.println(number.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(FuncParametersCP funcParametersCP) {
        System.out.println("ast FuncParametersCP");
        System.out.println(funcParametersCP.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(FunParam funParam) {
        System.out.println("ast FunParam");
        System.out.println(funParam.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ExpressionApp expressionApp) {
        System.out.println("ast ExpressionApp");
        System.out.println(expressionApp.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ExpressionIf expressionIf) {
        System.out.println("ast ExpressionIf");
        System.out.println(expressionIf.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(Not not) {
        System.out.println("ast Not");
        System.out.println(not.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ExprIfWithVarDotVarSign exprIfWithVarDotVarSign) {
        System.out.println("ast ExprIfWithVarDotVarSign");
        System.out.println(exprIfWithVarDotVarSign.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ExprIfWithFunc exprIfWithFunc) {
        System.out.println("ast ExprIfWithFunc");
        System.out.println(exprIfWithFunc.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(VarAfterIf varAfterIf) {
        System.out.println("ast VarAfterIf");
        System.out.println(varAfterIf.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ExpressionHide expressionHide) {
        System.out.println("ast ExpressionHide");
        System.out.println(expressionHide.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ExprHideWithFunc exprHideWithFunc) {
        System.out.println("ast ExprHideWithFunc");
        System.out.println(exprHideWithFunc.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ExprHideWithNotVarDotVar exprHideWithNotVarDotVar) {
        System.out.println("ast ExprHideWithNotVarDotVar");
        System.out.println(exprHideWithNotVarDotVar.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(VarAfterHide varAfterHide) {
        System.out.println("ast VarAfterHide");
        System.out.println(varAfterHide.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ExpressionSwitch expressionSwitch) {
        System.out.println("ast ExpressionSwitch");
        System.out.println(expressionSwitch.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(VarAfterSwitch varAfterSwitch) {
        System.out.println("ast VarAfterSwitch");
        System.out.println(varAfterSwitch.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ExpressionSwitchCase expressionSwitchCase) {
        System.out.println("ast ExpressionSwitchCase");
        System.out.println(expressionSwitchCase.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ExpressionModel expressionModel) {
        System.out.println("ast ExpressionModel");
        System.out.println(expressionModel.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(Date date) {
        System.out.println("ast Date");
        System.out.println(date.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(Year year) {
        System.out.println("ast Year");
        System.out.println(year.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(Month month) {
        System.out.println("ast Month");
        System.out.println(month.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(Day day) {
        System.out.println("ast Day");
        System.out.println(day.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ExpressionType expressionType) {
        System.out.println("ast ExpressionType");
        System.out.println(expressionType.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ExpressionClick expressionClick) {
        System.out.println("ast ExpressionClick");
        System.out.println(expressionClick.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ExpressionMouseOver expressionMouseOver) {
        System.out.println("ast ExpressionMouseOver");
        System.out.println(expressionMouseOver.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ExpressionDefault expressionDefault) {
        System.out.println("ast ExpressionDefault");
        System.out.println(expressionDefault.toString());
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ExpressionFor expressionFor) {
        System.out.println("ast ExpressionFor");

        if (expressionFor.getVAR() != null) {
            createSymbol(expressionFor.getScopeId(), expressionFor.getVAR(), null, false);
        }
        if (expressionFor.getVarAfter() != null && expressionFor.getVarAfter().getVAR() != null) {
            createSymbol(expressionFor.getScopeId(), expressionFor.getVarAfter().getVAR(), null, false);
        }

        System.out.println(expressionFor.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(VarAfter varAfter) {
        System.out.println("ast VarAfter");
        System.out.println(varAfter.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ExprForWithArr exprForWithArr) {
        System.out.println("ast ExprForWithArr");

        System.out.println(exprForWithArr.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ExprForWithIndex exprForWithIndex) {
        System.out.println("ast ExprForWithIndex");
        if (exprForWithIndex.getVAR() != null) {
            createSymbol(exprForWithIndex.getScopeId(), exprForWithIndex.getVAR(), null, false);
        }
        System.out.println(exprForWithIndex.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ArrElements arrElements) {
        System.out.println("ast ArrElements");
        System.out.println(arrElements.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(Object object) {
        System.out.println("ast Object");
        System.out.println(object.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ArrElement arrElement) {
        System.out.println("ast ArrElement");
        System.out.println(arrElement.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ElementObj elementObj) {
        System.out.println("ast ElementObj");
        System.out.println(elementObj.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(VarQuote varQuote) {
        System.out.println("ast VarQuote");
        System.out.println(varQuote.toString());
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(NumberValue numberValue) {
        System.out.println("ast NumberValue");
        System.out.println(numberValue.toString());
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(VarAftercomma varAftercomma) {
        System.out.println("ast VarAftercomma");
        System.out.println(varAftercomma.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(VarBeforeIndex varBeforeIndex) {
        System.out.println("ast VarBeforeIndex");
        if(varBeforeIndex.getVAR() != null){
            createSymbol(varBeforeIndex.getScopeId(), varBeforeIndex.getVAR(), new Type("var"), false);
        }
        System.out.println(varBeforeIndex.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptBody scriptBody) {
        System.out.println("ast ScriptBody");
        System.out.println(scriptBody.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptListStatement scriptListStatement) {
        System.out.println("ast ScriptListStatement");
        System.out.println(scriptListStatement.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptStatement scriptStatement) {
        System.out.println("ast ScriptStatement");
        System.out.println(scriptStatement.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(LeftWhitespaces leftWhitespaces) {
        System.out.println("ast LeftWhitespaces");
        System.out.println(leftWhitespaces.toString());
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(RightWhitespaces rightWhitespaces) {
        System.out.println("ast RightWhitespaces");
        System.out.println(rightWhitespaces.toString());
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(WhiteSpaces whiteSpaces) {
        System.out.println("ast WhiteSpaces");
        System.out.println(whiteSpaces.toString());
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptFunction scriptFunction) {
        System.out.println("ast ScriptFunction");
        System.out.println(scriptFunction.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptVar scriptVar) {
        System.out.println("ast ScriptVar");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptObj scriptObj) {
        System.out.println("ast ScriptObj");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptComment scriptComment) {
        System.out.println("ast ScriptComment");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptFor scriptFor) {
        System.out.println("ast ScriptFor");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptIf scriptIf) {
        System.out.println("ast ScriptIf");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptWhile scriptWhile) {
        System.out.println("ast ScriptWhile");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptDoWhile scriptDoWhile) {
        System.out.println("ast ScriptDoWhile");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptIdentifier scriptIdentifier) {
        System.out.println("ast ScriptIdentifier");
        System.out.println(scriptIdentifier.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptFunctionPar scriptFunctionPar) {
        System.out.println("ast ScriptFunctionPar");
        System.out.println(scriptFunctionPar.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(FuncParameters funcParameters) {
        System.out.println("ast FuncParameters");
        System.out.println(funcParameters.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(FuncBody funcBody) {
        System.out.println("ast FuncBody");
        System.out.println(funcBody.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ReturnFunctionBody returnFunctionBody) {
        System.out.println("ast ReturnFunctionBody");
        System.out.println(returnFunctionBody.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptFunReturn scriptFunReturn) {
        System.out.println("ast ScriptFunReturn");
        System.out.println(scriptFunReturn.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptValueString scriptValueString) {
        System.out.println("ast ScriptValueString");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptValueNumber scriptValueNumber) {
        System.out.println("ast ScriptValueNumber");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptEmptyString scriptEmptyString) {
        System.out.println("ast ScriptEmptyString");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(Value value) {
        System.out.println("ast Value");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptValue scriptValue) {
        System.out.println("ast ScriptValue");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptValueArray scriptValueArray) {
        System.out.println("ast ScriptValueArray");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ArrayElement arrayElement) {
        System.out.println("ast ArrayElement");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptObjValue scriptObjValue) {
        System.out.println("ast ScriptObjValue");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptObjElement scriptObjElement) {
        System.out.println("ast ScriptObjElement");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(LineComment lineComment) {
        System.out.println("ast LineComment");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(MultiLineComment multiLineComment) {
        System.out.println("ast MultiLineComment");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ContentLineComment contentLineComment) {
        System.out.println("ast ContentLineComment");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ContentComment contentComment) {
        System.out.println("ast ContentComment");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptIdentifierFor scriptIdentifierFor) {
        System.out.println("ast ScriptIdentifierFor");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(NumberFor numberFor) {
        System.out.println("ast NumberFor");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptIdentifierForAfterSemicol scriptIdentifierForAfterSemicol) {
        System.out.println("ast ScriptIdentifierForAfterSemicol");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(XSignFor xSignFor) {
        System.out.println("ast XSignFor");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(XVariableFor xVariableFor) {
        System.out.println("ast XVariableFor");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptIdentifierForBeforeSings scriptIdentifierForBeforeSings) {
        System.out.println("ast ScriptIdentifierForBeforeSings");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(SignFor signFor) {
        System.out.println("ast SignFor");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(StringFor stringFor) {
        System.out.println("ast StringFor");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptNormalIfWhile scriptNormalIfWhile) {
        System.out.println("ast ScriptNormalIfWhile");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptNotIfWhile scriptNotIfWhile) {
        System.out.println("ast ScriptNotIfWhile");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptIdentifierIf scriptIdentifierIf) {
        System.out.println("ast ScriptIdentifierIf");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(IfSign ifSign) {
        System.out.println("ast IfSign");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(IfConditionValue ifConditionValue) {
        System.out.println("ast IfConditionValue");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(IfNumberValue ifNumberValue) {
        System.out.println("ast IfNumberValue");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(IfStringValue ifStringValue) {
        System.out.println("ast IfStringValue");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(IfNot ifNot) {
        System.out.println("ast IfNot");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ScriptWhileHeader scriptWhileHeader) {
        System.out.println("ast ScriptWhileHeader");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(RightBracket rightBracket) {
        System.out.println("ast RightBracket");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(LeftBracket leftBracket) {
        System.out.println("ast LeftBracket");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(IfNotInBracket ifNotInBracket) {
        System.out.println("ast IfNotInBracket");
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(OperatorVar operatorVar) {
        System.out.println("ast operatorVar");
        System.out.println(operatorVar.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(VarWithOperator varWithOperator) {
        System.out.println("ast varWithOperator");
        System.out.println(varWithOperator.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(VarType varType) {
        System.out.println("ast varType");
        System.out.println(varType.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(Operator operator) {
        System.out.println("ast operator");
        System.out.println(operator.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(Equation equation) {
        System.out.println("ast equation");
        System.out.println(equation.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(EquationParam equationParam) {
        System.out.println("ast equationParam");
        System.out.println(equationParam.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(DotIteration dotIteration) {
        System.out.println("ast dotIteration");
        System.out.println(dotIteration.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(VarDot varDot) {
        System.out.println("ast varDot");
        System.out.println(varDot.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(AttributeFunc attributeFunc) {
        System.out.println("ast attributeFunc");
        System.out.println(attributeFunc.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(AttributeVarDotVar attributeVarDotVar) {
        System.out.println("ast attributeVarDotVar");
        System.out.println(attributeVarDotVar.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(ExprIfWithIterationCondition exprIfWithIterationCondition) {
        System.out.println("ast exprIfWithIterationCondition");
        System.out.println(exprIfWithIterationCondition.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(Iteration iteration) {
        System.out.println("ast iteration");
        System.out.println(iteration.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(IterationExpr iterationExpr) {
        System.out.println("ast iterationExpr");
        System.out.println(iterationExpr.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(IterationExprWithGates iterationExprWithGates) {
        System.out.println("ast iterationExprWithGates");
        System.out.println(iterationExprWithGates.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(IterationMustache iterationMustache) {
        System.out.println("ast iterationMustache");
        System.out.println(iterationMustache.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(IterationMustacheExpr iterationMustacheExpr) {
        System.out.println("ast iterationMustacheExpr");
        System.out.println(iterationMustacheExpr.toString(0));
        System.out.println("----------------*********----------------");
    }

    @Override
    public void visit(IterationCondition iterationCondition) {
        System.out.println("ast iterationCondition");
        System.out.println(iterationCondition.toString(0));
        System.out.println("----------------*********----------------");
    }

    private void createSymbol(int scopeID, String name, Type type, boolean isParam) {
        System.out.println("createSymbol " + name);
        Scope scope = Main.symbolTable.getScopeByID(scopeID);
        Symbol symbol = new Symbol(name);
        symbol.setType(type);
        symbol.setParam(isParam);
        symbol.setScope(scope);
        scope.addSymbol(name, symbol);
    }


}
