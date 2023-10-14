package Base;

import Main.Main;
import SymbolTable.Scope;
import gen.HTMLParser;
import gen.HTMLParserBaseVisitor;
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
import nodes.HtmlDocument;
import nodes.coustom.injectedHtml.htmlElement.*;
import nodes.coustom.injectedHtml.htmlDocument.ScriptletOrSeaWs;
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
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;
import nodes.coustom.injectedHtml.spacesMushtache.*;
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

public class BaseVisitor extends HTMLParserBaseVisitor {
    @Override
    public HtmlDocument visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx) {
        System.out.println("visitHtmlDocument");
        HtmlDocument htmlDocument = new HtmlDocument();
        // htmlDocument.setScopeId(getCurrentScope().getId());
        for (int i = 0; i < ctx.htmlElements().size(); i++) {
            htmlDocument.getElements().add(visitHtmlElements(ctx.htmlElements(i)));
        }

        for (int i = 0; i < ctx.scriptletOrSeaWs().size(); i++) {
            htmlDocument.getScriptletOrSeaWs().add(visitScriptletOrSeaWs(ctx.scriptletOrSeaWs(i)));
        }
        PrettyPrinter.addToStringBuilder(htmlDocument.toString());
        return htmlDocument;
    }

    @Override
    public HtmlElements visitHtmlElements(HTMLParser.HtmlElementsContext ctx) {
        System.out.println("visitHtmlElements");
        HtmlElements htmlElements = new HtmlElements();
        //  htmlElements.setScopeId(getCurrentScope().getId());
        htmlElements.setHtmlElement(visitHtmlElement(ctx.htmlElement()));
        for (int i = 0; i < ctx.htmlMisc().size(); i++) {
            htmlElements.getHtmlMiscs().add(visitHtmlMisc(ctx.htmlMisc(i)));
        }
        return htmlElements;
    }

    @Override
    public ScriptletOrSeaWs visitScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx) {
        System.out.println("visitScriptletOrSeaWs");
        ScriptletOrSeaWs scriptletOrSeaWs = new ScriptletOrSeaWs();
        // scriptletOrSeaWs.setScopeId(getCurrentScope().getId());
        if (ctx.SCRIPTLET() != null) {
            scriptletOrSeaWs.setSCRIPTLET(ctx.SCRIPTLET().getText());
        }
        if (ctx.SEA_WS() != null) {
            scriptletOrSeaWs.setSEA_WS(ctx.SEA_WS().getText());

        }


        return scriptletOrSeaWs;
    }

    @Override
    public HtmlElement visitHtmlElement(HTMLParser.HtmlElementContext ctx) {
        System.out.println("visitHtmlElement");
        createScope();
        HtmlElement htmlElement = new HtmlElement();
        htmlElement.setScopeId(getCurrentScope().getId());
        if (ctx.TAG_OPEN() != null) {
            htmlElement.setTAG_OPEN(ctx.TAG_OPEN().getText());
        }
        if (ctx.TAG_NAME() != null) {
            htmlElement.setTAG_NAME(ctx.TAG_NAME().getText());
        }
        for (int i = 0; i < ctx.htmlAttribute().size(); i++) {
            htmlElement.getHtmlAttributes().add(visitHtmlAttribute(ctx.htmlAttribute(i)));
        }

        if (ctx.closeHtmlAndContent() != null) {
            htmlElement.setCloseHtmlAndContent(visitCloseHtmlAndContent(ctx.closeHtmlAndContent()));
        }

        if (ctx.script() != null) {
            htmlElement.setScript(visitScript(ctx.script()));
        }
        removeScope();

        return htmlElement;
    }

    @Override
    public Script visitScript(HTMLParser.ScriptContext ctx) {
        System.out.println("visitScript");
        Script script = new Script();
        script.setScopeId(getCurrentScope().getId());
        script.setSCRIPT_CLOSE(ctx.SCRIPT_CLOSE().getText());
        script.setSCRIPT_OPEN(ctx.SCRIPT_OPEN().getText());
        script.setScriptBody(visitScript_body(ctx.script_body()));

        return script;
    }

    @Override
    public ScriptBody visitScript_body(HTMLParser.Script_bodyContext ctx) {
        System.out.println("visitScript_body");
        ScriptBody scriptBody = new ScriptBody();
        scriptBody.setScopeId(getCurrentScope().getId());
        scriptBody.setScriptListStatement(visitScript_list_statement(ctx.script_list_statement()));

        return scriptBody;
    }

    @Override
    public ScriptListStatement visitScript_list_statement(HTMLParser.Script_list_statementContext ctx) {
        System.out.println("visitScript_list_statement");
        ScriptListStatement scriptListStatement = new ScriptListStatement();
        scriptListStatement.setScopeId(getCurrentScope().getId());
        scriptListStatement.setLeftWhitespaces(visitLeft_whitespaces(ctx.left_whitespaces()));
        scriptListStatement.setRightWhitespaces(visitRight_whitespaces(ctx.right_whitespaces()));
        for (int i = 0; i < ctx.script_statement().size(); i++) {
            scriptListStatement.getScriptStatementArrayList().add(visitScript_statement(ctx.script_statement(i)));
        }

        return scriptListStatement;
    }

    @Override
    public ScriptStatement visitScript_statement(HTMLParser.Script_statementContext ctx) {
        System.out.println("visitScript_statement");
        ScriptStatement scriptStatement = new ScriptStatement();
        scriptStatement.setScopeId(getCurrentScope().getId());
        scriptStatement.setLeftWhitespaces(visitLeft_whitespaces(ctx.left_whitespaces()));
        scriptStatement.setRightWhitespaces(visitRight_whitespaces(ctx.right_whitespaces()));
        if (ctx.script_function() != null) {
            scriptStatement.setScriptFunction(visitScript_function(ctx.script_function()));
        }
        if (ctx.script_var() != null) {
            scriptStatement.setScriptVar(visitScript_var(ctx.script_var()));
        }
        if (ctx.script_obj() != null) {
            scriptStatement.setScriptObj(visitScript_obj(ctx.script_obj()));
        }
        if (ctx.script_comment() != null) {
            scriptStatement.setScriptComment(visitScript_comment(ctx.script_comment()));
        }
        if (ctx.script_for() != null) {
            scriptStatement.setScriptFor(visitScript_for(ctx.script_for()));
        }
        if (ctx.script_if() != null) {
            scriptStatement.setScriptIf(visitScript_if(ctx.script_if()));
        }
        if (ctx.script_while() != null) {
            scriptStatement.setScriptWhile(visitScript_while(ctx.script_while()));
        }
        if (ctx.script_do_while() != null) {
            scriptStatement.setScriptDoWhile(visitScript_do_while(ctx.script_do_while()));
        }

        return scriptStatement;
    }

    @Override
    public ScriptDoWhile visitScript_do_while(HTMLParser.Script_do_whileContext ctx) {
        System.out.println("visitScript_do_while");
        ScriptDoWhile scriptDoWhile = new ScriptDoWhile();
        scriptDoWhile.setScopeId(getCurrentScope().getId());
        scriptDoWhile.setScriptListStatement(visitScript_list_statement(ctx.script_list_statement()));
        scriptDoWhile.setScriptWhileHeader(visitScript_while_header(ctx.script_while_header()));

        return scriptDoWhile;
    }

    @Override
    public ScriptWhileHeader visitScript_while_header(HTMLParser.Script_while_headerContext ctx) {
        System.out.println("visitScript_while_header");
        ScriptWhileHeader scriptWhileHeader = new ScriptWhileHeader();
        scriptWhileHeader.setScopeId(getCurrentScope().getId());
        if (ctx.if_sign() != null) {
            scriptWhileHeader.setIfConditionValue(visitIf_condition_value(ctx.if_condition_value()));
            scriptWhileHeader.setIfSign(visitIf_sign(ctx.if_sign()));
        }
        scriptWhileHeader.setScriptIdentifierIf(visitScript_identifier_if(ctx.script_identifier_if()));
        if (ctx.if_not() != null) {
            scriptWhileHeader.setIfNot(visitIf_not(ctx.if_not()));
        }
        for (int i = 0; i < ctx.right_bracket().size(); i++) {
            scriptWhileHeader.getRightBracketArrayList().add(visitRight_bracket(ctx.right_bracket(i)));
        }
        for (int i = 0; i < ctx.left_bracket().size(); i++) {
            scriptWhileHeader.getLeftBracketArrayList().add(visitLeft_bracket(ctx.left_bracket(i)));
        }
        if (ctx.if_not_in_bracket() != null) {
            scriptWhileHeader.setIfNotInBracket(visitIf_not_in_bracket(ctx.if_not_in_bracket()));
        }

        return scriptWhileHeader;
    }

    @Override
    public ScriptWhile visitScript_while(HTMLParser.Script_whileContext ctx) {
        System.out.println("visitScript_while");
        ScriptWhile scriptWhile = new ScriptWhile();
        scriptWhile.setScopeId(getCurrentScope().getId());
        if (ctx.script_normal_if_while() != null) {
            scriptWhile.setScriptNormalIfWhile(visitScript_normal_if_while(ctx.script_normal_if_while()));
        }
        if (ctx.script_not_if_while() != null) {
            scriptWhile.setScriptNotIfWhile(visitScript_not_if_while(ctx.script_not_if_while()));
        }

        return scriptWhile;
    }

    @Override
    public ScriptIf visitScript_if(HTMLParser.Script_ifContext ctx) {
        System.out.println("visitScript_if");
        ScriptIf scriptIf = new ScriptIf();
        scriptIf.setScopeId(getCurrentScope().getId());
        if (ctx.script_normal_if_while() != null) {
            scriptIf.setScriptNormalIfWhile(visitScript_normal_if_while(ctx.script_normal_if_while()));
        }
        if (ctx.script_not_if_while() != null) {
            scriptIf.setScriptNotIfWhile(visitScript_not_if_while(ctx.script_not_if_while()));
        }

        return scriptIf;
    }

    @Override
    public ScriptNotIfWhile visitScript_not_if_while(HTMLParser.Script_not_if_whileContext ctx) {
        System.out.println("visitScript_not_if_while");
        ScriptNotIfWhile scriptNotIfWhile = new ScriptNotIfWhile();
        scriptNotIfWhile.setScopeId(getCurrentScope().getId());
        if (ctx.if_sign() != null) {
            scriptNotIfWhile.setIfConditionValue(visitIf_condition_value(ctx.if_condition_value()));
            scriptNotIfWhile.setIfSign(visitIf_sign(ctx.if_sign()));
        }
        scriptNotIfWhile.setScriptIdentifierIf(visitScript_identifier_if(ctx.script_identifier_if()));
        scriptNotIfWhile.setIfNot(visitIf_not(ctx.if_not()));
        scriptNotIfWhile.setScriptListStatement(visitScript_list_statement(ctx.script_list_statement()));
        for (int i = 0; i < ctx.right_bracket().size(); i++) {
            scriptNotIfWhile.getRightBracketArrayList().add(visitRight_bracket(ctx.right_bracket(i)));
        }
        for (int i = 0; i < ctx.left_bracket().size(); i++) {
            scriptNotIfWhile.getLeftBracketArrayList().add(visitLeft_bracket(ctx.left_bracket(i)));
        }
        if (ctx.if_not_in_bracket() != null) {
            scriptNotIfWhile.setIfNotInBracket(visitIf_not_in_bracket(ctx.if_not_in_bracket()));
        }

        return scriptNotIfWhile;
    }

    @Override
    public IfNotInBracket visitIf_not_in_bracket(HTMLParser.If_not_in_bracketContext ctx) {
        System.out.println("visitIf_not_in_bracket");
        IfNotInBracket ifNotInBracket = new IfNotInBracket();
        ifNotInBracket.setScopeId(getCurrentScope().getId());
        ifNotInBracket.setIF_NOT(ctx.IF_NOT().getText());

        return ifNotInBracket;
    }

    @Override
    public IfNot visitIf_not(HTMLParser.If_notContext ctx) {
        System.out.println("visitIf_not");
        IfNot ifNot = new IfNot();
        ifNot.setIF_NOT(ctx.IF_NOT().getText());

        return ifNot;
    }

    @Override
    public ScriptNormalIfWhile visitScript_normal_if_while(HTMLParser.Script_normal_if_whileContext ctx) {
        System.out.println("visitScript_normal_if_while");
        ScriptNormalIfWhile scriptNormalIfWhile = new ScriptNormalIfWhile();
        scriptNormalIfWhile.setScopeId(getCurrentScope().getId());
        if (ctx.if_sign() != null) {
            scriptNormalIfWhile.setIfConditionValue(visitIf_condition_value(ctx.if_condition_value()));
            scriptNormalIfWhile.setIfSign(visitIf_sign(ctx.if_sign()));
        }
        scriptNormalIfWhile.setScriptIdentifierIf(visitScript_identifier_if(ctx.script_identifier_if()));
        scriptNormalIfWhile.setScriptListStatement(visitScript_list_statement(ctx.script_list_statement()));
        for (int i = 0; i < ctx.right_bracket().size(); i++) {
            scriptNormalIfWhile.getRightBracketArrayList().add(visitRight_bracket(ctx.right_bracket(i)));
        }
        for (int i = 0; i < ctx.left_bracket().size(); i++) {
            scriptNormalIfWhile.getLeftBracketArrayList().add(visitLeft_bracket(ctx.left_bracket(i)));
        }

        return scriptNormalIfWhile;
    }

    @Override
    public LeftBracket visitLeft_bracket(HTMLParser.Left_bracketContext ctx) {
        System.out.println("visitLeft_bracket");
        LeftBracket leftBracket = new LeftBracket();
        leftBracket.setScopeId(getCurrentScope().getId());
        leftBracket.setSCRIPT_PAR_BRACKET_CLOSE(ctx.SCRIPT_PAR_BRACKET_CLOSE().getText());

        return leftBracket;
    }

    @Override
    public RightBracket visitRight_bracket(HTMLParser.Right_bracketContext ctx) {
        System.out.println("visitRight_bracket");
        RightBracket rightBracket = new RightBracket();
        rightBracket.setScopeId(getCurrentScope().getId());
        rightBracket.setSCRIPT_PAR_BRACKET_NOT_OPEN_CONDITION(ctx.SCRIPT_PAR_BRACKET_NOT_OPEN_CONDITION().getText());

        return rightBracket;
    }

    @Override
    public ScriptIdentifierIf visitScript_identifier_if(HTMLParser.Script_identifier_ifContext ctx) {
        System.out.println("visitScript_identifier_if");
        ScriptIdentifierIf scriptIdentifierIf = new ScriptIdentifierIf();
        scriptIdentifierIf.setScopeId(getCurrentScope().getId());
        scriptIdentifierIf.setPARAMETER(ctx.PARAMETER().getText());

        return scriptIdentifierIf;
    }

    @Override
    public IfSign visitIf_sign(HTMLParser.If_signContext ctx) {
        System.out.println("visitIf_sign");
        IfSign ifSign = new IfSign();
        ifSign.setScopeId(getCurrentScope().getId());
        ifSign.setX_SIGN(ctx.X_SIGN().getText());

        return ifSign;
    }

    @Override
    public IfConditionValue visitIf_condition_value(HTMLParser.If_condition_valueContext ctx) {
        System.out.println("visitIf_condition_value");
        IfConditionValue ifConditionValue = new IfConditionValue();
        ifConditionValue.setScopeId(getCurrentScope().getId());
        if (ctx.if_number_value() != null) {
            ifConditionValue.setIfNumberValue(visitIf_number_value(ctx.if_number_value()));
        }
        if (ctx.if_string_value() != null) {
            ifConditionValue.setIfStringValue(visitIf_string_value(ctx.if_string_value()));
        }

        return ifConditionValue;
    }

    @Override
    public IfStringValue visitIf_string_value(HTMLParser.If_string_valueContext ctx) {
        System.out.println("visitIf_string_value");
        IfStringValue ifStringValue = new IfStringValue();
        ifStringValue.setScopeId(getCurrentScope().getId());
        ifStringValue.setPARAMETER(ctx.PARAMETER().getText());

        return ifStringValue;
    }

    @Override
    public IfNumberValue visitIf_number_value(HTMLParser.If_number_valueContext ctx) {
        System.out.println("visitIf_number_value");
        IfNumberValue ifNumberValue = new IfNumberValue();
        ifNumberValue.setScopeId(getCurrentScope().getId());
        ifNumberValue.setNUMBER_FOR(Integer.parseInt(ctx.NUMBER_FOR().getText()));

        return ifNumberValue;
    }

    @Override
    public ScriptFor visitScript_for(HTMLParser.Script_forContext ctx) {
        System.out.println("visitScript_for");
        ScriptFor scriptFor = new ScriptFor();
        scriptFor.setScopeId(getCurrentScope().getId());
        scriptFor.setScriptIdentifierFor(visitScript_identifier_for(ctx.script_identifier_for()));
        if (ctx.number_for() != null) {
            scriptFor.setNumberFor(visitNumber_for(ctx.number_for()));
        }
        scriptFor.setScriptIdentifierForAfterSemicol(visitScript_identifier_for_after_semicol(ctx.script_identifier_for_after_semicol()));
        scriptFor.setxSignFor(visitX_sign_for(ctx.x_sign_for()));
        scriptFor.setxVariableFor(visitX_variable_for(ctx.x_variable_for()));
        scriptFor.setScriptIdentifierForBeforeSings(visitScript_identifier_for_before_sings(ctx.script_identifier_for_before_sings()));
        scriptFor.setSignFor(visitSign_for(ctx.sign_for()));
        scriptFor.setScriptListStatement(visitScript_list_statement(ctx.script_list_statement()));

        return scriptFor;
    }

    @Override
    public SignFor visitSign_for(HTMLParser.Sign_forContext ctx) {
        System.out.println("visitSign_for");
        SignFor signFor = new SignFor();
        signFor.setScopeId(getCurrentScope().getId());
        if (ctx.SIGN_FOR() != null) {
            signFor.setSIGN_FOR(ctx.SIGN_FOR().getText());
        }
        if (ctx.SIGN_FOR_STEPS() != null) {
            signFor.setSIGN_FOR_STEPS(ctx.SIGN_FOR_STEPS().getText());
            signFor.setNUMBER_FOR(Integer.parseInt(ctx.NUMBER_FOR().getText().trim()));
        }

        return signFor;
    }

    @Override
    public ScriptIdentifierForBeforeSings visitScript_identifier_for_before_sings(HTMLParser.Script_identifier_for_before_singsContext ctx) {
        System.out.println("visitScript_identifier_for_before_sings");
        ScriptIdentifierForBeforeSings scriptIdentifierForBeforeSings = new ScriptIdentifierForBeforeSings();
        scriptIdentifierForBeforeSings.setScopeId(getCurrentScope().getId());
        scriptIdentifierForBeforeSings.setScriptIdentifierFor(visitScript_identifier_for(ctx.script_identifier_for()));

        return scriptIdentifierForBeforeSings;
    }

    @Override
    public XVariableFor visitX_variable_for(HTMLParser.X_variable_forContext ctx) {
        System.out.println("visitX_variable_for");
        XVariableFor xVariableFor = new XVariableFor();
        xVariableFor.setScopeId(getCurrentScope().getId());
        if (ctx.number_for() != null) {
            xVariableFor.setNumberFor(visitNumber_for(ctx.number_for()));
        }
        if (ctx.string_for() != null) {
            xVariableFor.setStringFor(visitString_for(ctx.string_for()));
        }

        return xVariableFor;
    }

    @Override
    public StringFor visitString_for(HTMLParser.String_forContext ctx) {
        System.out.println("visitString_for");
        StringFor stringFor = new StringFor();
        stringFor.setScopeId(getCurrentScope().getId());
        stringFor.setPARAMETER(ctx.PARAMETER().getText());

        return stringFor;
    }

    @Override
    public XSignFor visitX_sign_for(HTMLParser.X_sign_forContext ctx) {
        System.out.println("visitX_sign_for");
        XSignFor xSignFor = new XSignFor();
        xSignFor.setScopeId(getCurrentScope().getId());
        xSignFor.setX_SIGN(ctx.X_SIGN().getText());

        return xSignFor;
    }

    @Override
    public ScriptIdentifierForAfterSemicol visitScript_identifier_for_after_semicol(HTMLParser.Script_identifier_for_after_semicolContext ctx) {
        System.out.println("visitScript_identifier_for_after_semicol");
        ScriptIdentifierForAfterSemicol scriptIdentifierForAfterSemicol = new ScriptIdentifierForAfterSemicol();
        scriptIdentifierForAfterSemicol.setScopeId(getCurrentScope().getId());
        scriptIdentifierForAfterSemicol.setScriptIdentifierFor(visitScript_identifier_for(ctx.script_identifier_for()));

        return scriptIdentifierForAfterSemicol;
    }

    @Override
    public NumberFor visitNumber_for(HTMLParser.Number_forContext ctx) {
        System.out.println("visitNumber_for");
        NumberFor numberFor = new NumberFor();
        numberFor.setScopeId(getCurrentScope().getId());
        numberFor.setNUMBER_FOR(Integer.parseInt(ctx.NUMBER_FOR().toString().trim()));

        return numberFor;
    }

    @Override
    public ScriptIdentifierFor visitScript_identifier_for(HTMLParser.Script_identifier_forContext ctx) {
        System.out.println("visitScript_identifier_for");
        ScriptIdentifierFor scriptIdentifierFor = new ScriptIdentifierFor();
        scriptIdentifierFor.setScopeId(getCurrentScope().getId());
        scriptIdentifierFor.setPARAMETER(ctx.PARAMETER().getText());

        return scriptIdentifierFor;
    }

    @Override
    public ScriptComment visitScript_comment(HTMLParser.Script_commentContext ctx) {
        System.out.println("visitScript_comment");
        ScriptComment scriptComment = new ScriptComment();
        scriptComment.setScopeId(getCurrentScope().getId());
        if (ctx.line_comment() != null) {
            scriptComment.setLineComment(visitLine_comment(ctx.line_comment()));
        }
        if (ctx.multi_line_comment() != null) {
            scriptComment.setMultiLineComment(visitMulti_line_comment(ctx.multi_line_comment()));
        }

        return scriptComment;
    }

    @Override
    public MultiLineComment visitMulti_line_comment(HTMLParser.Multi_line_commentContext ctx) {
        System.out.println("visitMulti_line_comment");
        MultiLineComment multiLineComment = new MultiLineComment();
        multiLineComment.setScopeId(getCurrentScope().getId());
        multiLineComment.setContentComment(visitContent_comment(ctx.content_comment()));

        return multiLineComment;
    }

    @Override
    public ContentComment visitContent_comment(HTMLParser.Content_commentContext ctx) {
        System.out.println("visitContent_comment");
        ContentComment contentComment = new ContentComment();
        contentComment.setScopeId(getCurrentScope().getId());
        contentComment.setSCRIPT_COMMENT_CONTENT(ctx.SCRIPT_COMMENT_CONTENT().getText());

        return contentComment;
    }

    @Override
    public LineComment visitLine_comment(HTMLParser.Line_commentContext ctx) {
        System.out.println("visitLine_comment");
        LineComment lineComment = new LineComment();
        lineComment.setScopeId(getCurrentScope().getId());
        lineComment.setContentLineComment(visitContent_line_comment(ctx.content_line_comment()));

        return lineComment;
    }

    public ContentLineComment visitContent_line_comment(HTMLParser.Content_line_commentContext ctx) {
        System.out.println("visitContent_line_comment");
        ContentLineComment contentLineComment = new ContentLineComment();
        contentLineComment.setScopeId(getCurrentScope().getId());
        contentLineComment.setSCRIPT_COMMENT_LINE_CONTENT(ctx.SCRIPT_COMMENT_LINE_CONTENT().getText());

        return contentLineComment;
    }

    @Override
    public ScriptObj visitScript_obj(HTMLParser.Script_objContext ctx) {
        System.out.println("visitScript_obj");
        ScriptObj scriptObj = new ScriptObj();
        scriptObj.setScopeId(getCurrentScope().getId());
        scriptObj.setScriptIdentifier(visitScript_identifier(ctx.script_identifier()));
        scriptObj.setScriptObjValue(visitScript_obj_value(ctx.script_obj_value()));

        return scriptObj;
    }

    @Override
    public ScriptObjValue visitScript_obj_value(HTMLParser.Script_obj_valueContext ctx) {
        System.out.println("visitScript_obj_value");
        ScriptObjValue scriptObjValue = new ScriptObjValue();
        scriptObjValue.setScopeId(getCurrentScope().getId());
        for (int i = 0; i < ctx.script_obj_element().size(); i++) {
            scriptObjValue.getScriptObjElementArrayList().add(visitScript_obj_element(ctx.script_obj_element(i)));
        }

        return scriptObjValue;
    }

    @Override
    public ScriptObjElement visitScript_obj_element(HTMLParser.Script_obj_elementContext ctx) {
        System.out.println("visitScript_obj_element");
        ScriptObjElement scriptObjElement = new ScriptObjElement();
        scriptObjElement.setScopeId(getCurrentScope().getId());
        scriptObjElement.setScriptIdentifier(visitScript_identifier(ctx.script_identifier()));
        if (ctx.script_empty_string() != null) {
            scriptObjElement.setScriptEmptyString(visitScript_empty_string(ctx.script_empty_string()));
        }
        if (ctx.script_empty_string() != null) {
            scriptObjElement.setScriptValueString(visitScript_value_string(ctx.script_value_string()));
        }
        if (ctx.script_value_array() != null) {
            scriptObjElement.setScriptValueArray(visitScript_value_array(ctx.script_value_array()));
        }
        if (ctx.script_value_number() != null) {
            scriptObjElement.setScriptValueNumber(visitScript_value_number(ctx.script_value_number()));
        }

        return scriptObjElement;
    }

    @Override
    public ScriptVar visitScript_var(HTMLParser.Script_varContext ctx) {
        System.out.println("visitScript_var");
        ScriptVar scriptVar = new ScriptVar();
        scriptVar.setScopeId(getCurrentScope().getId());
        scriptVar.setScriptIdentifier(visitScript_identifier(ctx.script_identifier()));
        if (ctx.script_value() != null) {
            scriptVar.setScriptValue(visitScript_value(ctx.script_value()));
        }

        return scriptVar;
    }

    @Override
    public ScriptValue visitScript_value(HTMLParser.Script_valueContext ctx) {
        System.out.println("visitScript_value");
        ScriptValue scriptValue = new ScriptValue();
        scriptValue.setScopeId(getCurrentScope().getId());
        if (ctx.script_value_number() != null) {
            scriptValue.setScriptValueNumber(visitScript_value_number(ctx.script_value_number()));
        }
        if (ctx.script_value_string() != null) {
            scriptValue.setScriptValueString(visitScript_value_string(ctx.script_value_string()));
        }
        if (ctx.script_empty_string() != null) {
            scriptValue.setScriptValueString(visitScript_value_string(ctx.script_value_string()));
        }
        if (ctx.script_value_array() != null) {
            scriptValue.setScriptValueArray(visitScript_value_array(ctx.script_value_array()));
        }

        return scriptValue;
    }

    @Override
    public ScriptValueArray visitScript_value_array(HTMLParser.Script_value_arrayContext ctx) {
        System.out.println("visitScript_value_array");
        ScriptValueArray scriptValueArray = new ScriptValueArray();
        scriptValueArray.setScopeId(getCurrentScope().getId());
        for (int i = 0; i < ctx.array_element().size(); i++) {
            scriptValueArray.getArrayElementArrayList().add(visitArray_element(ctx.array_element(i)));
        }

        return scriptValueArray;
    }

    @Override
    public ArrayElement visitArray_element(HTMLParser.Array_elementContext ctx) {
        System.out.println("visitArray_element");
        ArrayElement arrayElement = new ArrayElement();
        arrayElement.setScopeId(getCurrentScope().getId());
        if (ctx.script_value_string() != null) {
            arrayElement.setScriptValueString(visitScript_value_string(ctx.script_value_string()));
        }
        if (ctx.script_value_number() != null) {
            arrayElement.setScriptValueNumber(visitScript_value_number(ctx.script_value_number()));
        }

        return arrayElement;
    }

    @Override
    public ScriptFunction visitScript_function(HTMLParser.Script_functionContext ctx) {
        System.out.println("visitScript_function");
        ScriptFunction scriptFunction = new ScriptFunction();
        scriptFunction.setScopeId(getCurrentScope().getId());
        scriptFunction.setSCRIP_K_FUNCTION(ctx.SCRIP_K_FUNCTION().getText());
        scriptFunction.setScriptIdentifier(visitScript_identifier(ctx.script_identifier()));
        scriptFunction.setScriptFunctionPar(visitScript_function_par(ctx.script_function_par()));


        return scriptFunction;
    }

    @Override
    public ScriptFunctionPar visitScript_function_par(HTMLParser.Script_function_parContext ctx) {
        System.out.println("visitScript_function_par");
        ScriptFunctionPar scriptFunctionPar = new ScriptFunctionPar();
        scriptFunctionPar.setScopeId(getCurrentScope().getId());
        scriptFunctionPar.setLeftWhitespaces(visitLeft_whitespaces(ctx.left_whitespaces()));
        scriptFunctionPar.setRightWhitespaces(visitRight_whitespaces(ctx.right_whitespaces()));

        for (int i = 0; i < ctx.func_parameters().size(); i++) {
            scriptFunctionPar.getFuncParametersArrayList().add(visitFunc_parameters(ctx.func_parameters(i)));
        }
        scriptFunctionPar.setFuncBody(visitFunc_body(ctx.func_body()));


        return scriptFunctionPar;
    }

    @Override
    public FuncBody visitFunc_body(HTMLParser.Func_bodyContext ctx) {
        System.out.println("visitFunc_body");
        FuncBody funcBody = new FuncBody();
        funcBody.setScopeId(getCurrentScope().getId());
        funcBody.setScriptListStatement(visitScript_list_statement(ctx.script_list_statement()));
        if (ctx.return_function_body() != null) {
            funcBody.setReturnFunctionBody(visitReturn_function_body(ctx.return_function_body()));
        }

        return funcBody;
    }

    @Override
    public ReturnFunctionBody visitReturn_function_body(HTMLParser.Return_function_bodyContext ctx) {
        System.out.println("visitReturn_function_body");
        ReturnFunctionBody returnFunctionBody = new ReturnFunctionBody();
        returnFunctionBody.setScopeId(getCurrentScope().getId());
        returnFunctionBody.setLeftWhitespaces(visitLeft_whitespaces(ctx.left_whitespaces()));
        returnFunctionBody.setRightWhitespaces(visitRight_whitespaces(ctx.right_whitespaces()));
        returnFunctionBody.setScriptFunReturn(visitScript_fun_return(ctx.script_fun_return()));


        return returnFunctionBody;
    }

    @Override
    public ScriptFunReturn visitScript_fun_return(HTMLParser.Script_fun_returnContext ctx) {
        System.out.println("visitScript_fun_return");
        ScriptFunReturn scriptFunReturn = new ScriptFunReturn();
        scriptFunReturn.setScopeId(getCurrentScope().getId());
        if (ctx.script_identifier() != null) {
            scriptFunReturn.setScriptIdentifier(visitScript_identifier(ctx.script_identifier()));
        }
        if (ctx.script_value_number() != null) {
            scriptFunReturn.setScriptValueNumber(visitScript_value_number(ctx.script_value_number()));
        }
        if (ctx.script_value_string() != null) {
            scriptFunReturn.setScriptValueString(visitScript_value_string(ctx.script_value_string()));
        }
        if (ctx.script_empty_string() != null) {
            scriptFunReturn.setScriptEmptyString(visitScript_empty_string(ctx.script_empty_string()));

        }

        return scriptFunReturn;
    }

    @Override
    public ScriptEmptyString visitScript_empty_string(HTMLParser.Script_empty_stringContext ctx) {
        System.out.println("visitScript_empty_string");
        ScriptEmptyString scriptEmptyString = new ScriptEmptyString();
        scriptEmptyString.setScopeId(getCurrentScope().getId());
        scriptEmptyString.setSCRIPT_QUOTE_CLOSE(ctx.SCRIPT_QUOTE_CLOSE().getText());
        scriptEmptyString.setSCRIPT_QUOTE_OPEN(ctx.SCRIPT_QUOTE_OPEN().getText());

        return scriptEmptyString;
    }

    @Override
    public ScriptValueNumber visitScript_value_number(HTMLParser.Script_value_numberContext ctx) {
        System.out.println("visitScript_value_number");
        ScriptValueNumber scriptValueNumber = new ScriptValueNumber();
        scriptValueNumber.setScopeId(getCurrentScope().getId());
        scriptValueNumber.setSCRIPT_NUMBER(Integer.parseInt(ctx.SCRIPT_NUMBER().toString().trim()));

        return scriptValueNumber;
    }

    @Override
    public ScriptValueString visitScript_value_string(HTMLParser.Script_value_stringContext ctx) {
        System.out.println("visitScript_value_string");
        ScriptValueString scriptValueString = new ScriptValueString();
        scriptValueString.setScopeId(getCurrentScope().getId());
        scriptValueString.setValue(visitValue(ctx.value()));

        return scriptValueString;
    }

    @Override
    public Value visitValue(HTMLParser.ValueContext ctx) {
        System.out.println("visitValue");
        Value value = new Value();
        value.setScopeId(getCurrentScope().getId());
        value.setSCRIPT_STRING(ctx.SCRIPT_STRING().getText());

        return value;
    }

    @Override
    public FuncParameters visitFunc_parameters(HTMLParser.Func_parametersContext ctx) {
        System.out.println("visitFunc_parameters");
        FuncParameters funcParameters = new FuncParameters();
        funcParameters.setScopeId(getCurrentScope().getId());
        funcParameters.setPARAMETER(ctx.PARAMETER().getText());

        return funcParameters;
    }

    @Override
    public ScriptIdentifier visitScript_identifier(HTMLParser.Script_identifierContext ctx) {
        System.out.println("visitScript_identifier");
        ScriptIdentifier scriptIdentifier = new ScriptIdentifier();
        scriptIdentifier.setScopeId(getCurrentScope().getId());
        scriptIdentifier.setSCRIPT_IDENTIFIER(ctx.SCRIPT_IDENTIFIER().getText());

        return scriptIdentifier;
    }

    @Override
    public LeftWhitespaces visitLeft_whitespaces(HTMLParser.Left_whitespacesContext ctx) {
        System.out.println("visitLeft_whitespaces");
        LeftWhitespaces leftWhitespaces = new LeftWhitespaces();
        leftWhitespaces.setScopeId(getCurrentScope().getId());
        for (int i = 0; i < ctx.whitespaces().size(); i++) {
            leftWhitespaces.getWhiteSpaces().add(visitWhitespaces(ctx.whitespaces(i)));
        }

        return leftWhitespaces;
    }

    @Override
    public WhiteSpaces visitWhitespaces(HTMLParser.WhitespacesContext ctx) {
        System.out.println("visitWhitespaces");
        WhiteSpaces whiteSpaces = new WhiteSpaces();
        whiteSpaces.setScopeId(getCurrentScope().getId());
        whiteSpaces.setSCRIPT_WHITESPACE(ctx.SCRIPT_WHITESPACE().getText());

        return whiteSpaces;
    }

    @Override
    public RightWhitespaces visitRight_whitespaces(HTMLParser.Right_whitespacesContext ctx) {
        System.out.println("visitRight_whitespaces");
        RightWhitespaces rightWhitespaces = new RightWhitespaces();
        rightWhitespaces.setScopeId(getCurrentScope().getId());
        for (int i = 0; i < ctx.whitespaces().size(); i++) {
            rightWhitespaces.getWhiteSpaces().add(visitWhitespaces(ctx.whitespaces(i)));
        }

        return rightWhitespaces;
    }

    @Override
    public HtmlMisc visitHtmlMisc(HTMLParser.HtmlMiscContext ctx) {
        System.out.println("visitHtmlMisc");
        HtmlMisc htmlMisc = new HtmlMisc();
      //  htmlMisc.setScopeId(getCurrentScope().getId());
        if (ctx.SEA_WS() != null) {
            htmlMisc.setSEA_WS(ctx.SEA_WS().getText());
        }
        if (ctx.htmlComment() != null) {
            htmlMisc.setHtmlComment(visitHtmlComment(ctx.htmlComment()));
        }

        return htmlMisc;
    }

    @Override
    public HtmlAttribute visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx) {
        System.out.println("visitHtmlAttribute");
        HtmlAttribute htmlAttribute = new HtmlAttribute();
        htmlAttribute.setScopeId(getCurrentScope().getId());
        if (ctx.cp_app() != null) {
            htmlAttribute.setCpApp(visitCp_app(ctx.cp_app()));
        }
        if (ctx.cp_show() != null) {
            htmlAttribute.setCpShow(visitCp_show(ctx.cp_show()));
        }
        if (ctx.cp_for() != null) {
            htmlAttribute.setCpFor(visitCp_for(ctx.cp_for()));
        }
        if (ctx.cp_hide() != null) {
            htmlAttribute.setCpHide(visitCp_hide(ctx.cp_hide()));
        }
        if (ctx.cp_if() != null) {
            htmlAttribute.setCpIf(visitCp_if(ctx.cp_if()));
        }
        if (ctx.cp_switch() != null) {
            htmlAttribute.setCpSwitch(visitCp_switch(ctx.cp_switch()));
        }
        if (ctx.cp_switch_case() != null) {
            htmlAttribute.setCpSwitchCase(visitCp_switch_case(ctx.cp_switch_case()));
        }
        if (ctx.cp_switch_default() != null) {
            htmlAttribute.setCpSwitchDefault(visitCp_switch_default(ctx.cp_switch_default()));
        }
        if (ctx.cp_model() != null) {
            htmlAttribute.setCpModel(visitCp_model(ctx.cp_model()));
        }
        if (ctx.cp_type() != null) {
            htmlAttribute.setCpType(visitCp_type(ctx.cp_type()));
        }
        if (ctx.cp_click() != null) {
            htmlAttribute.setCpClick(visitCp_click(ctx.cp_click()));
        }
        if (ctx.cp_mouseover() != null) {
            htmlAttribute.setCpMouseOver(visitCp_mouseover(ctx.cp_mouseover()));
        }
        if (ctx.default_cp() != null) {
            htmlAttribute.setDefaultCp(visitDefault_cp(ctx.default_cp()));
        }

        return htmlAttribute;

    }

    @Override
    public DefaultCp visitDefault_cp(HTMLParser.Default_cpContext ctx) {
        System.out.println("visitDefault_cp");
        DefaultCp defaultCp = new DefaultCp();
        defaultCp.setScopeId(getCurrentScope().getId());
        defaultCp.setDEFAULT_CP(ctx.TAG_NAME().getText());
        if (ctx.expression_default() != null)
            defaultCp.setExpressionDefault(visitExpression_default(ctx.expression_default()));

        return defaultCp;
    }

    @Override
    public ExpressionDefault visitExpression_default(HTMLParser.Expression_defaultContext ctx) {
        System.out.println("visitExpression_default");
        ExpressionDefault expressionDefault = new ExpressionDefault();
        expressionDefault.setScopeId(getCurrentScope().getId());
        if (ctx.VAR() != null)
            expressionDefault.setVar(ctx.VAR().getText());

        return expressionDefault;
    }

    @Override
    public CpModel visitCp_model(HTMLParser.Cp_modelContext ctx) {
        System.out.println("visitCp_model");
        CpModel cpModel = new CpModel();
        cpModel.setScopeId(getCurrentScope().getId());
        cpModel.setCP_MODEL(ctx.CP_MODEL().getText());
        cpModel.setExpressionModel(visitExpression_model(ctx.expression_model()));

        return cpModel;
    }

    @Override
    public ExpressionModel visitExpression_model(HTMLParser.Expression_modelContext ctx) {
        System.out.println("visitExpression_model");
        ExpressionModel expressionModel = new ExpressionModel();
        expressionModel.setScopeId(getCurrentScope().getId());
        if (ctx.date() != null) {
            expressionModel.setDate(visitDate(ctx.date()));
        }
        if (ctx.VAR() != null) {
            expressionModel.setVAR(ctx.VAR().getText());
        }
        if (ctx.iteration() != null) {
            expressionModel.setIteration(visitIteration(ctx.iteration()));
        }
        return expressionModel;
    }

    @Override
    public Date visitDate(HTMLParser.DateContext ctx) {
        System.out.println("visitDate");
        Date date = new Date();
        date.setScopeId(getCurrentScope().getId());
        date.setDay(visitDay(ctx.day()));
        date.setMonth(visitMonth(ctx.month()));
        date.setYear(visitYear(ctx.year()));

        return date;
    }

    @Override
    public Day visitDay(HTMLParser.DayContext ctx) {
        System.out.println("visitDay");
        Day day = new Day();
        day.setScopeId(getCurrentScope().getId());
        day.setDAY(ctx.DAY().getText());

        return day;
    }

    @Override
    public Month visitMonth(HTMLParser.MonthContext ctx) {
        System.out.println("visitMonth");
        Month month = new Month();
        month.setScopeId(getCurrentScope().getId());
        month.setMONTH(ctx.MONTH().getText());

        return month;
    }

    @Override
    public Year visitYear(HTMLParser.YearContext ctx) {
        System.out.println("visitYear");
        Year year = new Year();
        year.setScopeId(getCurrentScope().getId());
        year.setYEAR(ctx.YEAR().getText());

        return year;
    }

    @Override
    public CpMouseOver visitCp_mouseover(HTMLParser.Cp_mouseoverContext ctx) {
        System.out.println("visitCp_mouseover");
        CpMouseOver cpMouseOver = new CpMouseOver();
        cpMouseOver.setScopeId(getCurrentScope().getId());
        cpMouseOver.setCP_MOUSE_OVER(ctx.CP_MOUSEOVER().getText());
        cpMouseOver.setExpressionMouseOver(visitExpression_mouseover(ctx.expression_mouseover()));


        return cpMouseOver;
    }

    @Override
    public ExpressionMouseOver visitExpression_mouseover(HTMLParser.Expression_mouseoverContext ctx) {
        System.out.println("visitExpression_mouseover");
        ExpressionMouseOver expressionMouseOver = new ExpressionMouseOver();
        expressionMouseOver.setScopeId(getCurrentScope().getId());
        expressionMouseOver.setFUNCTION(ctx.FUNCTION().getText());

        return expressionMouseOver;
    }

    @Override
    public CpClick visitCp_click(HTMLParser.Cp_clickContext ctx) {
        System.out.println("visitCp_click");
        CpClick cpClick = new CpClick();
        cpClick.setScopeId(getCurrentScope().getId());
        cpClick.setCP_CLICK(ctx.CP_CLICK().getText());
        cpClick.setExpressionClick(visitExpression_click(ctx.expression_click()));

        return cpClick;
    }

    @Override
    public ExpressionClick visitExpression_click(HTMLParser.Expression_clickContext ctx) {
        System.out.println("visitExpression_click");
        ExpressionClick expressionClick = new ExpressionClick();
        expressionClick.setScopeId(getCurrentScope().getId());
//        if (ctx.FUNCTION() != null)
//            expressionClick.setFUNCTION(ctx.FUNCTION().getText());
        expressionClick.setFunctionCp(visitFunction_cp(ctx.function_cp()));

        return expressionClick;
    }

    @Override
    public CpType visitCp_type(HTMLParser.Cp_typeContext ctx) {
        System.out.println("visitCp_type");
        CpType cpType = new CpType();
        cpType.setScopeId(getCurrentScope().getId());
        cpType.setCP_TYPE(ctx.CP_TYPE().getText());
        cpType.setExpressionType(visitExpression_type(ctx.expression_type()));

        return cpType;
    }

    @Override
    public ExpressionType visitExpression_type(HTMLParser.Expression_typeContext ctx) {
        System.out.println("visitExpression_type");
        ExpressionType expressionType = new ExpressionType();
        expressionType.setScopeId(getCurrentScope().getId());
        expressionType.setTYPE(ctx.TYPE().getText());

        return expressionType;
    }

    @Override
    public CpSwitchDefault visitCp_switch_default(HTMLParser.Cp_switch_defaultContext ctx) {
        System.out.println("visitCp_switch_default");
        CpSwitchDefault cpSwitchDefault = new CpSwitchDefault();
        cpSwitchDefault.setScopeId(getCurrentScope().getId());
        cpSwitchDefault.setCP_SWITCH_DEFAULT(ctx.CP_SWITCH_DEFAULT().getText());

        return cpSwitchDefault;
    }

    @Override
    public CpSwitchCase visitCp_switch_case(HTMLParser.Cp_switch_caseContext ctx) {
        System.out.println("visitCp_switch_case");
        CpSwitchCase cpSwitchCase = new CpSwitchCase();
        cpSwitchCase.setScopeId(getCurrentScope().getId());
        cpSwitchCase.setCP_SWITCH_CASE(ctx.CP_SWITCH_CASE().getText());
        cpSwitchCase.setExpressionSwitchCase(visitExpression_switch_case(ctx.expression_switch_case()));

        return cpSwitchCase;
    }

    @Override
    public ExpressionSwitchCase visitExpression_switch_case(HTMLParser.Expression_switch_caseContext ctx) {
        System.out.println("visitExpression_switch_case");
        ExpressionSwitchCase expressionSwitchCase = new ExpressionSwitchCase();
        expressionSwitchCase.setScopeId(getCurrentScope().getId());
        if (ctx.NUMBER() != null) {
            expressionSwitchCase.setNUMBER(Integer.parseInt(ctx.NUMBER().getText()));
        }
        if (ctx.VAR() != null) {
            expressionSwitchCase.setVAR(ctx.VAR().getText());
        }

        return expressionSwitchCase;
    }

    @Override
    public CpSwitch visitCp_switch(HTMLParser.Cp_switchContext ctx) {
        System.out.println("visitCp_switch");
        CpSwitch cpSwitch = new CpSwitch();
        cpSwitch.setScopeId(getCurrentScope().getId());
        cpSwitch.setCP_SWITCH(ctx.CP_SWITCH().getText());
        cpSwitch.setExpressionSwitch(visitExpression_switch(ctx.expression_switch()));

        return cpSwitch;
    }

    @Override
    public ExpressionSwitch visitExpression_switch(HTMLParser.Expression_switchContext ctx) {
        System.out.println("visitExpression_switch");
        ExpressionSwitch expressionSwitch = new ExpressionSwitch();
        expressionSwitch.setScopeId(getCurrentScope().getId());
        if (ctx.VAR() != null) {
            expressionSwitch.setVAR(ctx.VAR().getText());
        }
        if (ctx.iteration() != null) {
            expressionSwitch.setIteration(visitIteration(ctx.iteration()));
        }

        return expressionSwitch;
    }

    @Override
    public VarAfterSwitch visitVar_after_switch(HTMLParser.Var_after_switchContext ctx) {
        System.out.println("visitVar_after_switch");
        VarAfterSwitch varAfterSwitch = new VarAfterSwitch();
        varAfterSwitch.setScopeId(getCurrentScope().getId());
        varAfterSwitch.setVAR(ctx.VAR().getText());

        return varAfterSwitch;
    }

    @Override
    public CpIf visitCp_if(HTMLParser.Cp_ifContext ctx) {
        System.out.println("visitCp_if");
        CpIf cpIf = new CpIf();
        cpIf.setScopeId(getCurrentScope().getId());
        cpIf.setCP_IF(ctx.CP_IF().getText());
        cpIf.setExpressionIf(visitExpression_if(ctx.expression_if()));

        return cpIf;
    }

    @Override
    public ExpressionIf visitExpression_if(HTMLParser.Expression_ifContext ctx) {
        System.out.println("visitExpression_if");
        ExpressionIf expressionIf = new ExpressionIf();
        expressionIf.setScopeId(getCurrentScope().getId());
        if (ctx.expr_if_with_func() != null) {
            expressionIf.setExprIfWithFunc(visitExpr_if_with_func(ctx.expr_if_with_func()));
        }
        if (ctx.expr_if_with_varDotVar_sign() != null) {
            expressionIf.setExprIfWithVarDotVarSign(visitExpr_if_with_varDotVar_sign(ctx.expr_if_with_varDotVar_sign()));
        }
        if (ctx.VAR() != null) {
            expressionIf.setVAR(ctx.VAR().getText());
            if (ctx.not() != null) {
                expressionIf.setNot(visitNot(ctx.not()));
            }
        }
        if (ctx.expr_if_with_iteration_condition() != null) {
            expressionIf.setExprIfWithIterationCondition(visitExpr_if_with_iteration_condition(ctx.expr_if_with_iteration_condition()));
        }

        return expressionIf;
    }

    @Override
    public ExprIfWithIterationCondition visitExpr_if_with_iteration_condition(HTMLParser.Expr_if_with_iteration_conditionContext ctx) {
        System.out.println("visitExpr_if_with_iteration_condition");
        ExprIfWithIterationCondition exprIfWithIterationCondition = new ExprIfWithIterationCondition();
        exprIfWithIterationCondition.setScopeId(getCurrentScope().getId());
        exprIfWithIterationCondition.setIteration(visitIteration(ctx.iteration()));

        return exprIfWithIterationCondition;
    }

    @Override
    public Iteration visitIteration(HTMLParser.IterationContext ctx) {
        System.out.println("visitIteration");
        Iteration iteration = new Iteration();
        iteration.setScopeId(getCurrentScope().getId());
        for (int i = 0; i < ctx.iteration_expr_with_gates().size(); i++) {
            iteration.getIterationExprWithGatesArrayList().add(visitIteration_expr_with_gates(ctx.iteration_expr_with_gates(i)));
        }
        iteration.setIterationExpr(visitIteration_expr(ctx.iteration_expr()));

        return iteration;
    }

    @Override
    public IterationExprWithGates visitIteration_expr_with_gates(HTMLParser.Iteration_expr_with_gatesContext ctx) {
        System.out.println("visitIteration_expr_with_gates");
        IterationExprWithGates iterationExprWithGates = new IterationExprWithGates();
        iterationExprWithGates.setScopeId(getCurrentScope().getId());
        if (ctx.AND() != null) {
            iterationExprWithGates.setAND(ctx.AND().getText());
        }
        if (ctx.OR() != null) {
            iterationExprWithGates.setOR(ctx.OR().getText());
        }
        iterationExprWithGates.setIterationExpr(visitIteration_expr(ctx.iteration_expr()));


        return iterationExprWithGates;
    }

    @Override
    public IterationExpr visitIteration_expr(HTMLParser.Iteration_exprContext ctx) {
        System.out.println("visitIteration_expr");
        IterationExpr iterationExpr = new IterationExpr();
        iterationExpr.setScopeId(getCurrentScope().getId());
        if (ctx.attribute_func() != null) {
            iterationExpr.setAttributeFunc(visitAttribute_func(ctx.attribute_func()));
        }
        if (ctx.attribute_varDotVar() != null) {
            iterationExpr.setAttributeVarDotVar(visitAttribute_varDotVar(ctx.attribute_varDotVar()));
        }
        if (ctx.VAR() != null) {
            iterationExpr.setVAR(ctx.VAR().getText());
            if (ctx.not() != null) {
                iterationExpr.setNot(visitNot(ctx.not()));
            }
        }

        return iterationExpr;
    }

    @Override
    public AttributeFunc visitAttribute_func(HTMLParser.Attribute_funcContext ctx) {
        System.out.println("visitAttribute_func");
        AttributeFunc attributeFunc = new AttributeFunc();
        attributeFunc.setScopeId(getCurrentScope().getId());
        attributeFunc.setFunctionCp(visitFunction_cp(ctx.function_cp()));
        if (ctx.not() != null) {
            attributeFunc.setNot(visitNot(ctx.not()));
        }
        if (ctx.sign_number() != null) {
            attributeFunc.setSignNumber(visitSign_number(ctx.sign_number()));
        }

        return attributeFunc;
    }

    @Override
    public AttributeVarDotVar visitAttribute_varDotVar(HTMLParser.Attribute_varDotVarContext ctx) {
        System.out.println("visitAttribute_varDotVar");
        AttributeVarDotVar attributeVarDotVar = new AttributeVarDotVar();
        attributeVarDotVar.setScopeId(getCurrentScope().getId());
        attributeVarDotVar.setDotIteration(visitDot_iteration(ctx.dot_iteration()));
        if (ctx.not() != null) {
            attributeVarDotVar.setNot(visitNot(ctx.not()));
        }
        if (ctx.sign_number() != null) {
            attributeVarDotVar.setSignNumber(visitSign_number(ctx.sign_number()));
        }
        return attributeVarDotVar;
    }

    @Override
    public DotIteration visitDot_iteration(HTMLParser.Dot_iterationContext ctx) {
        System.out.println("visitDot_iteration");
        DotIteration dotIteration = new DotIteration();
        dotIteration.setScopeId(getCurrentScope().getId());
        dotIteration.setVAR(ctx.VAR().getText());
        for (int i = 0; i < ctx.var_dot().size(); i++) {
            dotIteration.getVarDotArrayList().add(visitVar_dot(ctx.var_dot(i)));
        }

        return dotIteration;
    }

    @Override
    public VarDot visitVar_dot(HTMLParser.Var_dotContext ctx) {
        System.out.println("visitVar_dot");
        VarDot varDot = new VarDot();
        varDot.setScopeId(getCurrentScope().getId());
        varDot.setVAR(ctx.VAR().getText());

        return varDot;
    }

    @Override
    public ExprIfWithVarDotVarSign visitExpr_if_with_varDotVar_sign(HTMLParser.Expr_if_with_varDotVar_signContext ctx) {
        System.out.println("visitExpr_if_with_varDotVar_sign");
        ExprIfWithVarDotVarSign exprIfWithVarDotVarSign = new ExprIfWithVarDotVarSign();
        exprIfWithVarDotVarSign.setScopeId(getCurrentScope().getId());
        if (ctx.not() != null) {
            exprIfWithVarDotVarSign.setNot(visitNot(ctx.not()));
        }
        if (ctx.sign_number() != null) {
            exprIfWithVarDotVarSign.setSignNumber(visitSign_number(ctx.sign_number()));
        }
        exprIfWithVarDotVarSign.setVAR(ctx.VAR().getText());
        exprIfWithVarDotVarSign.setVarAfterIf(visitVar_after_if(ctx.var_after_if()));


        return exprIfWithVarDotVarSign;
    }

    @Override
    public VarAfterIf visitVar_after_if(HTMLParser.Var_after_ifContext ctx) {
        System.out.println("visitVar_after_if");
        VarAfterIf varAfterIf = new VarAfterIf();
        varAfterIf.setScopeId(getCurrentScope().getId());
        varAfterIf.setVAR(ctx.VAR().getText());

        return varAfterIf;
    }

    @Override
    public ExprIfWithFunc visitExpr_if_with_func(HTMLParser.Expr_if_with_funcContext ctx) {
        System.out.println("visitExpr_if_with_func");
        ExprIfWithFunc exprIfWithFunc = new ExprIfWithFunc();
        exprIfWithFunc.setScopeId(getCurrentScope().getId());
        if (ctx.not() != null) {
            exprIfWithFunc.setNot(visitNot(ctx.not()));
        }
        exprIfWithFunc.setFunctionCp(visitFunction_cp(ctx.function_cp()));
        if (ctx.sign_number() != null) {
            exprIfWithFunc.setSignNumber(visitSign_number(ctx.sign_number()));
        }

        return exprIfWithFunc;
    }

    @Override
    public CpHide visitCp_hide(HTMLParser.Cp_hideContext ctx) {
        System.out.println("visitCp_hide");
        CpHide cpHide = new CpHide();
        cpHide.setScopeId(getCurrentScope().getId());
        cpHide.setCP_HIDE(ctx.CP_HIDE().getText());
        cpHide.setExpressionHide(visitExpression_hide(ctx.expression_hide()));

        return cpHide;
    }

    @Override
    public ExpressionHide visitExpression_hide(HTMLParser.Expression_hideContext ctx) {
        System.out.println("visitExpression_hide");
        ExpressionHide expressionHide = new ExpressionHide();
        expressionHide.setScopeId(getCurrentScope().getId());
        if (ctx.expr_hide_with_func() != null) {
            expressionHide.setExprHideWithFunc(visitExpr_hide_with_func(ctx.expr_hide_with_func()));
        }
        /*if (ctx.expr_hide_with_not_varDotVar() != null) {
            expressionHide.setExprHideWithNotVarDotVar(visitExpr_hide_with_not_varDotVar(ctx.expr_hide_with_not_varDotVar()));
        }*/
        if (ctx.iteration() != null) {
            expressionHide.setIteration(visitIteration(ctx.iteration()));
        }
        if (ctx.VAR() != null) {
            expressionHide.setVAR(ctx.VAR().getText());
            if (ctx.not() != null) {
                expressionHide.setNot(visitNot(ctx.not()));
            }
        }

        return expressionHide;
    }


    @Override
    public ExprHideWithNotVarDotVar visitExpr_hide_with_not_varDotVar(HTMLParser.Expr_hide_with_not_varDotVarContext ctx) {
        System.out.println("visitExpr_hide_with_not_varDotVar");
        ExprHideWithNotVarDotVar exprHideWithNotVarDotVar = new ExprHideWithNotVarDotVar();
        exprHideWithNotVarDotVar.setScopeId(getCurrentScope().getId());
        if (ctx.not() != null) {
            exprHideWithNotVarDotVar.setNot(visitNot(ctx.not()));
        }
        exprHideWithNotVarDotVar.setVAR(ctx.VAR().getText());
        exprHideWithNotVarDotVar.setVarAfterHide(visitVar_after_hide(ctx.var_after_hide()));

        return exprHideWithNotVarDotVar;
    }


    @Override
    public VarAfterHide visitVar_after_hide(HTMLParser.Var_after_hideContext ctx) {
        System.out.println("visitVar_after_hide");
        VarAfterHide varAfterHide = new VarAfterHide();
        varAfterHide.setScopeId(getCurrentScope().getId());
        varAfterHide.setVAR(ctx.VAR().getText());

        return varAfterHide;
    }

    @Override
    public ExprHideWithFunc visitExpr_hide_with_func(HTMLParser.Expr_hide_with_funcContext ctx) {
        System.out.println("visitExpr_hide_with_func");
        ExprHideWithFunc exprHideWithFunc = new ExprHideWithFunc();
        exprHideWithFunc.setScopeId(getCurrentScope().getId());
        if (ctx.not() != null) {
            exprHideWithFunc.setNot(visitNot(ctx.not()));
        }
        exprHideWithFunc.setFunctionCp(visitFunction_cp(ctx.function_cp()));
        if (ctx.sign_number() != null) {
            exprHideWithFunc.setSignNumber(visitSign_number(ctx.sign_number()));
        }

        return exprHideWithFunc;
    }


    @Override
    public Not visitNot(HTMLParser.NotContext ctx) {
        System.out.println("visitNot");
        Not not = new Not();
        not.setScopeId(getCurrentScope().getId());
        not.setNOT_CONDITION(ctx.NOT_CONDITION().getText());

        return not;
    }

    @Override
    public CpFor visitCp_for(HTMLParser.Cp_forContext ctx) {
        System.out.println("visitCp_for");
        CpFor cpFor = new CpFor();
        cpFor.setScopeId(getCurrentScope().getId());
        cpFor.setCP_FOR(ctx.CP_FOR().getText());
        cpFor.setExpressionFor(visitExpression_for(ctx.expression_for()));

        return cpFor;
    }

    @Override
    public ExpressionFor visitExpression_for(HTMLParser.Expression_forContext ctx) {
        System.out.println("visitExpression_for");
        ExpressionFor expressionFor = new ExpressionFor();
        expressionFor.setScopeId(getCurrentScope().getId());
        expressionFor.setScopeId(getCurrentScope().getId());
        if (ctx.var_after() != null) {
            expressionFor.setVAR(ctx.VAR().getText());
            expressionFor.setVarAfter(visitVar_after(ctx.var_after()));
        }
        if (ctx.expr_for_with_index() != null) {
            expressionFor.setExprForWithIndex(visitExpr_for_with_index(ctx.expr_for_with_index()));
        }
        if (ctx.expr_for_with_arr() != null) {
            expressionFor.setExprForWithArr(visitExpr_for_with_arr(ctx.expr_for_with_arr()));
        }

        return expressionFor;
    }

    @Override
    public ExprForWithArr visitExpr_for_with_arr(HTMLParser.Expr_for_with_arrContext ctx) {
        System.out.println("visitExpr_for_with_arr");
        ExprForWithArr exprForWithArr = new ExprForWithArr();
        exprForWithArr.setScopeId(getCurrentScope().getId());
        exprForWithArr.setIN(ctx.IN().getText());
        exprForWithArr.setVAR(ctx.VAR().getText());
        exprForWithArr.setVarAfter(visitVar_after(ctx.var_after()));
        exprForWithArr.setVarAftercomma(visitVar_after_comma(ctx.var_after_comma()));

        return exprForWithArr;
    }

    @Override
    public VarAftercomma visitVar_after_comma(HTMLParser.Var_after_commaContext ctx) {
        System.out.println("visitVar_after_comma");
        VarAftercomma varAftercomma = new VarAftercomma();
        varAftercomma.setScopeId(getCurrentScope().getId());
        varAftercomma.setVAR(ctx.VAR().getText());

        return varAftercomma;
    }

    @Override
    public ExprForWithIndex visitExpr_for_with_index(HTMLParser.Expr_for_with_indexContext ctx) {
        System.out.println("visitExpr_for_with_index");
        ExprForWithIndex exprForWithIndex = new ExprForWithIndex();
        exprForWithIndex.setScopeId(getCurrentScope().getId());
        exprForWithIndex.setVAR(ctx.VAR().getText());
        exprForWithIndex.setINDEX(ctx.INDEX().getText());
        exprForWithIndex.setVarAfter(visitVar_after(ctx.var_after()));
        exprForWithIndex.setVarBeforeIndex(visitVar_before_index(ctx.var_before_index()));

        return exprForWithIndex;
    }

    @Override
    public VarBeforeIndex visitVar_before_index(HTMLParser.Var_before_indexContext ctx) {
        System.out.println("visitVar_before_index");
        VarBeforeIndex varBeforeIndex = new VarBeforeIndex();
        varBeforeIndex.setScopeId(getCurrentScope().getId());
        varBeforeIndex.setVAR(ctx.VAR().getText());

        return varBeforeIndex;
    }

    @Override
    public VarAfter visitVar_after(HTMLParser.Var_afterContext ctx) {
        System.out.println("visitVar_after");
        VarAfter varAfter = new VarAfter();
        varAfter.setScopeId(getCurrentScope().getId());
        if (ctx.VAR() != null) {
            varAfter.setVAR(ctx.VAR().getText());
        }
        if (ctx.arr_elements() != null) {
            varAfter.setArrElements(visitArr_elements(ctx.arr_elements()));
        }
        if (ctx.object() != null) {
            varAfter.setObject(visitObject(ctx.object()));
        }

        return varAfter;
    }

    @Override
    public Object visitObject(HTMLParser.ObjectContext ctx) {
        System.out.println("visitObject");
        Object object = new Object();
        object.setScopeId(getCurrentScope().getId());
        for (int i = 0; i < ctx.element_obj().size(); i++) {
            object.getElementObjArrayList().add(visitElement_obj(ctx.element_obj(i)));
        }

        return object;
    }

    @Override
    public ElementObj visitElement_obj(HTMLParser.Element_objContext ctx) {
        System.out.println("visitElement_obj");
        ElementObj elementObj = new ElementObj();
        elementObj.setScopeId(getCurrentScope().getId());
        elementObj.setVAR(ctx.VAR().getText());
        if (ctx.var_after() != null) {
            elementObj.setVarAfter(visitVar_after(ctx.var_after()));
        }
        if (ctx.var_quote() != null) {
            elementObj.setVarQuote(visitVar_quote(ctx.var_quote()));
        }
        if (ctx.number_value() != null) {
            elementObj.setNumberValue(visitNumber_value(ctx.number_value()));
        }

        return elementObj;
    }

    @Override
    public VarQuote visitVar_quote(HTMLParser.Var_quoteContext ctx) {
        System.out.println("visitVar_quote");
        VarQuote varQuote = new VarQuote();
        varQuote.setScopeId(getCurrentScope().getId());
        varQuote.setVAR(ctx.VAR().getText());

        return varQuote;
    }

    @Override
    public NumberValue visitNumber_value(HTMLParser.Number_valueContext ctx) {
        System.out.println("visitNumber_value");
        NumberValue numberValue = new NumberValue();
        numberValue.setScopeId(getCurrentScope().getId());
        numberValue.setNUMBER(Integer.parseInt(ctx.NUMBER().getText()));

        return numberValue;
    }

    @Override
    public ArrElements visitArr_elements(HTMLParser.Arr_elementsContext ctx) {
        System.out.println("visitArr_elements");
        ArrElements arrElements = new ArrElements();
        arrElements.setScopeId(getCurrentScope().getId());
        for (int i = 0; i < ctx.arr_element().size(); i++) {
            arrElements.getArrElementArrayList().add(visitArr_element(ctx.arr_element(i)));
        }
        return arrElements;
    }

    @Override
    public ArrElement visitArr_element(HTMLParser.Arr_elementContext ctx) {
        System.out.println("visitArr_element");
        ArrElement arrElement = new ArrElement();
        arrElement.setScopeId(getCurrentScope().getId());
        arrElement.setELEMENT(ctx.ELEMENT().getText());

        return arrElement;
    }

    @Override
    public CpApp visitCp_app(HTMLParser.Cp_appContext ctx) {
        System.out.println("visitCp_app");
        CpApp cpApp = new CpApp();
        cpApp.setScopeId(getCurrentScope().getId());
        cpApp.setCP_APP(ctx.CP_APP().getText());
        cpApp.setTAG_EQUALS(ctx.TAG_EQUALS().getText());
        cpApp.setExpressionApp(visitExpression_app(ctx.expression_app()));

        return cpApp;
    }

    @Override
    public CpShow visitCp_show(HTMLParser.Cp_showContext ctx) {
        System.out.println("visitCp_show");
        CpShow cpShow = new CpShow();
        cpShow.setScopeId(getCurrentScope().getId());
        cpShow.setCP_SHOW(ctx.CP_SHOW().getText());
        cpShow.setTAG_EQUALS(ctx.TAG_EQUALS().getText());
        cpShow.setExpressionShow(visitExpression_show(ctx.expression_show()));

        return cpShow;
    }


    @Override
    public ExpressionApp visitExpression_app(HTMLParser.Expression_appContext ctx) {
        System.out.println("visitExpression_app");
        ExpressionApp expressionApp = new ExpressionApp();
        expressionApp.setScopeId(getCurrentScope().getId());
        expressionApp.setVar(ctx.VAR().getText());

        return expressionApp;
    }

    @Override
    public ExpressionShow visitExpression_show(HTMLParser.Expression_showContext ctx) {
        System.out.println("visitExpression_show");
        ExpressionShow expressionShow = new ExpressionShow();
        expressionShow.setScopeId(getCurrentScope().getId());
        if (ctx.VAR() != null) {
            expressionShow.setVar(ctx.VAR().getText());
        }
        if (ctx.iteration() != null) {
            expressionShow.setIteration(visitIteration(ctx.iteration()));
        }
        if (ctx.function_show() != null) {
            expressionShow.setFunctionShow(visitFunction_show(ctx.function_show()));
        }

        return expressionShow;
    }

    @Override
    public VarAfterShow visitVar_after_show(HTMLParser.Var_after_showContext ctx) {
        System.out.println("visitVar_after_show");
        VarAfterShow varAfterShow = new VarAfterShow();
        varAfterShow.setScopeId(getCurrentScope().getId());
        varAfterShow.setVar(ctx.VAR().getText());

        return varAfterShow;
    }

    @Override
    public FunctionShow visitFunction_show(HTMLParser.Function_showContext ctx) {
        System.out.println("visitFunction_show");
        FunctionShow functionShow = new FunctionShow();
        functionShow.setScopeId(getCurrentScope().getId());
        functionShow.setFunctionCp(visitFunction_cp(ctx.function_cp()));
        if (ctx.sign_number() != null) {
            functionShow.setSignNumber(visitSign_number(ctx.sign_number()));
        }

        return functionShow;
    }

    @Override
    public FunctionCp visitFunction_cp(HTMLParser.Function_cpContext ctx) {
        System.out.println("visitFunction_cp");
        FunctionCp functionCp = new FunctionCp();
        functionCp.setScopeId(getCurrentScope().getId());
        if (ctx.FUNCTION() != null) {
            functionCp.setFUNCTION(ctx.FUNCTION().getText());
        }
        if (ctx.func_parameters_cp() != null) {
            functionCp.setFuncParameters(visitFunc_parameters_cp(ctx.func_parameters_cp()));
            functionCp.setVar(ctx.VAR().getText());
        }

        return functionCp;
    }

    @Override
    public FuncParametersCP visitFunc_parameters_cp(HTMLParser.Func_parameters_cpContext ctx) {
        System.out.println("visitFunc_parameters_cp");
        FuncParametersCP funcParametersCP = new FuncParametersCP();
        funcParametersCP.setScopeId(getCurrentScope().getId());
        funcParametersCP.setBRACKET_FUNC_CLOSE(ctx.BRACKET_FUNC_CLOSE().getText());
        funcParametersCP.setBRACKET_FUNC_OPEN(ctx.BRACKET_FUNC_OPEN().getText());
        for (int i = 0; i < ctx.fun_param().size(); i++) {
            funcParametersCP.getFunParamArrayList().add(visitFun_param(ctx.fun_param(i)));
        }
        if (ctx.equation() != null) {
            funcParametersCP.setEquation(visitEquation(ctx.equation()));
        }

        return funcParametersCP;
    }

    @Override
    public Equation visitEquation(HTMLParser.EquationContext ctx) {
        System.out.println("visitEquation");
        Equation equation = new Equation();
        equation.setScopeId(getCurrentScope().getId());
        if (ctx.VAR_PARAMETER() != null) {
            equation.setVAR_PARAMETER(ctx.VAR_PARAMETER().getText());
        }
        if (ctx.PARAMETER_NUMBER() != null) {
            equation.setPARAMETER_NUMBER(ctx.PARAMETER_NUMBER().getText());
        }
        for (int i = 0; i < ctx.equation_param().size(); i++) {
            equation.getEquationParamArrayList().add(visitEquation_param(ctx.equation_param(i)));
        }

        return equation;
    }

    @Override
    public EquationParam visitEquation_param(HTMLParser.Equation_paramContext ctx) {
        System.out.println("visitEquation_param");
        EquationParam equationParam = new EquationParam();
        equationParam.setScopeId(getCurrentScope().getId());
        equationParam.setPARAMETER_SIGN(ctx.PARAMETER_SIGN().getText());
        if (ctx.PARAMETER_NUMBER() != null) {
            equationParam.setPARAMETER_NUMBER(ctx.PARAMETER_NUMBER().getText());
        }
        if (ctx.VAR_PARAMETER() != null) {
            equationParam.setVAR_PARAMETER(ctx.VAR_PARAMETER().getText());
        }

        return equationParam;
    }

    @Override
    public FunParam visitFun_param(HTMLParser.Fun_paramContext ctx) {
        System.out.println("visitFun_param");
        FunParam funParam = new FunParam();
        funParam.setScopeId(getCurrentScope().getId());
        funParam.setVAR_PARAMETER(ctx.VAR_PARAMETER().getText());

        return funParam;
    }

    @Override
    public SignNumber visitSign_number(HTMLParser.Sign_numberContext ctx) {
        System.out.println("visitSign_number");
        SignNumber signNumber = new SignNumber();
        signNumber.setScopeId(getCurrentScope().getId());
        signNumber.setNumber(visitNumber(ctx.number()));
        signNumber.setSign(visitSign(ctx.sign()));

        return signNumber;
    }

    @Override
    public Number visitNumber(HTMLParser.NumberContext ctx) {
        System.out.println("visitNumber");
        Number number = new Number();
        number.setScopeId(getCurrentScope().getId());
        number.setNUMBER(Integer.parseInt(ctx.NUMBER().getText()));

        return number;
    }

    @Override
    public Sign visitSign(HTMLParser.SignContext ctx) {
        System.out.println("visitSign");
        Sign sign = new Sign();
        sign.setScopeId(getCurrentScope().getId());
        sign.setSIGN(ctx.SIGN().getText());

        return sign;
    }

    @Override
    public HTMLComment visitHtmlComment(HTMLParser.HtmlCommentContext ctx) {
        System.out.println("visitHtmlComment");
        HTMLComment htmlComment = new HTMLComment();
        htmlComment.setScopeId(getCurrentScope().getId());
        if (ctx.HTML_COMMENT() != null) {
            htmlComment.setHTML_COMMENT(ctx.HTML_COMMENT().getText());
        }
        if (ctx.HTML_CONDITIONAL_COMMENT() != null) {
            htmlComment.setHTML_CONDITIONAL_COMMENT(ctx.HTML_CONDITIONAL_COMMENT().getText());
        }
        return htmlComment;
    }

    @Override
    public CloseHtmlAndContent visitCloseHtmlAndContent(HTMLParser.CloseHtmlAndContentContext ctx) {
        System.out.println("visitCloseHtmlAndContent");
        CloseHtmlAndContent closeHtmlAndContent = new CloseHtmlAndContent();
        closeHtmlAndContent.setScopeId(getCurrentScope().getId());
        if (ctx.TAG_SLASH_CLOSE() == null) {
            if (ctx.TAG_CLOSE() != null)
                closeHtmlAndContent.setTAG_CLOSE(ctx.TAG_CLOSE().getText());
            if (ctx.innerCloseHtmlElement() != null) {
                closeHtmlAndContent.setInnerCloseHtmlElement(visitInnerCloseHtmlElement(ctx.innerCloseHtmlElement()));
            }
        } else {
            closeHtmlAndContent.setTAG_SLASH_CLOSE(ctx.TAG_SLASH_CLOSE().getText());
        }

        return closeHtmlAndContent;

    }

    @Override
    public InnerCloseHtmlElement visitInnerCloseHtmlElement(HTMLParser.InnerCloseHtmlElementContext ctx) {
        System.out.println("visitInnerCloseHtmlElement");
        InnerCloseHtmlElement innerCloseHtmlElement = new InnerCloseHtmlElement();
        innerCloseHtmlElement.setScopeId(getCurrentScope().getId());
        innerCloseHtmlElement.setTAG_CLOSE(ctx.TAG_CLOSE().getText());
        innerCloseHtmlElement.setTAG_NAME(ctx.TAG_NAME().getText());
        innerCloseHtmlElement.setTAG_SLASH(ctx.TAG_SLASH().getText());
        innerCloseHtmlElement.setTAG_OPEN(ctx.TAG_OPEN().getText());
        innerCloseHtmlElement.setHtmlContent(visitHtmlContent(ctx.htmlContent()));


        return innerCloseHtmlElement;

    }

    @Override
    public HtmlContent visitHtmlContent(HTMLParser.HtmlContentContext ctx) {
        System.out.println("visitHtmlContent");
        HtmlContent htmlContent = new HtmlContent();
        htmlContent.setScopeId(getCurrentScope().getId());
        if (ctx.htmlChardata() != null) {
            htmlContent.setHtmlChardata(visitHtmlChardata(ctx.htmlChardata()));
        }
        if (ctx.htmlChardataValues() != null) {
            for (int i = 0; i < ctx.htmlChardataValues().size(); i++) {
                htmlContent.getHtmlChardataValues().add(visitHtmlChardataValues(ctx.htmlChardataValues(i)));
            }
        }
        return htmlContent;
    }

    @Override
    public HtmlChardata visitHtmlChardata(HTMLParser.HtmlChardataContext ctx) {
        System.out.println("visitHtmlChardata");
        HtmlChardata htmlChardata = new HtmlChardata();
        htmlChardata.setScopeId(getCurrentScope().getId());
        if (ctx.htmlCharDataWithMustache() != null) {
            htmlChardata.setHtmlCharDataWithMustache(visitHtmlCharDataWithMustache(ctx.htmlCharDataWithMustache()));
        }
        if (ctx.htmlCharDataWithoutMustache() != null) {
            htmlChardata.setHtmlCharDataWithoutMustache(visitHtmlCharDataWithoutMustache(ctx.htmlCharDataWithoutMustache()));
        }

        if (ctx.SEA_WS() != null) {
            htmlChardata.setSEA_WS(ctx.SEA_WS().getText());
        }

        return htmlChardata;

    }

    @Override
    public HtmlChardataValues visitHtmlChardataValues(HTMLParser.HtmlChardataValuesContext ctx) {
        System.out.println("visitHtmlChardataValues");

        HtmlChardataValues htmlChardataValues = new HtmlChardataValues();
        htmlChardataValues.setScopeId(getCurrentScope().getId());
        if (ctx.CDATA() != null) {
            htmlChardataValues.setCDATA(ctx.CDATA().getText());
        }
        if (ctx.htmlComment() != null) {
            htmlChardataValues.setHtmlComment(visitHtmlComment(ctx.htmlComment()));
        }
        if (ctx.htmlElement() != null) {
            htmlChardataValues.setHtmlElement(visitHtmlElement(ctx.htmlElement()));
        }
        if (ctx.htmlChardata() != null) {
            htmlChardataValues.setHtmlChardata(visitHtmlChardata(ctx.htmlChardata()));
        }

        return htmlChardataValues;
    }

    @Override
    public HtmlCharDataWithoutMustache visitHtmlCharDataWithoutMustache(HTMLParser.HtmlCharDataWithoutMustacheContext ctx) {
        System.out.println("HtmlCharDataWithoutMustache");
        HtmlCharDataWithoutMustache htmlCharDataWithoutMustache = new HtmlCharDataWithoutMustache();
        htmlCharDataWithoutMustache.setScopeId(getCurrentScope().getId());
        htmlCharDataWithoutMustache.setSpacesBeforeText(visitSpacesBeforeText(ctx.spacesBeforeText()));

        if (ctx.html_text() != null) {
            htmlCharDataWithoutMustache.setHtmlText(visitHtml_text(ctx.html_text()));
        }
        if (ctx.var_condition_txt() != null) {
            htmlCharDataWithoutMustache.setVarConditionTxt(visitVar_condition_txt(ctx.var_condition_txt()));
        }
        htmlCharDataWithoutMustache.setSpacesAfterText(visitSpacesAfterText(ctx.spacesAfterText()));
        return htmlCharDataWithoutMustache;
    }

    @Override
    public SpacesAfterText visitSpacesAfterText(HTMLParser.SpacesAfterTextContext ctx) {
        System.out.println("visitSpacesAfterText");
        SpacesAfterText spacesAfterText = new SpacesAfterText();
        spacesAfterText.setScopeId(getCurrentScope().getId());
        for (int i = 0; i < ctx.htmlMisc().size(); i++) {
            spacesAfterText.getHtmlMiscArrayList().add(visitHtmlMisc(ctx.htmlMisc(i)));
        }
        return spacesAfterText;
    }

    @Override
    public HtmlText visitHtml_text(HTMLParser.Html_textContext ctx) {
        System.out.println("visitHtml_text");
        HtmlText htmlText = new HtmlText();
        htmlText.setScopeId(getCurrentScope().getId());
        htmlText.setANY_HTML_TEXT(ctx.ANY_HTML_TEXT().getText());

        return htmlText;
    }

    @Override
    public VarConditionTxt visitVar_condition_txt(HTMLParser.Var_condition_txtContext ctx) {
        System.out.println("visitVar_condition_txt");
        VarConditionTxt varConditionTxt = new VarConditionTxt();
        varConditionTxt.setScopeId(getCurrentScope().getId());
        if (ctx.VAR_BRACKET() != null) {
            varConditionTxt.setVAR_BRACKET(ctx.VAR_BRACKET().getText());
        }
        if (ctx.var_condition_mustache() != null) {
            varConditionTxt.setVarConditionMustache(visitVar_condition_mustache(ctx.var_condition_mustache()));
        }
        if (ctx.iteration_condition() != null) {
            varConditionTxt.setIterationCondition(visitIteration_condition(ctx.iteration_condition()));
        }

        return varConditionTxt;
    }

    @Override
    public IterationCondition visitIteration_condition(HTMLParser.Iteration_conditionContext ctx) {
        System.out.println("visitIteration_condition");
        IterationCondition iterationCondition = new IterationCondition();
        iterationCondition.setScopeId(getCurrentScope().getId());
        if (ctx.iteration_mustache() != null) {
            iterationCondition.setIterationMustache(visitIteration_mustache(ctx.iteration_mustache()));
        }
        if (ctx.sign_mustache() != null) {
            iterationCondition.setSignMustache(visitSign_mustache(ctx.sign_mustache()));
        }
        if (ctx.number_mustache() != null) {
            iterationCondition.setNumberMustache(visitNumber_mustache(ctx.number_mustache()));
        }

        return iterationCondition;
    }

    @Override
    public VarConditionMustache visitVar_condition_mustache(HTMLParser.Var_condition_mustacheContext ctx) {
        System.out.println("visitVar_condition_mustache");
        VarConditionMustache varConditionMustache = new VarConditionMustache();
        varConditionMustache.setScopeId(getCurrentScope().getId());
        if (ctx.FUNCTION_BRACKET() != null) {
            varConditionMustache.setFUNCTION_BRACKET(ctx.FUNCTION_BRACKET().getText());
        }
        if (ctx.VAR_BRACKET() != null) {
            varConditionMustache.setVAR_BRACKET(ctx.VAR_BRACKET().getText());
        }
        varConditionMustache.setSignMustache(visitSign_mustache(ctx.sign_mustache()));
        varConditionMustache.setNumberMustache(visitNumber_mustache(ctx.number_mustache()));

        return varConditionMustache;
    }

    @Override
    public SignMustache visitSign_mustache(HTMLParser.Sign_mustacheContext ctx) {
        System.out.println("visitSign_mustache");
        SignMustache signMustache = new SignMustache();
        signMustache.setScopeId(getCurrentScope().getId());
        signMustache.setSIGN_MUSTACHE(ctx.SIGN_MUSTACHE().getText());
        return signMustache;
    }

    @Override
    public NumberMustache visitNumber_mustache(HTMLParser.Number_mustacheContext ctx) {
        System.out.println("visitNumber_mustache");
        NumberMustache numberMustache = new NumberMustache();
        numberMustache.setScopeId(getCurrentScope().getId());
        numberMustache.setNUMBER_BRACKET(ctx.NUMBER_BRACKET().getText());
        return numberMustache;
    }

    @Override
    public SpacesBeforeText visitSpacesBeforeText(HTMLParser.SpacesBeforeTextContext ctx) {
        System.out.println("visitSpacesBeforeText");
        SpacesBeforeText spacesBeforeText = new SpacesBeforeText();
        spacesBeforeText.setScopeId(getCurrentScope().getId());
        for (int i = 0; i < ctx.htmlMisc().size(); i++) {
            spacesBeforeText.getHtmlMiscArrayList().add(visitHtmlMisc(ctx.htmlMisc(i)));
        }
        return spacesBeforeText;
    }

    @Override
    public HtmlCharDataWithMustache visitHtmlCharDataWithMustache(HTMLParser.HtmlCharDataWithMustacheContext ctx) {
        System.out.println("visitHtmlCharDataWithMustache");
        HtmlCharDataWithMustache htmlCharDataWithMustache = new HtmlCharDataWithMustache();
        htmlCharDataWithMustache.setScopeId(getCurrentScope().getId());
        for (int i = 0; i < ctx.mustach_list().size(); i++) {
            htmlCharDataWithMustache.getMustacheListArrayList().add(visitMustach_list(ctx.mustach_list(i)));
        }

        return htmlCharDataWithMustache;
    }

    @Override
    public MustacheList visitMustach_list(HTMLParser.Mustach_listContext ctx) {
        System.out.println("visitMustach_list");
        MustacheList mustacheList = new MustacheList();
        mustacheList.setScopeId(getCurrentScope().getId());
        mustacheList.setSpacesBeforeTextMustacheLEFT(visitSpacesBeforeTextMustacheLEFT(ctx.spacesBeforeTextMustacheLEFT()));
        if (ctx.textLeftMustache() != null) {
            mustacheList.setTextLeftMustache(visitTextLeftMustache(ctx.textLeftMustache()));
        }
        mustacheList.setSpacesAfterTextMustacheLEFT(visitSpacesAfterTextMustacheLEFT(ctx.spacesAfterTextMustacheLEFT()));

        for (int i = 0; i < ctx.mustache().size(); i++) {
            mustacheList.getMustacheArrayList().add(visitMustache(ctx.mustache(i)));
        }

        mustacheList.setSpacesBeforeTextMustacheRIGHT(visitSpacesBeforeTextMustacheRIGHT(ctx.spacesBeforeTextMustacheRIGHT()));
        if (ctx.textRightMustache() != null) {
            mustacheList.setTextRightMustache(visitTextRightMustache(ctx.textRightMustache()));
        }
        mustacheList.setSpacesAfterTextMustacheRIGHT(visitSpacesAfterTextMustacheRIGHT(ctx.spacesAfterTextMustacheRIGHT()));

        return mustacheList;
    }

    @Override
    public SpacesAfterTextMustacheRIGHT visitSpacesAfterTextMustacheRIGHT(HTMLParser.SpacesAfterTextMustacheRIGHTContext ctx) {
        System.out.println("visitSpacesAfterTextMustacheRIGHT");
        SpacesAfterTextMustacheRIGHT spacesAfterTextMustacheRIGHT = new SpacesAfterTextMustacheRIGHT();
        spacesAfterTextMustacheRIGHT.setScopeId(getCurrentScope().getId());
        for (int i = 0; i < ctx.htmlMisc().size(); i++) {
            spacesAfterTextMustacheRIGHT.getHtmlMiscArrayList().add(visitHtmlMisc(ctx.htmlMisc(i)));
        }
        return spacesAfterTextMustacheRIGHT;
    }

    @Override
    public TextRightMustache visitTextRightMustache(HTMLParser.TextRightMustacheContext ctx) {
        System.out.println("visitTextRightMustache");
        TextRightMustache textRightMustache = new TextRightMustache();
        textRightMustache.setScopeId(getCurrentScope().getId());
        if (ctx.var_condition_txt() != null) {
            textRightMustache.setVarConditionTxt(visitVar_condition_txt(ctx.var_condition_txt()));
        }
        if (ctx.html_text_after_mustache() != null) {
            textRightMustache.setHtmlTextAfterMustache(visitHtml_text_after_mustache(ctx.html_text_after_mustache()));
        }
        return textRightMustache;
    }

    @Override
    public HtmlTextAfterMustache visitHtml_text_after_mustache(HTMLParser.Html_text_after_mustacheContext ctx) {
        System.out.println("visitHtml_text_after_mustache");
        HtmlTextAfterMustache htmlTextAfterMustache = new HtmlTextAfterMustache();
        htmlTextAfterMustache.setScopeId(getCurrentScope().getId());
        htmlTextAfterMustache.setANY_HTML_TEXT(ctx.ANY_HTML_TEXT().getText());

        return htmlTextAfterMustache;
    }

    @Override
    public SpacesBeforeTextMustacheRIGHT visitSpacesBeforeTextMustacheRIGHT(HTMLParser.SpacesBeforeTextMustacheRIGHTContext ctx) {
        System.out.println("visitSpacesBeforeTextMustacheRIGHT");
        SpacesBeforeTextMustacheRIGHT spacesBeforeTextMustacheRIGHT = new SpacesBeforeTextMustacheRIGHT();
        spacesBeforeTextMustacheRIGHT.setScopeId(getCurrentScope().getId());
        for (int i = 0; i < ctx.htmlMisc().size(); i++) {
            spacesBeforeTextMustacheRIGHT.getHtmlMiscArrayList().add(visitHtmlMisc(ctx.htmlMisc(i)));
        }
        return spacesBeforeTextMustacheRIGHT;
    }

    @Override
    public SpacesAfterTextMustacheLEFT visitSpacesAfterTextMustacheLEFT(HTMLParser.SpacesAfterTextMustacheLEFTContext ctx) {
        System.out.println("visitSpacesAfterTextMustacheLEFT");
        SpacesAfterTextMustacheLEFT spacesAfterTextMustacheLEFT = new SpacesAfterTextMustacheLEFT();
        spacesAfterTextMustacheLEFT.setScopeId(getCurrentScope().getId());
        for (int i = 0; i < ctx.htmlMisc().size(); i++) {
            spacesAfterTextMustacheLEFT.getHtmlMiscArrayList().add(visitHtmlMisc(ctx.htmlMisc(i)));
        }
        return spacesAfterTextMustacheLEFT;
    }

    @Override
    public SpacesBeforeTextMustacheLEFT visitSpacesBeforeTextMustacheLEFT(HTMLParser.SpacesBeforeTextMustacheLEFTContext ctx) {
        System.out.println("visitSpacesBeforeTextMustacheLEFT");
        SpacesBeforeTextMustacheLEFT spacesBeforeTextMustacheLEFT = new SpacesBeforeTextMustacheLEFT();
        spacesBeforeTextMustacheLEFT.setScopeId(getCurrentScope().getId());
        for (int i = 0; i < ctx.htmlMisc().size(); i++) {
            spacesBeforeTextMustacheLEFT.getHtmlMiscArrayList().add(visitHtmlMisc(ctx.htmlMisc(i)));
        }
        return spacesBeforeTextMustacheLEFT;
    }

    @Override
    public TextLeftMustache visitTextLeftMustache(HTMLParser.TextLeftMustacheContext ctx) {
        System.out.println("visitTextLeftMustache");
        TextLeftMustache textLeftMustache = new TextLeftMustache();
        textLeftMustache.setScopeId(getCurrentScope().getId());
        if (ctx.html_text_before_mustache() != null) {
            textLeftMustache.setHtmlTextBeforeMustache(visitHtml_text_before_mustache(ctx.html_text_before_mustache()));
        }
        if (ctx.var_condition_txt() != null) {
            textLeftMustache.setVarConditionTxt(visitVar_condition_txt(ctx.var_condition_txt()));
        }
        return textLeftMustache;
    }

    @Override
    public HtmlTextBeforeMustache visitHtml_text_before_mustache(HTMLParser.Html_text_before_mustacheContext ctx) {
        System.out.println("visitHtml_text_before_mustache");
        HtmlTextBeforeMustache htmlTextBeforeMustache = new HtmlTextBeforeMustache();
        htmlTextBeforeMustache.setScopeId(getCurrentScope().getId());
        htmlTextBeforeMustache.setANY_HTML_TEXT(ctx.ANY_HTML_TEXT().getText());

        return htmlTextBeforeMustache;
    }

    @Override
    public Mustache visitMustache(HTMLParser.MustacheContext ctx) {
        System.out.println("visitMustache");
        Mustache mustache = new Mustache();
        mustache.setScopeId(getCurrentScope().getId());
        if (ctx.mustache_without_expr() != null) {
            mustache.setMustacheWithoutExpr(visitMustache_without_expr(ctx.mustache_without_expr()));
        }
        if (ctx.mustache_with_expr() != null) {
            mustache.setMustacheWithExpr(visitMustache_with_expr(ctx.mustache_with_expr()));
        }


        return mustache;
    }

    @Override
    public MustacheWithoutExpr visitMustache_without_expr(HTMLParser.Mustache_without_exprContext ctx) {
        System.out.println("visitMustache_without_expr");
        MustacheWithoutExpr mustacheWithoutExpr = new MustacheWithoutExpr();
        mustacheWithoutExpr.setScopeId(getCurrentScope().getId());
        mustacheWithoutExpr.setSpacesBeforeText(visitSpacesBeforeText(ctx.spacesBeforeText()));
        mustacheWithoutExpr.setFirstVariableBracket(visitFirst_variable_bracket(ctx.first_variable_bracket()));
        mustacheWithoutExpr.setHtmlText(visitHtml_text(ctx.html_text()));
        mustacheWithoutExpr.setSecondVariableBracket(visitSecond_variable_bracket(ctx.second_variable_bracket()));
        mustacheWithoutExpr.setSpacesAfterText(visitSpacesAfterText(ctx.spacesAfterText()));
        return mustacheWithoutExpr;
    }

    @Override
    public FirstVariableBracket visitFirst_variable_bracket(HTMLParser.First_variable_bracketContext ctx) {
        System.out.println("visitFirst_variable_bracket");
        FirstVariableBracket firstVariableBracket = new FirstVariableBracket();
        firstVariableBracket.setScopeId(getCurrentScope().getId());
        firstVariableBracket.setMUSTACHE_CLOSE(ctx.MUSTACHE_CLOSE().getText());
        firstVariableBracket.setMUSTACHE_OPEN(ctx.MUSTACHE_OPEN().getText());
        firstVariableBracket.setVar(visitVar(ctx.var()));
        return firstVariableBracket;

    }

    @Override
    public Var visitVar(HTMLParser.VarContext ctx) {
        System.out.println("visitVar");
        Var var = new Var();
        var.setScopeId(getCurrentScope().getId());
        if (ctx.var_with_quote() != null) {

            var.setVarWithQuote(visitVar_with_quote(ctx.var_with_quote()));
        }
        if (ctx.VAR_BRACKET() != null) {
            var.setVAR_BRACKET(ctx.VAR_BRACKET().toString());
        }
        return var;
    }

    @Override
    public VarWithQuote visitVar_with_quote(HTMLParser.Var_with_quoteContext ctx) {
        System.out.println("visitVar_with_quote");
        VarWithQuote varWithQuote = new VarWithQuote();
        varWithQuote.setScopeId(getCurrentScope().getId());
        varWithQuote.setVAR_BRACKET(ctx.VAR_BRACKET().getText());

        return varWithQuote;
    }

    @Override
    public SecondVariableBracket visitSecond_variable_bracket(HTMLParser.Second_variable_bracketContext ctx) {
        System.out.println("visitSecond_variable_bracket");
        SecondVariableBracket secondVariableBracket = new SecondVariableBracket();
        secondVariableBracket.setScopeId(getCurrentScope().getId());
        secondVariableBracket.setMUSTACHE_CLOSE(ctx.MUSTACHE_CLOSE().getText());
        secondVariableBracket.setMUSTACHE_OPEN(ctx.MUSTACHE_OPEN().getText());
        secondVariableBracket.setVar(visitVar(ctx.var()));
        return secondVariableBracket;
    }

    @Override
    public MustacheWithExpr visitMustache_with_expr(HTMLParser.Mustache_with_exprContext ctx) {
        System.out.println("visitMustache_with_expr");
        MustacheWithExpr mustacheWithExpr = new MustacheWithExpr();
        mustacheWithExpr.setScopeId(getCurrentScope().getId());
        mustacheWithExpr.setMUSTACHE_CLOSE(ctx.MUSTACHE_CLOSE().getText());
        mustacheWithExpr.setMUSTACHE_OPEN(ctx.MUSTACHE_OPEN().getText());
        mustacheWithExpr.setSpacesAfterTextMustacheRIGHT(visitSpacesAfterTextMustacheRIGHT(ctx.spacesAfterTextMustacheRIGHT()));
        mustacheWithExpr.setSpacesBeforeTextMustacheLEFT(visitSpacesBeforeTextMustacheLEFT(ctx.spacesBeforeTextMustacheLEFT()));
        mustacheWithExpr.setMustacheExpr(visitMustache_expr(ctx.mustache_expr()));


        return mustacheWithExpr;
    }

    @Override
    public MustacheExpr visitMustache_expr(HTMLParser.Mustache_exprContext ctx) {
        System.out.println("visitMustache_expr");
        MustacheExpr mustacheExpr = new MustacheExpr();
        mustacheExpr.setScopeId(getCurrentScope().getId());
        if (ctx.filter_mustache() != null) {
            mustacheExpr.setFilterMustache(visitFilter_mustache(ctx.filter_mustache()));
        }
        if (ctx.question_mustache() != null) {
            mustacheExpr.setQuestionMustache(visitQuestion_mustache(ctx.question_mustache()));
        }
        if (ctx.variable_mustache() != null) {
            mustacheExpr.setVariableMustache(visitVariable_mustache(ctx.variable_mustache()));
        }
        if (ctx.formatter_mustache() != null) {
            mustacheExpr.setFormatterMustache(visitFormatter_mustache(ctx.formatter_mustache()));
        }
        if (ctx.varDotVar() != null) {
            mustacheExpr.setVarDotVar(visitVarDotVar(ctx.varDotVar()));
        }
        if (ctx.operatorVar() != null) {
            mustacheExpr.setOperatorVar(visitOperatorVar(ctx.operatorVar()));
        }

        return mustacheExpr;
    }

    @Override
    public OperatorVar visitOperatorVar(HTMLParser.OperatorVarContext ctx) {
        System.out.println("visitOperatorVar");
        OperatorVar operatorVar = new OperatorVar();
        operatorVar.setScopeId(getCurrentScope().getId());
        operatorVar.setVarType(visitVar_type(ctx.var_type()));
        for (int i = 0; i < ctx.var_with_operatoer().size(); i++) {
            operatorVar.getVarWithOperatorList().add(visitVar_with_operatoer(ctx.var_with_operatoer(i)));
        }

        return operatorVar;
    }

    @Override
    public VarWithOperator visitVar_with_operatoer(HTMLParser.Var_with_operatoerContext ctx) {
        System.out.println("visitVar_with_operatoer");
        VarWithOperator varWithOperator = new VarWithOperator();
        varWithOperator.setScopeId(getCurrentScope().getId());
        varWithOperator.setOperator(visitOperator(ctx.operator()));
        varWithOperator.setVarType(visitVar_type(ctx.var_type()));

        return varWithOperator;
    }

    @Override
    public Operator visitOperator(HTMLParser.OperatorContext ctx) {
        System.out.println("visitOperator");
        Operator operator = new Operator();
        operator.setScopeId(getCurrentScope().getId());
        operator.setOPERATOR(ctx.OPERATOR().getText());

        return operator;
    }

    @Override
    public VarType visitVar_type(HTMLParser.Var_typeContext ctx) {
        System.out.println("visitVar_type");
        VarType varType = new VarType();
        varType.setScopeId(getCurrentScope().getId());
        if (ctx.var() != null) {
            varType.setVar(visitVar(ctx.var()));
        }
        if (ctx.number_mustache() != null) {
            varType.setNumberMustache(visitNumber_mustache(ctx.number_mustache()));
        }
        if (ctx.varDotVar() != null)
            varType.setVarDotVar(visitVarDotVar(ctx.varDotVar()));

        return varType;
    }

    @Override
    public FilterMustache visitFilter_mustache(HTMLParser.Filter_mustacheContext ctx) {
        System.out.println("visitFilter_mustache");
        FilterMustache filterMustache = new FilterMustache();
        filterMustache.setScopeId(getCurrentScope().getId());
        filterMustache.setPIPE(ctx.PIPE().getText());
        filterMustache.setFirstVar(visitFirst_var(ctx.first_var()));
        filterMustache.setFilterKind(visitFilter_kind(ctx.filter_kind()));

        return filterMustache;
    }

    @Override
    public FirstVar visitFirst_var(HTMLParser.First_varContext ctx) {
        System.out.println("visitFirst_var");
        FirstVar firstVar = new FirstVar();
        firstVar.setScopeId(getCurrentScope().getId());
        if (ctx.first_var_string() != null) {
            firstVar.setFirstVarString(visitFirst_var_string(ctx.first_var_string()));
        }
        if (ctx.NUMBER_BRACKET() != null) {
            firstVar.setNUMBER_BRACKET(Integer.parseInt(ctx.NUMBER_BRACKET().getText().trim()));
        }
        if (ctx.VAR_BRACKET() != null) {
            firstVar.setVAR_BRACKET(ctx.VAR_BRACKET().getText());
        }
        for (int i = 0; i < ctx.question_mustache().size(); i++) {
            firstVar.getQuestionMustacheArrayList().add(visitQuestion_mustache(ctx.question_mustache(i)));
        }
        if (ctx.BRACKET_MUSTACHE_Q_CLOSE() != null) {
            if (ctx.BRACKET_MUSTACHE_Q_OPEN() != null) {
                firstVar.setBRACKET_MUSTACHE_Q_CLOSE(ctx.BRACKET_MUSTACHE_Q_CLOSE().getText());
                firstVar.setBRACKET_MUSTACHE_Q_OPEN(ctx.BRACKET_MUSTACHE_Q_OPEN().getText());
            }
        }

        return firstVar;
    }

    @Override
    public FirstVarString visitFirst_var_string(HTMLParser.First_var_stringContext ctx) {
        System.out.println("visitFirst_var_string");
        FirstVarString firstVarString = new FirstVarString();
        firstVarString.setScopeId(getCurrentScope().getId());
        firstVarString.setVAR_BRACKET(ctx.VAR_BRACKET().getText());
        return firstVarString;
    }

    @Override
    public FilterKind visitFilter_kind(HTMLParser.Filter_kindContext ctx) {
        System.out.println("visitFilter_kind");
        FilterKind filterKind = new FilterKind();
        filterKind.setScopeId(getCurrentScope().getId());
        filterKind.setFILTER_KIND(ctx.FILTER_KIND().getText());

        return filterKind;
    }

    @Override
    public QuestionMustache visitQuestion_mustache(HTMLParser.Question_mustacheContext ctx) {
        System.out.println("visitQuestion_mustache");
        QuestionMustache questionMustache = new QuestionMustache();
        questionMustache.setScopeId(getCurrentScope().getId());
        questionMustache.setFirstVar(visitFirst_var(ctx.first_var()));
        questionMustache.setSecondVar(visitSecond_var(ctx.second_var()));
        questionMustache.setQUESTION_MARK(ctx.QUESTION_MARK().getText());
        questionMustache.setVarConditionTxt(visitVar_condition_txt(ctx.var_condition_txt()));
        questionMustache.setTWO_POINTS_VARIABLE(ctx.TWO_POINTS_VARIABLE().getText());


        return questionMustache;
    }

    @Override
    public SecondVar visitSecond_var(HTMLParser.Second_varContext ctx) {
        System.out.println("visitSecond_var");
        SecondVar secondVar = new SecondVar();
        secondVar.setScopeId(getCurrentScope().getId());
        if (ctx.first_var_string() != null) {
            secondVar.setFirstVarString(visitFirst_var_string(ctx.first_var_string()));
        }
        if (ctx.NUMBER_BRACKET() != null) {
            secondVar.setNUMBER_BRACKET(Integer.parseInt(ctx.NUMBER_BRACKET().getText().trim()));
        }
        if (ctx.VAR_BRACKET() != null) {
            secondVar.setVAR_BRACKET(ctx.VAR_BRACKET().getText());
        }
        for (int i = 0; i < ctx.question_mustache().size(); i++) {
            secondVar.getQuestionMustacheArrayList().add(visitQuestion_mustache(ctx.question_mustache(i)));
        }
        if (ctx.BRACKET_MUSTACHE_Q_CLOSE() != null) {
            if (ctx.BRACKET_MUSTACHE_Q_OPEN() != null) {
                secondVar.setBRACKET_MUSTACHE_Q_CLOSE(ctx.BRACKET_MUSTACHE_Q_CLOSE().getText());
                secondVar.setBRACKET_MUSTACHE_Q_OPEN(ctx.BRACKET_MUSTACHE_Q_OPEN().getText());
            }
        }
        return secondVar;
    }

    @Override
    public VariableMustache visitVariable_mustache(HTMLParser.Variable_mustacheContext ctx) {
        System.out.println("visitVariable_mustache");
        VariableMustache variableMustache = new VariableMustache();
        variableMustache.setScopeId(getCurrentScope().getId());
        variableMustache.setVar(visitVar(ctx.var()));

        return variableMustache;

    }

    @Override
    public FormatterMustache visitFormatter_mustache(HTMLParser.Formatter_mustacheContext ctx) {
        System.out.println("visitFormatter_mustache");
        FormatterMustache formatterMustache = new FormatterMustache();
        formatterMustache.setScopeId(getCurrentScope().getId());
        formatterMustache.setFirstVar(visitFirst_var(ctx.first_var()));
        formatterMustache.setPIPE(ctx.PIPE().getText());
        formatterMustache.setExprFormatter(visitExpr_formatter(ctx.expr_formatter()));

        return formatterMustache;
    }

    @Override
    public ExprFormatter visitExpr_formatter(HTMLParser.Expr_formatterContext ctx) {
        System.out.println("visitExpr_formatter");
        ExprFormatter exprFormatter = new ExprFormatter();
        exprFormatter.setScopeId(getCurrentScope().getId());
        exprFormatter.setMY_FORMATER(ctx.MY_FORMATER().getText());
        exprFormatter.setTWO_POINTS_VARIABLE(ctx.TWO_POINTS_VARIABLE().getText());
        exprFormatter.setFormatter(visitFormatter(ctx.formatter()));

        return exprFormatter;
    }

    @Override
    public Formatter visitFormatter(HTMLParser.FormatterContext ctx) {
        System.out.println("visitFormatter");
        Formatter formatter = new Formatter();
        formatter.setScopeId(getCurrentScope().getId());
        formatter.setVAR_BRACKET(ctx.VAR_BRACKET().getText());

        return formatter;
    }

    @Override
    public VarDotVar visitVarDotVar(HTMLParser.VarDotVarContext ctx) {
        System.out.println("visitVarDotVar");
        VarDotVar varDotVar = new VarDotVar();
        varDotVar.setScopeId(getCurrentScope().getId());
        varDotVar.setIterationMustache(visitIteration_mustache(ctx.iteration_mustache()));

        return varDotVar;
    }

    @Override
    public IterationMustache visitIteration_mustache(HTMLParser.Iteration_mustacheContext ctx) {
        System.out.println("visitIteration_mustache");
        IterationMustache iterationMustache = new IterationMustache();
        iterationMustache.setScopeId(getCurrentScope().getId());
        for (int i = 0; i < ctx.iteration_mustache_expr().size(); i++) {
            iterationMustache.getIterationMustacheExprArrayList().add(visitIteration_mustache_expr(ctx.iteration_mustache_expr(i)));
        }
        iterationMustache.setSecondVar(visitSecond_var(ctx.second_var()));

        return iterationMustache;
    }

    @Override
    public IterationMustacheExpr visitIteration_mustache_expr(HTMLParser.Iteration_mustache_exprContext ctx) {
        System.out.println("visitIteration_mustache_expr");
        IterationMustacheExpr iterationMustacheExpr = new IterationMustacheExpr();
        iterationMustacheExpr.setScopeId(getCurrentScope().getId());
        iterationMustacheExpr.setFirstVar(visitFirst_var(ctx.first_var()));

        return iterationMustacheExpr;
    }

    private void createScope() {
        System.out.println("createScope++++");
        Scope scope;
        if (Main.symbolTable.getStackScopes().isEmpty()) {
            scope = new Scope(null);
        } else {
            Scope scopeParent = Main.symbolTable.getStackScopes().peek();
            scope = new Scope(scopeParent);
        }
        Main.symbolTable.getStackScopes().push(scope);
        Main.symbolTable.getScopes().add(scope);
    }

    private void removeScope() {
        System.out.println("removeScope-----");
        Main.symbolTable.getStackScopes().pop();
    }

    private Scope getCurrentScope() {
        if (Main.symbolTable.getStackScopes().isEmpty())
            return null;
        return Main.symbolTable.getStackScopes().peek();
    }
}
