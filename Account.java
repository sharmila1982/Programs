import java.util.Scanner;

public class Account implements Accountoperation{
    static double balance=10000;

    public void deposit(double dep)
    {
   balance=balance+dep;
    }
   public  double getBalance()
    {
   return balance;
    }
    public void withdraw(double wd) throws InsufficientBalanceException
    {
        balance=balance-wd;
        if(balance<0)
        {
            throw new InsufficientBalanceException();
        }

    }
    public static void main(String[] args) throws InsufficientBalanceException {
        int a;
        double wd,dep;
        do{
        System.out.println("Press\n1.To get your Account balance.\n2.To withdraw amount.\n3.To deposit amount.\n4.To Exit");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        
        
        Account acc=new Account();
        if(a==1)
        {
            System.out.println("your Account Balance is :"+ acc.getBalance());

        }
        else if(a==2)
        {
            System.out.println("Enter how much amount do you want to withdraw");
         wd=sc.nextDouble();
        acc.withdraw(wd);
          System.out.println(wd+"|- debited from1 your account.");
        }
        else if(a==3)
        {
            System.out.println("Enter how much amount do you want to deposit");
             dep=sc.nextDouble();
             acc.deposit(dep);
            System.out.println(dep+"|- credited into your account.");
           
        }
        else if(a==4)
        {
            break;
        }
        else{
System.out.println("Enter valid input");
        }
    }while(a!=4);
        }
      

    }


