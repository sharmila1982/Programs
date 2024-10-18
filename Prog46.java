import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;

public class Prog46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> prog = new ArrayList<>();
        String input;
        String inputPattern = "[A-Za-z]+[0-9]+";
        Pattern pattern = Pattern.compile(inputPattern);
        while (true) {
            System.out.println("Enter strings until 'END' is given:");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("END")) {
                break;
            }
            Matcher matcher = pattern.matcher(input);
            if (!matcher.matches()) {
                System.out.println("The given string is not valid. It must be alphabets followed by digits.");
            } else {
                prog.add(input);
            }
        }
        Collections.sort(prog);
        try {
            Path trg = Paths.get("/home/sharmila/Documents/Codes.txt");
            BufferedWriter writer = Files.newBufferedWriter(trg, StandardOpenOption.CREATE);
            for (String str : prog) {
                writer.write(str);
                writer.newLine();
            }
            writer.close();
            System.out.println("Valid strings have been written to Codes.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
