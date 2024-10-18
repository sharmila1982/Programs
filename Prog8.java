import java.util.Scanner;

public class Prog8 {
    public static void main(String args[])
    {
    int a[]=new int[5];
    System.out.println("Enter 5 numbers"); 
    Scanner sc =new Scanner(System.in);
    for (int i=0;i<5;i++)
    {
    a[i]=sc.nextInt();
    }
    System.out.println("Displaying them in reverse order:");
    for (int i=4;i>=0;i--)
    {
    System.out.print(a[i]+"\t");
    }
}

}
