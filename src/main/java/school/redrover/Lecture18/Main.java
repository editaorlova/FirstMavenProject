package school.redrover.Lecture18;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
//        try {
//            System.out.println("Begin");
//            System.out.println(new Grade(15));
//            System.out.println("Success");
//        } catch (IllegalArgumentException e) {
//            System.out.println("Error");
//        }finally {
//            System.out.println("Done");
//        }
//---------------------------------------------
        BankAccount account = new BankAccount(100);
        System.out.println("Balance: " + account.getBalance());
        account.withdraw(50);
        System.out.println("Balance: " + account.getBalance());
        account.withdraw(500);
        System.out.println("Balance: " + account.getBalance());
    }

    public  static Grade makeGrade(int grade) {
        return new Grade(grade);
    }

    public static void writeToFile(String filename, String text) {
       try (FileWriter fileWriter = new FileWriter(filename)) {
           fileWriter.write(text);
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
