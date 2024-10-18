import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prog34 {
    public static void main(String[] args) {
        int upper = 0, lower = 0, digits = 0;
        System.out.println("Enter file name:");
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        try (BufferedReader bf = new BufferedReader(new FileReader(filename))) {
            int a;
            while ((a = bf.read()) != -1) {
                char character = (char) a;
                if (character >= 'A' && character <= 'Z') {
                    upper++;
                } else if (character >= 'a' && character <= 'z') {
                    lower++;
                } else if (character >= '0' && character <= '9') {
                    digits++;
                }
            }
            System.out.println("Number of uppercase letters in the file: " + upper);
            System.out.println("Number of lowercase letters in the file: " + lower);
            System.out.println("Number of digits in the file: " + digits);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
