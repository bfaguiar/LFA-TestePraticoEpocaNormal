grammar calculator;

file : stat* EOF;

stat : print
	 | declaration
     ;

print : 'print' operation;

declaration : VAR '=' operation;

operation :operation op=('*' | '/') operation		#DivMult
		  |operation op=('+' | '-') operation   	#SubSum
		  |'(' operation ')'					#parentesis
		  |INT                                  #doubleNumber
		  |IMAGINARYN                           #ImaginaryNumber
		  |VAR                                  #Var
		  ;



VAR : [A-Za-z]+;
INT : [0-9]+ ('.' [0-9]+)*;
IMAGINARYN : [0-9]+ ('+' | '-') [0-9]+ 'i';
WS  : [ \t\r\n] -> skip;