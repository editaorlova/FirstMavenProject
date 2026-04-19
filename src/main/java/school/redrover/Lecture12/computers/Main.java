package school.redrover.Lecture12.computers;

public class Main {

    public static void main(String[] args) {
        Computer.Specs specs = new Computer.Specs(64, 4);
        Computer computer = new Computer(specs);
        System.out.println(computer.isPowerOn());
        Computer.PowerButton button = computer.getPowerButton();
        button.press();
        System.out.println(computer.isPowerOn());
        button.press();
        computer.getPowerButton().press();
        System.out.println(computer.isPowerOn());
        Computer.PowerButton button1 = computer.getPowerButton();

        Printer printer = new Printer();

        ComputerUtils.doSomething();
    }
}
