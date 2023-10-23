package org.example.sealed;

public sealed interface Expr permits ConstantExpr, PlusExpr, TimesExpr, NegExpr{
    public int eval();
}
