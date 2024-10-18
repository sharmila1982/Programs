public class Prog11 {
    public static void main(String args[])
    {
        int length=5;
        if(args.length==1)
        {
System.out.println("The given number is "+args[0]+" and the default length is "+length);
        }
        else if(args.length<1)
        {
System.out.println("Enter atleast one number");
        }
        else if(args.length==2)
        {
            System.out.println("The given number is "+args[0]+" and the  length is "+args[1]);
        }
        else
        {
            System.out.println("Enter only two numbers");

        }
    }

}
