package Java_day5;
import java.io.*;

public class File_Operations {
    public static void main(String[] args) {
    	try {

            // Writing data to file

             FileWriter w1 = new FileWriter("C:\\Users\\Hxtreme\\eclipse-workspace\\Add_On\\src\\Java_day5\\example.txt") ;

                w1.write("Hello,Java I/O !");

                w1.close();

                System.out.println("Data written to file");

            // Reading data from file

            FileReader r1 = new FileReader("C:\\Users\\Hxtreme\\eclipse-workspace\\Add_On\\src\\Java_day5\\example.txt");

                int character;

                while ((character = r1.read()) != -1) {

                    System.out.print((char) character); // Prints characters on the same line
                }

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}