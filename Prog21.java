import java.util.Scanner;

public class Prog21 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter marks separated by commas.\n I will display total marks.");
        System.out.println("Enter in the above pattern.\n1.TELUGU\n2.HINDI\n3.ENGLISH\n4.MATHS\n5.SCIENCE\n6.SOCIAL");
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        String str[]=string.split(",");
        int arr[]=new int[str.length];
        int tot=0;
        for(int i=0;i<str.length;i++)
        {
           arr[i]=Integer.parseInt(str[i]);
           if(arr[i]<0 || arr[i]>100)
           {
            throw new Exception("Enter marks less than 100 and greater than 0");
        
           }
           tot=tot+arr[i];
        }
        System.out.println("The total marks :"+tot+" /600");
        

    }

}
