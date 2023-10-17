package org.example.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaClass {

    // 메소드로 전달할 수 있는 익명 함수

    // ()     ->   { ... }
    // 파라미터      실행문

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("hello");
        list.add("find");
        
        for (String str : list) {
            System.out.println("str = " + str);
        }

        // parameter type이 예측가능하면 생략 가능
        list.stream().forEach( str -> System.out.println("str = " + str));

        list.stream().forEach( (str1, st2) -> System.out.println("str = " + str1 + st2));



    }
}
