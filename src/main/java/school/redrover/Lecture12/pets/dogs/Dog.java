package school.redrover.Lecture12.pets.dogs;

import school.redrover.Lecture12.pets.Pet;

public abstract class Dog extends Pet {

    public Dog(String name) {
        super(name);
//        System.out.println("A new dog is created, its name is " + name);
    }

    public void eat() {
        System.out.println(getName() + "is eating");
    }
    public void voice() {
        System.out.println(getName() + " says: " + getWhatISay() + "!");
    }

    String getTag() {
        return  "I'm a " + getBreed() + ", my name is " + getName();
    }

    protected abstract String getBreed();

    public String getWhatISay() {
        return "Bow-Bow";
    }

    @Override
    public String toString() {
        return getBreed() + " " + getName();
    }
}
