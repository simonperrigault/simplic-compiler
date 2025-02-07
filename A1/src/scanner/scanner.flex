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
ID = [a-zA-Z]+
Numeral = [0-9]+ ("." [0-9]+)?

%%

// discard whitespace information
{WhiteSpace}  { }

// token definitions
"="           { return sym(Terminals.ASSIGN); }
"for"         { return sym(Terminals.FOR); }
"until"       { return sym(Terminals.UNTIL); }
"do"          { return sym(Terminals.DO); }
"od"          { return sym(Terminals.OD); }
"if"          { return sym(Terminals.IF); }
"then"        { return sym(Terminals.THEN); }
"fi"          { return sym(Terminals.FI); }
"not"         { return sym(Terminals.NOT) ;}
{ID}          { return sym(Terminals.ID); }
{Numeral}     { return sym(Terminals.NUMERAL); }
<<EOF>>       { return sym(Terminals.EOF); }

/* error fallback */
[^]           { throw new SyntaxError("Illegal character <"+yytext()+">"); }
