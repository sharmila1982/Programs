public class Counter {
    int num;
    Counter()
    {
     num=0;
    }
    Counter(int num)
    {
        this.num=num;
    }
        int getIncrement()
        {
            return num+1;
        }
        int getDecrement()
        {
            return num-1;

        }

    
    public static void main(String[] args) {
        
        Counter c =new Counter();
        Counter c1=new Counter(10);
       System.out.println("The increment of given number "+ c1.getIncrement());
       System.out.println("The Decrement of given number "+ c1.getDecrement());
    }

}
