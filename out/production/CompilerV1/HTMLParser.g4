
parser grammar HTMLParser;

options {
 tokenVocab=HTMLLexer;
}

htmlDocument
    : scriptletOrSeaWs* XML? scriptletOrSeaWs* DTD? scriptletOrSeaWs* htmlElements*
    ;

scriptletOrSeaWs
    : SCRIPTLET
    | SEA_WS
    ;

htmlElements
    : htmlMisc* htmlElement htmlMisc*
    ;

/*TAG_OPEN TAG_NAME htmlAttribute*
                      (TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)? | TAG_SLASH_CLOSE);*/

closeHtmlAndContent:
 TAG_CLOSE innerCloseHtmlElement? | TAG_SLASH_CLOSE;

 innerCloseHtmlElement:
  htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE;

htmlElement
        : TAG_OPEN TAG_NAME htmlAttribute* closeHtmlAndContent
    /*html
    | body
    | head
    | header
    | nav
    | li
    | ul
    | ol
    | paragraph
    | div
    | span
    | form
    | input
    | h
    | img
    | br
    | i*/
    | SCRIPTLET
    | script
    | style
    ;

/*html:TAG_OPEN HTML_NAME htmlAttribute*
                      TAG_CLOSE htmlContent? TAG_OPEN TAG_SLASH HTML_NAME TAG_CLOSE;

body: TAG_OPEN BODY_NAME htmlAttribute*
                       TAG_CLOSE htmlContent? TAG_OPEN TAG_SLASH BODY_NAME TAG_CLOSE;

head: TAG_OPEN HEAD_NAME htmlAttribute*
                       TAG_CLOSE htmlContent? TAG_OPEN TAG_SLASH HEAD_NAME TAG_CLOSE;

header: TAG_OPEN HEADER_NAME htmlAttribute*
                           TAG_CLOSE htmlContent? TAG_OPEN TAG_SLASH HEADER_NAME TAG_CLOSE;

nav: TAG_OPEN NAV_NAME htmlAttribute*
                     TAG_CLOSE htmlContent? TAG_OPEN TAG_SLASH NAV_NAME TAG_CLOSE;

li: TAG_OPEN LI_NAME htmlAttribute*
                   TAG_CLOSE htmlContent? TAG_OPEN TAG_SLASH LI_NAME TAG_CLOSE;


ul: TAG_OPEN UL_NAME htmlAttribute*
                   TAG_CLOSE htmlContent? TAG_OPEN TAG_SLASH UL_NAME TAG_CLOSE;

ol: TAG_OPEN OL_NAME htmlAttribute*
                   TAG_CLOSE htmlContent? TAG_OPEN TAG_SLASH OL_NAME TAG_CLOSE;

paragraph: TAG_OPEN PARAGRAPH_NAME htmlAttribute*
                    TAG_CLOSE htmlContent? TAG_OPEN TAG_SLASH PARAGRAPH_NAME TAG_CLOSE;

div: TAG_OPEN DIV_NAME htmlAttribute*
                      TAG_CLOSE htmlContent? TAG_OPEN TAG_SLASH DIV_NAME TAG_CLOSE;

span: TAG_OPEN SPAN_NAME htmlAttribute*
                            TAG_CLOSE htmlContent? TAG_OPEN TAG_SLASH SPAN_NAME TAG_CLOSE;

form: TAG_OPEN FORM_NAME htmlAttribute*
                            TAG_CLOSE htmlContent? TAG_OPEN TAG_SLASH FORM_NAME TAG_CLOSE;

input: TAG_OPEN INPUT_NAME htmlAttribute* (TAG_CLOSE | TAG_SLASH_CLOSE);

h: TAG_OPEN H_NAME  htmlAttribute*
                         TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH H_NAME  TAG_CLOSE)?;

img: TAG_OPEN IMG_NAME htmlAttribute* (TAG_CLOSE | TAG_SLASH_CLOSE);

br: TAG_OPEN BR_NAME htmlAttribute* (TAG_CLOSE | TAG_SLASH_CLOSE);

i: TAG_OPEN I_NAME  htmlAttribute*
                            TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH I_NAME TAG_CLOSE)?;*/

htmlChardataValues: (htmlElement | CDATA | htmlComment) htmlChardata?;
htmlContent
    : htmlChardata?  htmlChardataValues*
    ;

cp_show: CP_SHOW TAG_EQUALS (expression_show);

cp_app: CP_APP TAG_EQUALS (expression_app);

cp_for: CP_FOR TAG_EQUALS (expression_for);

cp_hide: CP_HIDE TAG_EQUALS (expression_hide);

cp_if: CP_IF TAG_EQUALS (expression_if);

cp_switch: CP_SWITCH TAG_EQUALS (expression_switch);

cp_switch_case: CP_SWITCH_CASE TAG_EQUALS (expression_switch_case);

cp_switch_default: CP_SWITCH_DEFAULT;

cp_model: CP_MODEL TAG_EQUALS (expression_model);

cp_type: CP_TYPE TAG_EQUALS (expression_type);

cp_click: CP_CLICK TAG_EQUALS (expression_click);

cp_mouseover: CP_MOUSEOVER TAG_EQUALS (expression_mouseover);

default_cp: TAG_NAME expression_default?;

htmlAttribute
    : cp_show
    | cp_app
    | cp_for
    | cp_if
    | cp_hide
    | cp_switch
    | cp_switch_case
    | cp_switch_default
    | cp_model
    | cp_type
    | cp_click
    | cp_mouseover
    | default_cp
    ;

/*expression: expression_app
          | expression_for
          | expression_switch
          | expression_switch_case
          | expression_show
          | expression_hide
          | expression_if
          | expression_model
          | expression_click
          | expression_mouseover
          | expression_type
          ;*/

expression_default: TAG_EQUALS QUOTE_OPEN VAR QUOTE_CLOSE;

expression_app: QUOTE_OPEN VAR QUOTE_CLOSE;

expression_show: QUOTE_OPEN VAR QUOTE_CLOSE
          //     | QUOTE_OPEN VAR DOT var_after_show QUOTE_CLOSE
               | QUOTE_OPEN function_show QUOTE_CLOSE
               | QUOTE_OPEN iteration QUOTE_CLOSE;

function_show: function_cp (sign_number)?;
sign_number: sign number;
var_after_show: VAR;

expr_hide_with_func: QUOTE_OPEN not? function_cp (sign_number)? QUOTE_CLOSE;
expr_hide_with_not_varDotVar: QUOTE_OPEN not? VAR DOT var_after_hide QUOTE_CLOSE;

expression_hide: QUOTE_OPEN not? VAR QUOTE_CLOSE
               | expr_hide_with_func
               | QUOTE_OPEN iteration QUOTE_CLOSE;

var_after_hide: VAR;
function_cp: FUNCTION | VAR func_parameters_cp;
func_parameters_cp: BRACKET_FUNC_OPEN (fun_param* | equation) BRACKET_FUNC_CLOSE;
fun_param: VAR_PARAMETER COMMA_PAR?;
equation: (equation_param)* (VAR_PARAMETER | PARAMETER_NUMBER);
equation_param: (VAR_PARAMETER | PARAMETER_NUMBER) PARAMETER_SIGN;

expr_for_with_index: QUOTE_OPEN VAR IN var_after SEMICOL var_before_index EQUALS INDEX QUOTE_CLOSE;
expr_for_with_arr: QUOTE_OPEN VAR COMMA_FOR var_after_comma IN var_after QUOTE_CLOSE;

expression_for: QUOTE_OPEN VAR IN var_after QUOTE_CLOSE
              | expr_for_with_index
              | expr_for_with_arr;

var_before_index: VAR;
var_after_comma: VAR;
var_after: VAR | arr_elements | BRACKET_OPEN_OBJ object BRACKET_CLOSE_OBJ;

arr_elements: BRACET_OPEN arr_element* BRACET_CLOSE;
arr_element: ELEMENT COMMA | ELEMENT;

object: element_obj*;
element_obj: VAR TWO_POINTS (var_after | var_quote | number_value) COMMA_FOR?;
number_value: NUMBER;
var_quote:  QUOTE_OPEN_OBJ_FOR VAR QUOTE_CLOSE_OBJ_FOR;


expr_if_with_varDotVar_sign: QUOTE_OPEN not? VAR DOT var_after_if (sign_number)? QUOTE_CLOSE;
expr_if_with_func: QUOTE_OPEN not? function_cp (sign_number)? QUOTE_CLOSE;

/*
expr_if_with_iteration_condition: QUOTE_OPEN
                                  ((not? VAR | not? function_cp (sign_number)? | not? VAR DOT var_after_if (sign_number)?)
                                  (AND | OR)
                                  (not? VAR | not? function_cp (sign_number)? | not? VAR DOT var_after_if (sign_number)?))*
                                  ((AND | OR)
                                  (not? VAR | not? function_cp (sign_number)? | not? VAR DOT var_after_if (sign_number)?))?
                                  QUOTE_CLOSE;
*/

/*expr_if_with_iteration_condition: QUOTE_OPEN
                                  iteration
                                  ((AND | OR)
                                  (last_iterator))?
                                  QUOTE_CLOSE;*/

expr_if_with_iteration_condition: QUOTE_OPEN
                                  iteration
                                  QUOTE_CLOSE;

iteration: (iteration_expr_with_gates)* iteration_expr;
iteration_expr_with_gates: iteration_expr (AND | OR) ;
iteration_expr: (not? VAR | attribute_func | attribute_varDotVar);
attribute_func: not? function_cp (sign_number)?;
attribute_varDotVar: not? dot_iteration (sign_number)?;
dot_iteration: var_dot* VAR;
var_dot: VAR DOT;

expression_if: QUOTE_OPEN not? VAR QUOTE_CLOSE
             | expr_if_with_varDotVar_sign
             | expr_if_with_func
             | expr_if_with_iteration_condition;

var_after_if: VAR;
sign: SIGN;
number:NUMBER;
not: NOT_CONDITION;

expression_switch: QUOTE_OPEN VAR QUOTE_CLOSE
                 | QUOTE_OPEN iteration QUOTE_CLOSE;
var_after_switch: VAR;

expression_switch_case: QUOTE_OPEN (VAR | NUMBER) QUOTE_CLOSE;

expression_model: QUOTE_OPEN VAR QUOTE_CLOSE
                | QUOTE_OPEN date QUOTE_CLOSE
                | QUOTE_OPEN iteration QUOTE_CLOSE;

date: year month day;
year : YEAR;
month: MONTH;
day: DAY;

expression_type: QUOTE_OPEN TYPE QUOTE_CLOSE;

expression_click: QUOTE_OPEN function_cp QUOTE_CLOSE;

expression_mouseover: QUOTE_OPEN FUNCTION QUOTE_CLOSE;


spacesBeforeText: htmlMisc*;
spacesAfterText: htmlMisc*;
spacesBeforeTextMustacheLEFT: htmlMisc*;
spacesAfterTextMustacheLEFT: htmlMisc*;
spacesBeforeTextMustacheRIGHT: htmlMisc*;
spacesAfterTextMustacheRIGHT: htmlMisc*;

mustach_list: spacesBeforeTextMustacheLEFT textLeftMustache? spacesAfterTextMustacheLEFT
              mustache+ spacesBeforeTextMustacheRIGHT textRightMustache? spacesAfterTextMustacheRIGHT;

textLeftMustache: (html_text_before_mustache|var_condition_txt);
textRightMustache: (html_text_after_mustache|var_condition_txt);

htmlCharDataWithoutMustache: spacesBeforeText (html_text | var_condition_txt) spacesAfterText;
htmlCharDataWithMustache : (mustach_list)*;

htmlChardata: htmlCharDataWithoutMustache
            | htmlCharDataWithMustache
            | SEA_WS
            ;

// mustach
mustache_with_expr:  spacesBeforeTextMustacheLEFT MUSTACHE_OPEN  (mustache_expr) MUSTACHE_CLOSE  spacesAfterTextMustacheRIGHT;
mustache_without_expr: first_variable_bracket spacesBeforeText (html_text) spacesAfterText second_variable_bracket;

mustache: mustache_with_expr
        | mustache_without_expr;

mustache_expr: (filter_mustache | question_mustache | variable_mustache | formatter_mustache | varDotVar | operatorVar);
filter_mustache: first_var PIPE filter_kind;
question_mustache:  var_condition_txt QUESTION_MARK first_var TWO_POINTS_VARIABLE second_var;
variable_mustache: var;
formatter_mustache:  first_var PIPE expr_formatter ;
varDotVar: iteration_mustache;
operatorVar: (var_with_operatoer)* var_type;

iteration_mustache: (iteration_mustache_expr)* second_var;
iteration_mustache_expr: first_var DOT_M;

var_with_operatoer: var_type operator;
var_type: (var | number_mustache | varDotVar);
operator: OPERATOR;

filter_kind: FILTER_KIND;
html_text_before_mustache:ANY_HTML_TEXT;
html_text_after_mustache: ANY_HTML_TEXT;
html_text: ANY_HTML_TEXT;

var_condition_mustache:(VAR_BRACKET | FUNCTION_BRACKET) sign_mustache number_mustache;
var_condition_txt: VAR_BRACKET | var_condition_mustache | iteration_condition;
iteration_condition:  iteration_mustache (sign_mustache number_mustache)?;

sign_mustache: SIGN_MUSTACHE;
number_mustache: NUMBER_BRACKET;

first_var_string: ((Q_O_VAR_BRACKET|S_Q_VAR_BRACKET) VAR_BRACKET (Q_O_VAR_BRACKET|S_Q_VAR_BRACKET));
first_var: VAR_BRACKET | NUMBER_BRACKET | first_var_string | BRACKET_MUSTACHE_Q_OPEN question_mustache* BRACKET_MUSTACHE_Q_CLOSE;
second_var: VAR_BRACKET | NUMBER_BRACKET | first_var_string | BRACKET_MUSTACHE_Q_OPEN question_mustache* BRACKET_MUSTACHE_Q_CLOSE;
first_variable_bracket:  MUSTACHE_OPEN var MUSTACHE_CLOSE ;
second_variable_bracket:  MUSTACHE_OPEN var MUSTACHE_CLOSE ;

var:  VAR_BRACKET | var_with_quote;
var_with_quote: (Q_O_VAR_BRACKET VAR_BRACKET Q_O_VAR_BRACKET)
              | (S_Q_VAR_BRACKET VAR_BRACKET S_Q_VAR_BRACKET);

expr_formatter: MY_FORMATER TWO_POINTS_VARIABLE Q_O_VAR_BRACKET formatter Q_O_VAR_BRACKET;
formatter: VAR_BRACKET;

htmlMisc
    : htmlComment
    | SEA_WS
    ;

htmlComment
    : HTML_COMMENT
    | HTML_CONDITIONAL_COMMENT
    ;

script
    : SCRIPT_OPEN (script_body) SCRIPT_CLOSE
    ;

script_body: script_list_statement;
script_list_statement: left_whitespaces script_statement* right_whitespaces;

left_whitespaces: whitespaces*;
right_whitespaces: whitespaces*;
whitespaces: SCRIPT_WHITESPACE;

script_statement: left_whitespaces
                (script_function
                | script_var
                | script_obj
                | script_comment
                | script_for
                | script_if
                | script_while
                | script_do_while)
                 right_whitespaces;

// script function
script_function: SCRIPT_K_VAR script_identifier SCRIPT_EQUALS SCRIP_K_FUNCTION script_function_par;
script_function_par: SCRIPT_PAR_BRACKET_OPEN func_parameters* SCRIPT_PAR_BRACKET_CLOSE
                     SCRIPT_FUN_B_O left_whitespaces func_body right_whitespaces SCRIPT_FUN_B_C;

func_parameters: PARAMETER PAR_COMMA | PARAMETER;
func_body: script_list_statement return_function_body?;
return_function_body: left_whitespaces script_fun_return right_whitespaces;
script_fun_return: RETURN (script_value_string | script_value_number | script_identifier | script_empty_string) SCRIPT_SEMICOL?;

// script var
script_var: SCRIPT_K_VAR script_identifier SCRIPT_EQUALS? script_value? SCRIPT_SEMICOL?;
script_identifier: SCRIPT_IDENTIFIER;
script_value: script_value_number | script_value_string | script_empty_string | script_value_array;
script_value_number: SCRIPT_NUMBER;
script_value_string: SCRIPT_QUOTE_OPEN value SCRIPT_QUOTE_CLOSE;
script_empty_string: SCRIPT_QUOTE_OPEN SCRIPT_QUOTE_CLOSE;
value: SCRIPT_STRING;

// script object
script_obj:
 SCRIPT_K_VAR script_identifier SCRIPT_EQUALS script_obj_value SCRIPT_SEMICOL?;

script_obj_value:SCRIPT_FUN_B_O script_obj_element* SCRIPT_FUN_B_C;
script_obj_element: script_identifier SCRIPT_OBJ_TOW_POINTS (script_value_string | script_value_number | script_value_array | script_empty_string) SCRIPT_COMMA?;
script_value_array: SCRIPT_ARRAY_B_O array_element* SCRIPT_ARRAY_B_C;
array_element: (script_value_number | script_value_string) SCRIPT_COMMA? ;

// script comment
script_comment: line_comment | multi_line_comment ; //| multi_line_comment;
line_comment: DOUBLE_SLASH content_line_comment;
content_line_comment: SCRIPT_COMMENT_LINE_CONTENT;
multi_line_comment: slash_open content_comment? slash_close;
slash_open: SLASH_STAR_OPEN ;
slash_close: SLASH_STAR_CLOSE;
content_comment: SCRIPT_COMMENT_CONTENT;

// script for

script_identifier_for_after_semicol: script_identifier_for;
script_identifier_for_before_sings: script_identifier_for;
script_for: SCRIPT_K_FOR
            SCRIPT_PAR_BRACKET_OPEN
            SCRIPT_K_VAR_FOR? script_identifier_for (EQULAS_FOR number_for)?
            SEMI_COL_FOR
            script_identifier_for_after_semicol x_sign_for x_variable_for
            SEMI_COL_FOR
            script_identifier_for_before_sings sign_for
            SCRIPT_PAR_BRACKET_CLOSE
            SCRIPT_FUN_B_O
            (script_list_statement )
            SCRIPT_FUN_B_C;

script_identifier_for: PARAMETER;
sign_for: SIGN_FOR | SIGN_FOR_STEPS NUMBER_FOR;
x_variable_for: number_for | string_for;
x_sign_for: X_SIGN;
number_for: NUMBER_FOR;
string_for: QUOTE PARAMETER QUOTE | S_QUOTE PARAMETER S_QUOTE;

// script if

script_if: SCRIPT_K_IF (script_normal_if_while | script_not_if_while);

right_bracket: SCRIPT_PAR_BRACKET_NOT_OPEN_CONDITION;
left_bracket: SCRIPT_PAR_BRACKET_CLOSE;

script_normal_if_while: SCRIPT_PAR_BRACKET_OPEN   // (
                  right_bracket*?
                  SCRIPT_K_VAR_FOR? script_identifier_if (if_sign if_condition_value)?
                  SCRIPT_PAR_BRACKET_CLOSE
                  left_bracket*?
                  SCRIPT_FUN_B_O // {
                  (script_list_statement)
                  SCRIPT_FUN_B_C;


script_not_if_while: SCRIPT_PAR_BRACKET_OPEN
               if_not right_bracket*? if_not_in_bracket?
               SCRIPT_K_VAR_FOR? script_identifier_if (if_sign if_condition_value)?
               SCRIPT_PAR_BRACKET_CLOSE
               left_bracket*?
               SCRIPT_FUN_B_O
               (script_list_statement)
               SCRIPT_FUN_B_C;

script_identifier_if: PARAMETER;
if_sign: X_SIGN;
if_condition_value:  if_number_value | if_string_value;
if_number_value: NUMBER_FOR;
if_string_value:  QUOTE PARAMETER QUOTE | S_QUOTE PARAMETER S_QUOTE;
if_not: IF_NOT;
if_not_in_bracket: IF_NOT;

// script while

script_while: SCRIPT_K_WHILE (script_normal_if_while | script_not_if_while);

// script do_while

script_do_while: SCRIPT_K_DO SCRIPT_FUN_B_O script_list_statement SCRIPT_FUN_B_C  script_while_header SCRIPT_SEMICOL;
script_while_header:SCRIPT_K_WHILE
                    SCRIPT_PAR_BRACKET_OPEN
                    if_not? right_bracket*? if_not_in_bracket?
                    SCRIPT_K_VAR_FOR? script_identifier_if (if_sign if_condition_value)?
                    SCRIPT_PAR_BRACKET_CLOSE
                    left_bracket*?;

style
    : STYLE_OPEN (STYLE_BODY | STYLE_SHORT_BODY)
    ;


// Packages:
//1- Auto Close Tag
//2- JavaScript
//3- Live