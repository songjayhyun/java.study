package org.example.sealed;

public final class NegExpr implements Expr{
    Expr e;

    public NegExpr(Expr e) {
        this.e = e;
    }

    public int eval() {
        return -e.eval();
    }
}
