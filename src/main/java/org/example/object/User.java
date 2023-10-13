package org.example.object;

public class User implements Cloneable{

    // clone()메소드는 인스턴스 객체의 복제를 위한 메소드로, 해당 인스턴스 객체를 복사하여 참조값을 반환한다
    // 클래스의 복제를 가능하기 위해선 Cloneable 인터페이스를 재정의해야합니다.
    // 재정의하지 않은 클래스를 clone하면 CloneNotSupportedException 예외가 발생합니다.

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
