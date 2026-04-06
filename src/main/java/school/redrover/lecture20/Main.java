package school.redrover.lecture20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;

public class Main {
    private String name;

//    public static void main(String[] args) {
//        Integer[] integers = new Integer[] {1, 2, 3, 4, 5};
//        swap(integers, 0, 4);
//        System.out.println(Arrays.toString(integers));
//
//        String[] strings = new String[] {"a", "b", "c", "d", "e", "f"};
//        swap(strings, 0, 4);
//        System.out.println(Arrays.toString(strings));
//
//        Student[] students = new Student[] {
//                new Student("Ivan"),
//                new Student("Petr"),
//                new Student("Nikolaj")
//        };
//        swap(students, 0, 2);
//        System.out.println(Arrays.toString(students));
//    }
//
//    static <T> void swap(T[] array, int i, int j) {
//        T temp = array[i];
//        array[i] = array[j];
//        array[j] = temp;
//    }


    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(filter(list, new IsEven()));
        System.out.println(filter(list, new IsGreaterThan5()));

    }

    static List<Integer> filter(List<Integer> list, FilterExpression expression) {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : list) {
            boolean isOk = expression.isOk(integer);
            if (isOk) {
                result.add(integer);
            }
        }
        return result;
    }

}

interface FilterExpression {
    boolean isOk(Integer integer);
}

class IsEven implements FilterExpression {
    public boolean isOk(Integer integer) {
        return integer % 2 == 0;
    }
}

class IsGreaterThan5 implements FilterExpression {
    public boolean isOk(Integer integer) {
        return integer > 5;
    }
}

class Student {
    private final String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name= '" + name + '\'' +
                '}';
    }
}
