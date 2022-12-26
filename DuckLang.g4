grammar DuckLang;

prog	: 'program' block 'endprog'	;

block	: (cmd)+ ;

cmd		: cmdread | cmdwrite | cmdattrib ;

cmdread		: 'read' AP ID FP SC ;

cmdwrite 	: 'write' AP ID FP SC ;

cmdattrib 	: ID ATTR expr SC ;

expr 	: term (OP term)*	;

term 	: ID | NUMBER	;

AP 	: '(' ;

FP : ')' ;

SC : ';' ;

OP : '+' | '-' | '*' | '/';

ATTR : '=' ;

ID	 : [a-z] ([a-z] | [A-Z] | [0-9])*  ;

NUMBER : [0-9] ('.' [0-9]+)? ;

WS   :  (' '| '\t' | '\n' | '\r') -> skip;
