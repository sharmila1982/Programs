import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Circle{
     public static void main(String[] args) {
        Set<Circle> set1=new HashSet<>();
       set1.add(new Circle(70,20));
       set1.add(new Circle(30,100));
       set1.add(new Circle(10,80));
       set1.add(new Circle(10,80));
       set1.add(new Circle(50,40));
       System.out.println("#### Using HASHSET ####");

       for (Circle c : set1) {
        System.out.println(c);
       }
       System.out.println("#### Using TREESET ####");
       Set<Circle> set2=new TreeSet<>((c1,c2)->Integer.compare(c1.radius_y,c2.radius_y));
       set2.add(new Circle(70,20));
       set2.add(new Circle(30,100));
       set2.add(new Circle(90,80));
       set2.add(new Circle(10,60));
       set2.add(new Circle(50,40));
        for (Circle item : set2) {
            System.out.println(item);  
        }
}
     int radius_x;
     int radius_y;

    Circle(int radius_x,int radius_y)
    {
        this.radius_x=radius_x;
        this.radius_y=radius_y;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + radius_x;
        result = prime * result + radius_y;
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Circle other = (Circle) obj;
        if (radius_x != other.radius_x)
            return false;
        if (radius_y != other.radius_y)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Circle [radius_x=" + radius_x + ", radius_y=" + radius_y + "]";
    }
    public int getRadius_x()
    {
        return radius_x;
    }
    public int getRadius_y()
    {
        return radius_y;
    }
    
}
