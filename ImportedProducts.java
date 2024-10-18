public class ImportedProducts extends Products{
private int imported_duty;
    public ImportedProducts(String name,double base_price,int imported_duty)
    {
        super(name,base_price);
        this.imported_duty=imported_duty;   

    }
    public void setImportDuty(int imported_duty)
    {
     this.imported_duty=imported_duty;   
    }
    public double getNetPrice()
    {
       return base_price+(base_price*imported_duty/100);
    }
    public void print() {
        super.print(); 
        System.out.println("Import Duty: " + imported_duty + "%");
        System.out.println("Net Price (after import duty): $" + getNetPrice());
    }
}
