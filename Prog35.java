import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prog35 {
    public static void main(String[] args) {
        System.out.println("Enter file name:");
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        try (BufferedReader bf = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Lines containing  more than 5 characters:");
            while ((line = bf.readLine()) != null) {
                if (line.length() > 5) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}