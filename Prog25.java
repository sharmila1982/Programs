import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog25 {
    public static void main(String[] args) {
        System.out.println("Enter names names untill END is given");
        Scanner sc=new Scanner(System.in);
        List<String> prog=new ArrayList<>();
       int i=0;
       prog.add(sc.nextLine());
       while(!prog.get(i).equalsIgnoreCase("END"))
        {
            i++;
            prog.add(sc.nextLine());
            
        }
        for(int j=0;j<i;j++)
        {
            System.out.print(prog.get(j));
            if(j!=i-1)
            {
                System.out.print("-");
            }
            if(prog.get(j).equalsIgnoreCase("END"))
            {
              break;
            }
        }
        System.out.println();
    }

}
