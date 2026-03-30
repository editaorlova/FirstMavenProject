package school.redrover.Lecture18;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(makeGrade(5));
            System.out.println(makeGrade(-12));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("Done");

    }

    public  static Grade makeGrade(int grade) {
        return new Grade(grade);
    }

    public static void writeToFile(String filename, String text) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filename));
            fileWriter.write(text);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            // The finally block always executes, regardless of an exception/
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println("Error closing the file: " + e.getMessage());
                    // This is often considered unrecoverable cleanup, so just report it
                    e.printStackTrace();
                }
            }
        }
    }
}
