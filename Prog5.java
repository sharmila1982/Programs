
import java.util.Scanner;

public class Prog5 {
public static void main(String args[])
{
    int a[]=new int[5];
    int sum=0;
    System.out.println("Enter 5 numbers"); 
    Scanner sc =new Scanner(System.in);
    for (int i=0;i<5;i++)
    {
    a[i]=sc.nextInt();
    sum+=a[i];
    }
    System.out.println("The average of given 5 numbers is:"+sum/5);
}
}
