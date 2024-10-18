import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Prog32 {
    public static void main(String[] args) {
        System.out.println("Enter some numbers and finally end with '0':");
       List<Integer> prog=new ArrayList<>();
       Scanner sc=new Scanner(System.in);
       int i=0;
       prog.add(sc.nextInt());
       while(prog.get(i)!=0)
        {
            i++;
            prog.add(sc.nextInt());
            
        }
        int sum=0;
        for(int j=0;j<prog.size();j++)
        {
         if(prog.get(j)>0)
         {
           sum=sum+prog.get(j);
         }
        }
        System.out.println("The sum of the given positive numbers:"+sum);
        
    }

    

}
