import java.util.Scanner;

public class Prog9 {
    static int n;
    static int big=0;
   static int large(int[] a)
    {
   for(int i=0;i<n;i++)
   {
    if(a[i]>big)
    {
        big=a[i];
   }
}
   return big;
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("how many do you want to enter:");
         n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" numbers"); 
    
    for (int i=0;i<n;i++)
    {
    a[i]=sc.nextInt();
    }
    System.out.println("The largest numberis:"+Prog9.large(a));
    }

}
