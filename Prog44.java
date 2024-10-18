import java.util.Scanner;
public class Prog44 {
    public static void main(String[] args) {
        System.out.println("Enter a sentence");
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String[]ch=line.split(" ");
        for (String  word : ch) {
       System.out.println(word);   
        }
    }
}
