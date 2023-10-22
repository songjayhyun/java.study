package org.example.set;

// Set 인터페이스를 구현한 컬렉션 클래스들의 가장 큰 특징은 저장하는 요소의 중복을 허용하지 않는다는 것이다
// Set 인터페이스의 구현 클래스들은 equals() 메소드를 이용해 저장 요소의 중복을 검사한다
// Set 인터페이스는 get() 메소드가 존재하지 않으므로, 전부 다 꺼내서 가져와야함
// HashSet, LinkedHashSet, TreeSet 등이 있다.

import org.example.stream.Customer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetClass {

    public static void main(String[] args) {
        Set set = new HashSet<>();

        Customer kim = new Customer("kim", 10);
        Customer song = new Customer("song", 20);

        set.add(kim);
        set.add(new Customer("kim",10));
        set.add(song);

        System.out.println("set.size() = " + set.size());

        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Customer next = (Customer)iterator.next();
            System.out.println("next = " + next);
        }

        set.stream().forEach(customer -> System.out.println("customer = " + customer));
    }
}
