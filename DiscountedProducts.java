public class DiscountedProducts extends Products{
        private int discount_rate;
            public DiscountedProducts(String name,double base_price,int discount_rate)
            {
                super(name,base_price);
                this.discount_rate=discount_rate;
            }
            public void setDiscountRate(int discount_rate)
            {
             this.discount_rate=discount_rate;   
            }
            public double getNetPrice()
            {                  
                return  base_price-(base_price*discount_rate/100);
            }
            public void print() {
                super.print(); 
                System.out.println("Discount rate: " +discount_rate + "%");
                System.out.println("Net Price (after deducting discount rate): " + getNetPrice());
            }
public static void main(String[] args) {
System.out.println("**** Using upcasting****");
Products p1=new ImportedProducts("Mobile phone", 25000,15);
Products p2=new DiscountedProducts("Bluetooth",2500,20);
p1.print();
p2.print();
System.out.println("**** Using downcasting****");
ImportedProducts p3=(ImportedProducts)p1;
DiscountedProducts p4=(DiscountedProducts) p2;
p3.setImportDuty(10);
p3.print();
p4.setDiscountRate(15);
p4.print();
}
        }
        


