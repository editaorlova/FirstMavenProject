package school.redrover.Lecture20.L20_2;

public class Student {
    private final String name;

    public Student(String name) {
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
