package org.example.generic;

public class GenericClass {

    // generic은 java 5에서 추가된 기능으로 특히 객체를 수집, 관리하는 컬렉션 이용 시 사용
    // 제네릭을 사용하면 데이터 저장하는 시점에 어떤 데이터를 저장할 건지 명시할 수 있다.
    // 사용하고자 하는 데이터 타칩을 명확히 선언할 수 있고, 정확한 데이터의 사용 여부를 컴파일 시점에 확정 지을 수 있다.


    public static void main(String[] args) {
        Box box = new Box(new Apple());
        Apple apple = (Apple)box.getItem();
        System.out.println("apple = " + apple);

        NewBox<Apple> appleNewBox = new NewBox<>(new Apple()); // 잘못 들어가면 컴파일 에러
        Apple item = appleNewBox.getItem(); // 형변환 필요 없음
        System.out.println("item = " + item);

        // Object 클래스는 최상위 클래스로서 Java의 모든 클래스를 참조할 수 있다.
        // 모든 클래스를 참조할 수 있다는 것은 분명 편하지만 오류를 범할 가능성도 많다.
        // 예를 들어, Object 배열에 다양한 객체의 참조를 넣었을 때,
        // 객체의 구분없이 배열에 담을 수 있다는 것은 담을 때 편리성은 있지만 꺼낼 때는 문제가 발생한다.
        Object[] objects = new Object[3];
        objects[0] = Integer.valueOf(10);
        objects[1] = new String("java");
        objects[2] = Double.valueOf("3.14");

        NewBox<Fruit> fruitNewBox = new NewBox<Apple>(new Apple()); // 타입변수끼리 상속 관계여도 에러가 난다
        NewBox<Fruit> fruitNewBox1 = new NewBox<>();
        fruitNewBox1.add(new Fruit());
        fruitNewBox1.add(new Apple()); // 가능
        fruitNewBox1.add(new Toy()); // Fruit 상속 받은 클래스가 아니어서 불가능
    }
}
