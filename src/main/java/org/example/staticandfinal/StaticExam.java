package org.example.staticandfinal;

public class StaticExam {

    // static 키워드가 적용된 필드를 정적 필드 혹은 클래스 변수라고 한다.
    // 정적 필드는 해당클래스의 모든 인스턴스 객체들이 공유하는 변수이며, 이런 의미가 바로 클래스 변수이다.
    // 정적 필드는 객체 인스턴스화 없이 클래스 이름으로 정적 필드에 접근 가능

    private static String msg;

    static {
        msg = "Public msg";
    }

    public static void showMsg() {
        System.out.println(msg);
    }
}
