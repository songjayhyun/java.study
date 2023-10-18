package org.example.optional;

import java.util.Optional;

public class OptionalClass {

    // null 대신 쓰고자 한다
    // isPresent는 결국 null 사용할 때 유사한 구조
    // 대신 map, flatMap, filter, orElse, or, ifPresent 등 익숙해지기

    // of, ofNullable, empty

    Optional<String> opt = Optional.of("value"); // null이 아닌값

    Optional<String> opt2 = Optional.ofNullable("somevalue"); // null 가능

    Optional<String> opt3 = Optional.empty(); // 빈 값

    // get
    Optional<String> opt4 = Optional.of("value");
    String str = opt4.get(); // 값이 없다면 exception

    // isPresent, isEmpty, ifPresent, ifPresentOrElse
    opt4.isPresent(); // 값의 존재 여부 확인

    private String getValue() {
        return "";
    }

//    String value = getValue();
//    if (value != null) {
//        doSome(value);
//    }

    Optional<String> present = getValue();
    present.ifPresent(value -> doSome(value));

    // orElse, orElseGet,or
    Optional<String> opt = getValue();
    String result1 = opt.orElse("default"); // 값이 없으면 값 리턴
    String result2 = opt.orElseGet(()->"default"); // 값이 없으면 함수 리턴
    Optional<String> result3 = opt.or(()->Optional.of("default")); // optional 리턴

    // orElseThrow

    // map, flatMap(Optional 감싸서 반환)
    Optional<Integer> pdOpt2 =
            memOpt.map(mem -> mem.getBirthday())
                    .map(birth -> cal(birth));

    // filter
    pdOpt.filter(str -> str.length() > 3)
            .ifPresent(str -> System.out.println())

    // 두 개의 Optional
    Optional<Member> memOpt;
    Optional<Company> comOpt = memOpt.map(mem -> getCompany(mem));
    Optional<Card> card = memOpt.flatMap(
            mem -> comOpt.map(comp -> createCard(mem,comp))
    );

}
