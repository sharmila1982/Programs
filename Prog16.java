class Employee{
    int empId;
    String empName;
    String empDept;
   public Employee(int empId,String empName,String empDept){
       this.empId=empId;
       this.empName=empName;
       this.empDept=empDept;
   }
   public int getEmpId(){
       return empId;
   }
   public String getEmpName(){
       return empName;
   }
   public String getEmpDept(){
       return empDept;
   }
   public void Display(){
       System.out.println("the employee ID:"+empId);
       System.out.println("the employee name:"+empName);
       System.out.println("the employee department:"+empDept);
   }
}
   public class Prog16 extends Employee{
       int busNo;
       String busBoards;
       public Prog16(int empId,String empName,String empDept,int busNo,String busBoards){
           super(empId,empName,empDept);
           this.busNo=busNo;
           this.busBoards=busBoards;
       }
       public int getBusNo(){
           return busNo;
       }
       public String getEmpBoards(){
           return busBoards;
       }
       public void Display(){
           super.Display();
           System.out.println("This the bus number:"+busNo);
           System.out.println("The employee board is:"+busBoards);
       }
       public static void main(String args[]){
           Prog16 fe=new Prog16(101, "Sharmila", "AC", 01, "A");
           fe.Display();
       }
   }