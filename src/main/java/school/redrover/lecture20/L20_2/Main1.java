package school.redrover.lecture20.L20_2;

import javax.xml.transform.Transformer;
import java.util.ArrayList;
import java.util.List;

public class Main1 {
    private String name;


    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(transform(list, element -> element + 10));
        System.out.println(transform(list, element -> element * 10));


        List<String> strings = List.of("В", "лесу", "родилась", "елочка");
        System.out.println(transform(strings, element -> element + "-" + element));
        System.out.println(transform(strings, element -> element.length()));

                List<Student> students = List.of(
                        new Student("Ivan Ivanovich"),
                        new Student("Ivan Petrovich"),
                        new Student("Semen Markovich")
                );

        System.out.println(transform(students, student -> student.getName()));

    }

    static <A, B> List<B> transform(List<A> strings, Transformer<A, B> transformer) {
        List<B> result = new ArrayList<>();
        for (A element : strings) {
            result.add(transformer.transform(element));
        }
        return result;
    }

    interface Transformer <A, B> {
        B transform(A element);
    }

    static <T> List<T> filter(List<T> list, FilterExpression<T> expression) {
        List<T> result = new ArrayList<>();
        for (T integer : list) {
            boolean isOk = expression.isOk(integer);
            if (isOk) {
                result.add(integer);
            }
        }
        return result;
    }

}

