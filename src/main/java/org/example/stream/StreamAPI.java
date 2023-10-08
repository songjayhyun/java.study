package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

    List<String> list = Arrays.asList("Lee", "Park", "Kim");

    // 기존
    Iterator<String> it = list.iterator();
    while (it.hasNext()) {
        System.out.println("name = " + it.next());
    }

    // Stream 활용
    list.stream().forEach(name -> System.out.println("list = " + name));


    // 한번 생성한 스트림은 재사용 불가
    Stream<String> stream = list.stream(); // Stream 생성
    System.out.println(stream.count()); // Stream 사용
    stream.forEach(System.out::println); // Exception 발생


    // Stream.Builder를 이용한 Stream 객체 생성
    Stream.Builder<String> builder = Stream.builder();
    builder.accept("Kim");
    builder.accept("Lee");
    builder.accept("Song");
    builder.accept("Park");
    builder.accept("Lee");
    Stream<String> stream = builder.build();
    stream.forEach(System.out::println);


    // filtering
    List<Customer> customers = new ArrayList<>();
    customers.add(new Customer("Kim", 33));
    customers.add(new Customer("Park", 21));
    customers.add(new Customer("Song", 45));
    customers.add(new Customer("Lee", 67));
    customers.add(new Customer("Choi", 19));
    customers.add(new Customer("Kim", 33)); // ÓÔ ðW·

    Stream<Customer> stream1 = customers.stream();
    stream1.filter( customer -> customer.getAge() > 30)
            .forEach(System.out::println);

    Stream<Customer> stream2 = customers.stream();
    stream2.filter( customer -> customer.getAge() > 30)
            .distinct()
            .forEach(System.out::println);


    // sort
    List<Customer> customers = new ArrayList<>();
    customers.add(new Customer("Kim", 33));
    customers.add(new Customer("Park", 21));
    customers.add(new Customer("Song", 45));
    customers.add(new Customer("Lee", 67));
    customers.add(new Customer("Choi", 19));

    customers.stream()
            .sorted()
            .forEach(System.out::println);

    customers.stream()
            .sorted(Comparator.comparing(Customer::getName)).forEach(System.out::println);


    // mapping
    List<String> names = customers.stream()
            .map(Customer::getName)
            .collect(Collectors.toList());

    names.stream().forEach(System.out::println);

    customers.stream()
            .map(Customer::getName)
            .forEach(System.out::println);
}
