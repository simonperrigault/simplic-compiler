# Assignment A2

## 1.2 Designing the abstract grammar

_Compare CFG and abstract grammar for Calc_

not the exp / factor thing that the parser needs
no token in abstract
semantic actions in CFG

## 1.4 Well-formed AST's

_Examples of other well-formed ASTs, not well-formed_

you can have 0 or more C, and 0 or 1 B
not well = 2 B, an Opt instead of a List for the C

## Building the AST

_Describe the semantic actions in Calc, Opt and List_

at the end of the production that use terminals/tokens
opt = 2 productions, one without (Opt()) and one with (Opt(a))
list = a new production that uses recursion, end case create a list and the other uses this list

## 2.2 Unintended empty production

_Adds an empty production and it still works, why ?_

the parser chooses to shift, that means that he tries to get more tokens instead of reducing and create a production. In our case, this is what we want because we have other bindings behind. But it is better to have a good grammar.

## Questions

_Why does my list with an empty production works for the statements but I have to add a case with one element for the function parameters ?_

Maybe because of the syntax, function parameters are separated by a comma so there are differences between one and more.

_Why do I have to put "Expr" in the %typeof of all the expressions (add, mul...) if they all inherite from Expr in the jastadd file ?_