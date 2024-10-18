import java.util.Scanner;

public class Product {
    static int no_of_prod=20;
        int prod_id;
        String prod_name;
        double price;
        void init(int prod_id,String prod_name, double price)
        {
    this.prod_id=prod_id;
    this.prod_name=prod_name;
    this.price=price;
    
        }
        double getNetPrice(double price)
        {
            this.price=price;
            double tax=0;
            tax=(price*12)/100;
            return tax;
        }
       void purchase(double price,int quantity)
        {
         System.out.println("Total price is "+(price*quantity));
        }
        int sell(int quantity)
        {
        return no_of_prod-quantity;
        }
        Product()
        {
            System.out.println("***Reliance Smart Bill***");
        }
        Product(String prod_name)
        {
        System.out.println("Your selected product name is "+prod_name);
        }
        Product(int prod_id,int quantity,double price)
        {
            System.out.println("SOAP ID is :"+prod_id);
            System.out.println("No.of Quantity of SOAP is "+quantity);
            System.out.println("Price of each SOAP is "+price);
        }
    public static void main(String[] args) {
        System.out.println("Enter how many number of soaps do you want");
        Scanner sc=new Scanner(System.in);
        int quan=sc.nextInt();
       if(quan>no_of_prod)
   {
   System.out.println("There are "+no_of_prod+" available.\n Please enter a value less than that");
   }
   if(quan<1)
   {
    System.out.println("Select atleast one item...");
   }
    Product p=new Product();
    Product p1=new Product("SOAP");
    Product p2=new Product(101,quan,50.00);
    p.init(101,"SOAP",50.00);
    p2.purchase(50.00,quan);
    System.out.println("The Total amount need to be paid (NET PRICE) "+((50.0*quan)+p.getNetPrice(50.00*quan)));

    System.out.println("The remaining number of SOAPS are "+p1.sell(quan));
    System.out.println("***Thank you for Shopping.....!***");
}
    public double getPrice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrice'");
    }
}
