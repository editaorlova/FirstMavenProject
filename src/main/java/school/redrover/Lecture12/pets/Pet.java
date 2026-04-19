package school.redrover.Lecture12.pets;

public abstract class Pet {
    private final String name;

    public Pet (String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }
}
