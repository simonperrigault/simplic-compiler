package lang;

import lang.ast.*;

public class MSNVisitor extends TraversingVisitor {
    public static Integer result(ASTNode n) {
        MSNVisitor v = new MSNVisitor();
        n.accept(v, 0);
        return v.msn;
    }

    private Integer msn = 0;

    public Object visit(Block node, Object data) {
        Integer current = (Integer) data;
        if (current + 1 > this.msn) {
            this.msn = current + 1;
        }
        for (int i = 0; i < node.getNumChild(); ++i) {
            node.getChild(i).accept(this, current + 1);
        }
        return data;
    }
}
