package school.redrover.lecture12.pets.dogs;

public class Chihuahua extends Dog{

    private String name;

    public Chihuahua(String name) {
        super(name);
    }

    public String getBreed() {
        return "Chihuahua";
    }

    public String getWhatISay() {
        return "Yap-yap" + getName();
    }
}
