package org.example.sealed;

public final class ConstantExpr implements Expr{
    private int i;

    public ConstantExpr(int i) {
        this.i = i;
    }

    public int eval() {
        return i;
    }
}
