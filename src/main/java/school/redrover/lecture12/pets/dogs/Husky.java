package school.redrover.lecture12.pets.dogs;

public class Husky extends Dog {

    public Husky(String name) {
        super(name);// 1й строкой вызывается обязательно родительский конструктор
        // потом остальная инициализация, которая есть конкретно для хаски
    }

    @Override
    protected String getBreed() {
        return "Husky";
    }

    @Override
    public String getWhatISay() {
        return "AAAAAAAAAAAAAA";
    }

    public void behaveFoolishly() {
        System.out.println("I'm a big dummy");
    }
}