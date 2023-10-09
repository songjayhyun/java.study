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


    // Static Method -> Static Field -> ok
    // Instance Method -> Static Field -> ok
    // Static Method -> Instance Field -> X, 인스턴스 필드는 객체 생성 시점이기 때문에 없을 수도 있다.
    // Instance Method -> Instance Field -> ok

    private static String staticMsg = "Static Msg";
    private String instanceMsg;

    public StaticExam(String instanceMsg) {
        this.instanceMsg = instanceMsg;
    }

    public void showInstanceMsg() {
        System.out.println("instanceMsg = " + instanceMsg);
        System.out.println("staticMsg = " + staticMsg);
        StaticExam.showStaticMsg();
    }

    public static void showStaticMsg() {
        System.out.println("staticMsg = " + staticMsg);
        // System.out.println("instanceMsg = " + instanceMsg);
        // showInstanceMsg();
        // StaticExam.showInstanceMsg();
    }
}
