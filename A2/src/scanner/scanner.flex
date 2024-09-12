package lang.ast; // The generated scanner will belong to the package lang.ast

import lang.ast.LangParser.Terminals; // The terminals are implicitly defined in the parser
import lang.ast.LangParser.SyntaxError;

%%

// define the signature for the generated scanner
%public
%final
%class LangScanner
%extends beaver.Scanner

// the interface between the scanner and the parser is the nextToken() method
%type beaver.Symbol 
%function nextToken 

// store line and column information in the tokens
%line
%column

// this code will be inlined in the body of the generated scanner class
%{
  private beaver.Symbol sym(short id) {
    return new beaver.Symbol(id, yyline + 1, yycolumn + 1, yylength(), yytext());
  }
%}

// macros
WhiteSpace = [ ] | \t | \f | \n | \r
ID = [a-zA-Z][a-zA-Z0-9_]*
Numeral = 0|[1-9][0-9]*

%%

// discard whitespace information
{WhiteSpace}  { }

// token definitions
"while"     { return sym(Terminals.WHILE); }
"if"        { return sym(Terminals.IF); }
"else"      { return sym(Terminals.ELSE); }
"int"       { return sym(Terminals.INT); }
"return"    { return sym(Terminals.RETURN); }
"*"         { return sym(Terminals.MUL); }
"/"         { return sym(Terminals.DIV); }
"%"         { return sym(Terminals.MOD); }
"+"         { return sym(Terminals.ADD); }
"-"         { return sym(Terminals.SUB); }
"=="        { return sym(Terminals.EQ); }
"!="        { return sym(Terminals.NEQ); }
"<="        { return sym(Terminals.LE); }
">="        { return sym(Terminals.GE); }
"<"         { return sym(Terminals.LT); }
">"         { return sym(Terminals.GT); }
"("         { return sym(Terminals.LPAR); }
")"         { return sym(Terminals.RPAR); }
"{"         { return sym(Terminals.LBRACK); }
"}"         { return sym(Terminals.RBRACK); }
";"         { return sym(Terminals.SEMICOLON); }
","         { return sym(Terminals.COMMA); }
"="         { return sym(Terminals.ASSIGN); }
{Numeral}   { return sym(Terminals.NUMERAL); }
"//"        { return sym(Terminals.COMMENT); }
{ID}        { return sym(Terminals.ID); }
<<EOF>>     { return sym(Terminals.EOF); }

/* error fallback */
[^]         { throw new SyntaxError("Illegal character <"+yytext()+">"); }
