package school.redrover.Lecture22;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {

        List<Integer> ints = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Stream<Integer> r = ints //List<Integer>
                .stream() //Stream<Integer>
                .limit(6)
                .peek(x -> System.out.println("Looking at " + x))
                .filter(x -> x < 5) //Stream<Integer>
                .map( x -> x + 10) //Stream<Integer>
                .filter( x -> x % 2 == 0);
//              .forEach(x -> System.out.println(x))

//        .toList(); // List
        System.out.println(r.toList());

        List<String> values = List.of("10", "20", "abc", "30");
        int sum = values.stream() //Stream<String>
                .filter(s -> s.matches("\\d+")) //Stream<String>
                .map(s -> Integer.parseInt(s)) //Stream<Integer>
                .mapToInt(i -> i.intValue()) //IntStream
                .sum();
        System.out.println(sum);

        Map<String, List<Integer>> collect = ints //List<Integer>
                .stream() //Stream<Integer>
                .collect(Collectors.groupingBy(
                        n -> n % 2 == 0 ? "even" : "odd"
                ));
        System.out.println(collect);

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";

        Map<Character, List<String>> map = Arrays.stream(text.split(" "))
                .map(word -> word.toLowerCase())
                .filter(word -> word.length() < 5)
                .collect(Collectors.groupingBy(
                        word -> word.charAt(0)
                ));
        System.out.println(map);

        List<List<String>> nested = List.of(
                List.of("a", "b"),
                List.of("c", "d"),
                List.of("e")
        );
        System.out.println(nested);

        System.out.println(nested.stream()
                .flatMap(list -> list.stream())
                .toList());

        List<List<Integer>> nested1 = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5)
        );
        System.out.println(nested1);

        System.out.println(nested1.stream()
                .flatMap(list -> list.stream())
                .filter(integer -> integer % 2 == 0)
                .toList());

        List<Integer> ints1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -123);

        System.out.println(ints1.stream().anyMatch(i -> i < 0));

        System.out.println(ints1.stream().filter(i -> i < 0).findFirst());

        List<Person> people = List.of(
                new Person("Alice", 30, "New York"),
                new Person("Bob", 22, "San Francisco"),
                new Person("Charlie", 25, "New York"),
                new Person("Diana", 28, "Boston"),
                new Person("Eve", 35, "San Francisco")
        );

        System.out.println(
                people.stream() //Stream<Person>
                        .filter(x -> x.getCity().equals("New York")) //STream<Person>
                        .map(x -> x.getName()) //Stream<String>
                        .map(name -> name.toUpperCase())
                        .toList()
        );

        System.out.println(
                people.stream()
                        .filter(x -> x.getCity().equals("San Francisco"))
                        .count()
        );

        System.out.println(
                people.stream() //Stream<Person>
                        .collect(Collectors.groupingBy(person -> person.getCity()))
        );

        System.out.println( // Each name in the list
                people.stream()
                        .map( person -> person.getCity())
                        .distinct()
                        .collect(Collectors.joining(", "))
        );

        System.out.println(
                people.stream() //Stream<Person>
                        .collect(Collectors.partitioningBy( //split list
                                person -> person.getAge() < 30
                        ))
                        .get(false)
        );


        Stream<Integer> numbers = Stream.iterate(0, i -> i + 1) //Create unlimited list of datas
                .peek(i -> System.out.println(i))
                .filter(i -> i % 2 == 0)
//                .skip(10)
                .limit(20);
        System.out.println(numbers.toList());

        Stream<Integer> numbers1 = Stream.iterate(0, i -> i + 1) //Create unlimited list of datas
                .filter(i -> i % 2 == 0)
                        .takeWhile(i -> i < 100);
        System.out.println(numbers1.toList());

        List<String> words = List.of(
                "When", "I", "find", "myself", "in", "times", "of", "trouble,",
                "Mother", "Mary", "comes", "to", "me"
        );

        words.stream()
                .flatMap(word -> CharBuffer.wrap(word.toCharArray()).chars().mapToObj(ch -> (char) ch))
                .forEach(c -> System.out.println(c));
    }
}
