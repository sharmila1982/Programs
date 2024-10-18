import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Prog26 {
    public static void main(String[] args) {
        System.out.println("Enter two dates in the given format[DD-MM-YYYY].");
        Scanner sc=new Scanner(System.in);
        String d1=sc.nextLine();
        String d2=sc.nextLine();
        SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yyyy");
        try{ 
       Date date1= sf.parse(d1);
       Date date2= sf.parse(d2);  
       long diff1=date2.getTime()-date1.getTime();
        long days=diff1/(1000*60*60*24);
            System.out.println("Number of days in between given dates are "+days);
        }
    catch(ParseException e)
   {
System.out.println("please useDD-MM-YYYY");
   }
}
    }


