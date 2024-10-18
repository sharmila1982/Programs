import java.util.Scanner;

public class Prog23 {
    public static void main(String[] args) {
        System.out.println("Enter a sentence using uuper and lower case letters");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("The given sentence after interchanging the cases:");
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                System.out.print(Character.toLowerCase(str.charAt(i)));
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z')
           {
            System.out.print(Character.toUpperCase(str.charAt(i)));

           }
           else
           {
            System.out.print(str.charAt(i));
           }
        }

    }

}
