package AST;

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

public interface ASTVisitor {

    void visit(HtmlDocument htmlDocument);

    void visit(HtmlElements htmlElements);

    void visit(ScriptletOrSeaWs scriptletOrSeaWs);

    void visit(HtmlElement htmlElement);

    void visit(HtmlMisc htmlMisc);

    void visit(HtmlAttribute htmlAttribute);

    void visit(CloseHtmlAndContent closeHtmlAndContent);

    void visit(Script script);

    void visit(InnerCloseHtmlElement innerCloseHtmlElement);

    void visit(HtmlContent htmlContent);

    void visit(HtmlChardata htmlChardata);

    void visit(HtmlChardataValues htmlChardataValues);

    void visit(HtmlCharDataWithMustache htmlCharDataWithMustache);

    void visit(HtmlCharDataWithoutMustache htmlCharDataWithoutMustache);

    void visit(HTMLComment htmlComment);

    void visit(MustacheList mustacheList);

    void visit(TextLeftMustache textLeftMustache);

    void visit(Mustache mustache);

    void visit(TextRightMustache textRightMustache);

    void visit(HtmlTextBeforeMustache htmlTextBeforeMustache);

    void visit(VarConditionTxt varConditionTxt);

    void visit(VarConditionMustache varConditionMustache);

    void visit(SignMustache signMustache);

    void visit(NumberMustache numberMustache);

    void visit(HtmlTextAfterMustache htmlTextAfterMustache);

    void visit(MustacheWithExpr mustacheWithExpr);

    void visit(MustacheWithoutExpr mustacheWithoutExpr);

    void visit(SpacesBeforeTextMustacheLEFT spacesBeforeTextMustacheLEFT);

    void visit(MustacheExpr mustacheExpr);

    void visit(SpacesAfterTextMustacheRIGHT spacesAfterTextMustacheRIGHT);

    void visit(FilterMustache filterMustache);

    void visit(QuestionMustache questionMustache);

    void visit(VariableMustache variableMustache);

    void visit(FormatterMustache formatterMustache);

    void visit(VarDotVar varDotVar);

    void visit(FirstVariableBracket firstVariableBracket);

    void visit(SpacesBeforeText spacesBeforeText);

    void visit(HtmlText htmlText);

    void visit(SpacesAfterText spacesAfterText);

    void visit(SecondVariableBracket secondVariableBracket);

    void visit(Var var);

    void visit(VarWithQuote varWithQuote);

    void visit(FirstVar firstVar);

    void visit(FilterKind filterKind);

    void visit(FirstVarString firstVarString);

    void visit(SecondVar secondVar);

    void visit(ExprFormatter exprFormatter);

    void visit(Formatter formatter);

    void visit(CpShow cpShow);

    void visit(CpApp cpApp);

    void visit(CpFor cpFor);

    void visit(CpIf cpIf);

    void visit(CpHide cpHide);

    void visit(CpSwitch cpSwitch);

    void visit(CpSwitchCase cpSwitchCase);

    void visit(CpSwitchDefault cpSwitchDefault);

    void visit(CpModel cpModel);

    void visit(CpType cpType);

    void visit(CpClick cpClick);

    void visit(CpMouseOver cpMouseOver);

    void visit(DefaultCp defaultCp);

    void visit(ExpressionShow expressionShow);

    void visit(VarAfterShow varAfterShow);

    void visit(FunctionShow functionShow);

    void visit(FunctionCp functionCp);

    void visit(SignNumber signNumber);

    void visit(Sign sign);

    void visit(Number number);

    void visit(FuncParametersCP funcParametersCP);

    void visit(FunParam funParam);

    void visit(ExpressionApp expressionApp);

    void visit(ExpressionIf expressionIf);

    void visit(Not not);

    void visit(ExprIfWithVarDotVarSign exprIfWithVarDotVarSign);

    void visit(ExprIfWithFunc exprIfWithFunc);

    void visit(VarAfterIf varAfterIf);

    void visit(ExpressionHide expressionHide);

    void visit(ExprHideWithFunc exprHideWithFunc);

    void visit(ExprHideWithNotVarDotVar exprHideWithNotVarDotVar);

    void visit(VarAfterHide varAfterHide);

    void visit(ExpressionSwitch expressionSwitch);

    void visit(VarAfterSwitch varAfterSwitch);

    void visit(ExpressionSwitchCase expressionSwitchCase);

    void visit(ExpressionModel expressionModel);

    void visit(Date date);

    void visit(Year year);

    void visit(Month month);

    void visit(Day day);

    void visit(ExpressionType expressionType);

    void visit(ExpressionClick expressionClick);

    void visit(ExpressionMouseOver expressionMouseOver);

    void visit(ExpressionDefault expressionDefault);

    void visit(ExpressionFor expressionFor);

    void visit(VarAfter varAfter);

    void visit(ExprForWithArr exprForWithArr);

    void visit(ExprForWithIndex exprForWithIndex);

    void visit(ArrElements arrElements);

    void visit(Object object);

    void visit(ArrElement arrElement);

    void visit(ElementObj elementObj);

    void visit(VarQuote varQuote);

    void visit(NumberValue numberValue);

    void visit(VarAftercomma varAftercomma);

    void visit(VarBeforeIndex varBeforeIndex);

    void visit(ScriptBody scriptBody);

    void visit(ScriptListStatement scriptListStatement);

    void visit(ScriptStatement scriptStatement);

    void visit(LeftWhitespaces leftWhitespaces);

    void visit(RightWhitespaces rightWhitespaces);

    void visit(WhiteSpaces whiteSpaces);

    void visit(ScriptFunction scriptFunction);

    void visit(ScriptVar scriptVar);

    void visit(ScriptObj scriptObj);

    void visit(ScriptComment scriptComment);

    void visit(ScriptFor scriptFor);

    void visit(ScriptIf scriptIf);

    void visit(ScriptWhile scriptWhile);

    void visit(ScriptDoWhile scriptDoWhile);

    void visit(ScriptIdentifier scriptIdentifier);

    void visit(ScriptFunctionPar scriptFunctionPar);

    void visit(FuncParameters funcParameters);

    void visit(FuncBody funcBody);

    void visit(ReturnFunctionBody returnFunctionBody);

    void visit(ScriptFunReturn scriptFunReturn);

    void visit(ScriptValueString scriptValueString);

    void visit(ScriptValueNumber scriptValueNumber);

    void visit(ScriptEmptyString scriptEmptyString);

    void visit(Value value);

    void visit(ScriptValue scriptValue);

    void visit(ScriptValueArray scriptValueArray);

    void visit(ArrayElement arrayElement);

    void visit(ScriptObjValue scriptObjValue);

    void visit(ScriptObjElement scriptObjElement);

    void visit(LineComment lineComment);

    void visit(MultiLineComment multiLineComment);

    void visit(ContentLineComment contentLineComment);

    void visit(ContentComment contentComment);

    void visit(ScriptIdentifierFor scriptIdentifierFor);

    void visit(NumberFor numberFor);

    void visit(ScriptIdentifierForAfterSemicol scriptIdentifierForAfterSemicol);

    void visit(XSignFor xSignFor);

    void visit(XVariableFor xVariableFor);

    void visit(ScriptIdentifierForBeforeSings scriptIdentifierForBeforeSings);

    void visit(SignFor signFor);

    void visit(StringFor stringFor);

    void visit(ScriptNormalIfWhile scriptNormalIfWhile);

    void visit(ScriptNotIfWhile scriptNotIfWhile);

    void visit(ScriptIdentifierIf scriptIdentifierIf);

    void visit(IfSign ifSign);

    void visit(IfConditionValue ifConditionValue);

    void visit(IfNumberValue ifNumberValue);

    void visit(IfStringValue ifStringValue);

    void visit(IfNot ifNot);

    void visit(ScriptWhileHeader scriptWhileHeader);

    void visit(RightBracket rightBracket);

    void visit(LeftBracket leftBracket);

    void visit(IfNotInBracket ifNotInBracket);

    void visit(OperatorVar operatorVar);

    void visit(VarWithOperator varWithOperator);

    void visit(VarType varType);

    void visit(Operator operator);

    void visit(Equation equation);

    void visit(EquationParam equationParam);

    void visit(DotIteration dotIteration);

    void visit(VarDot varDot);

    void visit(AttributeFunc attributeFunc);

    void visit(AttributeVarDotVar attributeVarDotVar);

    void visit(ExprIfWithIterationCondition exprIfWithIterationCondition);

    void visit(Iteration iteration);

    void visit(IterationExpr iterationExpr);

    void visit(IterationExprWithGates iterationExprWithGates);

    void visit(IterationMustache iterationMustache);

    void visit(IterationMustacheExpr iterationMustacheExpr);

    void visit(IterationCondition iterationCondition);
}
