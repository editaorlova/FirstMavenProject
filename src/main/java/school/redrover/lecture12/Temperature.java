package school.redrover.lecture12;

public record Temperature(int degrees, String scale) {

    public static final  int TOO_COLD = 0;

    public boolean issTooCold() { //метод спокойно можем добавить, переменные - нет, только статические поля
        return degrees < TOO_COLD;
    }
}


