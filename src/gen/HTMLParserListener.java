// Generated from F:/Intellij Projects/CompilerV1/src\HTMLParser.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void enterScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void exitScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#closeHtmlAndContent}.
	 * @param ctx the parse tree
	 */
	void enterCloseHtmlAndContent(HTMLParser.CloseHtmlAndContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#closeHtmlAndContent}.
	 * @param ctx the parse tree
	 */
	void exitCloseHtmlAndContent(HTMLParser.CloseHtmlAndContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#innerCloseHtmlElement}.
	 * @param ctx the parse tree
	 */
	void enterInnerCloseHtmlElement(HTMLParser.InnerCloseHtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#innerCloseHtmlElement}.
	 * @param ctx the parse tree
	 */
	void exitInnerCloseHtmlElement(HTMLParser.InnerCloseHtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlChardataValues}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardataValues(HTMLParser.HtmlChardataValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlChardataValues}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardataValues(HTMLParser.HtmlChardataValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_show}.
	 * @param ctx the parse tree
	 */
	void enterCp_show(HTMLParser.Cp_showContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_show}.
	 * @param ctx the parse tree
	 */
	void exitCp_show(HTMLParser.Cp_showContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_app}.
	 * @param ctx the parse tree
	 */
	void enterCp_app(HTMLParser.Cp_appContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_app}.
	 * @param ctx the parse tree
	 */
	void exitCp_app(HTMLParser.Cp_appContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_for}.
	 * @param ctx the parse tree
	 */
	void enterCp_for(HTMLParser.Cp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_for}.
	 * @param ctx the parse tree
	 */
	void exitCp_for(HTMLParser.Cp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_hide}.
	 * @param ctx the parse tree
	 */
	void enterCp_hide(HTMLParser.Cp_hideContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_hide}.
	 * @param ctx the parse tree
	 */
	void exitCp_hide(HTMLParser.Cp_hideContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_if}.
	 * @param ctx the parse tree
	 */
	void enterCp_if(HTMLParser.Cp_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_if}.
	 * @param ctx the parse tree
	 */
	void exitCp_if(HTMLParser.Cp_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_switch}.
	 * @param ctx the parse tree
	 */
	void enterCp_switch(HTMLParser.Cp_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_switch}.
	 * @param ctx the parse tree
	 */
	void exitCp_switch(HTMLParser.Cp_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_switch_case}.
	 * @param ctx the parse tree
	 */
	void enterCp_switch_case(HTMLParser.Cp_switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_switch_case}.
	 * @param ctx the parse tree
	 */
	void exitCp_switch_case(HTMLParser.Cp_switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_switch_default}.
	 * @param ctx the parse tree
	 */
	void enterCp_switch_default(HTMLParser.Cp_switch_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_switch_default}.
	 * @param ctx the parse tree
	 */
	void exitCp_switch_default(HTMLParser.Cp_switch_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_model}.
	 * @param ctx the parse tree
	 */
	void enterCp_model(HTMLParser.Cp_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_model}.
	 * @param ctx the parse tree
	 */
	void exitCp_model(HTMLParser.Cp_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_type}.
	 * @param ctx the parse tree
	 */
	void enterCp_type(HTMLParser.Cp_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_type}.
	 * @param ctx the parse tree
	 */
	void exitCp_type(HTMLParser.Cp_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_click}.
	 * @param ctx the parse tree
	 */
	void enterCp_click(HTMLParser.Cp_clickContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_click}.
	 * @param ctx the parse tree
	 */
	void exitCp_click(HTMLParser.Cp_clickContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_mouseover}.
	 * @param ctx the parse tree
	 */
	void enterCp_mouseover(HTMLParser.Cp_mouseoverContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_mouseover}.
	 * @param ctx the parse tree
	 */
	void exitCp_mouseover(HTMLParser.Cp_mouseoverContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#default_cp}.
	 * @param ctx the parse tree
	 */
	void enterDefault_cp(HTMLParser.Default_cpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#default_cp}.
	 * @param ctx the parse tree
	 */
	void exitDefault_cp(HTMLParser.Default_cpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expression_default}.
	 * @param ctx the parse tree
	 */
	void enterExpression_default(HTMLParser.Expression_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expression_default}.
	 * @param ctx the parse tree
	 */
	void exitExpression_default(HTMLParser.Expression_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expression_app}.
	 * @param ctx the parse tree
	 */
	void enterExpression_app(HTMLParser.Expression_appContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expression_app}.
	 * @param ctx the parse tree
	 */
	void exitExpression_app(HTMLParser.Expression_appContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expression_show}.
	 * @param ctx the parse tree
	 */
	void enterExpression_show(HTMLParser.Expression_showContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expression_show}.
	 * @param ctx the parse tree
	 */
	void exitExpression_show(HTMLParser.Expression_showContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#function_show}.
	 * @param ctx the parse tree
	 */
	void enterFunction_show(HTMLParser.Function_showContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#function_show}.
	 * @param ctx the parse tree
	 */
	void exitFunction_show(HTMLParser.Function_showContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#sign_number}.
	 * @param ctx the parse tree
	 */
	void enterSign_number(HTMLParser.Sign_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#sign_number}.
	 * @param ctx the parse tree
	 */
	void exitSign_number(HTMLParser.Sign_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#var_after_show}.
	 * @param ctx the parse tree
	 */
	void enterVar_after_show(HTMLParser.Var_after_showContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#var_after_show}.
	 * @param ctx the parse tree
	 */
	void exitVar_after_show(HTMLParser.Var_after_showContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expr_hide_with_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_hide_with_func(HTMLParser.Expr_hide_with_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expr_hide_with_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_hide_with_func(HTMLParser.Expr_hide_with_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expr_hide_with_not_varDotVar}.
	 * @param ctx the parse tree
	 */
	void enterExpr_hide_with_not_varDotVar(HTMLParser.Expr_hide_with_not_varDotVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expr_hide_with_not_varDotVar}.
	 * @param ctx the parse tree
	 */
	void exitExpr_hide_with_not_varDotVar(HTMLParser.Expr_hide_with_not_varDotVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expression_hide}.
	 * @param ctx the parse tree
	 */
	void enterExpression_hide(HTMLParser.Expression_hideContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expression_hide}.
	 * @param ctx the parse tree
	 */
	void exitExpression_hide(HTMLParser.Expression_hideContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#var_after_hide}.
	 * @param ctx the parse tree
	 */
	void enterVar_after_hide(HTMLParser.Var_after_hideContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#var_after_hide}.
	 * @param ctx the parse tree
	 */
	void exitVar_after_hide(HTMLParser.Var_after_hideContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#function_cp}.
	 * @param ctx the parse tree
	 */
	void enterFunction_cp(HTMLParser.Function_cpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#function_cp}.
	 * @param ctx the parse tree
	 */
	void exitFunction_cp(HTMLParser.Function_cpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#func_parameters_cp}.
	 * @param ctx the parse tree
	 */
	void enterFunc_parameters_cp(HTMLParser.Func_parameters_cpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#func_parameters_cp}.
	 * @param ctx the parse tree
	 */
	void exitFunc_parameters_cp(HTMLParser.Func_parameters_cpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#fun_param}.
	 * @param ctx the parse tree
	 */
	void enterFun_param(HTMLParser.Fun_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#fun_param}.
	 * @param ctx the parse tree
	 */
	void exitFun_param(HTMLParser.Fun_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(HTMLParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(HTMLParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#equation_param}.
	 * @param ctx the parse tree
	 */
	void enterEquation_param(HTMLParser.Equation_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#equation_param}.
	 * @param ctx the parse tree
	 */
	void exitEquation_param(HTMLParser.Equation_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expr_for_with_index}.
	 * @param ctx the parse tree
	 */
	void enterExpr_for_with_index(HTMLParser.Expr_for_with_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expr_for_with_index}.
	 * @param ctx the parse tree
	 */
	void exitExpr_for_with_index(HTMLParser.Expr_for_with_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expr_for_with_arr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_for_with_arr(HTMLParser.Expr_for_with_arrContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expr_for_with_arr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_for_with_arr(HTMLParser.Expr_for_with_arrContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expression_for}.
	 * @param ctx the parse tree
	 */
	void enterExpression_for(HTMLParser.Expression_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expression_for}.
	 * @param ctx the parse tree
	 */
	void exitExpression_for(HTMLParser.Expression_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#var_before_index}.
	 * @param ctx the parse tree
	 */
	void enterVar_before_index(HTMLParser.Var_before_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#var_before_index}.
	 * @param ctx the parse tree
	 */
	void exitVar_before_index(HTMLParser.Var_before_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#var_after_comma}.
	 * @param ctx the parse tree
	 */
	void enterVar_after_comma(HTMLParser.Var_after_commaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#var_after_comma}.
	 * @param ctx the parse tree
	 */
	void exitVar_after_comma(HTMLParser.Var_after_commaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#var_after}.
	 * @param ctx the parse tree
	 */
	void enterVar_after(HTMLParser.Var_afterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#var_after}.
	 * @param ctx the parse tree
	 */
	void exitVar_after(HTMLParser.Var_afterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arr_elements}.
	 * @param ctx the parse tree
	 */
	void enterArr_elements(HTMLParser.Arr_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arr_elements}.
	 * @param ctx the parse tree
	 */
	void exitArr_elements(HTMLParser.Arr_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arr_element}.
	 * @param ctx the parse tree
	 */
	void enterArr_element(HTMLParser.Arr_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arr_element}.
	 * @param ctx the parse tree
	 */
	void exitArr_element(HTMLParser.Arr_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(HTMLParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(HTMLParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#element_obj}.
	 * @param ctx the parse tree
	 */
	void enterElement_obj(HTMLParser.Element_objContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#element_obj}.
	 * @param ctx the parse tree
	 */
	void exitElement_obj(HTMLParser.Element_objContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#number_value}.
	 * @param ctx the parse tree
	 */
	void enterNumber_value(HTMLParser.Number_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#number_value}.
	 * @param ctx the parse tree
	 */
	void exitNumber_value(HTMLParser.Number_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#var_quote}.
	 * @param ctx the parse tree
	 */
	void enterVar_quote(HTMLParser.Var_quoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#var_quote}.
	 * @param ctx the parse tree
	 */
	void exitVar_quote(HTMLParser.Var_quoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expr_if_with_varDotVar_sign}.
	 * @param ctx the parse tree
	 */
	void enterExpr_if_with_varDotVar_sign(HTMLParser.Expr_if_with_varDotVar_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expr_if_with_varDotVar_sign}.
	 * @param ctx the parse tree
	 */
	void exitExpr_if_with_varDotVar_sign(HTMLParser.Expr_if_with_varDotVar_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expr_if_with_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_if_with_func(HTMLParser.Expr_if_with_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expr_if_with_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_if_with_func(HTMLParser.Expr_if_with_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expr_if_with_iteration_condition}.
	 * @param ctx the parse tree
	 */
	void enterExpr_if_with_iteration_condition(HTMLParser.Expr_if_with_iteration_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expr_if_with_iteration_condition}.
	 * @param ctx the parse tree
	 */
	void exitExpr_if_with_iteration_condition(HTMLParser.Expr_if_with_iteration_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#iteration}.
	 * @param ctx the parse tree
	 */
	void enterIteration(HTMLParser.IterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#iteration}.
	 * @param ctx the parse tree
	 */
	void exitIteration(HTMLParser.IterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#iteration_expr_with_gates}.
	 * @param ctx the parse tree
	 */
	void enterIteration_expr_with_gates(HTMLParser.Iteration_expr_with_gatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#iteration_expr_with_gates}.
	 * @param ctx the parse tree
	 */
	void exitIteration_expr_with_gates(HTMLParser.Iteration_expr_with_gatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#iteration_expr}.
	 * @param ctx the parse tree
	 */
	void enterIteration_expr(HTMLParser.Iteration_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#iteration_expr}.
	 * @param ctx the parse tree
	 */
	void exitIteration_expr(HTMLParser.Iteration_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#attribute_func}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_func(HTMLParser.Attribute_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#attribute_func}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_func(HTMLParser.Attribute_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#attribute_varDotVar}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_varDotVar(HTMLParser.Attribute_varDotVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#attribute_varDotVar}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_varDotVar(HTMLParser.Attribute_varDotVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#dot_iteration}.
	 * @param ctx the parse tree
	 */
	void enterDot_iteration(HTMLParser.Dot_iterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#dot_iteration}.
	 * @param ctx the parse tree
	 */
	void exitDot_iteration(HTMLParser.Dot_iterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#var_dot}.
	 * @param ctx the parse tree
	 */
	void enterVar_dot(HTMLParser.Var_dotContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#var_dot}.
	 * @param ctx the parse tree
	 */
	void exitVar_dot(HTMLParser.Var_dotContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expression_if}.
	 * @param ctx the parse tree
	 */
	void enterExpression_if(HTMLParser.Expression_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expression_if}.
	 * @param ctx the parse tree
	 */
	void exitExpression_if(HTMLParser.Expression_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#var_after_if}.
	 * @param ctx the parse tree
	 */
	void enterVar_after_if(HTMLParser.Var_after_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#var_after_if}.
	 * @param ctx the parse tree
	 */
	void exitVar_after_if(HTMLParser.Var_after_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(HTMLParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(HTMLParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(HTMLParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(HTMLParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(HTMLParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(HTMLParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expression_switch}.
	 * @param ctx the parse tree
	 */
	void enterExpression_switch(HTMLParser.Expression_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expression_switch}.
	 * @param ctx the parse tree
	 */
	void exitExpression_switch(HTMLParser.Expression_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#var_after_switch}.
	 * @param ctx the parse tree
	 */
	void enterVar_after_switch(HTMLParser.Var_after_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#var_after_switch}.
	 * @param ctx the parse tree
	 */
	void exitVar_after_switch(HTMLParser.Var_after_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expression_switch_case}.
	 * @param ctx the parse tree
	 */
	void enterExpression_switch_case(HTMLParser.Expression_switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expression_switch_case}.
	 * @param ctx the parse tree
	 */
	void exitExpression_switch_case(HTMLParser.Expression_switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expression_model}.
	 * @param ctx the parse tree
	 */
	void enterExpression_model(HTMLParser.Expression_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expression_model}.
	 * @param ctx the parse tree
	 */
	void exitExpression_model(HTMLParser.Expression_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(HTMLParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(HTMLParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#year}.
	 * @param ctx the parse tree
	 */
	void enterYear(HTMLParser.YearContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#year}.
	 * @param ctx the parse tree
	 */
	void exitYear(HTMLParser.YearContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(HTMLParser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(HTMLParser.MonthContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(HTMLParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(HTMLParser.DayContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expression_type}.
	 * @param ctx the parse tree
	 */
	void enterExpression_type(HTMLParser.Expression_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expression_type}.
	 * @param ctx the parse tree
	 */
	void exitExpression_type(HTMLParser.Expression_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expression_click}.
	 * @param ctx the parse tree
	 */
	void enterExpression_click(HTMLParser.Expression_clickContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expression_click}.
	 * @param ctx the parse tree
	 */
	void exitExpression_click(HTMLParser.Expression_clickContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expression_mouseover}.
	 * @param ctx the parse tree
	 */
	void enterExpression_mouseover(HTMLParser.Expression_mouseoverContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expression_mouseover}.
	 * @param ctx the parse tree
	 */
	void exitExpression_mouseover(HTMLParser.Expression_mouseoverContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#spacesBeforeText}.
	 * @param ctx the parse tree
	 */
	void enterSpacesBeforeText(HTMLParser.SpacesBeforeTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#spacesBeforeText}.
	 * @param ctx the parse tree
	 */
	void exitSpacesBeforeText(HTMLParser.SpacesBeforeTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#spacesAfterText}.
	 * @param ctx the parse tree
	 */
	void enterSpacesAfterText(HTMLParser.SpacesAfterTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#spacesAfterText}.
	 * @param ctx the parse tree
	 */
	void exitSpacesAfterText(HTMLParser.SpacesAfterTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#spacesBeforeTextMustacheLEFT}.
	 * @param ctx the parse tree
	 */
	void enterSpacesBeforeTextMustacheLEFT(HTMLParser.SpacesBeforeTextMustacheLEFTContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#spacesBeforeTextMustacheLEFT}.
	 * @param ctx the parse tree
	 */
	void exitSpacesBeforeTextMustacheLEFT(HTMLParser.SpacesBeforeTextMustacheLEFTContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#spacesAfterTextMustacheLEFT}.
	 * @param ctx the parse tree
	 */
	void enterSpacesAfterTextMustacheLEFT(HTMLParser.SpacesAfterTextMustacheLEFTContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#spacesAfterTextMustacheLEFT}.
	 * @param ctx the parse tree
	 */
	void exitSpacesAfterTextMustacheLEFT(HTMLParser.SpacesAfterTextMustacheLEFTContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#spacesBeforeTextMustacheRIGHT}.
	 * @param ctx the parse tree
	 */
	void enterSpacesBeforeTextMustacheRIGHT(HTMLParser.SpacesBeforeTextMustacheRIGHTContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#spacesBeforeTextMustacheRIGHT}.
	 * @param ctx the parse tree
	 */
	void exitSpacesBeforeTextMustacheRIGHT(HTMLParser.SpacesBeforeTextMustacheRIGHTContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#spacesAfterTextMustacheRIGHT}.
	 * @param ctx the parse tree
	 */
	void enterSpacesAfterTextMustacheRIGHT(HTMLParser.SpacesAfterTextMustacheRIGHTContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#spacesAfterTextMustacheRIGHT}.
	 * @param ctx the parse tree
	 */
	void exitSpacesAfterTextMustacheRIGHT(HTMLParser.SpacesAfterTextMustacheRIGHTContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#mustach_list}.
	 * @param ctx the parse tree
	 */
	void enterMustach_list(HTMLParser.Mustach_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#mustach_list}.
	 * @param ctx the parse tree
	 */
	void exitMustach_list(HTMLParser.Mustach_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#textLeftMustache}.
	 * @param ctx the parse tree
	 */
	void enterTextLeftMustache(HTMLParser.TextLeftMustacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#textLeftMustache}.
	 * @param ctx the parse tree
	 */
	void exitTextLeftMustache(HTMLParser.TextLeftMustacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#textRightMustache}.
	 * @param ctx the parse tree
	 */
	void enterTextRightMustache(HTMLParser.TextRightMustacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#textRightMustache}.
	 * @param ctx the parse tree
	 */
	void exitTextRightMustache(HTMLParser.TextRightMustacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlCharDataWithoutMustache}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCharDataWithoutMustache(HTMLParser.HtmlCharDataWithoutMustacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlCharDataWithoutMustache}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCharDataWithoutMustache(HTMLParser.HtmlCharDataWithoutMustacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlCharDataWithMustache}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCharDataWithMustache(HTMLParser.HtmlCharDataWithMustacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlCharDataWithMustache}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCharDataWithMustache(HTMLParser.HtmlCharDataWithMustacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#mustache_with_expr}.
	 * @param ctx the parse tree
	 */
	void enterMustache_with_expr(HTMLParser.Mustache_with_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#mustache_with_expr}.
	 * @param ctx the parse tree
	 */
	void exitMustache_with_expr(HTMLParser.Mustache_with_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#mustache_without_expr}.
	 * @param ctx the parse tree
	 */
	void enterMustache_without_expr(HTMLParser.Mustache_without_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#mustache_without_expr}.
	 * @param ctx the parse tree
	 */
	void exitMustache_without_expr(HTMLParser.Mustache_without_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#mustache}.
	 * @param ctx the parse tree
	 */
	void enterMustache(HTMLParser.MustacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#mustache}.
	 * @param ctx the parse tree
	 */
	void exitMustache(HTMLParser.MustacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#mustache_expr}.
	 * @param ctx the parse tree
	 */
	void enterMustache_expr(HTMLParser.Mustache_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#mustache_expr}.
	 * @param ctx the parse tree
	 */
	void exitMustache_expr(HTMLParser.Mustache_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#filter_mustache}.
	 * @param ctx the parse tree
	 */
	void enterFilter_mustache(HTMLParser.Filter_mustacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#filter_mustache}.
	 * @param ctx the parse tree
	 */
	void exitFilter_mustache(HTMLParser.Filter_mustacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#question_mustache}.
	 * @param ctx the parse tree
	 */
	void enterQuestion_mustache(HTMLParser.Question_mustacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#question_mustache}.
	 * @param ctx the parse tree
	 */
	void exitQuestion_mustache(HTMLParser.Question_mustacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#variable_mustache}.
	 * @param ctx the parse tree
	 */
	void enterVariable_mustache(HTMLParser.Variable_mustacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#variable_mustache}.
	 * @param ctx the parse tree
	 */
	void exitVariable_mustache(HTMLParser.Variable_mustacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#formatter_mustache}.
	 * @param ctx the parse tree
	 */
	void enterFormatter_mustache(HTMLParser.Formatter_mustacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#formatter_mustache}.
	 * @param ctx the parse tree
	 */
	void exitFormatter_mustache(HTMLParser.Formatter_mustacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#varDotVar}.
	 * @param ctx the parse tree
	 */
	void enterVarDotVar(HTMLParser.VarDotVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#varDotVar}.
	 * @param ctx the parse tree
	 */
	void exitVarDotVar(HTMLParser.VarDotVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#operatorVar}.
	 * @param ctx the parse tree
	 */
	void enterOperatorVar(HTMLParser.OperatorVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#operatorVar}.
	 * @param ctx the parse tree
	 */
	void exitOperatorVar(HTMLParser.OperatorVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#iteration_mustache}.
	 * @param ctx the parse tree
	 */
	void enterIteration_mustache(HTMLParser.Iteration_mustacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#iteration_mustache}.
	 * @param ctx the parse tree
	 */
	void exitIteration_mustache(HTMLParser.Iteration_mustacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#iteration_mustache_expr}.
	 * @param ctx the parse tree
	 */
	void enterIteration_mustache_expr(HTMLParser.Iteration_mustache_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#iteration_mustache_expr}.
	 * @param ctx the parse tree
	 */
	void exitIteration_mustache_expr(HTMLParser.Iteration_mustache_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#var_with_operatoer}.
	 * @param ctx the parse tree
	 */
	void enterVar_with_operatoer(HTMLParser.Var_with_operatoerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#var_with_operatoer}.
	 * @param ctx the parse tree
	 */
	void exitVar_with_operatoer(HTMLParser.Var_with_operatoerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(HTMLParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(HTMLParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(HTMLParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(HTMLParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#filter_kind}.
	 * @param ctx the parse tree
	 */
	void enterFilter_kind(HTMLParser.Filter_kindContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#filter_kind}.
	 * @param ctx the parse tree
	 */
	void exitFilter_kind(HTMLParser.Filter_kindContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#html_text_before_mustache}.
	 * @param ctx the parse tree
	 */
	void enterHtml_text_before_mustache(HTMLParser.Html_text_before_mustacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#html_text_before_mustache}.
	 * @param ctx the parse tree
	 */
	void exitHtml_text_before_mustache(HTMLParser.Html_text_before_mustacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#html_text_after_mustache}.
	 * @param ctx the parse tree
	 */
	void enterHtml_text_after_mustache(HTMLParser.Html_text_after_mustacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#html_text_after_mustache}.
	 * @param ctx the parse tree
	 */
	void exitHtml_text_after_mustache(HTMLParser.Html_text_after_mustacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#html_text}.
	 * @param ctx the parse tree
	 */
	void enterHtml_text(HTMLParser.Html_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#html_text}.
	 * @param ctx the parse tree
	 */
	void exitHtml_text(HTMLParser.Html_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#var_condition_mustache}.
	 * @param ctx the parse tree
	 */
	void enterVar_condition_mustache(HTMLParser.Var_condition_mustacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#var_condition_mustache}.
	 * @param ctx the parse tree
	 */
	void exitVar_condition_mustache(HTMLParser.Var_condition_mustacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#var_condition_txt}.
	 * @param ctx the parse tree
	 */
	void enterVar_condition_txt(HTMLParser.Var_condition_txtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#var_condition_txt}.
	 * @param ctx the parse tree
	 */
	void exitVar_condition_txt(HTMLParser.Var_condition_txtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#iteration_condition}.
	 * @param ctx the parse tree
	 */
	void enterIteration_condition(HTMLParser.Iteration_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#iteration_condition}.
	 * @param ctx the parse tree
	 */
	void exitIteration_condition(HTMLParser.Iteration_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#sign_mustache}.
	 * @param ctx the parse tree
	 */
	void enterSign_mustache(HTMLParser.Sign_mustacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#sign_mustache}.
	 * @param ctx the parse tree
	 */
	void exitSign_mustache(HTMLParser.Sign_mustacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#number_mustache}.
	 * @param ctx the parse tree
	 */
	void enterNumber_mustache(HTMLParser.Number_mustacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#number_mustache}.
	 * @param ctx the parse tree
	 */
	void exitNumber_mustache(HTMLParser.Number_mustacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#first_var_string}.
	 * @param ctx the parse tree
	 */
	void enterFirst_var_string(HTMLParser.First_var_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#first_var_string}.
	 * @param ctx the parse tree
	 */
	void exitFirst_var_string(HTMLParser.First_var_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#first_var}.
	 * @param ctx the parse tree
	 */
	void enterFirst_var(HTMLParser.First_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#first_var}.
	 * @param ctx the parse tree
	 */
	void exitFirst_var(HTMLParser.First_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#second_var}.
	 * @param ctx the parse tree
	 */
	void enterSecond_var(HTMLParser.Second_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#second_var}.
	 * @param ctx the parse tree
	 */
	void exitSecond_var(HTMLParser.Second_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#first_variable_bracket}.
	 * @param ctx the parse tree
	 */
	void enterFirst_variable_bracket(HTMLParser.First_variable_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#first_variable_bracket}.
	 * @param ctx the parse tree
	 */
	void exitFirst_variable_bracket(HTMLParser.First_variable_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#second_variable_bracket}.
	 * @param ctx the parse tree
	 */
	void enterSecond_variable_bracket(HTMLParser.Second_variable_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#second_variable_bracket}.
	 * @param ctx the parse tree
	 */
	void exitSecond_variable_bracket(HTMLParser.Second_variable_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(HTMLParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(HTMLParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#var_with_quote}.
	 * @param ctx the parse tree
	 */
	void enterVar_with_quote(HTMLParser.Var_with_quoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#var_with_quote}.
	 * @param ctx the parse tree
	 */
	void exitVar_with_quote(HTMLParser.Var_with_quoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expr_formatter}.
	 * @param ctx the parse tree
	 */
	void enterExpr_formatter(HTMLParser.Expr_formatterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expr_formatter}.
	 * @param ctx the parse tree
	 */
	void exitExpr_formatter(HTMLParser.Expr_formatterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#formatter}.
	 * @param ctx the parse tree
	 */
	void enterFormatter(HTMLParser.FormatterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#formatter}.
	 * @param ctx the parse tree
	 */
	void exitFormatter(HTMLParser.FormatterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(HTMLParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(HTMLParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_body}.
	 * @param ctx the parse tree
	 */
	void enterScript_body(HTMLParser.Script_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_body}.
	 * @param ctx the parse tree
	 */
	void exitScript_body(HTMLParser.Script_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_list_statement}.
	 * @param ctx the parse tree
	 */
	void enterScript_list_statement(HTMLParser.Script_list_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_list_statement}.
	 * @param ctx the parse tree
	 */
	void exitScript_list_statement(HTMLParser.Script_list_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#left_whitespaces}.
	 * @param ctx the parse tree
	 */
	void enterLeft_whitespaces(HTMLParser.Left_whitespacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#left_whitespaces}.
	 * @param ctx the parse tree
	 */
	void exitLeft_whitespaces(HTMLParser.Left_whitespacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#right_whitespaces}.
	 * @param ctx the parse tree
	 */
	void enterRight_whitespaces(HTMLParser.Right_whitespacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#right_whitespaces}.
	 * @param ctx the parse tree
	 */
	void exitRight_whitespaces(HTMLParser.Right_whitespacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#whitespaces}.
	 * @param ctx the parse tree
	 */
	void enterWhitespaces(HTMLParser.WhitespacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#whitespaces}.
	 * @param ctx the parse tree
	 */
	void exitWhitespaces(HTMLParser.WhitespacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_statement}.
	 * @param ctx the parse tree
	 */
	void enterScript_statement(HTMLParser.Script_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_statement}.
	 * @param ctx the parse tree
	 */
	void exitScript_statement(HTMLParser.Script_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_function}.
	 * @param ctx the parse tree
	 */
	void enterScript_function(HTMLParser.Script_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_function}.
	 * @param ctx the parse tree
	 */
	void exitScript_function(HTMLParser.Script_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_function_par}.
	 * @param ctx the parse tree
	 */
	void enterScript_function_par(HTMLParser.Script_function_parContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_function_par}.
	 * @param ctx the parse tree
	 */
	void exitScript_function_par(HTMLParser.Script_function_parContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#func_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunc_parameters(HTMLParser.Func_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#func_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunc_parameters(HTMLParser.Func_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(HTMLParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(HTMLParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#return_function_body}.
	 * @param ctx the parse tree
	 */
	void enterReturn_function_body(HTMLParser.Return_function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#return_function_body}.
	 * @param ctx the parse tree
	 */
	void exitReturn_function_body(HTMLParser.Return_function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_fun_return}.
	 * @param ctx the parse tree
	 */
	void enterScript_fun_return(HTMLParser.Script_fun_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_fun_return}.
	 * @param ctx the parse tree
	 */
	void exitScript_fun_return(HTMLParser.Script_fun_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_var}.
	 * @param ctx the parse tree
	 */
	void enterScript_var(HTMLParser.Script_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_var}.
	 * @param ctx the parse tree
	 */
	void exitScript_var(HTMLParser.Script_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_identifier}.
	 * @param ctx the parse tree
	 */
	void enterScript_identifier(HTMLParser.Script_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_identifier}.
	 * @param ctx the parse tree
	 */
	void exitScript_identifier(HTMLParser.Script_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_value}.
	 * @param ctx the parse tree
	 */
	void enterScript_value(HTMLParser.Script_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_value}.
	 * @param ctx the parse tree
	 */
	void exitScript_value(HTMLParser.Script_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_value_number}.
	 * @param ctx the parse tree
	 */
	void enterScript_value_number(HTMLParser.Script_value_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_value_number}.
	 * @param ctx the parse tree
	 */
	void exitScript_value_number(HTMLParser.Script_value_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_value_string}.
	 * @param ctx the parse tree
	 */
	void enterScript_value_string(HTMLParser.Script_value_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_value_string}.
	 * @param ctx the parse tree
	 */
	void exitScript_value_string(HTMLParser.Script_value_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_empty_string}.
	 * @param ctx the parse tree
	 */
	void enterScript_empty_string(HTMLParser.Script_empty_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_empty_string}.
	 * @param ctx the parse tree
	 */
	void exitScript_empty_string(HTMLParser.Script_empty_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(HTMLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(HTMLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_obj}.
	 * @param ctx the parse tree
	 */
	void enterScript_obj(HTMLParser.Script_objContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_obj}.
	 * @param ctx the parse tree
	 */
	void exitScript_obj(HTMLParser.Script_objContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_obj_value}.
	 * @param ctx the parse tree
	 */
	void enterScript_obj_value(HTMLParser.Script_obj_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_obj_value}.
	 * @param ctx the parse tree
	 */
	void exitScript_obj_value(HTMLParser.Script_obj_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_obj_element}.
	 * @param ctx the parse tree
	 */
	void enterScript_obj_element(HTMLParser.Script_obj_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_obj_element}.
	 * @param ctx the parse tree
	 */
	void exitScript_obj_element(HTMLParser.Script_obj_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_value_array}.
	 * @param ctx the parse tree
	 */
	void enterScript_value_array(HTMLParser.Script_value_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_value_array}.
	 * @param ctx the parse tree
	 */
	void exitScript_value_array(HTMLParser.Script_value_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#array_element}.
	 * @param ctx the parse tree
	 */
	void enterArray_element(HTMLParser.Array_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#array_element}.
	 * @param ctx the parse tree
	 */
	void exitArray_element(HTMLParser.Array_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_comment}.
	 * @param ctx the parse tree
	 */
	void enterScript_comment(HTMLParser.Script_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_comment}.
	 * @param ctx the parse tree
	 */
	void exitScript_comment(HTMLParser.Script_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#line_comment}.
	 * @param ctx the parse tree
	 */
	void enterLine_comment(HTMLParser.Line_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#line_comment}.
	 * @param ctx the parse tree
	 */
	void exitLine_comment(HTMLParser.Line_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#content_line_comment}.
	 * @param ctx the parse tree
	 */
	void enterContent_line_comment(HTMLParser.Content_line_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#content_line_comment}.
	 * @param ctx the parse tree
	 */
	void exitContent_line_comment(HTMLParser.Content_line_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#multi_line_comment}.
	 * @param ctx the parse tree
	 */
	void enterMulti_line_comment(HTMLParser.Multi_line_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#multi_line_comment}.
	 * @param ctx the parse tree
	 */
	void exitMulti_line_comment(HTMLParser.Multi_line_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#slash_open}.
	 * @param ctx the parse tree
	 */
	void enterSlash_open(HTMLParser.Slash_openContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#slash_open}.
	 * @param ctx the parse tree
	 */
	void exitSlash_open(HTMLParser.Slash_openContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#slash_close}.
	 * @param ctx the parse tree
	 */
	void enterSlash_close(HTMLParser.Slash_closeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#slash_close}.
	 * @param ctx the parse tree
	 */
	void exitSlash_close(HTMLParser.Slash_closeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#content_comment}.
	 * @param ctx the parse tree
	 */
	void enterContent_comment(HTMLParser.Content_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#content_comment}.
	 * @param ctx the parse tree
	 */
	void exitContent_comment(HTMLParser.Content_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_identifier_for_after_semicol}.
	 * @param ctx the parse tree
	 */
	void enterScript_identifier_for_after_semicol(HTMLParser.Script_identifier_for_after_semicolContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_identifier_for_after_semicol}.
	 * @param ctx the parse tree
	 */
	void exitScript_identifier_for_after_semicol(HTMLParser.Script_identifier_for_after_semicolContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_identifier_for_before_sings}.
	 * @param ctx the parse tree
	 */
	void enterScript_identifier_for_before_sings(HTMLParser.Script_identifier_for_before_singsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_identifier_for_before_sings}.
	 * @param ctx the parse tree
	 */
	void exitScript_identifier_for_before_sings(HTMLParser.Script_identifier_for_before_singsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_for}.
	 * @param ctx the parse tree
	 */
	void enterScript_for(HTMLParser.Script_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_for}.
	 * @param ctx the parse tree
	 */
	void exitScript_for(HTMLParser.Script_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_identifier_for}.
	 * @param ctx the parse tree
	 */
	void enterScript_identifier_for(HTMLParser.Script_identifier_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_identifier_for}.
	 * @param ctx the parse tree
	 */
	void exitScript_identifier_for(HTMLParser.Script_identifier_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#sign_for}.
	 * @param ctx the parse tree
	 */
	void enterSign_for(HTMLParser.Sign_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#sign_for}.
	 * @param ctx the parse tree
	 */
	void exitSign_for(HTMLParser.Sign_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#x_variable_for}.
	 * @param ctx the parse tree
	 */
	void enterX_variable_for(HTMLParser.X_variable_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#x_variable_for}.
	 * @param ctx the parse tree
	 */
	void exitX_variable_for(HTMLParser.X_variable_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#x_sign_for}.
	 * @param ctx the parse tree
	 */
	void enterX_sign_for(HTMLParser.X_sign_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#x_sign_for}.
	 * @param ctx the parse tree
	 */
	void exitX_sign_for(HTMLParser.X_sign_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#number_for}.
	 * @param ctx the parse tree
	 */
	void enterNumber_for(HTMLParser.Number_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#number_for}.
	 * @param ctx the parse tree
	 */
	void exitNumber_for(HTMLParser.Number_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#string_for}.
	 * @param ctx the parse tree
	 */
	void enterString_for(HTMLParser.String_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#string_for}.
	 * @param ctx the parse tree
	 */
	void exitString_for(HTMLParser.String_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_if}.
	 * @param ctx the parse tree
	 */
	void enterScript_if(HTMLParser.Script_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_if}.
	 * @param ctx the parse tree
	 */
	void exitScript_if(HTMLParser.Script_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#right_bracket}.
	 * @param ctx the parse tree
	 */
	void enterRight_bracket(HTMLParser.Right_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#right_bracket}.
	 * @param ctx the parse tree
	 */
	void exitRight_bracket(HTMLParser.Right_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#left_bracket}.
	 * @param ctx the parse tree
	 */
	void enterLeft_bracket(HTMLParser.Left_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#left_bracket}.
	 * @param ctx the parse tree
	 */
	void exitLeft_bracket(HTMLParser.Left_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_normal_if_while}.
	 * @param ctx the parse tree
	 */
	void enterScript_normal_if_while(HTMLParser.Script_normal_if_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_normal_if_while}.
	 * @param ctx the parse tree
	 */
	void exitScript_normal_if_while(HTMLParser.Script_normal_if_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_not_if_while}.
	 * @param ctx the parse tree
	 */
	void enterScript_not_if_while(HTMLParser.Script_not_if_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_not_if_while}.
	 * @param ctx the parse tree
	 */
	void exitScript_not_if_while(HTMLParser.Script_not_if_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_identifier_if}.
	 * @param ctx the parse tree
	 */
	void enterScript_identifier_if(HTMLParser.Script_identifier_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_identifier_if}.
	 * @param ctx the parse tree
	 */
	void exitScript_identifier_if(HTMLParser.Script_identifier_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#if_sign}.
	 * @param ctx the parse tree
	 */
	void enterIf_sign(HTMLParser.If_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#if_sign}.
	 * @param ctx the parse tree
	 */
	void exitIf_sign(HTMLParser.If_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#if_condition_value}.
	 * @param ctx the parse tree
	 */
	void enterIf_condition_value(HTMLParser.If_condition_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#if_condition_value}.
	 * @param ctx the parse tree
	 */
	void exitIf_condition_value(HTMLParser.If_condition_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#if_number_value}.
	 * @param ctx the parse tree
	 */
	void enterIf_number_value(HTMLParser.If_number_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#if_number_value}.
	 * @param ctx the parse tree
	 */
	void exitIf_number_value(HTMLParser.If_number_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#if_string_value}.
	 * @param ctx the parse tree
	 */
	void enterIf_string_value(HTMLParser.If_string_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#if_string_value}.
	 * @param ctx the parse tree
	 */
	void exitIf_string_value(HTMLParser.If_string_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#if_not}.
	 * @param ctx the parse tree
	 */
	void enterIf_not(HTMLParser.If_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#if_not}.
	 * @param ctx the parse tree
	 */
	void exitIf_not(HTMLParser.If_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#if_not_in_bracket}.
	 * @param ctx the parse tree
	 */
	void enterIf_not_in_bracket(HTMLParser.If_not_in_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#if_not_in_bracket}.
	 * @param ctx the parse tree
	 */
	void exitIf_not_in_bracket(HTMLParser.If_not_in_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_while}.
	 * @param ctx the parse tree
	 */
	void enterScript_while(HTMLParser.Script_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_while}.
	 * @param ctx the parse tree
	 */
	void exitScript_while(HTMLParser.Script_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_do_while}.
	 * @param ctx the parse tree
	 */
	void enterScript_do_while(HTMLParser.Script_do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_do_while}.
	 * @param ctx the parse tree
	 */
	void exitScript_do_while(HTMLParser.Script_do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script_while_header}.
	 * @param ctx the parse tree
	 */
	void enterScript_while_header(HTMLParser.Script_while_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script_while_header}.
	 * @param ctx the parse tree
	 */
	void exitScript_while_header(HTMLParser.Script_while_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(HTMLParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(HTMLParser.StyleContext ctx);
}