package org.example.lambda;

import java.util.function.Predicate;

public class PredicateClassExam {

    public static void main(String[] args) {
        Predicate<String> isEmptyStr = s -> s.length() == 0;
        String s = "";

        if (isEmptyStr.test(s))
        {
            System.out.println("PredicateClassExam.main");
        }
    }
}
