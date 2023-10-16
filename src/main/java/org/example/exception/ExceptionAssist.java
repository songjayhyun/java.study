package org.example.exception;

public class ExceptionAssist {

    public static void main(String[] args) {

        Account account = new Account(10000);
        int withdraw = account.withdraw(11000);
        System.out.println("withdraw = " + withdraw);

        Account account1 = new Account(20000);
        int withdraw2 = 0;
        try {
            withdraw2 = account1.newWithdraw(30000);
        } catch (OverDraftException e) {
            throw new RuntimeException(e);
        }
        System.out.println("withdraw2 = " + withdraw2);
    }
}
