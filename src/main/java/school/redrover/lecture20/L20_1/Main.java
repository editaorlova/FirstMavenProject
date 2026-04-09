package school.redrover.lecture20.L20_1;

import java.util.ArrayList;
import java.util.List;

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
//        System.out.println(filter(list, new IsEven()));

        System.out.println(filter(list, element -> element % 2 != 0));

        System.out.println(filter(list, i -> i > 5));

        List<String> strings = List.of("В", "лесу", "родилась", "елочка");
        System.out.println(filter(strings, a -> a.length() > 5));

        school.redrover.lecture20.L20_2.FilterExpression<String> startsWithR = element -> element.startsWith("р");

        System.out.println(filter(strings, startsWithR));
        System.out.println(filter(List.of("Я", "памятник", "себе", "воздвиг", "рукотворный"), startsWithR));
        System.out.println(filter(strings, s -> s.length() < 5));

        System.out.println(filter(
                List.of(
                        new school.redrover.lecture20.L20_2.Student("Ivan Ivanovich"),
                        new school.redrover.lecture20.L20_2.Student("Ivan Petrovich"),
                        new school.redrover.lecture20.L20_2.Student("Semen Markovich")
                ),
                student -> student.getName().startsWith("Ivan")
        ));
    }



    static <T> List<T> filter(List<T> list, school.redrover.lecture20.L20_2.FilterExpression<T> expression) {
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

interface FilterExpression <T> {
    boolean isOk(T element);
}

class Student {
    private final String name;

    Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name= '" + name + '\'' +
                '}';
    }
}
