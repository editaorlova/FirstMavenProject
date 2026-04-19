package school.redrover.Lecture12.pets;


import school.redrover.Lecture12.pets.dogs.Chihuahua;
import school.redrover.Lecture12.pets.dogs.Dog;
import school.redrover.Lecture12.pets.dogs.GermanShepherd;
import school.redrover.Lecture12.pets.dogs.Husky;

/*
FQN = Fully Qualified Name
school.redrover.lecture12.pets.Main
 */

public class Main {
    public static void main() {

        GermanShepherd muhtar = new GermanShepherd("Muhtar");
//        muhtar.voice();
//        System.out.println(muhtar.getTag());
//        System.out.println(muhtar.getWhatISay());

        Chihuahua killer = new Chihuahua("Killer");
//        killer.voice();
//        System.out.println(killer.getTag());
//        System.out.println(killer.getWhatISay());


        Husky snezhok = new Husky("Snezhok");
        snezhok.behaveFoolishly();
//        snezhok.getTag();
//        System.out.println(snezhok.getWhatISay());

        Dog m1 = snezhok;
        //---------------
//        m1.getBreed();
        m1.voice();

        Dog[] dogs = new Dog[] { muhtar, killer, snezhok };
        for (int i = 0; i < dogs.length; i++) {
            Dog dog = dogs[i];
//            dog.voice();
            System.out.println(dog.getWhatISay());
        }

        PetOwner myself = new PetOwner();

        myself.feed(muhtar);
        myself.feed(killer);
        myself.feed(snezhok);
        myself.feed(snezhok,"Кормим снежка");

        Husky husky = new Husky("dogs.Husky");
        System.out.println(husky.toString());

        Dog d = new Husky("dogs.Dog");
        System.out.println(d.toString());
//        d.behaveFoolishly();

//        //-----------------
//
//        Month jan = new Month("January", 31, 22);
//        Month feb = new Month("February", 28, 20);
//
//        Month[] months = {jan, feb};
//
//        Manager manager = new Manager("Ivan", 100);
//
//        int salary = manager.getSalary(months);
//        System.out.println("Manager salary: " + salary);
//
//        Employee emp1 = new Employee("Alice", 3000);
//        Employee emp2 = new Employee("Bob", 4000);
//        Employee[] employees = {emp1, emp2};
//
//        SalaryUtils utils = new SalaryUtils();
//        int totalSalary = utils.getTotalSalary(employees,months);
//
//        System.out.println("Total salary: " + totalSalary);

    }
}