package org.example.sealed;

public final class TimesExpr implements Expr{
    Expr a,b;

    public TimesExpr(Expr a, Expr b) {
        this.a = a;
        this.b = b;
    }

    public int eval() {
        return a.eval() * b.eval();
    }
}
