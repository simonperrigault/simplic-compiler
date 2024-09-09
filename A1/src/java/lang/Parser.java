package lang;

import javax.smartcardio.TerminalFactory;

import lang.RDPTemplate;
import lang.ast.LangParser.Terminals;

public class Parser extends RDPTemplate {
    
    protected void parseProgram() {
        stmt();
    }

    protected void stmt() {
        switch(peek()) {
            case Terminals.FOR:
                forStmt();
                break;
            case Terminals.IF:
                ifStmt();
                break;
            case Terminals.ID:
                assignment();
                break;
            default:
                error("Unexpected token " + peek());
        }
    }

    protected void forStmt() {

    }

    protected void ifStmt() {

    }

    protected void assignment() {
        accept(Terminals.ID);
        accept(Terminals.ASSIGN);
        expr();
    }

    protected void expr() {
        switch (peek()) {
            case Terminals.ID:
                accept(Terminals.ID);
                break;
            case Terminals.NUMERAL:
                accept(Terminals.NUMERAL);
                break;
            case Terminals.NOT:
                accept(Terminals.NOT);
                expr();
                break;
            default:
                error("Unexpected token " + peek());
                break;
        }
    }
}
