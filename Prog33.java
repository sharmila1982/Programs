import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog33 {
    public static void main(String[] args) {
        System.out.println("Enter names until 'END' is given:");
        Scanner sc = new Scanner(System.in);
        List<String> prog = new ArrayList<>();
        String input;
        while (true) {
            input = sc.nextLine();
            if (input.equalsIgnoreCase("END")) {
                break;
            }
            prog.add(input);
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/sharmila/Documents/names.txt"))) {
            for (String name : prog) {
                bw.write(name);
                bw.newLine();
            }
            bw.close();
            System.out.println("Names have been written to names.txt successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
