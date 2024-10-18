public class Products {
private String name;double base_price;
public Products(String name,double base_price)
{
this.base_price=base_price;
this.name=name;
}
public void setPrice(double price)
{
    base_price=price;
}
public double getNetPrice()
{
    return base_price;
}
public void print()
{
    System.out.println("Product name is: "+name);
  System.out.println("Base price of "+name+" is "+base_price);
}
}
