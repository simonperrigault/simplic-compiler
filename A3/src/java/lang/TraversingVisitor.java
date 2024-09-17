package lang;

import lang.ast.*;

/**
 * Traverses each node, passing the data to the children.
 * Returns the data unchanged.
 * Overriding methods may change the data passed and the data returned.
 */
public abstract class TraversingVisitor implements lang.ast.Visitor {

    protected Object visitChildren(ASTNode node, Object data) {
        for (int i = 0; i < node.getNumChild(); ++i) {
            node.getChild(i).accept(this, data);
        }
        return data;
    }

    public Object List.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object Opt.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object Program.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    
    public Object FuncDecl.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object FuncDeclParam.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object FuncParam.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }

    public Object IdDecl.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object Decl.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }

    public Object Block.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object ReturnStmt.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object DeclStmt.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object AssignStmt.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object FuncCallStmt.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object IfStmt.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object WhileStmt.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object ContinueStmt.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object BreakStmt.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }

    public Object LtExpr.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object LeExpr.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object GtExpr.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object GeExpr.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object EqExpr.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object NeqExpr.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }

    public Object AddExpr.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object SubExpr.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object MulExpr.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object DivExpr.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object ModExpr.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object OppExpr.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object PrimaryExpr.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object FuncCall.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object Numeral.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
    public Object IdUse.accept(Visitor visitor, Object data) {
        return visitChildren(node, data);
    }
}
