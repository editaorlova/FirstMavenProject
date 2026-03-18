import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String name;
    private final List<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, List<Integer> grades) {
        this(name);
        this.grades.addAll(grades);
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {

        if (grades.isEmpty()) return 0;

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum * 1.0 / grades.size();
    }

    public List<Integer> getGrades() {

//      return List.copyOf(grades); //возвращаем его имьютебл копию
        return new ArrayList<>(grades);
    }

    public static void main(String[] args) {
        Student bob = new Student("Bob", List.of(5, 3, 5, 5));
        Student alice = new Student("Alice", List.of(4, 4, 5, 5));
        Student julie = new Student("Julie", List.of(3, 5, 3, 3));

        System.out.println(bob.getGradeAverage());
        List<Integer> grades = bob.getGrades();
        grades.clear();
        System.out.println(bob.getGradeAverage());
        System.out.println(grades);
        System.out.println(bob.getGrades());

    }
}
