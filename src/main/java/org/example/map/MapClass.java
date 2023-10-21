package org.example.map;

import org.example.stream.Customer;

import java.util.*;

public class MapClass {
    // 내부에 Entry 인터페이스를 가지며, key와 value를 가지고 있다
    // Collection 인터페이스를 상속하지 않는다
    // HashMap, LinkedHashMap, TreeMap

    public static void main(String[] args) {
        HashMap<String, Customer> map = new HashMap<>(); // value는 중복 가능, 순서 보장하지 않음

        Customer kim = new Customer("kim", 10);
        map.put(kim.getName(), kim);
        System.out.println("kim = " + kim);

        // iterator를 사용하여 호출
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("kim", 10));
        list.add(new Customer("sang", 20));
        Iterator<Customer> iterator = list.iterator();
        while(iterator.hasNext()) {
            Customer next = iterator.next();
        }

        Collection<Customer> values = map.values();
        Iterator<Customer> iterator1 = values.iterator();
        while(iterator1.hasNext()) {
            Customer next = iterator1.next();
        }

        // 우리가 배웠던 stream api 이용
        map.values().stream().forEach(customer -> System.out.println("customer = " + customer));
    }
}
