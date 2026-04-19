package school.redrover.Lecture12.pets.dogs;

public class Main {

    static void main() {
        Husky husky = new Husky("AAA");
        System.out.println(husky.getBreed());
        husky.behaveFoolishly();
        husky.voice();
    }
}
