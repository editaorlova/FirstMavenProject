package school.redrover.Lecture22;

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

        System.out.println(nested.stream().flatMap(list -> list.stream()).toList());
    }
}
