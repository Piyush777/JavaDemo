package org.ust.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamIntro {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        System.out.println("Lambda using For Each(Consumer Operation)");
        //lambda with forEach, and Demo for Consumer
        names.forEach(name-> System.out.println(name));

        System.out.println("Stream filter names start with A");
        //Stream with filter
        List<String> result = names.stream()
                .filter(name->name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(result);

        System.out.println("Filtering Even Numbers");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("Another consumer Method");
        numbers.forEach(num->{
            num*=10;
            System.out.println(num);
        });
        List<Integer> evenNumbers = numbers.stream().
                                    filter(n->n%2==0)
                               .collect(Collectors.toUnmodifiableList());
        System.out.println(evenNumbers);

        //Predicate Demo for Complex Conditions
        Predicate<Integer> isEven = n->n%2==0;
        Predicate<Integer> isGreaterThan4 = n-> n>4;
        System.out.println("Complex Filter using Multiple Predicates");
        System.out.println("Printing Even and >4");
        List<Integer> evenGreaterThan4 = numbers.stream()
                                        .filter(isEven.and(isGreaterThan4))
                                        .collect(Collectors.toUnmodifiableList());
        System.out.println(evenGreaterThan4);

        System.out.println("Printing Either Even Or >4");
        List<Integer> evenOrGreaterThan4 = numbers.stream()
                                           .filter(isEven.or(isGreaterThan4))
                                            .collect(Collectors.toUnmodifiableList());

        System.out.println(evenOrGreaterThan4);


        List<String> upperCaseNames = names.stream()
                                      .map(name->name.toUpperCase())
                                     .collect(Collectors.toUnmodifiableList());
        System.out.println(upperCaseNames);

        //sort names by length
        System.out.println("Sort Names by Length");
        names.sort((a,b)->(Integer.compare(a.length(),b.length())));
        System.out.println(names);


        System.out.println("Threads using Lambda");
        //creating a new thread using lambda
        Thread thread = new Thread(()-> System.out.println("Thread is running"));
        thread.start();

        System.out.println("Supplier Demo using Math.random");
        //Supplier using Random
        Supplier<Double> randomValue = ()->Math.random();
        System.out.println(randomValue.get());

        System.out.println("Using Mapper and Reducer with Identity");
        int sum  = numbers.stream()
                   .map(n->n*10)
                  .reduce(0,(a,b)->a+b);
        System.out.println(sum);

    }
}
