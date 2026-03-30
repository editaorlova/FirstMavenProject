package school.redrover.Lecture18;

public class Grade {
    private final int grade;

    public Grade(int grade) throws IllegalArgumentException {
        if (grade >= 1 && grade <= 5) {
            this.grade = grade;
        } else {
            throw new IllegalArgumentException("Grade must be between 1 and 5, was: " + grade);
        }

    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "grade=" + grade +
                '}';
    }
}
