package org.example.object;

public class ObjectExam {

    // object 클래스는 모든 자바 클래스들이 상속하는 최상위 클래스입니다.

    public static void main(String[] args) throws CloneNotSupportedException {
        EmptyClass emptyClass = new EmptyClass();
        EmptyClass emptyClass2 = new EmptyClass();

        emptyClass.toString(); // 해당 클래스에 대한 설명을 문자열 타입으로 반환
        System.out.println("emptyClass2.toString() = " + emptyClass2.toString());
        System.out.println("emptyClass2 = " + emptyClass2); // toString 자동호출

        // 자바의 모든 클래스는 비교가 가능해야 하며, 비교는 해당 클래스의 속성을 기준으로 한다.
        // 동일(identity)비교와 동등(eqality)비교로 구분된다
        // equals() 메소드는 인스턴스 객체와 파라미터로 전달되는 객체가 같은지 비교
        emptyClass.equals(emptyClass2);

        // 생성 객체 식별하는 정수값 반환
        emptyClass.hashCode();

        User user = new User();
        user.setName("Edward");
        User clone = (User) user.clone();

        emptyClass.getClass();
        emptyClass.notify();
        emptyClass.notifyAll();
    }
}
