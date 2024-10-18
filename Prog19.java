import java.util.Scanner;

public class Prog19 {
    public static void main(String[] args) {
        System.out.println("Enter 10 random numbers.\nI will give you the numbers which are greater than the average of the given numbers");
        int a[]=new int[10];
        int sum=0,avg=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
       {
        a[i]=sc.nextInt();
        sum=sum+a[i];
       }
       avg=sum/10;
       System.out.println("The numbers which are greater than the average are:");
       for(int i=0;i<a.length;i++)
       {
        if(a[i]>avg)
        System.out.print(a[i]+"\t");
       }
       System.out.println();
    }

}
