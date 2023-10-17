package org.example.lambda;

public class LambdaExam {

    public static void main(String[] args) {
        FunctionalInterfaceClass f = (int a, int b) -> a + b;
        f.testMethod(5,3);
    }

    // Predicate<T>,  Consumer<T>, Function<T,R>, Supplier<T>
    // test(),        accpet(),    apply(),       get()
    // True or False  void         type           only return value

    int max(int a, int b) {
        return a+b;
    }

    //(int a, int b ) -> { return a > b ? a : b;} == new Obejct { int max() ~ }
    //(int a, int b) -> a > b ? a : b
    // (a,b) -> a > b? a : b

    int sqaure(int x ) {
        return x * x;
    }

    // (int x) -> { return x * x; }
    // x -> x *

    int roll() {
        return (int) (Math.random() * 6);
    }

    // () -> (int) (Math.random() * 6)
}
