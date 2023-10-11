package org.example.string;


// 문자열 변경엔 메모리 비용이 든다
public class StringBuilderClass {
    
    // StringBuffer StringBuilder는 동기화 특성을 제외하고 모든 메소드 기능이 동일
    // 가변의 특성을 가지고 있음

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("JAVA");
        System.out.println("sb. = " + sb.capacity());
        sb.append("programming");

        String string = sb.toString();
    }
}
