package org.example.sealed;

public final class PlusExpr implements Expr{
    Expr a,b;

    public PlusExpr(Expr a, Expr b) {
        this.a = a;
        this.b = b;
    }

    public int eval() {
        return a.eval() + b.eval();
    }
}
