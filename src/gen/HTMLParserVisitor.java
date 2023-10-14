// Generated from F:/Intellij Projects/CompilerV1/src\HTMLParser.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#closeHtmlAndContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseHtmlAndContent(HTMLParser.CloseHtmlAndContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#innerCloseHtmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCloseHtmlElement(HTMLParser.InnerCloseHtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlChardataValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlChardataValues(HTMLParser.HtmlChardataValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_show(HTMLParser.Cp_showContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_app(HTMLParser.Cp_appContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_for(HTMLParser.Cp_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_hide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_hide(HTMLParser.Cp_hideContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_if(HTMLParser.Cp_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_switch(HTMLParser.Cp_switchContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_switch_case(HTMLParser.Cp_switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_switch_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_switch_default(HTMLParser.Cp_switch_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_model(HTMLParser.Cp_modelContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_type(HTMLParser.Cp_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_click}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_click(HTMLParser.Cp_clickContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_mouseover}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_mouseover(HTMLParser.Cp_mouseoverContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#default_cp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_cp(HTMLParser.Default_cpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expression_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_default(HTMLParser.Expression_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expression_app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_app(HTMLParser.Expression_appContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expression_show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_show(HTMLParser.Expression_showContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#function_show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_show(HTMLParser.Function_showContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#sign_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign_number(HTMLParser.Sign_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#var_after_show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_after_show(HTMLParser.Var_after_showContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expr_hide_with_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_hide_with_func(HTMLParser.Expr_hide_with_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expr_hide_with_not_varDotVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_hide_with_not_varDotVar(HTMLParser.Expr_hide_with_not_varDotVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expression_hide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_hide(HTMLParser.Expression_hideContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#var_after_hide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_after_hide(HTMLParser.Var_after_hideContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#function_cp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_cp(HTMLParser.Function_cpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#func_parameters_cp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_parameters_cp(HTMLParser.Func_parameters_cpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#fun_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_param(HTMLParser.Fun_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(HTMLParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#equation_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation_param(HTMLParser.Equation_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expr_for_with_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_for_with_index(HTMLParser.Expr_for_with_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expr_for_with_arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_for_with_arr(HTMLParser.Expr_for_with_arrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expression_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_for(HTMLParser.Expression_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#var_before_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_before_index(HTMLParser.Var_before_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#var_after_comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_after_comma(HTMLParser.Var_after_commaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#var_after}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_after(HTMLParser.Var_afterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#arr_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_elements(HTMLParser.Arr_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#arr_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_element(HTMLParser.Arr_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(HTMLParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#element_obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_obj(HTMLParser.Element_objContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#number_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_value(HTMLParser.Number_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#var_quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_quote(HTMLParser.Var_quoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expr_if_with_varDotVar_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_if_with_varDotVar_sign(HTMLParser.Expr_if_with_varDotVar_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expr_if_with_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_if_with_func(HTMLParser.Expr_if_with_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expr_if_with_iteration_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_if_with_iteration_condition(HTMLParser.Expr_if_with_iteration_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration(HTMLParser.IterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#iteration_expr_with_gates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_expr_with_gates(HTMLParser.Iteration_expr_with_gatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#iteration_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_expr(HTMLParser.Iteration_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#attribute_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_func(HTMLParser.Attribute_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#attribute_varDotVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_varDotVar(HTMLParser.Attribute_varDotVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#dot_iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_iteration(HTMLParser.Dot_iterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#var_dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_dot(HTMLParser.Var_dotContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expression_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_if(HTMLParser.Expression_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#var_after_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_after_if(HTMLParser.Var_after_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(HTMLParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(HTMLParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(HTMLParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expression_switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_switch(HTMLParser.Expression_switchContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#var_after_switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_after_switch(HTMLParser.Var_after_switchContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expression_switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_switch_case(HTMLParser.Expression_switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expression_model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_model(HTMLParser.Expression_modelContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(HTMLParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#year}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYear(HTMLParser.YearContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth(HTMLParser.MonthContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay(HTMLParser.DayContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expression_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_type(HTMLParser.Expression_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expression_click}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_click(HTMLParser.Expression_clickContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expression_mouseover}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_mouseover(HTMLParser.Expression_mouseoverContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#spacesBeforeText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpacesBeforeText(HTMLParser.SpacesBeforeTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#spacesAfterText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpacesAfterText(HTMLParser.SpacesAfterTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#spacesBeforeTextMustacheLEFT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpacesBeforeTextMustacheLEFT(HTMLParser.SpacesBeforeTextMustacheLEFTContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#spacesAfterTextMustacheLEFT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpacesAfterTextMustacheLEFT(HTMLParser.SpacesAfterTextMustacheLEFTContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#spacesBeforeTextMustacheRIGHT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpacesBeforeTextMustacheRIGHT(HTMLParser.SpacesBeforeTextMustacheRIGHTContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#spacesAfterTextMustacheRIGHT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpacesAfterTextMustacheRIGHT(HTMLParser.SpacesAfterTextMustacheRIGHTContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#mustach_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMustach_list(HTMLParser.Mustach_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#textLeftMustache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextLeftMustache(HTMLParser.TextLeftMustacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#textRightMustache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextRightMustache(HTMLParser.TextRightMustacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlCharDataWithoutMustache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCharDataWithoutMustache(HTMLParser.HtmlCharDataWithoutMustacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlCharDataWithMustache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCharDataWithMustache(HTMLParser.HtmlCharDataWithMustacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#mustache_with_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMustache_with_expr(HTMLParser.Mustache_with_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#mustache_without_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMustache_without_expr(HTMLParser.Mustache_without_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#mustache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMustache(HTMLParser.MustacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#mustache_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMustache_expr(HTMLParser.Mustache_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#filter_mustache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_mustache(HTMLParser.Filter_mustacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#question_mustache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_mustache(HTMLParser.Question_mustacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#variable_mustache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_mustache(HTMLParser.Variable_mustacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#formatter_mustache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatter_mustache(HTMLParser.Formatter_mustacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#varDotVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDotVar(HTMLParser.VarDotVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#operatorVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorVar(HTMLParser.OperatorVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#iteration_mustache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_mustache(HTMLParser.Iteration_mustacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#iteration_mustache_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_mustache_expr(HTMLParser.Iteration_mustache_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#var_with_operatoer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_with_operatoer(HTMLParser.Var_with_operatoerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_type(HTMLParser.Var_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(HTMLParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#filter_kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_kind(HTMLParser.Filter_kindContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#html_text_before_mustache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_text_before_mustache(HTMLParser.Html_text_before_mustacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#html_text_after_mustache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_text_after_mustache(HTMLParser.Html_text_after_mustacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#html_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_text(HTMLParser.Html_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#var_condition_mustache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_condition_mustache(HTMLParser.Var_condition_mustacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#var_condition_txt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_condition_txt(HTMLParser.Var_condition_txtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#iteration_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_condition(HTMLParser.Iteration_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#sign_mustache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign_mustache(HTMLParser.Sign_mustacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#number_mustache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_mustache(HTMLParser.Number_mustacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#first_var_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_var_string(HTMLParser.First_var_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#first_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_var(HTMLParser.First_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#second_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond_var(HTMLParser.Second_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#first_variable_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_variable_bracket(HTMLParser.First_variable_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#second_variable_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond_variable_bracket(HTMLParser.Second_variable_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(HTMLParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#var_with_quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_with_quote(HTMLParser.Var_with_quoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expr_formatter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_formatter(HTMLParser.Expr_formatterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#formatter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatter(HTMLParser.FormatterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(HTMLParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_body(HTMLParser.Script_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_list_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_list_statement(HTMLParser.Script_list_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#left_whitespaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_whitespaces(HTMLParser.Left_whitespacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#right_whitespaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_whitespaces(HTMLParser.Right_whitespacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#whitespaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhitespaces(HTMLParser.WhitespacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_statement(HTMLParser.Script_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_function(HTMLParser.Script_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_function_par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_function_par(HTMLParser.Script_function_parContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#func_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_parameters(HTMLParser.Func_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body(HTMLParser.Func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#return_function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_function_body(HTMLParser.Return_function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_fun_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_fun_return(HTMLParser.Script_fun_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_var(HTMLParser.Script_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_identifier(HTMLParser.Script_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_value(HTMLParser.Script_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_value_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_value_number(HTMLParser.Script_value_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_value_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_value_string(HTMLParser.Script_value_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_empty_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_empty_string(HTMLParser.Script_empty_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(HTMLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_obj(HTMLParser.Script_objContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_obj_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_obj_value(HTMLParser.Script_obj_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_obj_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_obj_element(HTMLParser.Script_obj_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_value_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_value_array(HTMLParser.Script_value_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#array_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_element(HTMLParser.Array_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_comment(HTMLParser.Script_commentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#line_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_comment(HTMLParser.Line_commentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#content_line_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent_line_comment(HTMLParser.Content_line_commentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#multi_line_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_line_comment(HTMLParser.Multi_line_commentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#slash_open}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlash_open(HTMLParser.Slash_openContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#slash_close}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlash_close(HTMLParser.Slash_closeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#content_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent_comment(HTMLParser.Content_commentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_identifier_for_after_semicol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_identifier_for_after_semicol(HTMLParser.Script_identifier_for_after_semicolContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_identifier_for_before_sings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_identifier_for_before_sings(HTMLParser.Script_identifier_for_before_singsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_for(HTMLParser.Script_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_identifier_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_identifier_for(HTMLParser.Script_identifier_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#sign_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign_for(HTMLParser.Sign_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#x_variable_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_variable_for(HTMLParser.X_variable_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#x_sign_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_sign_for(HTMLParser.X_sign_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#number_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_for(HTMLParser.Number_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#string_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_for(HTMLParser.String_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_if(HTMLParser.Script_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#right_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_bracket(HTMLParser.Right_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#left_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_bracket(HTMLParser.Left_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_normal_if_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_normal_if_while(HTMLParser.Script_normal_if_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_not_if_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_not_if_while(HTMLParser.Script_not_if_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_identifier_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_identifier_if(HTMLParser.Script_identifier_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#if_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_sign(HTMLParser.If_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#if_condition_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condition_value(HTMLParser.If_condition_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#if_number_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_number_value(HTMLParser.If_number_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#if_string_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_string_value(HTMLParser.If_string_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#if_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_not(HTMLParser.If_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#if_not_in_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_not_in_bracket(HTMLParser.If_not_in_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_while(HTMLParser.Script_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_do_while(HTMLParser.Script_do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script_while_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_while_header(HTMLParser.Script_while_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(HTMLParser.StyleContext ctx);
}