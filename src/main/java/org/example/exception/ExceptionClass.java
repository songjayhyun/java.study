package org.example.exception;

public class ExceptionClass {

    // 예외 클래스 최상 클래스는 Throwable 클래스이다.
    // Throwable 하위 클래스로는 Exception과 Error 클래스가 있다.

    public static class ErrorClass {
        // 이를 상속한 클래스들은 매우 심각한 오류를 나타낸다.
        // 자바 프로그램 외에서 발생했음으로 핸들링 불가
        // 핸들링 가능 -> Exception
    }

    public static class RuntimeException {
        // Exception 클래스와 달리 try~catch, throws 불필요
        // 계열 클래스를 Unchecked Exception, 그 밖에를 Checked Exception
    }

    // try - catch
    // try 영역은 예외가 발생할 수 있는 영역을 감싸고, catch는 발생한 예외를 처리한다

    // ArrayIndexOutOfBoundsException: 배열 접근 시 잘못된 인덱스 접근
    // ClassCastException: 허용불가 형변환
    // NullPointerException: 참조 변수가 NULL인 경우

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 3;

        try {
            System.out.println(" = " + num1/num2);
        } catch (ArithmeticException e){
            System.out.println("e.getMessage() = " + e.getMessage());
        } catch (NullPointerException e) {
            // 여러 개의 catch문 활용 가능
            System.out.println("e.getMessage() = " + e.getMessage());
        } finally {
            // 예외발생 상관없이 항상 실행
            System.out.println("ExceptionClass.main");
        }
    }
}


