import java.util.*;


public class Prog4 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number of the day you worked \n1.Monday\n2.Tuesday\n3.Wednesday\n4.Thursday\n5.Friday\n6.Saturday\n7.Sunday");
        int day=sc.nextInt();
        int hours=0;
        if(0<day && day<8)
        {
        
        System.out.println("Enter numbers of working hours");        
         hours=sc.nextInt();}
        int wages=0;
        double bonus=0;
        switch(day){
        case 1,2,3 -> wages=200*hours;
        case 4,5 -> wages=400*hours;
        case 6 -> wages=600*hours;
        case 7 -> wages=800*hours;
        default -> System.out.println("ENter a valid number of days between 1 to 7");
        }
        if(wages>2000)
        {
            bonus=(10*wages)/100;

        }
        if(0<day && day<8)
        {
        System.out.println("Your total wages:"+(wages+bonus));
        }
    }
    
}
