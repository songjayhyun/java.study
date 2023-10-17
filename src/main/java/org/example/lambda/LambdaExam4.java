package org.example.lambda;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class LambdaExam4 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i= 0; i<=10; i++) {
            list.add(i);
        }

        // list의 모든 요소 출력
        list.forEach(i -> System.out.println("i = " + i));

        // list에서 2 또는 3의 배수 제거
        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        list.stream().filter(x -> x % 2 != 0 || x % 3 != 0).collect(Collectors.toCollection(ArrayList::new)).forEach(System.out::println);

        // 하나의 메서드만 호출하는 람다식은 클래스이름::메서드이름 또는 참조변수::메서드이름으로 바꿀 수 있다.
        BiFunction<String, String, Boolean> f = (s1,s2) -> s1.equals(s2);
        BiFunction<String, String, Boolean> f2 = String::equals;
    }
}
