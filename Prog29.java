import java.util.Scanner;
public class Prog29 {
public static void main(String[] args) {
    System.out.println("Enter 5 numbers:");
    Scanner sc=new Scanner(System.in);
    int sum=0;
    String[] str=new String[5];
    for(int i=0;i<5;i++)
    {
      str[i]=sc.nextLine();
    }
    int []arr=new int[5];
    for(int i=0;i<5;i++)
    {
    arr[i]=Integer.parseInt(str[i]);
    sum=sum+arr[i];
    }
    System.out.println("The total of the given numbers:"+sum);

}
}
