grammar Jython;

start: program;

program: importclass*(classDef*) ;

importclass : 'import' importName = CLASSNAME+;

classDef : 'class' className = CLASSNAME ('(' classParentName = CLASSNAME ')')? '{' (class_body*) '}';

class_body : varDec | arrayDec | methodDec | constructor;

varDec : variableType = (TYPE | CLASSNAME) varibaleName = ID;

arrayDec : arrayType = (TYPE | CLASSNAME) '['INTEGER']' arrayVaribaleName = ID ;

methodDec : 'def' methodReturnType = (CLASSNAME | TYPE | 'void') methodName = ID '(' methodParameters = parameter* ')' '{' (statement)* '}';

constructor : 'def' cosntructorType = CLASSNAME '(' constructorParameters = parameter* ')''{' (statement)* '}' ;

parameter : varDec (',' varDec)* ;

statement : varDec | assignment | print_statment | method_call | return_statment | if_statment | while_statment | if_else_statment | for_statment;

return_statment : 'return' exp ;

condition_list : condition (('or'|'and') condition)* ;

condition : BOOL | prefixexp | (exp) relational_operators (exp); if_statment : 'if' '(' condition_list ')' '{' statement* '}';

while_statment : 'while' '(' condition_list ')' '{' statement* '}' ;

if_else_statment :'if' '(' condition_list ')' '{' statement* '}' ('elif' '(' condition_list ')' '{' statement* '}')* 'else' '{' statement* '}' ;

print_statment : 'print' '(' (prefixexp | (CLASSNAME | TYPE) args | INTEGER |STRING | BOOL) ')' ;

for_statment : 'for' ID 'in' ID '{' statement* '}' | 'for' ID 'in' 'range''('INTEGER (',' INTEGER)? (',' INTEGER)? ')' '{' statement* '}' ;

method_call : ID '.'args ;

assignment : prefixexp assignment_operators exp | varDec assignment_operators exp | arrayDec '=' TYPE args ('['INTEGER']') ;

exp : 'none' | BOOL | INTEGER | STRING | FLOAT | prefixexp | exp arithmetic_operator exp |'('exp')' | ID;

prefixexp: ID | prefixexp'['INTEGER']' | prefixexp'.'ID | prefixexp'.'ID ;

args : '(' (explist)? ')' ;

explist : exp (',' exp)*;

arithmetic_operator: '+' | '-' | '*' | '/' | '%' ;

relational_operators : '<' | '>' | '<=' | '>=' | '==' | '!=' ; assignment_operators : '=' | '+=' | '-=' | '*=' | '/=' ;

CLASSNAME : (UPPERLETTER+  (Letter | Underline | NUMBERS+)*)+;

TYPE : 'none' | 'int' | 'float' | 'string' | 'bool';

ID : ((Underline)* Letter (Underline | NUMBERS+)*)+;

STRING : '"' .*? '"';

INTEGER : NUMBERS+;

FLOAT : NUMBERS + '.' NUMBERS* | '.' NUMBERS+ ;

BOOL : 'false' | 'true';

Letter: (UPPERLETTER | LOWERLETTER)+;

LetterAndNumbers: LETTERAndNUMBERS+;

Underline: UnderlineLetter+;

fragment UPPERLETTER : [A-Z];
fragment LOWERLETTER : [a-z];
fragment NUMBERS : [0-9];
fragment LETTERAndNUMBERS : [a-zA-Z0-9];
fragment UnderlineLetter : [_];

//newLine: '\n';
WS:[ \t\r\n]+ -> skip;

fragment WhiteSpace:[ \t\r\n]+;