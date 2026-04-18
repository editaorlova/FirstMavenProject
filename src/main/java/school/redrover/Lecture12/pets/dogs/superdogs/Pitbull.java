package school.redrover.Lecture12.pets.dogs.superdogs;

import school.redrover.Lecture12.pets.dogs.Dog;

public class Pitbull extends Dog {

    public Pitbull(String name) {
        super(name);

        getBreed();// потому что protected - доступ вне пакета есть для дочернего класса
    }

    @Override
    protected String getBreed() {
        return "Pitbull";
    }

}
