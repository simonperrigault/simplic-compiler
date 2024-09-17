# Assignment A3

## 1.1 Visitors

_What does each accept method do ?_

it calls the visit method of the visitor with "this" as a parameter to use the good implementation of the visit method

_What does each visit method do in the traversingVisitor ?_

it calls the VisitChildren method which calls visit on each of the children of a node
there is a visit method for each type of node so we can deal with them differently

_What happens when the result method is called ?_

the visitor will traverse the whole program, and if it sees a ask node, it changes its variable to true, and finally return its variable after the traversal

_How is double dispatch used ?_

the visit method(ask) method is overriden in the CheckInteractiveVisitor

_How would you change the visitor to count the number of Ask Node ?_

create a variable int count and add one to it each time we traverse Ask Node

_How would you modify the SymbolTable class to support name binding ?_

use a hashtable instead of a set, key = name value = decl node

_What would a call look like that performs name analysis and prints the errors to standard error ?_

Program.checkNames(System.err);

_Push/pop operations ?_

when we enter a new scope, we push a new symbol table where you can shadow previous declarations. There is no pop because we just use the stack of the function calls. When we finish a scope, its symbol table will be pop by the func stack.