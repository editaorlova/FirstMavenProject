import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Lecture 12 -----------------------
//            Temperature zero = new Temperature(0,"C");
//            System.out.println(zero);
//        System.out.println(zero.degrees());
//        System.out.println(zero.scale());
//        System.out.println(zero.equals(new Temperature(0, "C")));
//        System.out.println(zero.equals(zero == new Temperature(0, "C")));
//        System.out.println(zero.issTooCold());
//
//        System.out.println(StringUtils.abbreviate("This is our lecture", 8));

//        // Lecture 14--------------------------------

//        String[] strings = new String[] {"one", "two", "three"};

//        List<String> list = List.of("one", "two", "three"); //аналог массива, неизменяемый список
//        System.out.println(list.get(0));

//       String longestString = "";
//        for(String s: list) {
//            if (s.length() > longestString.length()) {
//                longestString = s;
//            }
//        }
//        System.out.println(longestString);

//        List<Integer> integers = List.of(1, 2, 3); // в <> - класс, а не примитивный тип, пример
        //-------------------------------------
        String[] strings = new String[] {"one", "two", "three"};

//        List<String> list = new ArrayList<>(); //изменяемый список
//        list.add("one");
//        list.add("two");
//        list.add("three");

        List<String> list = new ArrayList<>(List.of("one", "two", "three")); //изменяемый список, но не такой элегантный, как выше :)

        System.out.println(list);
        list.add("four");
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove("one");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        list.addAll(List.of("five","six", "seven", "eight","nine"));
        System.out.println(list);

        System.out.println(list.size());
        list.add("six");
        list.add("six");
        list.add(0,"six");
        list.add("six");
        list.add("six");
        System.out.println(list);

        System.out.println(list.reversed());
        System.out.println(list);
        //------------------------

        System.out.println(findEven(List.of(1,2,3,4,5)));

        //список списков - неизменяемый (важно просто чтобы все элементы внешнего списка были одного типа)
        List<List<Integer>> list1 = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6, 12),
                List.of(7, 8)
        );
        System.out.println(list1);

        //Iterator - перебор элементов списка определенным образом

//        List<Integer> list2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
////        Iterator<Integer> iterator = list2.iterator(); // привязан к списку ↑
//
//        Iterator<Integer> iterator = new RandomIterator(100); //привязан к другой концепции
//
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            System.out.println("==>" + next);
//        }

        //-------------------------------
        //Set - множество. Разница с list - в set не может быть дубликатов + множество set не хранит порядок

        Set<Integer> ints = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        /*1*/

//        Iterator<Integer> iterator1 = ints.iterator();
//
//        while (iterator1.hasNext()) {
//            int next = iterator1.next();
//            System.out.println("==>" + next);
//        }

        /*2*/

//        for (int i: ints) {
//            System.out.println("--> " + i);
//        }

        System.out.println(ints);
        ints.add(11);
        System.out.println(ints);
        ints.add(11);
        System.out.println(ints);
        ints.add(11);
        System.out.println(ints);

        Set<String> set = new HashSet<>(Set.of(
                "one", "two", "three", "four"
        ));
        System.out.println(set);

        //Set + record---------------------
        Set<Grade> grades = new HashSet<>();
        grades.add(new Grade(5));
        grades.add(new Grade(5));
        grades.add(new Grade(5));
        grades.add(new Grade(5));
        grades.add(new Grade(5));
        grades.add(new Grade(5));
        grades.add(new Grade(5));
        System.out.println(grades);

        //------------------------------
//        Map<String, String> phoneBook = new HashMap<>(); // Коллекция Map, как и Set, не сохраняет порядка
//        phoneBook.put("John","123-567-3322");
//        phoneBook.put("George","123-567-3322");
//        phoneBook.put("Paul","123-567-3322");
//        phoneBook.put("Ringo","123-567-3322");
//        System.out.println(phoneBook);
//        phoneBook.put("John","943-566-7777");
//        System.out.println(phoneBook);
//
//        System.out.println(phoneBook.get("John"));
//        System.out.println(phoneBook.get("XXX"));
//        System.out.println(phoneBook.getOrDefault("John", "No such record"));
//        System.out.println(phoneBook.getOrDefault("XXX", "No such record"));

        // Как часто встречаются все буквы в какой-то строке

         String string = "В лесу родилась елочка, в лесу она росла";
         Map<Character, Integer> map = new HashMap<>();
         for (char c : string.toLowerCase().toCharArray()) {
//            if (map.containsKey(c)) {
//                int count = map.get(c);
//                count++;
//                map.put(c, count);
//            }else{
//                map.put(c, 1);
//            }
             map.put(c, map.getOrDefault(c, 0) + 1);
         }

        System.out.println(map);

        System.out.println(map.keySet()); //уникальный список всех букв
        System.out.println(map.values()); //все значения

        //------------------------------
        Queue<String> queue = new LinkedList<>(); //Типы списка, родственные списку

        queue.add("Alice");
        queue.add("Bob");
        queue.add("Carol");

        System.out.println(queue);

//        while (!queue.isEmpty()) {
//           String customer = queue.poll();
//            System.out.println(customer);
//        }
//
//        System.out.println(queue.poll());

        System.out.println(queue.poll()); //FIFO - удаляет и возвращает значение из головы списка
        System.out.println(queue.poll());

        System.out.println(queue);

        queue.add("Dave");
        System.out.println(queue);

        //-----------------------
        Deque<String> deque = new ArrayDeque<>();
        deque.addLast("Alice");
        deque.addLast("Bob");
        deque.addLast("Carol");

        System.out.println(deque);

        deque.addFirst("Dave");
        System.out.println(deque);

        System.out.println(deque.pollFirst()); //удаление из головы очереди
        System.out.println(deque);
        System.out.println(deque.pollLast()); // удаление из хваста очереди
        System.out.println(deque);

        System.out.println(deque.peekFirst()); //подсмотреть в очереди
        System.out.println(deque.peekLast());
        System.out.println(deque);

        //-----------------------------
        List<String> list2 = List.of("a", "b", "c", "d");
        for (String s : list2) {
            System.out.println(s);
        }

        String[] list3 = {"a", "b", "c", "d"};
        for (String s : list3) {
            System.out.println(s);
        }




    }




    //function findEven
    static List<Integer> findEven(List<Integer> list){
        List<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 == 0) {
                result.add(i);
            }
        }
        return result;
    }

    record Grade(int grade) {}
}
