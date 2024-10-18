import java.util.Scanner;

public class Prog20 {
    public static void main(String[] args) {
        System.out.println("Enter a sentence.\nI will display it vertically");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char st[]=str.toCharArray();
        System.out.println("Displaying the sentence vertically ");
        for(int i=0;i<str.length();i++)
        {
            System.out.println(st[i]);
        }
    }

}
