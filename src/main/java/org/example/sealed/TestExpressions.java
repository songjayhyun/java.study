package org.example.sealed;

public class TestExpressions {
    public static void main(String[] args) {
        System.out.println(
                new TimesExpr(
                        new PlusExpr(new ConstantExpr(6), new ConstantExpr(7)),
                        new NegExpr(new ConstantExpr(8))
                ).eval());
    }
}
