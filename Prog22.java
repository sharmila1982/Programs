import java.util.Scanner;

public class Prog22 {
    public static void main(String[] args) {
        System.out.println("Enter a sentence");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("displaying the position of space for all spaces.");
        for(int i=0;i<str.length();i++)
        {
         if(str.charAt(i)==' ')
         {
          System.out.print(i+"\t");
         }
        }
        System.out.println();
    }
}
