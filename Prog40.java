import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
public class Prog40 {
    public static void main(String[] args) {
        try (BufferedReader bf1 = new BufferedReader(new FileReader("/home/sharmila/Documents/names1.txt"))) {
            Set<String> marks1=new LinkedHashSet<>();
            String line1;
            while ((line1 = bf1.readLine()) != null) {
                marks1.add(line1.toLowerCase());
            }   
        
        
        try (BufferedReader bf2 = new BufferedReader(new FileReader("/home/sharmila/Documents/names2.txt"))) {
            Set<String> marks2=new LinkedHashSet<>();
            String line2;
            while ((line2 = bf2.readLine()) != null) {
                marks2.add(line2.toLowerCase());
            }    
        
        marks1.addAll(marks2);
        System.out.println(marks1);
        }
    }
        catch (IOException e) {
            e.printStackTrace();
        } 
    }
}  