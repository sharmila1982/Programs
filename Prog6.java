import java.util.Scanner;

public class Prog6 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int b=1;
        System.out.println("Enter a number");
        int a=sc.nextInt();
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
              if(b<i)
              {
                b=i;
              }
            }

        }
        System.out.println("The largest factor of the given number is:"+b);

    }
}
