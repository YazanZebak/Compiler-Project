
lexer grammar  HTMLLexer;

HTML_COMMENT
    : ' '* '<!--' .*? '-->' ' '*
    ;

HTML_CONDITIONAL_COMMENT
    : '<![' .*? ']>'
    ;

XML
    : '<?xml' .*? '>'
    ;


CDATA
    : '<![CDATA[' .*? ']]>'
    ;

DTD
    : '<!' .*? '>'
    ;

SCRIPTLET
    : '<?' .*? '?>'
    | '<%' .*? '%>'
    ;

SEA_WS
    :  (' '|'\t'|'\r'? '\n')+
    ;

SCRIPT_OPEN
    : '<script' .*? '>' ->pushMode(SCRIPT)
    ;

STYLE_OPEN
    : '<style' .*? '>'  ->pushMode(STYLE)
    ;

TAG_OPEN
    : ' '* '<' ' '* -> pushMode(TAG)
    ;


// HTML TEXT
ANY_HTML_TEXT : (' '* ('a'..'z' | 'A'..'Z' | DIGIT+)+  ' '*)*
              | ((' '* ('a'..'z' | 'A'..'Z' | DIGIT+)+  ' '*)* ' '* HTML_SYMBOLS ' '* (' '* ('a'..'z' | 'A'..'Z' | DIGIT+)+  ' '*)*)*
              ;

HTML_SYMBOLS: ('%'|'&'|'^'|'$' |'|'|'~'|')'|'('|'.'|','|'!'|'-'|'_'|'/'|'+'|'?'|'='|':'|';'|'#');

// MUSTACHE
MUSTACHE_OPEN: '{{' -> pushMode(MUSTACHE_MODE);

mode MUSTACHE_MODE;
MUSTACHE_CLOSE:  '}}' ->popMode;
PIPE: ' '* '|' ' '*;
TWO_POINTS_VARIABLE: ' '* ':' ' '*;
Q_O_VAR_BRACKET: ' '* '"' ' '*;
Q_C_VAR_BRACKET: ' '* '"' ' '*;
S_Q_VAR_BRACKET: ' '* '\'' ' '*;
DOT_M: ' '* '.' ' '*;
FILTER_KIND: ' '* 'uppercase' ' '*
           | ' '* 'lowercase' ' '*
           | ' '* 'currency' ' '*
           | ' '* 'filter' ' '*
           | ' '* 'number' ' '*
           | ' '* 'json' ' '*
           | ' '*  'string' ' '*;
MY_FORMATER: ' '* 'myFormater' ' '*;
OPERATOR: PLUS | MINUS | MULTIPLE | DIVIDE ;
FUNCTION_BRACKET: ' '* ('a'..'z' | 'A'..'Z' )+ '()' ' '* ;  // | '-'
VAR_BRACKET: ' '* ('a'..'z' | 'A'..'Z' | ' ')+ ' '*;  // | '-'
COMMA_BRACKET: ' '* ',' ' '*;
QUESTION_MARK: ' '* '?' ' '*;
NUMBER_BRACKET: ' '* DIGIT+ ' '*;
SIGN_MUSTACHE: LARGER_THAN | SMALLER_THAN| LARGER_EQUAL_THAN | SMALLER_EQUAL_THAN;
BRACKET_MUSTACHE_Q_OPEN: ' '* '(' ' '*;
BRACKET_MUSTACHE_Q_CLOSE: ' '* ')' ' '*;
// tag declarations
mode TAG;

CP_SHOW: 'cp-show';
CP_APP: 'cp-app';
CP_FOR: 'cp-for';
CP_HIDE: 'cp-hide';
CP_IF: 'cp-if';
CP_SWITCH: 'cp-switch';
CP_SWITCH_CASE: 'cp-switch-case';
CP_SWITCH_DEFAULT: 'cp-switchDefault';
CP_MODEL: 'cp-model';
CP_TYPE: 'type';
CP_CLICK: '@click';
CP_MOUSEOVER: '@mouseover';

TAG_CLOSE
    : '>' -> popMode
    ;

TAG_SLASH_CLOSE
    : '/>' -> popMode
    ;

TAG_SLASH
    : '/'
    ;


// lexing mode for attribute values

TAG_EQUALS
    : ' '* '=' ' '* -> pushMode(ATTVALUE)
    ;

/*PARAGRAPH_NAME: ' '* 'p' ' '*;
DIV_NAME: ' '* 'div' ' '*;
SPAN_NAME:' '* 'span' ' '*;
HTML_NAME: ' '* 'html' ' '*;
BODY_NAME:' '* 'body' ' '*;
HEADER_NAME:' '* 'header' ' '*;
NAV_NAME:' '* 'nav' ' '*;
UL_NAME:' '* 'ul' ' '*;
OL_NAME: ' '* 'ol' ' '*;
HEAD_NAME:' '* 'head' ' '*;
LI_NAME: ' '* 'li' ' '*;
FORM_NAME: ' '* 'form' ' '*;
INPUT_NAME: ' '* 'input' ' '*;
IMG_NAME: ' '* 'img' ' '* ;
BR_NAME: ' '* 'br' ' '* ;
H_NAME: 'h' H_NUMBER?;
I_NAME:  ' '* 'i' ' '*;
H_NUMBER: [0-9];*/




TAG_NAME
    : TAG_NameStartChar TAG_NameChar*
    ;

TAG_WHITESPACE
    : [ \t\r\n] -> channel(HIDDEN)
    ;

fragment
HEXDIGIT
    : [a-fA-F0-9]
    ;

fragment
DIGIT
    : [0-9]
    ;

fragment
TAG_NameChar
    : TAG_NameStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
    | '\u00B7'
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040'
    ;

fragment
TAG_NameStartChar
    : [:a-zA-Z]
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    ;


// <scripts>

mode SCRIPT;
SCRIPT_WHITESPACE: (' '|'\t'|'\r'? '\n')+;
SCRIPT_K_VAR: K_VAR;
SCRIPT_K_FOR: ' '* 'for' ' '*;
SCRIPT_K_IF: ' '* 'if' ' '*;
SCRIPT_K_WHILE: ' '* 'while' ' '*;
SCRIPT_K_DO: ' '* 'do' ' '*;
SCRIPT_CLOSE: '</script>'  -> popMode;
SCRIPT_FUNCTION: ' '* ~["]'()' ' '* ;
SCRIP_K_FUNCTION: ' '* 'function' ' '*;
SCRIPT_IDENTIFIER: ('a'..'z' | 'A'..'Z' | '_')+;
SCRIPT_EQUALS: ' '* '=' ' '*;
SCRIPT_NUMBER: ' '* DIGIT+ ' '*;
SCRIPT_FUN_B_O: ' '* '{' ' '*;
SCRIPT_FUN_B_C: ' '* '}' ' '*;
RETURN: ' '* 'return' ' '*;
SCRIPT_OBJ_TOW_POINTS: ' '* ':' ' '*;
SCRIPT_COMMA: ' '* ',' ' '*;
SCRIPT_ARRAY_B_O: ' '* '[' ' '*;
SCRIPT_ARRAY_B_C: ' '* ']' ' '*;
SCRIPT_SEMICOL: ' '* ';' ' '*;
SCRIPT_PAR_BRACKET_OPEN: ' '* '(' ' '* -> pushMode(SCRIPT_PAR_BRACKET);
SCRIPT_QUOTE_OPEN: ' '* '"' ' '* -> pushMode(QUOTE_SCRIPT_VALUE);
DOUBLE_SLASH: ' '* '//' ' '* -> pushMode(COMMENT_LINE);
SLASH_STAR_OPEN: ' '* '/*' ' '* -> pushMode(COMMENT_STAR);


mode COMMENT_LINE;
SCRIPT_COMMENT_LINE_CONTENT: ' '* ATTCHAR+ ' '* -> popMode;

mode COMMENT_STAR;

SCRIPT_COMMENT_CONTENT: ' '* ATTCHAR+ ' '*;
SLASH_STAR_CLOSE: ' '* '*/' ' '* -> popMode;

mode QUOTE_SCRIPT_VALUE;
SCRIPT_QUOTE_CLOSE: ' '* '"' ' '* -> popMode;
SCRIPT_STRING: ' '* ATTCHAR+ ' '*;


fragment ATTCHAR
    : [0-9a-zA-Z] ' '* SYMBOLS ' '* [0-9a-zA-Z]
    | ' '* [0-9a-zA-Z] ' '*
    | HEXCHARS
    | DECCHARS
    ;

fragment SYMBOLS:  ' '* ('%'|'&'|'^'|'$' |'|'|'>'|'<'|'~'|'{'|'}'|')'|'('|'.'|','|'!'|'-'|'_'|'/'|'+'|'?'|'='|':'|';'|'#')* ' '*;
fragment HEXCHARS
    : '#' [0-9a-zA-Z]+
    ;

fragment DECCHARS
    : [0-9]+ '%'?
    ;

mode SCRIPT_PAR_BRACKET;
SCRIPT_PAR_BRACKET_NOT_OPEN_CONDITION: ' '* '(' ' '* -> pushMode(SCRIPT_PAR_BRACKET);
SCRIPT_PAR_BRACKET_CLOSE: ' '* ')' ' '* -> popMode;
SCRIPT_K_VAR_FOR: K_VAR;
IF_NOT: ' ' * '!' ' '*;
PARAMETER: ('a'..'z' | 'A'..'Z' | '_')+; //ATTCHAR+
PAR_COMMA: ' '* ',' ' '* ;
SEMI_COL_FOR: ' '* ';' ' '*;
X_SIGN: LARGER_THAN | SMALLER_THAN| LARGER_EQUAL_THAN | SMALLER_EQUAL_THAN | DOUBLE_EQUALS | NOT_EQUALS;
SIGN_FOR: PLUS PLUS | MINUS MINUS;
SIGN_FOR_STEPS: PLUS_EQUALS | MINUS_EQUALS;
NUMBER_FOR: DIGIT+;
QUOTE: ' '* '"' ' '*;
S_QUOTE: ' '* '\'' ' '*;
EQULAS_FOR: ' '* '=' ' '*;

// <styles>

mode STYLE;

STYLE_BODY
    : .*? '</style>' -> popMode
    ;

STYLE_SHORT_BODY
    : .*? '</>' -> popMode
    ;


// attribute values

mode ATTVALUE;


// an attribute value may have spaces b/t the '=' and the value
QUOTE_OPEN: ' '* '"' ' '* -> pushMode(QUOTE_MODE);


/*
ATTRIBUTE
    : DOUBLE_QUOTE_STRING
    | SINGLE_QUOTE_STRING
    | ATTCHARS
    | HEXCHARS
    | DECCHARS
    ;

fragment ATTCHARS
    : ATTCHAR+ ' '?
    ;

fragment ATTCHAR
    : '-'
    | '_'
    | '.'
    | '/'
    | '+'
    | ','
    | '?'
    | '='
    | ':'
    | ';'
    | '#'
    | [0-9a-zA-Z]
    ;

fragment HEXCHARS
    : '#' [0-9a-fA-F]+
    ;

fragment DECCHARS
    : [0-9]+ '%'?
    ;


fragment DOUBLE_QUOTE_STRING
    : '"' ~[<"]* '"'
    ;

fragment SINGLE_QUOTE_STRING
    : '\'' ~[<']* '\''
    ;
*/

fragment STRING_X_ATTCHAR
    : [0-9a-zA-Z] ' '* ('%'|'&'|'^'|'$' |'|'|'>'|'<'|'~'|'{'|'}'|')'|'('|'!'|'-'|'_'|'/'|'+'|'?'|'='|':'|';'|'#')* ' '* [0-9a-zA-Z]
    | [0-9a-zA-Z] ' '* ('%'|'&'|'^'|'$' |'|'|'>'|'<'|'~'|'{'|'}'|')'|'('|'!'|'-'|'_'|'/'|'+'|'?'|'='|':'|';'|'#')*
    | ' '*('%'|'&'|'^'|'$' |'|'|'>'|'<'|'~'|'{'|'}'|')'|'('|'!'|'-'|'_'|'/'|'+'|'?'|'='|':'|';'|'#')* ' '* [0-9a-zA-Z] ' '*
    | ' '* [0-9a-zA-Z] ' '*
    | HEXCHARS
    | DECCHARS;


mode QUOTE_MODE;

COMMA_FOR: ' '* ',' ' '*;

INDEX: ' '* 'index' ' '* ;

TYPE:'button' | 'checkbox' | 'color' | 'date' | 'datetime-local' | 'email' | 'file'  | 'hidden' | 'image'
    | 'month' | 'number' | 'password' | 'radio' | 'range' | 'reset' | 'search' | 'submit' | 'tel' | 'text'
    | 'time' | 'url' | 'week';
AND:  ' '* '&&' ' '*;
OR:  ' '* '||' ' '*;
FUNCTION:  ~["!$%]*'()';
VAR: ('a'..'z' | 'A'..'Z')+
   | '_'* ('a'..'z' | 'A'..'Z')+ '_'* DIGIT*
   | '_'* DIGIT* '_'* ('a'..'z' | 'A'..'Z')+
   | ('a'..'z' | 'A'..'Z')+ '_'* ('a'..'z' | 'A'..'Z')+
   | ('a'..'z' | 'A'..'Z')+ '_'* ('a'..'z' | 'A'..'Z')+ DIGIT*
   | ('a'..'z' | 'A'..'Z')+ '_'* ('a'..'z' | 'A'..'Z')+ '_'* DIGIT*
   ;
 /*  | (('a'..'z' | 'A'..'Z') ' '* ('0'..'9')* ' '* ('a'..'z' | 'A'..'Z'))+
   | (('a'..'z' | 'A'..'Z') ' '* ('0'..'9')*)+*/

DOT: ' '* '.' ' '*;
NOT_CONDITION: ' '* '!' ' '*;
QUOTE_CLOSE:' '*  '"' ' '*  -> popMode, popMode ;


IN:  ' '* 'in' ' '+ ;
SEMICOL: ' '* ';' ' '*;

EQUALS
    : ' '* '=' ' '*
    ;
BRACKET_OPEN_OBJ: ' '* '{' ' '*;
BRACKET_CLOSE_OBJ: ' '* '}' ' '*;
TWO_POINTS: ' '* ':' ' '*;
QUOTE_OPEN_OBJ_FOR: ' '* '"' ' ';
QUOTE_CLOSE_OBJ_FOR: ' '* '"' ' '*;

SIGN: LARGER_THAN | SMALLER_THAN| LARGER_EQUAL_THAN | SMALLER_EQUAL_THAN | DOUBLE_EQUALS | NOT_EQUALS;

YEAR: DIGIT DIGIT DIGIT DIGIT ' '*  -> pushMode(MONTH_MODE);

NUMBER: DIGIT+;



BRACKET_FUNC_OPEN: ' '* '(' ' '* -> pushMode(BRACKET_FUN_MODE);


BRACET_OPEN: '[' -> pushMode(ARRAY_ELEMENTS)  ;

mode ARRAY_ELEMENTS;

BRACET_CLOSE: ']' -> popMode;
COMMA: ' '* ',' ' '* ;
ELEMENT : ' '*  '\'' CHARACHTER+ '\'' ' '*  | ' '*  DIGIT+ ' '* ;

fragment CHARACHTER: ('a'..'z' | 'A'..'Z' | '0'..'9');

mode MONTH_MODE;
MONTH: DIGIT DIGIT ' '*  -> pushMode(DAY_MODE);

mode DAY_MODE;
DAY: DIGIT DIGIT ' '* -> popMode , popMode;

mode BRACKET_FUN_MODE;

BRACKET_FUNC_CLOSE : ' '* ')' ' '* -> popMode;
VAR_PARAMETER: ('a'..'z' | 'A'..'Z')+
                   | '_'* ('a'..'z' | 'A'..'Z')+ '_'* DIGIT*
                   | '_'* DIGIT* '_'* ('a'..'z' | 'A'..'Z')+
                   | ('a'..'z' | 'A'..'Z')+ '_'* ('a'..'z' | 'A'..'Z')+
                   | ('a'..'z' | 'A'..'Z')+ '_'* ('a'..'z' | 'A'..'Z')+ DIGIT*
                   | ('a'..'z' | 'A'..'Z')+ '_'* ('a'..'z' | 'A'..'Z')+ '_'* DIGIT*
                   ;
COMMA_PAR: ' '* ',' ' '*;
PARAMETER_SIGN: PLUS | MINUS | MULTIPLE | DIVIDE;
PARAMETER_NUMBER: DIGIT+;





fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];
fragment PLUS: ' '* '+' ' '*;
fragment MINUS: ' '* '-' ' '*;
fragment MULTIPLE: ' '* '*' ' '* ;
fragment DIVIDE: ' '* '/' ' '*;
fragment PLUS_EQUALS: ' '* '+=' ' '*;
fragment MINUS_EQUALS: ' '* '-=' ' '*;
fragment LARGER_THAN: ' '* '>' ' '*;
fragment SMALLER_THAN: ' '* '<' ' '*;
fragment LARGER_EQUAL_THAN: ' '* '>=' ' '* | ' '* '=>' ' '*;
fragment SMALLER_EQUAL_THAN: ' '* '<=' ' '* | ' '* '=<' ' '*;
fragment NOT_EQUALS: ' '* '!=' ' '* ;
fragment DOUBLE_EQUALS: ' '* '==' ' '*;
fragment K_VAR: ' '* 'var' ' '*;