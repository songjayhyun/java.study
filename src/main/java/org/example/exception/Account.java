package org.example.exception;

public class Account {
    private int balance;
    public Account(int money) {
        this.balance = money;
    }

    public int withdraw(int money) {
        if (balance < money) {
            System.out.println("잔액 부족");
        } else {
            balance -= money;
        }
        return money;
    }

    public int newWithdraw(int money) throws OverDraftException { // 호출 한 곳에서 exception 하도록 던지기
        if (balance < money) {
            throw new OverDraftException("잔액이 부족합니다.");
            // JVM에게 예외가 발생했음을 알림
        } else {
            balance -= money;
        }
        return money;
    }

}
