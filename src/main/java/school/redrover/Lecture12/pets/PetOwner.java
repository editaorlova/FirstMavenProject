package school.redrover.Lecture12.pets;

import school.redrover.Lecture12.pets.dogs.Chihuahua;
import school.redrover.Lecture12.pets.dogs.Dog;

public class PetOwner {

    void feed(Dog dog) {
        System.out.println("Giving" + dog.getName() + " food");
        dog.eat();
    }

    void feed(Dog dog, String text) {
        System.out.println(text);
        dog.eat();
    }

    void feed(String text, Dog dog) {
        System.out.println(text);
        dog.eat();
    }

    void feed(Chihuahua chihuahua) {
        System.out.println("Giving" + chihuahua.getName() + " expensive food ");
        chihuahua.eat();
    }
    // Это все разные методы
}
