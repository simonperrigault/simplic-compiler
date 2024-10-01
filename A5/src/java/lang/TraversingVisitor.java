package lang;

import lang.ast.*;

/**
 * Traverses each node, passing the data to the children.
 * Returns the data unchanged.
 * Overriding methods may change the data passed and the data returned.
 */
public abstract class TraversingVisitor implements Visitor {

    protected Object visitChildren(ASTNode node, Object data) {
        for (int i = 0; i < node.getNumChild(); ++i) {
            node.getChild(i).accept(this, data);
        }
        return data;
    }

    public Object visit(List node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(Opt node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(Program node, Object data) {
        return visitChildren(node, data);
    }
    
    public Object visit(FuncDecl node, Object data) {
        return visitChildren(node, data);
    }

    public Object visit(IdDecl node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(Decl node, Object data) {
        return visitChildren(node, data);
    }

    public Object visit(Block node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(ReturnStmt node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(DeclStmt node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(AssignStmt node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(FuncCallStmt node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(IfStmt node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(WhileStmt node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(ContinueStmt node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(BreakStmt node, Object data) {
        return visitChildren(node, data);
    }

    public Object visit(LtExpr node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(LeExpr node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(GtExpr node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(GeExpr node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(EqExpr node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(NeqExpr node, Object data) {
        return visitChildren(node, data);
    }

    public Object visit(AddExpr node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(SubExpr node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(MulExpr node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(DivExpr node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(ModExpr node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(OppExpr node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(PrimaryExpr node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(FuncCall node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(Numeral node, Object data) {
        return visitChildren(node, data);
    }
    public Object visit(IdUse node, Object data) {
        return visitChildren(node, data);
    }
}
