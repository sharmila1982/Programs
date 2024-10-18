import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Prog43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your PAN number: ");
        String pannum = scanner.nextLine();
        String panpat="[A-Z]{5}[0-9]{4}[A-Z]{1}";
        Pattern pat=Pattern.compile(panpat);
        Matcher mat=pat.matcher(pannum);
        if (mat.matches()) {
            System.out.println("The PAN number is valid.");
        } else {
            System.out.println("The PAN number is not valid.");
        }
        scanner.close();
    }
}
