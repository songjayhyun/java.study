package org.example.staticandfinal;

public class FinalExam {

    // final 키워드는 클래스, 필드, 메소드, 지역변수, 파라미터에 적용
    // 클래스에 final은 상속을 허용하지 않으며 overriding 금지
    // final를 적용하고 초기화하면 다른 값으로 변경 불가
    // 초기화 무조건 해주어야 함

    private final String msg;

    public FinalExam(String msg) {
        this.msg = msg;
    }

    public final void showMsg() {
        System.out.println("msg = " + msg);
    }

    public void showMsg(final String msg) {
        // msg = "New Msg";
        // Cannot assign a value to final variable 'msg'
        System.out.println("msg = " + msg);
    }
}
