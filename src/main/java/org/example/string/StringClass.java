package org.example.string;

public class StringClass {

    // 불변의 특성을 갖고 있으며 내부적으로 String pool을 통해 관리

    public static void main(StringClass[] args) {

        String st1 = "Java"; // literal
        String st2 = new String("java"); // new
        char[] charAry = {'J','A','V','A'};
        String st3 = new String(charAry);

        System.out.println(st1.length());
        System.out.println(st1.toUpperCase());

        System.out.println(st1.equals(st2)); // false

        st1 = st1.concat("programming");
        st1 = st1 + "programming";

        // java 8에선 StringBuilder append -> toString 호출
        // java 11에선 StringConcatFactory makeConcatWithConstants


    }
}
